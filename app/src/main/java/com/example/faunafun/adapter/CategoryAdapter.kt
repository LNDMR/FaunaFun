package com.example.faunafun.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.faunafun.R
import com.example.faunafun.data.model.Category

class CategoryAdapter(private val dataset: List<Category>)
    : RecyclerView.Adapter<CategoryAdapter.ViewHolder>() {

        // define which parts of the layout shall be renewed before displaying
        class ViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
            val categoryName = view.findViewById<TextView>(R.id.category_title_text)
            val animalRecycler = view.findViewById<RecyclerView>(R.id.animal_recycler)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val adapterLayout = LayoutInflater.from(parent.context)
                .inflate(R.layout.category_item, parent, false)
            return ViewHolder(adapterLayout)
        }

        // recycling process starts
        // the attributes of the ViewHolder are renewed
        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val category = dataset[position]
            holder.categoryName.text = category.name
            holder.animalRecycler.adapter = AnimalAdapter(category.animals)
        }

        // layoutManager needs to know amount of items
        override fun getItemCount(): Int {
            return dataset.size
        }
}