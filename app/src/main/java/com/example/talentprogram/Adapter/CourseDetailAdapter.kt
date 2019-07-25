package com.example.talentprogram.Adapter

import android.content.Context
import android.text.Layout
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.talentprogram.Activities.CourseDetailActivity
import com.example.talentprogram.ViewHolder.CourseDetailViewHolder
import java.util.zip.Inflater

class CourseDetailAdapter(var context: Context,var layout: Int,var list: List<String>):RecyclerView.Adapter<CourseDetailViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CourseDetailViewHolder {
        var inflater= LayoutInflater.from(context)
        var view=inflater.inflate(layout,parent,false)
        return CourseDetailViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.count()
    }

    override fun onBindViewHolder(holder: CourseDetailViewHolder, position: Int) {
    holder.courseDetailName.text=list[position]
        holder.itemView.setOnClickListener{
            context.startActivity(CourseDetailActivity.newIntent(context))
        }
    }

}