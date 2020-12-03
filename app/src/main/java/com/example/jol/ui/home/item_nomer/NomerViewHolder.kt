package com.example.jol.ui.home.item_nomer

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.jol.ui.home.item_test.Item
import kotlinx.android.synthetic.main.item_test.view.*

class NomerViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    fun populateModel(data: Item){
        itemView.testTitle.text = data.name
    }
}