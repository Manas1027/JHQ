package com.example.jol.ui.home.item

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.jol.R
import kotlinx.android.synthetic.main.activity_test_list.*

class ItemListActivity : AppCompatActivity() {

    private val myAdapter = ItemAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_list)

        RV.adapter = myAdapter
        RV.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        setData()
    }

    fun setData(){
        val params: MutableList<Item> = mutableListOf()
        for(i in 1..3){
            val model = Item("asas")
            model.name = "Basqish $i"
            params.add(model)
        }
        myAdapter.items = params
    }
}