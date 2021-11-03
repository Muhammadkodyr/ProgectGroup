package com.example.projectgroup

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MySmith(private val context : Activity, private val arrayList : ArrayList<Lang>) : ArrayAdapter<Lang>(context,
                R.layout.list_item, arrayList)       {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater : LayoutInflater = LayoutInflater.from(context)
        val view : View = inflater.inflate(R.layout.list_item, null)

        val imageView : ImageView = view.findViewById(R.id.img_lang)
        val langname : TextView = view.findViewById(R.id.lang_name)


        langname.text = arrayList[position].name

        return view
    }
}