package com.example.jol.ui.home.item

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.jol.ui.home.test.Test
import kotlinx.android.synthetic.main.test_item.view.*

class ItemViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    fun populateModel(data: Item){
        itemView.tvTitle.text = data.name
    }
}