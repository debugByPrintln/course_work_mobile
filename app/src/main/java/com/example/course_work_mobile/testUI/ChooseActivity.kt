package com.example.course_work_mobile.testUI

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.course_work_mobile.R
import com.example.course_work_mobile.data.Constants
import kotlinx.android.synthetic.main.activity_choose.*

class ChooseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose)

        test1.setOnClickListener {
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra(Constants.TEST, "test1")
            startActivity(intent)
        }

        test2.setOnClickListener {
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra(Constants.TEST, "test2")
            startActivity(intent)
        }

//        test3.setOnClickListener {
//            val intent = Intent(this, QuestionActivity::class.java)
//            intent.putExtra(Constants.TEST, "test3")
//            startActivity(intent)
//        }
//
//        test4.setOnClickListener {
//            val intent = Intent(this, QuestionActivity::class.java)
//            intent.putExtra(Constants.TEST, "test4")
//            startActivity(intent)
//        }
    }
}