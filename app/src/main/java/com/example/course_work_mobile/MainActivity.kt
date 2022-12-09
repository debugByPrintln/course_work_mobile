package com.example.course_work_mobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.course_work_mobile.learnUI.LearnActivity
import com.example.course_work_mobile.testUI.ChooseActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        learn_button.setOnClickListener {
            val intent = Intent(this, LearnActivity::class.java)
            startActivity(intent)
        }

        test_button.setOnClickListener {
            val intent = Intent(this, ChooseActivity::class.java)
            startActivity(intent)
        }
    }
}