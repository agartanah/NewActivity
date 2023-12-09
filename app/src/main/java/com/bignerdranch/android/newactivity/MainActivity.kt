package com.bignerdranch.android.newactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private val URL = "https://media.tenor.com/ko2smYF8O7YAAAAd/party-party-time.gif"

    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)

        button.setOnClickListener {
            val intent = Intent(this, PicActivity::class.java)
            intent.putExtra(R.string.key_link.toString(), URL)
            startActivity(intent)
        }
    }
}