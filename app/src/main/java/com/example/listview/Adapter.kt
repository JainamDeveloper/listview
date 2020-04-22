package com.example.listview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import androidx.appcompat.widget.AppCompatTextView

class Adapter(val arr: ArrayList<Int>) : BaseAdapter() {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val container =
            LayoutInflater.from(parent?.context).inflate(R.layout.layout_row, parent, false)
        container.findViewById<AppCompatTextView>(R.id.textViewName).text = arr[position].toString()
        return container
    }

    override fun getItem(position: Int): Any {
        return "arr[position]"
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return arr.size
    }
}