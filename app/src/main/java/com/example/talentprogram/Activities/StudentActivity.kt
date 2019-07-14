package com.example.talentprogram.Activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.talentprogram.Adapter.StudentAdapter
import com.example.talentprogram.Database.StudentDataClass
import com.example.talentprogram.R
import kotlinx.android.synthetic.main.activity_student.*

class StudentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student)
        var imageIcon= mutableListOf<Int>(
            R.drawable.yla,
            R.drawable.cmk,
            R.drawable.ppw,
            R.drawable.mmk)
    var student1=StudentDataClass("Ye Lin Aung","Android",imageIcon[0])
    var student2=StudentDataClass("Chit Myo Ko","Android",imageIcon[1])
    var student3=StudentDataClass("Pyae Pyae Win","Android",imageIcon[2])
    var student4=StudentDataClass("Mya Mya Kyaing","Android",imageIcon[3])
    var studentArray= mutableListOf<StudentDataClass>(student1,student2,student3,student4)
        var adapter=StudentAdapter(this,R.layout.student,studentArray,imageIcon)
        rvStudent.layoutManager=GridLayoutManager(this,2)
        rvStudent.adapter=adapter
    }
    companion object{
        fun newIntent(context: Context):Intent{
            val intent=Intent(context,MainActivity::class.java)
         return intent
        }
    }
}
