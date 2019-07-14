package com.example.talentprogram.Activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.talentprogram.Adapter.CourseAdapter
import com.example.talentprogram.Database.CourseItem
import com.example.talentprogram.R
import kotlinx.android.synthetic.main.activity_course.*

class CourseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_course)
        var course_1 = CourseItem("Android Development")
        var course_2 = CourseItem("PHP Development")
        var course_3 = CourseItem("Java Development")
        var course_4 = CourseItem("Design Implementation")
        var course_5 = CourseItem("Computer Basic")
        var courseArr = mutableListOf<CourseItem>(course_1, course_2,course_3,course_4,course_5)
        var imageIcon= mutableListOf<Int>(
            R.drawable.android,
            R.drawable.php,
            R.drawable.java,
            R.drawable.design,
            R.drawable.basic
        )
        var adapter = CourseAdapter(this, R.layout.course, courseArr, imageIcon)
        rcCourse.layoutManager = LinearLayoutManager(this)
        rcCourse.adapter = adapter
    }
    companion object
    {
        fun newIntent(context: Context): Intent
        {
            val intent= Intent(context, MainActivity::class.java)
            return intent
        }
    }
}
