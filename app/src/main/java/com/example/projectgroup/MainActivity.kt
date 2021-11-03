package com.example.projectgroup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.projectgroup.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var userArrayList : ArrayList<Lang>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(LayoutInflater)
        setContentView(binding.root)

        val imageId = intArrayOf(

            R.drawable.lang,R.drawable.lang,R.drawable.lang,R.drawable.lang,
            R.drawable.lang,R.drawable.lang,R.drawable.lang,R.drawable.lang
        )

        val name = arrayOf(
            "English", "Japanese", "French", "Irish", "Spanish", "Chinese", "Russian", "Portuguese"
        )

        userArrayList = ArrayList()

        for( i in name.indices){
            val lang = Lang(name[i])
            userArrayList.add(lang)
        }

        binding.listview.isClickable = true
        binding.listview.adapter = MySmith(this, userArrayList)
        binding.listview.setOnItemclickListener {parent, view, position, id ->
            val name = name[position]
            val imageId = imageId[position]
        }
    }
}