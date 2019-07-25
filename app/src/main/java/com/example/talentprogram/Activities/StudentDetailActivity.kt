package com.example.talentprogram.Activities

import android.bluetooth.BluetoothClass
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
        backArrow.setOnClickListener {
            onBackPressed()
            true
        }
        var studentName = intent.getStringExtra(STUDENT_NAME)
        var studentMajor=intent.getStringExtra(STUDENT_MAJOR)
        var studentImage = intent.getIntExtra(STUDENT_IMAGE,0)

        var studentWork=intent.getStringExtra(STUDENT_WORK)
        var studentOffice=intent.getStringExtra(STUDENT_OFFICE)
        var studentBirthday=intent.getStringExtra(STUDENT_BIRTHDAY)
        var studentPhone=intent.getStringExtra(STUDENT_PHONE)

      name.text=studentName
        major.text=studentMajor
        image.setImageResource(studentImage)
        work.text=studentWork
        office.text=studentOffice
        birthday.text=studentBirthday
        phone.text=studentPhone


    }

    companion object {
const val STUDENT_NAME="student_name"
        const val STUDENT_MAJOR="student_major"
        const val STUDENT_IMAGE="student_image"
        const val STUDENT_WORK="student_work"
        const val STUDENT_OFFICE="student_office"
        const val STUDENT_ADDRESS="student_address"
        const val STUDENT_BIRTHDAY="student_birthday"
        const val STUDENT_PHONE="student_phone"


        fun newIntent(context: Context,name:String,major:String,image:Int,
                      work:String,office:String,address:String,
                      birthday:String,phone:String): Intent {
            val intent = Intent(context, StudentDetailActivity::class.java)

            intent.putExtra(STUDENT_NAME,name)
            intent.putExtra(STUDENT_IMAGE,image)
            intent.putExtra(STUDENT_MAJOR,major)
            intent.putExtra(STUDENT_WORK,work)
            intent.putExtra(STUDENT_OFFICE,office)
            intent.putExtra(STUDENT_ADDRESS,address)
            intent.putExtra(STUDENT_BIRTHDAY,birthday)
            intent.putExtra(STUDENT_PHONE,phone)

            return intent
        }
    }


}
