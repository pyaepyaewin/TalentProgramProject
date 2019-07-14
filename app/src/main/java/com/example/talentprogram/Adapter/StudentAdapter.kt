package com.example.talentprogram.Adapter

import android.content.Context
import android.text.Layout
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.talentprogram.Activities.StudentActivity
import com.example.talentprogram.Activities.StudentDetailActivity
import com.example.talentprogram.Database.StudentDataClass
import com.example.talentprogram.ViewHolder.StudentViewHolder
import java.util.zip.Inflater

class StudentAdapter(var context: Context,var layout: Int,var list:List<StudentDataClass>,var icon:List<Int>):
    RecyclerView.Adapter<StudentViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentViewHolder {
        var inflater= LayoutInflater.from(context)
        var view=inflater.inflate(layout,parent,false)
        return StudentViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.count()
    }

    override fun onBindViewHolder(holder: StudentViewHolder, position: Int) {

    holder.studentName.text=list[position].name
        holder.studentMajor.text=list[position].major
        holder.studentIcon.setImageResource(icon[position])
        holder.itemView.setOnClickListener{
            context.startActivity(StudentDetailActivity.newIntent(context))
        }

    }

}