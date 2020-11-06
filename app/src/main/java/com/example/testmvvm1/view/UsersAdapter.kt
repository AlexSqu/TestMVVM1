package com.example.testmvvm1.view


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.testmvvm1.R
import com.example.testmvvm1.dataclasses.Data
import com.example.testmvvm1.model.data


//адаптер для отображения данных в recyclerview
class UsersAdapter (private val users: List<data>) : RecyclerView.Adapter<UsersAdapter.ViewHolder>(){

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var name: TextView? = null
        init{
            name = itemView?.findViewById((R.id.name))

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.data_row, parent, false)
        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.name?.text = users[position].name

    }

    override fun getItemCount() = users.size

}