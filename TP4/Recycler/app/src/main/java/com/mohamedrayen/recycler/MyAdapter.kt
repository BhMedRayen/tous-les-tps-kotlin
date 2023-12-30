package com.mohamedrayen.recycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView


internal class MyAdapter(private val myDataSet: ArrayList<String>) :
    RecyclerView.Adapter<MyAdapter.ViewHolder>() {
    internal inner class ViewHolder(val itemview: View):
    RecyclerView.ViewHolder(itemview),View.OnClickListener {
    init {
        itemView.setOnClickListener(this)
    }
        val vText = itemview.findViewById<TextView>(R.id.word)
        override fun onClick(v: View?) {
              val position = adapterPosition;
              if (position != RecyclerView.NO_POSITION) {
                 itemview.setOnClickListener {
                     Toast.makeText(itemview.context, position, Toast.LENGTH_SHORT).show()
                 }
               }
            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val x = LayoutInflater.from(parent.context).inflate(R.layout.ligne,parent,false)
        return ViewHolder(x)
    }

    override fun getItemCount(): Int {
         return   myDataSet.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       var current = myDataSet[position]
        holder.vText.text = current.toString();
    }
}