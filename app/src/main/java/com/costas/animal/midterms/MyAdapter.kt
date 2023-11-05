package com.costas.animal.midterms

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.costas.animal.midterms.databinding.AnimalsBinding

class MyAdapter(
    private val animals: MutableList<Animals>,
    private val context: Context
) : RecyclerView.Adapter<MyAdapter.AnimalsViewHolder>() {

    inner class AnimalsViewHolder(private val binding: AnimalsBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(animal: Animals) {
            binding.name.text = animal.name

            binding.root.setOnClickListener {
                val intent = Intent(context, AnimalDetailsActivity::class.java)

                intent.putExtra("name", animal.name)
                intent.putExtra("details", animal.details)

                context.startActivity(intent)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalsViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = AnimalsBinding.inflate(inflater, parent, false)
        return AnimalsViewHolder(binding)
    }

    override fun getItemCount() = animals.size

    override fun onBindViewHolder(holder: AnimalsViewHolder, position: Int) {
        val person = animals[position]
        holder.bind(person)
    }
}