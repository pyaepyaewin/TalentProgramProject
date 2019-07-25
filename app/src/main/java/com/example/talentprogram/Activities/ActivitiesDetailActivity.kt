package com.example.talentprogram.Activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.talentprogram.R
import kotlinx.android.synthetic.main.activity_activities_detail.*
import kotlinx.android.synthetic.main.activity_student_detail.*
import java.security.AccessControlContext

class ActivitiesDetailActivity : AppCompatActivity() {
    companion object
    {
        const val NAME="name"
        const val TEXT_BODY="text"
        const val IMAGE="image"
        fun newIntent(context:Context,name:String,image:Int,textBody:String): Intent {
            val intent=Intent(context,ActivitiesDetailActivity::class.java)
            intent.putExtra(NAME,name)
            intent.putExtra(IMAGE,image)
            intent.putExtra(TEXT_BODY,textBody)
            return intent
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activities_detail)
        back.setOnClickListener {
           onBackPressed()
            true
        }
        var name=intent.getStringExtra(NAME)
        var text=intent.getStringExtra(TEXT_BODY)
        var image=intent.getIntExtra(IMAGE,0)
txtChairman.text=name

        txtDetail.text=text
        imageChairman.setImageResource(image)
    }

}
