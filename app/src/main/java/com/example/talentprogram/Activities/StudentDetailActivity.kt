package com.example.talentprogram.Activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.talentprogram.R
import kotlinx.android.synthetic.main.activity_student_detail.*

class StudentDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_detail)


    }

    companion object {

        fun newIntent(context: Context): Intent {
            val intent = Intent(context, StudentDetailActivity::class.java)
            return intent
        }
    }


}
