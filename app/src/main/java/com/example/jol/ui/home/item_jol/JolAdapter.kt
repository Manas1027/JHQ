package com.example.jol.ui.home.item_jol

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.jol.R
import com.example.jol.ui.home.item_test.Item

class JolAdapter: RecyclerView.Adapter<JolViewHolder>() {

    var models: MutableList<Item> = mutableListOf()
        set(value) {
            field = value
            notifyDataSetChanged()
        }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JolViewHolder {
        var item = LayoutInflater.from(parent.context).inflate(R.layout.item_test, parent, false)
        return JolViewHolder(item)
    }

    override fun onBindViewHolder(holder: JolViewHolder, position: Int) {
        holder.populateModel(models[position])
    }

    override fun getItemCount(): Int {
        return models.size
    }
}