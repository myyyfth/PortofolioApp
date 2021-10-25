package com.example.dzikirapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class QauliyahShalatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_qauliyah_shalat)

        val rvQauliyahShalat = findViewById<RecyclerView>(R.id.rv_qauliyah_shalat )
        rvQauliyahShalat.layoutManager = LinearLayoutManager(this)
        rvQauliyahShalat.adapter = DzikirDoaAdapter(DataDzikirDoa.listQauliyahShalat)
    }
}

/*
*       findViewById -> itu didalam class AppCompatActivity
*
*       kegunaan layoutManager adalah untuk memposisikan data untuk recycle view agar dia tau di viewgroup yg mana
*
*       this digunakan untuk mengaju kepada sebuah p
*  */