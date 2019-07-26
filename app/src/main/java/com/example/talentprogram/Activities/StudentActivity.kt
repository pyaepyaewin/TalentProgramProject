package com.example.talentprogram.Activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.LinearLayout
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.talentprogram.Adapter.StudentAdapter
import com.example.talentprogram.Database.StudentDataClass
import com.example.talentprogram.R
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import kotlinx.android.synthetic.main.activity_student.*
import kotlinx.android.synthetic.main.bottomsheet.*
import kotlinx.android.synthetic.main.bottomsheet.view.*

class StudentActivity : AppCompatActivity() {
   // private lateinit var sheetBehavior: BottomSheetBehavior<LinearLayout>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student)
        studentToolBar.setTitle("Student")
        setSupportActionBar(studentToolBar)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

//        val cor_layout = corBottom
//        val botttom = cor_layout.bottomSheet
//        sheetBehavior = BottomSheetBehavior.from(botttom)
//        sheetBehavior.state = BottomSheetBehavior.STATE_EXPANDED


        var imageIcon = mutableListOf<Int>(
            R.drawable.yla,
            R.drawable.cmk,
            R.drawable.ppw,
            R.drawable.mmk
        )
        var student1 = StudentDataClass(
            "Ye Lin Aung", "Android", imageIcon[0],
            "Mobile Developer", "Ace Plus Solution Co.Ltd", "Hlaing Thar Yar", "1.1.1998", "09253366392"
        )
        var student2 = StudentDataClass(
            "Chit Myo Ko",
            "Android",
            imageIcon[1],
            "Mobile Developer",
            "Ace Plus Solution Co.Ltd",
            "Hlaing Township",
            "1.1.1997",
            "09969979091"
        )
        var student3 = StudentDataClass(
            "Pyae Pyae Win",
            "Android",
            imageIcon[2],
            "Mobile Developer",
            "Ace Plus Solution Co.Ltd",
            "No.203,KyunChan 3rd Street,Kamayut Township",
            "4.4.1996",
            "09970888966"
        )
        var student4 = StudentDataClass(
            "Mya Mya Kyaing",
            "Android",
            imageIcon[3],
            "Mobile Developer",
            "Ace Plus Solution Co.Ltd",
            "Kamayut Township",
            "1.1.1996",
            "09459203722"
        )
        var studentArray = mutableListOf<StudentDataClass>(student1, student2, student3, student4)
        var adapter = StudentAdapter(this, R.layout.student, studentArray, imageIcon)
        rvStudent.layoutManager = GridLayoutManager(this, 2)
        rvStudent.adapter = adapter

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.filter, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if (item.itemId == R.id.filter){
            //sheetBehavior.state = BottomSheetBehavior.STATE_EXPANDED
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }



//    companion object {
//        fun newIntent(context: Context): Intent {
//            val intent = Intent(context, MainActivity::class.java)
//            return intent
//        }
//    }

//    private fun slideUpDownBottomSheet() {
//        if (bottomSheetBehavior.state != BottomSheetBehavior.STATE_EXPANDED) {
//            bottomSheetBehavior.state = BottomSheetBehavior.STATE_EXPANDED
//
//        } else {
//            bottomSheetBehavior.state = BottomSheetBehavior.STATE_COLLAPSED
//
//        }
//    }
}
