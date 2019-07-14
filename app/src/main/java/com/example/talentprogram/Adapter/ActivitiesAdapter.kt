package com.example.talentprogram.Adapter


import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup

import androidx.recyclerview.widget.RecyclerView
import com.example.talentprogram.Activities.ActivitiesActivity
import com.example.talentprogram.Database.ActivityDataClass
import com.example.talentprogram.ViewHolder.ActivitiesViewHolder

class ActivitiesAdapter (var context: Context, var layout:Int, var list: List<ActivityDataClass>, var icon:List<Int>):
RecyclerView.Adapter<ActivitiesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ActivitiesViewHolder {
       var inflater=LayoutInflater.from(context)
        var view = inflater.inflate(layout, parent, false)
        return ActivitiesViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.count()
    }

    override fun onBindViewHolder(holder: ActivitiesViewHolder, position: Int) {
        holder.text1.text = list[position].text1
        holder.text2.text = list[position].text2
        holder.text3.text = list[position].text3
        holder.text4.text = list[position].text4
        holder.text5.text = list[position].text5
        holder.image.setImageResource(icon[position])

        holder.itemView.setOnClickListener {
            context.startActivity(ActivitiesActivity.newIntent(context))
        }
    }
}