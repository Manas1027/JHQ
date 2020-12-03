package com.example.jol.ui.home.item_shtraf

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.jol.R
import com.example.jol.ui.home.item_test.Item

class ShtrafAdapter: RecyclerView.Adapter<ShtrafViewHolder>() {

    var items: MutableList<Item> = mutableListOf()
    set(value) {
        field = value
        notifyDataSetChanged()
    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShtrafViewHolder {
        var item = LayoutInflater.from(parent.context).inflate(R.layout.shtraf_item, parent, false)
        return ShtrafViewHolder(item)
    }


    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ShtrafViewHolder, position: Int) {
        holder.populateModel(items[position])
    }
}