package com.example.faunafun.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.faunafun.R
import com.example.faunafun.data.model.Animal

class AnimalAdapter(private val dataset: List<Animal>)
: RecyclerView.Adapter<AnimalAdapter.ViewHolder>() {

    // define which parts of the layout shall be renewed before displaying
    class ViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val animalName = view.findViewById<TextView>(R.id.animal_name_text)
        val animalImage = view.findViewById<ImageView>(R.id.animal_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.animal_item, parent, false)
        return ViewHolder(adapterLayout)
    }

    // recycling process starts
    // the attributes of the ViewHolder are renewed
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val animal = dataset[position]

        holder.animalName.text = animal.name
        holder.animalImage.setImageResource(animal.imageResource)

        // holder.info_button.setOnClickListener {
        //     Toast.makeText(context, "You will be forwarded to learn all about the ${animal.name}!", Toast.LENGTH_SHORT)
        //         .show()
        // }
    }

    // layoutManager needs to know amount of items
    override fun getItemCount(): Int {
        return dataset.size
    }
}