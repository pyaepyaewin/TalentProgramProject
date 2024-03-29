package com.example.talentprogram.Activities

import android.bluetooth.BluetoothClass
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.recyclerview.widget.GridLayoutManager
import com.example.talentprogram.Adapter.TeacherAdapter
import com.example.talentprogram.Database.TeacherDataClass
import com.example.talentprogram.R
import kotlinx.android.synthetic.main.activity_teacher.*

class TeacherActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_teacher)
        teacherToolBar.setTitle("Teacher")
        setSupportActionBar(teacherToolBar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        var imageIcon= mutableListOf<Int>(
            R.drawable.tza,
            R.drawable.pla,
            R.drawable.kkk,
            R.drawable.msp

        )
        var teacher1 = TeacherDataClass("Ma Thaw Zin Aung","Android",imageIcon[0],"Mobile Developer",
            "Ace Plus Solution Co.Ltd","1.1.1996","09453113658","thawzinaung.tza@gmail.com")
        var teacher2 = TeacherDataClass("Phone Lin Aung","Android",imageIcon[1],
            "Mobile Developer","ACE",
            "2.1.1996","123434","phonelinaung@gmail.com")
        var teacher3 = TeacherDataClass("Kyaw Kyaw Khaing","Android",imageIcon[2],"Mobile Developer","Ace Plus Solution Co.Ltd","1.1.1996","099123456","kyawkyawkhaing@gmail.com")
        var teacher4 = TeacherDataClass("Myo Set Paing","Android",imageIcon[3],"Mobile Developer","Ace Plus Solution Co.Ltd",
            "2.1.1996","09951104661","myosetpaing@gmail.com")
        var teacherArray = mutableListOf<TeacherDataClass>(teacher1,teacher2,teacher3,teacher4)

        var adapter = TeacherAdapter(this, R.layout.teacher, teacherArray, imageIcon)
       rvTeacher.layoutManager = GridLayoutManager(this,2)
        rvTeacher.adapter = adapter
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.filter,menu)
        return true
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

