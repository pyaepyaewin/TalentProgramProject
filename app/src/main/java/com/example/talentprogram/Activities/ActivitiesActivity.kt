package com.example.talentprogram.Activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.talentprogram.Adapter.ActivitiesAdapter
import com.example.talentprogram.Database.ActivityDataClass
import com.example.talentprogram.Database.TeacherDataClass
import com.example.talentprogram.R
import kotlinx.android.synthetic.main.activity_activities.*
import kotlinx.android.synthetic.main.activity_activities_detail.*
import java.util.zip.Inflater

class ActivitiesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activities)
        backBtn.setOnClickListener {
            onBackPressed()
            true
        }

        var activity1 = ActivityDataClass("Sayar U Thein Oo",
            "Don't waint for opportunity,Create it",R.drawable.chairman,
            "ACE Data Systems Group ကေနျပီး TALENT Program ကို စတင္လိုက္ျပီ ျဖစ္ပါတယ္… TALENT ဆုိတာ (Training And Learning Environment Nurturing Talent) လို႕ ရည္ညႊန္းပါတယ္… အဲဒါေၾကာင့္ ဒီ Program မွာ IT Professional ျဖစ္ဖို႕လိုုအပ္တဲ့ Intensive Training ေတြ ပညာရွင္ပီပီ အလုပ္လုပ္ကိုင္ဖို႕ လုိအပ္တဲ့ Professional Value ေတြ ေလ့လာ သင္ၾကားနိုင္မယ့္ ပတ္ဝန္းက်င္ေကာင္းေတြနဲ႕အတူ ဆရာေကာင္း Senior ေကာင္းေတြက ပံ့ပိုးသင္ၾကားေပးသြားမွာ ျဖစ္ပါတယ္\n" +
                    "ACE Data Systems Group ကေနျပီး TALENT Program ကို စတင္လိုက္ျပီ ျဖစ္ပါတယ္… TALENT ဆုိတာ (Training And Learning Environment Nurturing Talent) လို႕ ရည္ညႊန္းပါတယ္… အဲဒါေၾကာင့္ ဒီ Program မွာ IT Professional ျဖစ္ဖို႕လိုုအပ္တဲ့ Intensive Training ေတြ ပညာရွင္ပီပီ အလုပ္လုပ္ကိုင္ဖို႕ လုိအပ္တဲ့ Professional Value ေတြ ေလ့လာ သင္ၾကားနိုင္မယ့္ ပတ္ဝန္းက်င္ေကာင္းေတြနဲ႕အတူ ဆရာေကာင္း Senior ေကာင္းေတြက ပံ့ပိုးသင္ၾကားေပးသြားမွာ ျဖစ္ပါတယ္")
       var activity2=ActivityDataClass("Talent Program Myanmar",
           "Talent Materials are ready now and waiting",R.drawable.present,
           "ACE Data Systems Group ကေနျပီး TALENT Program ကို စတင္လိုက္ျပီ ျဖစ္ပါတယ္… TALENT ဆုိတာ (Training And Learning Environment Nurturing Talent) လို႕ ရည္ညႊန္းပါတယ္… အဲဒါေၾကာင့္ ဒီ Program မွာ IT Professional ျဖစ္ဖို႕လိုုအပ္တဲ့ Intensive Training ေတြ ပညာရွင္ပီပီ အလုပ္လုပ္ကိုင္ဖို႕ လုိအပ္တဲ့ Professional Value ေတြ ေလ့လာ သင္ၾကားနိုင္မယ့္ ပတ္ဝန္းက်င္ေကာင္းေတြနဲ႕အတူ ဆရာေကာင္း Senior ေကာင္းေတြက ပံ့ပိုးသင္ၾကားေပးသြားမွာ ျဖစ္ပါတယ္\n" +
                   "ACE Data Systems Group ကေနျပီး TALENT Program ကို စတင္လိုက္ျပီ ျဖစ္ပါတယ္… TALENT ဆုိတာ (Training And Learning Environment Nurturing Talent) လို႕ ရည္ညႊန္းပါတယ္… အဲဒါေၾကာင့္ ဒီ Program မွာ IT Professional ျဖစ္ဖို႕လိုုအပ္တဲ့ Intensive Training ေတြ ပညာရွင္ပီပီ အလုပ္လုပ္ကိုင္ဖို႕ လုိအပ္တဲ့ Professional Value ေတြ ေလ့လာ သင္ၾကားနိုင္မယ့္ ပတ္ဝန္းက်င္ေကာင္းေတြနဲ႕အတူ ဆရာေကာင္း Senior ေကာင္းေတြက ပံ့ပိုးသင္ၾကားေပးသြားမွာ ျဖစ္ပါတယ္")
        var activity3 = ActivityDataClass("Sayar U Thein Oo",
            "Don't waint for opportunity,Create it",R.drawable.chairman,
            "ACE Data Systems Group ကေနျပီး TALENT Program ကို စတင္လိုက္ျပီ ျဖစ္ပါတယ္… TALENT ဆုိတာ (Training And Learning Environment Nurturing Talent) လို႕ ရည္ညႊန္းပါတယ္… အဲဒါေၾကာင့္ ဒီ Program မွာ IT Professional ျဖစ္ဖို႕လိုုအပ္တဲ့ Intensive Training ေတြ ပညာရွင္ပီပီ အလုပ္လုပ္ကိုင္ဖို႕ လုိအပ္တဲ့ Professional Value ေတြ ေလ့လာ သင္ၾကားနိုင္မယ့္ ပတ္ဝန္းက်င္ေကာင္းေတြနဲ႕အတူ ဆရာေကာင္း Senior ေကာင္းေတြက ပံ့ပိုးသင္ၾကားေပးသြားမွာ ျဖစ္ပါတယ္\n" +
                    "ACE Data Systems Group ကေနျပီး TALENT Program ကို စတင္လိုက္ျပီ ျဖစ္ပါတယ္… TALENT ဆုိတာ (Training And Learning Environment Nurturing Talent) လို႕ ရည္ညႊန္းပါတယ္… အဲဒါေၾကာင့္ ဒီ Program မွာ IT Professional ျဖစ္ဖို႕လိုုအပ္တဲ့ Intensive Training ေတြ ပညာရွင္ပီပီ အလုပ္လုပ္ကိုင္ဖို႕ လုိအပ္တဲ့ Professional Value ေတြ ေလ့လာ သင္ၾကားနိုင္မယ့္ ပတ္ဝန္းက်င္ေကာင္းေတြနဲ႕အတူ ဆရာေကာင္း Senior ေကာင္းေတြက ပံ့ပိုးသင္ၾကားေပးသြားမွာ ျဖစ္ပါတယ္")
var arrayActivity= mutableListOf<ActivityDataClass>(activity1,activity2,activity3)

       var adapter= ActivitiesAdapter(this,R.layout.activities,arrayActivity)
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

