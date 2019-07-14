package com.example.talentprogram.ViewHolder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.course.view.*

class CourseViewHolder(v: View): RecyclerView.ViewHolder(v) {
    var courseName = v.tvCourseName
    var courseIcon=v.ivCourseIcon
}