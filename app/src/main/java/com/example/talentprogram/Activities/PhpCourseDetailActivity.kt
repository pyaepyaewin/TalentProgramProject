package com.example.talentprogram.Activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.talentprogram.R

class PhpCourseDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_php_course_detail)

    }

    companion object {

        fun newIntent(context: Context): Intent {
            val intent = Intent(context, CourseDetailActivity::class.java)
            return intent
        }
    }
}