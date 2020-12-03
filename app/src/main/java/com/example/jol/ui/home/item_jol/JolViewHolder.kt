package com.example.jol.ui.home.item_jol

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.jol.ui.home.item_test.Item
import kotlinx.android.synthetic.main.item_test.view.*
import kotlinx.android.synthetic.main.shtraf_item.view.*

class JolViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    fun populateModel(data: Item){
        itemView.tvTitle.text = data.name
    }
}