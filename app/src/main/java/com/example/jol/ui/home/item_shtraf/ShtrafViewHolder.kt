package com.example.jol.ui.home.item_shtraf

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.jol.ui.home.item_test.Item
import kotlinx.android.synthetic.main.shtraf_item.view.*

class ShtrafViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    fun populateModel(data: Item){
        itemView.tvTitle.text = data.name
    }
}