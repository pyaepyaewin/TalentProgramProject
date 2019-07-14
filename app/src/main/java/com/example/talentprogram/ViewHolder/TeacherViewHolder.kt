package com.example.talentprogram.ViewHolder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.nav_header_main.view.*


import kotlinx.android.synthetic.main.teacher.view.*


class TeacherViewHolder(v: View):RecyclerView.ViewHolder(v)
{
    var teacherName= v.txtView1
    var major=v.txtView2
    var icon=v.imageTeacher

}