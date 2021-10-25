package com.example.dzikirapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailArticleActivity : AppCompatActivity() {

    companion object {
        const val DATA_TITLE = "title"
        const val DATA_DESC = "desc"
        const val DATA_IMAGE = "image"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_article)

        val dataTitle = intent.getStringExtra(DATA_TITLE)
        val dataDesc = intent.getStringExtra(DATA_DESC)
        val dataImage = intent.getIntExtra(DATA_IMAGE, 0)

        val tvTitle = findViewById<TextView>(R.id.tv_title_artikel)
        tvTitle.text = dataTitle
        val tvDesc = findViewById<TextView>(R.id.tv_desc)
        tvDesc.text = dataDesc
        val imgArtikel = findViewById<ImageView>(R.id.img_artikel)
        imgArtikel.setImageResource(dataImage)
    }
}