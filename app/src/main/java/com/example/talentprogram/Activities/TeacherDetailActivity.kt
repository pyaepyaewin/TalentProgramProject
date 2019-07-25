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
        back.setOnClickListener {
           onBackPressed()
            true
        }

        var teacherName = intent.getStringExtra(TEACHER_NAME)
        var teacherImage = intent.getIntExtra(TEACHER_IMAGE, 0)

        var teacherWork = intent.getStringExtra(TEACHER_WORK)
        var teacherOffice = intent.getStringExtra(TEACHER_OFFICE)
        var teacherBirthday = intent.getStringExtra(TEACHER_BIRTHDAY)
        var teacherPhone = intent.getStringExtra(TEACHER_PHONE)
        var teacherGmail = intent.getStringExtra(TEACHER_GMAIL)
        txtTeacherName.text = teacherName
        teacherTza.setImageResource(teacherImage)
        txtWork.text = teacherWork
        txtOffice.text = teacherOffice
        txtBirthday.text = teacherBirthday
        txtPhone.text = teacherPhone
        txtEmail.text = teacherGmail


    }

    companion object {
        const val TEACHER_NAME = "teacher_name"

        const val TEACHER_IMAGE = "teacher_image"
        const val TEACHER_WORK = "teacher_work"
        const val TEACHER_OFFICE = "teacher_office"
        const val TEACHER_BIRTHDAY = "teacher_birthday"
        const val TEACHER_PHONE = "teacher_phone"
        const val TEACHER_GMAIL = "teacher_gmail"


        fun newIntent(
            context: Context, name: String, image: Int, work: String,
            office: String, birthday: String, phone: String, gmail: String
        ): Intent {
            val intent = Intent(context, TeacherDetailActivity::class.java)

            intent.putExtra(TEACHER_NAME, name)

            intent.putExtra(TEACHER_IMAGE, image)
            intent.putExtra(TEACHER_WORK, work)
            intent.putExtra(TEACHER_OFFICE, office)
            intent.putExtra(TEACHER_BIRTHDAY, birthday)
            intent.putExtra(TEACHER_PHONE, phone)
            intent.putExtra(TEACHER_GMAIL, gmail)
            return intent
        }
    }
}