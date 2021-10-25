package com.example.dzikirapp

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import  androidx.recyclerview.widget.RecyclerView

class ArtikelAdapter(private val listArtikel: ArrayList<Artikel>) :
    RecyclerView.Adapter<ArtikelAdapter.MyViewHolder>() {

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imgArtikel: ImageView = view.findViewById(R.id.img_artikel)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MyViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.row_item_artikel, parent, false)
    )

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val holderImage = holder.imgArtikel
        holderImage.apply {
            holder.imgArtikel.setImageResource(listArtikel[position].imageArtikel)
            setOnClickListener {
                val intent = Intent(holder.imgArtikel.context, DetailArticleActivity::class.java)
                intent.putExtra(DetailArticleActivity.DATA_TITLE, listArtikel[position].titleArtikel)
                intent.putExtra(DetailArticleActivity.DATA_DESC, listArtikel[position].descriptor)
                intent.putExtra(DetailArticleActivity.DATA_IMAGE, listArtikel[position].imageArtikel)
                context.startActivity(intent)
        }
        }
    }

    override fun getItemCount() = listArtikel.size

}