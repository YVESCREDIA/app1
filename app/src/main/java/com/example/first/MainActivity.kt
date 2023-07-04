package com.example.first

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val random: Random = Random(7)

        val btn_valider:Button = findViewById(R.id.btn_valider)
        val txt_msg1: TextView = findViewById(R.id.message)
        val txt_msg2: TextView = findViewById(R.id.message2)
        val txt_gagne: TextView = findViewById(R.id.gagne)

        btn_valider.setOnClickListener {
            // Code here executes on main thread after user presses button
            txt_gagne.visibility = View.INVISIBLE
            val randomInt1 = random.nextInt(1, 7)
            val randomInt2 = random.nextInt(1, 7)

            txt_msg1.text = randomInt1.toString()
            txt_msg2.text = randomInt2.toString()

            if(randomInt1 == 6 && randomInt2 == 6)
                txt_gagne.visibility = View.VISIBLE
        }

    }
}