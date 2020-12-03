package com.example.jol.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.jol.R
import com.example.jol.data.AvtoDatabase
import com.example.jol.data.dao.AvtoDao
import com.example.jol.ui.home.item_jol.JolAdapter
import com.example.jol.ui.home.item_med.MedAdapter
import com.example.jol.ui.home.item_nomer.NomerAdapter
import com.example.jol.ui.home.item_test.Item
import com.example.jol.ui.home.item_shtraf.ShtrafAdapter
import com.example.jol.ui.home.item_test.TestAdapter
import com.example.jol.ui.home.item_transport.TransportAdapter
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    private val testAdapter = TestAdapter()
    private val shtrafAdapter = ShtrafAdapter()
    private val jolAdapter = JolAdapter()
    private val nomerAdapter = NomerAdapter()
    private val medAdapter = MedAdapter()
    private val transportAdapter = TransportAdapter()

    private lateinit var dao: AvtoDao
    var keyNumber: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        RV.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        //dao = AvtoDatabase.getInstance(requireContext()).dao()
        keyNumber = intent.getIntExtra("key", 0)
        when(keyNumber){
            1 -> {
                RV.adapter = testAdapter
                setDataTest()
            }
            2 -> {
                RV.adapter = shtrafAdapter
                setDataShtraf()
            }
            3 -> {
                RV.adapter = jolAdapter
                setDataJHQ()
            }
            4 -> {
                RV.adapter = nomerAdapter
                setDataNomer()
            }
            5 -> {
                RV.adapter = medAdapter
                setDataMed()
            }
            6 -> {
                RV.adapter = transportAdapter
                setDataTransport()
            }
        }
    }


      fun setDataTest() {
            val params: MutableList<Item> = mutableListOf()
            for (i in 1..20) {
                val model = Item("asas")
                model.name = "Basqish $i"
                params.add(model)
            }
            testAdapter.models = params
        }

    fun setDataShtraf() {
        val params: MutableList<Item> = mutableListOf()
        for (i in 1..3) {
            val model = Item("asas")
            model.name = "Basqish $i"
            params.add(model)
        }
        shtrafAdapter.models = params
    //itemAdapter.items = dao.getShtraf()
    }

    fun setDataJHQ() {
        val params: MutableList<Item> = mutableListOf()
        for (i in 1..3) {
            val model = Item("asas")
            model.name = "Basqish $i"
            params.add(model)
        }
        jolAdapter.models = params
    }

    fun setDataNomer() {
        val params: MutableList<Item> = mutableListOf()
        for (i in 1..2) {
            val model = Item("asas")
            model.name = "Basqish $i"
            params.add(model)
        }
        nomerAdapter.models = params
    }

    fun setDataMed() {
        val params: MutableList<Item> = mutableListOf()
        for (i in 1..2) {
            val model = Item("asas")
            model.name = "Basqish $i"
            params.add(model)
        }
        medAdapter.models = params
    }

    fun setDataTransport() {
        val params: MutableList<Item> = mutableListOf()
        for (i in 1..1) {
            val model = Item("asas")
            model.name = "Basqish $i"
            params.add(model)
        }
        transportAdapter.models = params
    }

}