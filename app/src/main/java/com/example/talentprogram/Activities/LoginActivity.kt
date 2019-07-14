package com.example.talentprogram.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.talentprogram.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        btnLogin.setOnClickListener{
            gotoMainActivity()
        }
    }
    private fun gotoMainActivity()
    {
        startActivity(MainActivity.newIntent(this))
    }
}
