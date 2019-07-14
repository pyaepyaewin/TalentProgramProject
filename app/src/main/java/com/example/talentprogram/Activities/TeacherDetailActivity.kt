package com.example.talentprogram.Activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.talentprogram.R
import kotlinx.android.synthetic.main.activity_teacher_detail.*

class TeacherDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_teacher_detail)
        back.setOnClickListener{
          goToTeacherActivity()
        }

    }
        companion object {

            fun newIntent(context: Context): Intent {
                val intent = Intent(context, TeacherDetailActivity::class.java)
                return intent
            }
        }
    fun goToTeacherActivity()
    {
        startActivity(TeacherActivity.newIntent(this))
    }

}