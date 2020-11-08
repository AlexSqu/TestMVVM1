package com.example.testmvvm1.view


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.testmvvm1.R
import com.example.testmvvm1.dataclasses.Data
import com.example.testmvvm1.dataclasses.Products



//адаптер для отображения данных в recyclerview
class UsersAdapter (private val users: Products, private val listener: OnItemClickListener) : RecyclerView.Adapter<UsersAdapter.ViewHolder>(){

   inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener{
        var name: TextView? = null
        init{
            name = itemView?.findViewById((R.id.name))
        }
        init {
            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            val position : Int = adapterPosition
            if (position != RecyclerView.NO_POSITION) {
                listener.onItemClick(position)
            }
        }
    }

    interface OnItemClickListener{
        fun onItemClick(position: Int)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.data_row, parent, false)
        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.name?.text = users.data[position].name



    }

    override fun getItemCount() = users.data.size

}