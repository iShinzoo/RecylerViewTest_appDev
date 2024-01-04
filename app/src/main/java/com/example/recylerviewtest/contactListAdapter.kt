package com.example.recylerviewtest

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class contactListAdapter (
    private val ContactListOf : List<Contanct_Item>
) : RecyclerView.Adapter<contactListAdapter.ContactListViewHolder>(){


class ContactListViewHolder(
    view : View
) : RecyclerView.ViewHolder(view){
    val image = view.findViewById<ImageView>(R.id.image)
    val textHeading = view.findViewById<TextView>(R.id.text_heading)
    val textSubHeading = view.findViewById<TextView>(R.id.text_sub_heading)
}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_res,parent,false)
        return ContactListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ContactListViewHolder, position: Int) {
        holder.image.setImageResource(ContactListOf[position].ImageRes)
        holder.textHeading.text = ContactListOf[position].heading
        holder.textSubHeading.text = ContactListOf[position].Sub_heading
    }
    override fun getItemCount(): Int {
        return ContactListOf.size
    }
}


