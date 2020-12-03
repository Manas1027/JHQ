package com.example.jol.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.jol.R
import com.example.jol.data.AvtoDatabase
import com.example.jol.data.dao.AvtoDao
import com.example.jol.ui.home.item.Item
import com.example.jol.ui.home.item.ItemAdapter
import com.example.jol.ui.home.test.Test
import com.example.jol.ui.home.test.TestAdapter
import kotlinx.android.synthetic.main.activity_test_list.*

class TestListActivity : AppCompatActivity() {

    private val testAdapter = TestAdapter()
    private val itemAdapter = ItemAdapter()
    private lateinit var dao: AvtoDao
    var keyNumber: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_list)
        RV.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        //dao = AvtoDatabase.getInstance(requireContext()).dao()
        keyNumber = intent.getIntExtra("key", 0)
        when(keyNumber){
            1 -> {
                RV.adapter = testAdapter
                setDataTest()
            }
            2 -> {
                RV.adapter = itemAdapter
                setDataShtraf()
            }
            3 -> {
                RV.adapter = itemAdapter
                setDataJHQ()
            }
            4 -> {
                RV.adapter = itemAdapter
                setDataNomer()
            }
            5 -> {
                RV.adapter = itemAdapter
                setDataMed()
            }
            6 -> {
                RV.adapter = itemAdapter
                setDataTransport()
            }
        }
    }


      fun setDataTest() {
            val params: MutableList<Test> = mutableListOf()
            for (i in 1..20) {
                val model = Test("asas")
                model.name = "Basqish $i"
                params.add(model)
            }
            testAdapter.models = params
        }

    fun setDataShtraf() {

        //itemAdapter.items = dao.getAvto()
    }

    fun setDataJHQ() {
        val params: MutableList<Item> = mutableListOf()
        for (i in 1..3) {
            val model = Item("asas")
            model.name = "Basqish $i"
            params.add(model)
        }
        itemAdapter.items = params
    }

    fun setDataNomer() {
        val params: MutableList<Item> = mutableListOf()
        for (i in 1..2) {
            val model = Item("asas")
            model.name = "Basqish $i"
            params.add(model)
        }
        itemAdapter.items = params
    }

    fun setDataMed() {
        val params: MutableList<Item> = mutableListOf()
        for (i in 1..2) {
            val model = Item("asas")
            model.name = "Basqish $i"
            params.add(model)
        }
        itemAdapter.items = params
    }

    fun setDataTransport() {
        val params: MutableList<Item> = mutableListOf()
        for (i in 1..1) {
            val model = Item("asas")
            model.name = "Basqish $i"
            params.add(model)
        }
        itemAdapter.items = params
    }

}