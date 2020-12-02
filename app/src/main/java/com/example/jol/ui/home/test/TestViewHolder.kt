package com.example.jol.ui.home.test

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.jol.ui.home.test.Test
import kotlinx.android.synthetic.main.test_item.view.*

class TestViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    fun populateModel(data: Test){
        itemView.tvTitle.text = data.name
    }
}