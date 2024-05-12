package com.example.myapplication3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Luanch : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_luanch)

        val buttgo = findViewById<Button>(R.id.buttonstart)
        buttgo.setOnClickListener {
            val intent = Intent(this,welcome::class.java)
            startActivity(intent)
        }


    }
}