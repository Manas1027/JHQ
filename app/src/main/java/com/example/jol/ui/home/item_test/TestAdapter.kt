package com.example.jol.ui.home.item_test

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.jol.R

class TestAdapter: RecyclerView.Adapter<TestViewHolder>() {

    var models: MutableList<Item> = mutableListOf()
    set(value) {
        field = value
        notifyDataSetChanged()
    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TestViewHolder {
        var item = LayoutInflater.from(parent.context).inflate(R.layout.item_test, parent, false)
        return TestViewHolder(item)
    }

    override fun onBindViewHolder(holder: TestViewHolder, position: Int) {
        holder.populateModel(models[position])
    }

    override fun getItemCount(): Int {
        return models.size
    }
}