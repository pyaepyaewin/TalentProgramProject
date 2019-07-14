package com.example.talentprogram.ViewHolder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.student.view.*

class StudentViewHolder (v: View):RecyclerView.ViewHolder(v)
{
    var studentName=v.txtStudent1
    var studentMajor=v.txtStudent2
    var studentIcon=v.studentImage
}