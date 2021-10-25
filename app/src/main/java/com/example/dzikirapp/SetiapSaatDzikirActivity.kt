package com.example.dzikirapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SetiapSaatDzikirActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setiap_saat_dzikir)

        val rvDzikir = findViewById<RecyclerView>(R.id.rv_dzikir_doa_harian)
        rvDzikir.layoutManager = LinearLayoutManager(this)
        rvDzikir.adapter = DzikirDoaAdapter(DataDzikirDoa.listDzikir)
    }
}