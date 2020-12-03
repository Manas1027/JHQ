package com.example.jol.ui.home.test

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.jol.ui.home.test.Test
import kotlinx.android.synthetic.main.item_test.view.*

class TestViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    fun populateModel(data: Test){
        itemView.testTitle.text = data.name
    }
}