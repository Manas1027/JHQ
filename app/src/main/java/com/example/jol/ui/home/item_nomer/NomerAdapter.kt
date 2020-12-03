package com.example.jol.ui.home.item_nomer

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.jol.R
import com.example.jol.ui.home.item_jol.JolViewHolder
import com.example.jol.ui.home.item_test.Item

class NomerAdapter: RecyclerView.Adapter<NomerViewHolder>() {

    var models: MutableList<Item> = mutableListOf()
        set(value) {
            field = value
            notifyDataSetChanged()
        }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NomerViewHolder {
        var item = LayoutInflater.from(parent.context).inflate(R.layout.shtraf_item, parent, false)
        return NomerViewHolder(item)
    }

    override fun onBindViewHolder(holder: NomerViewHolder, position: Int) {
        holder.populateModel(models[position])
    }

    override fun getItemCount(): Int {
        return models.size
    }
}