package com.example.jol.ui

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.test.view.*

class TestViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    fun populateModel(data: Test){
        itemView.tvTitle.text = data.name
    }
}