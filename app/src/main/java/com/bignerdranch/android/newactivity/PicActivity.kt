package com.bignerdranch.android.newactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide

class PicActivity : AppCompatActivity() {
    private lateinit var pic: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pic)

        val link = intent.getStringExtra(R.string.key_link.toString())

        pic = findViewById(R.id.imageView)

        Glide.with(this).load(link).into(pic)
    }
}