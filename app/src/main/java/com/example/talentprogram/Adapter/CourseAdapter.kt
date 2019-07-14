package com.example.talentprogram.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.talentprogram.Activities.CourseDetailActivity
import com.example.talentprogram.Activities.PhpCourseDetailActivity
import com.example.talentprogram.Database.CourseItem
import com.example.talentprogram.ViewHolder.CourseViewHolder


class CourseAdapter(var context: Context, var layout: Int, var list: List<CourseItem>, var icon:List<Int>):
    RecyclerView.Adapter<CourseViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CourseViewHolder {
            var inflater = LayoutInflater.from(context)
            var view = inflater.inflate(layout,parent,false)
            return CourseViewHolder(view)
        }

        override fun getItemCount(): Int {
            return list.count()
        }

        override fun onBindViewHolder(holder: CourseViewHolder, position: Int) {
            holder.courseName.text = list[position].courseName
            holder.courseIcon.setImageResource(icon[position])
            holder.itemView.setOnClickListener{
                context.startActivity(CourseDetailActivity.newIntent(context))
            }

        }
    }
