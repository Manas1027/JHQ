package com.example.jol.ui.home.item_test

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_test.view.*

class TestViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    fun populateModel(data: Item){
        itemView.testTitle.text = data.name
    }
}