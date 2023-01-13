package com.example.faunafun

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.faunafun.adapter.CategoryAdapter
import com.example.faunafun.data.Datasource
import com.example.faunafun.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val datasource = Datasource()
        var categoryList = datasource.getAnimals()

        binding.categoryRecycler.adapter = CategoryAdapter(categoryList)
    }
}