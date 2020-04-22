package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.Adapter as Adapter1

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val arr = ArrayList<Int>()
        for (i in 0..50) {
            arr.add(i)
        }
//        listView.adapter = Adapter(arr)
        listView.adapter = MyArrayAdapter(this, arr)
    }
}
