package com.example.course_work_mobile.learnUI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.course_work_mobile.R
import com.example.course_work_mobile.adapter.CardAdapter
import com.example.course_work_mobile.data.CardStorage
import kotlinx.android.synthetic.main.activity_learn.*

class LearnActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_learn)
        val cards = CardStorage.getCardList()
        val crds = CardStorage.getCardList()
        val adapter = CardAdapter(this, crds) {position ->
            val card = cards[position]
            val intent = DetailsActivity.createIntent(this, card)
            startActivity(intent)
        }

        cardList.adapter = adapter
    }
}