package com.example.talentprogram.Activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.talentprogram.Adapter.ActivitiesAdapter
import com.example.talentprogram.Database.ActivityDataClass
import com.example.talentprogram.Database.TeacherDataClass
import com.example.talentprogram.R
import kotlinx.android.synthetic.main.activity_activities.*

class ActivitiesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activities)
var imageArray= mutableListOf<Int>(
    R.drawable.chairman,
    R.drawable.present,
    R.drawable.favorite,
    R.drawable.comment,
    R.drawable.seen
)
        var activity1 = ActivityDataClass("Sayar U Thein Oo","Don't waint for opportunity,Create it","1.8M",
            "50K","1.8M seen",imageArray[0],imageArray[2],imageArray[3],imageArray[4])
        var activity2 = ActivityDataClass("Talent Program Myanmar","Talent Materials are ready now and waiting","1.8M",
            "50K","1.8M seen",imageArray[1],imageArray[2],imageArray[3],imageArray[4])
        var activity3 = ActivityDataClass("Sayar U Thein Oo","Don't waint for opportunity,Create it","1.8M",
            "50K","1.8M seen",imageArray[2],imageArray[2],imageArray[3],imageArray[4])

var arrayActivity= mutableListOf<ActivityDataClass>(activity1,activity2,activity3)

        var adapter= ActivitiesAdapter(this,R.layout.activities,arrayActivity,imageArray)
        rvActivities.layoutManager=LinearLayoutManager(this)
        rvActivities.adapter=adapter
    }
    companion object{
        fun newIntent(context: Context):Intent{
            val intent= Intent(context,MainActivity::class.java)
            return intent
        }
    }
    }

