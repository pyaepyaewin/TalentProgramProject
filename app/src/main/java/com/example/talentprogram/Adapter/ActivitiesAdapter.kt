package com.example.talentprogram.Adapter


import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup

import androidx.recyclerview.widget.RecyclerView
import com.example.talentprogram.Activities.ActivitiesActivity
import com.example.talentprogram.Activities.ActivitiesDetailActivity
import com.example.talentprogram.Database.ActivityDataClass
import com.example.talentprogram.ViewHolder.ActivitiesViewHolder

class ActivitiesAdapter (var context: Context, var layout:Int, var list: List<ActivityDataClass>):
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
       holder.name.text=list[position].chairmanName
        holder.text.text=list[position].text
        holder.image.setImageResource(list[position].backgroundImage)

        holder.itemView.setOnClickListener {
            context.startActivity(ActivitiesDetailActivity.newIntent(context,list[position].chairmanName,
                list[position].backgroundImage,list[position].bodyText))
        }
    }
}
