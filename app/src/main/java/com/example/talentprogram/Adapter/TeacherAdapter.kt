package com.example.talentprogram.Adapter

import android.content.Context
import android.media.Image
import android.text.Layout
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.talentprogram.Activities.CourseDetailActivity
import com.example.talentprogram.Activities.TeacherActivity
import com.example.talentprogram.Activities.TeacherDetailActivity
import com.example.talentprogram.Database.CourseItem
import com.example.talentprogram.Database.TeacherDataClass
import com.example.talentprogram.ViewHolder.CourseViewHolder
import com.example.talentprogram.ViewHolder.TeacherViewHolder

class TeacherAdapter(var context: Context, var layout: Int, var list: List<TeacherDataClass>, var icon:List<Int>):
    RecyclerView.Adapter<TeacherViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeacherViewHolder {
        var inflater = LayoutInflater.from(context)
        var view = inflater.inflate(layout,parent,false)
        return TeacherViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.count()
    }

    override fun onBindViewHolder(holder: TeacherViewHolder, position: Int) {
        holder.teacherName.text = list[position].name
            holder.major.text=list[position].major
        holder.icon.setImageResource(icon[position])
        holder.itemView.setOnClickListener{
            context.startActivity(TeacherDetailActivity.newIntent(context))
        }
    }
}
