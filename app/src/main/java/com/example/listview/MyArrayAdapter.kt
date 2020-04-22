package com.example.listview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import androidx.appcompat.widget.AppCompatTextView

class MyArrayAdapter(context: Context, val arr: ArrayList<Int>) :
    ArrayAdapter<Int>(context, arr.size) {
    lateinit var view: View
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        if (view == null) {
            view =
                LayoutInflater.from(parent.context).inflate(R.layout.layout_row, parent, false)
        }
        view.findViewById<AppCompatTextView>(R.id.textViewName).text = arr[position].toString()
        return view
    }

}