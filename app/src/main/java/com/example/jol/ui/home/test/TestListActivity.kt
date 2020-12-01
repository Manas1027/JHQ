package com.example.jol.ui.home.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.jol.R
import kotlinx.android.synthetic.main.activity_test_list.*

class TestListActivity : AppCompatActivity() {

    private val myAdapter = TestAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_list)

        RV.adapter = myAdapter
        RV.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        setData()
    }

    fun setData(){
        val params: MutableList<Test> = mutableListOf()
        for(i in 1..20){
            val model = Test("asas")
            model.name = "Basqish $i"
            params.add(model)
        }
        myAdapter.models = params
    }
}