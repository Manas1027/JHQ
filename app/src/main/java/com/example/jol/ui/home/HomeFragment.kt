package com.example.jol.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.jol.R
import com.example.jol.TestListActivity
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_home.view.*

class HomeFragment : Fragment(R.layout.fragment_home) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        test.setOnClickListener {
            val intent = Intent(this, TestListActivity::class.java)
            startActivity(intent)
        }
    }


}