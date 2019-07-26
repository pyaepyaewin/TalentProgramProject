package com.example.talentprogram.Activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.talentprogram.Adapter.CourseDetailAdapter
import com.example.talentprogram.R
import kotlinx.android.synthetic.main.activity_course_detail.*

class CourseDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_course_detail)
        setSupportActionBar(courseDetailToolBar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        var androidCourseDetailList = mutableListOf<String>(
            "1.Version Control And Git",
            "2.Kotlin Programming",
            "3.Installation First App",
            "4.Activity And Activity Life Cycle",
            "5.Intent",
            "6.Fragment And Fragment Lifecycle"
        )

        //  var phpCourseDetailList= mutableListOf<String>("1.Php","2.Php","3.Php","4.Php","5.Php","6.Php")
//        var javaCourseDetailList= mutableListOf<String>("1.java","2.java","3.java","4.java","5.java","6.java")
//        var designCourseDetailList= mutableListOf<String>("1.design","2.design","3.design","4.design","5.design","6.design")
//        var basicCourseDetailList= mutableListOf<String>("1.basic","2.basic","3.basic","4.basic","5.basic","6.basic")


        var androidAdapter = CourseDetailAdapter(this, R.layout.coursedetail, androidCourseDetailList)
        //  var phpAdapter=CourseDetailAdapter(this,R.layout.coursedetail,phpCourseDetailList)
//        var javaAdapter=CourseDetailAdapter(this,R.layout.coursedetail,javaCourseDetailList)
//        var designAdapter=CourseDetailAdapter(this,R.layout.coursedetail,designCourseDetailList)
//        var basicAdapter=CourseDetailAdapter(this,R.layout.coursedetail,basicCourseDetailList)

        rvCourseDetail.layoutManager = LinearLayoutManager(this)
        rvCourseDetail.adapter = androidAdapter
        //    rvCourseDetail.adapter=phpAdapter
//        rvCourseDetail.adapter=javaAdapter
//        rvCourseDetail.adapter=designAdapter
//        rvCourseDetail.adapter=basicAdapter
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
    companion object {

        fun newIntent(context: Context): Intent {
            val intent = Intent(context, CourseDetailActivity::class.java)
            return intent
        }
    }
}