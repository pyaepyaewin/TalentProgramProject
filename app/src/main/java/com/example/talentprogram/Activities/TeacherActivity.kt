package com.example.talentprogram.Activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.talentprogram.Adapter.TeacherAdapter
import com.example.talentprogram.Database.TeacherDataClass
import com.example.talentprogram.R
import kotlinx.android.synthetic.main.activity_teacher.*

class TeacherActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_teacher)
        var imageIcon= mutableListOf<Int>(
            R.drawable.tza,
            R.drawable.pla,
            R.drawable.kkk,
            R.drawable.msp

        )
        var teacher1 = TeacherDataClass("Ma Thaw Zin Aung","Android",imageIcon[0])
        var teacher2 = TeacherDataClass("Phone Lin Aung","Android",imageIcon[1])
        var teacher3 = TeacherDataClass("Kyaw Kyaw Khaing","Android",imageIcon[2])
        var teacher4 = TeacherDataClass("Myo Set Paing","Android",imageIcon[3])
        var teacherArray = mutableListOf<TeacherDataClass>(teacher1,teacher2,teacher3,teacher4)

        var adapter = TeacherAdapter(this, R.layout.teacher, teacherArray, imageIcon)
       rvTeacher.layoutManager = GridLayoutManager(this,2)
        rvTeacher.adapter = adapter
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

