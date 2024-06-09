package com.example.taskrecyclerview.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.taskrecyclerview.R
import com.example.taskrecyclerview.classes.Person

class PersonAdapter(private val peopleList:List<Person>) : RecyclerView.Adapter<PersonAdapter.PersonViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_person, parent, false)
        return PersonViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        val currentItem = peopleList[position]
        holder.textViewName.text = currentItem.name
        holder.textViewAge.text = currentItem.age.toString()
        holder.textViewGender.text = currentItem.gender
        holder.textViewOccupation.text = currentItem.occupation
    }

    override fun getItemCount() = peopleList.size

    class PersonViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textViewName: TextView = itemView.findViewById(R.id.textViewName)
        val textViewAge: TextView = itemView.findViewById(R.id.textViewAge)
        val textViewGender: TextView = itemView.findViewById(R.id.textViewGender)
        val textViewOccupation: TextView = itemView.findViewById(R.id.textViewOccupation)
    }
}