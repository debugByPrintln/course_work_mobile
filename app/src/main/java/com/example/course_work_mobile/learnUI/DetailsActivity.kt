package com.example.course_work_mobile.learnUI

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.course_work_mobile.R
import com.example.course_work_mobile.data.Card
import java.lang.IllegalArgumentException

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        val card = intent?.getParcelableExtra<Card>(ARGS_VERSION)
            ?: throw IllegalArgumentException("Missing argument")

        findViewById<TextView>(R.id.name).text = card.name
        findViewById<TextView>(R.id.alternativeNames).text = card.alternativeNames
        findViewById<TextView>(R.id.pharmacologicGroup).text = card.pharmacologicGroup
        findViewById<TextView>(R.id.workMechanism).text = card.workMechanism
        findViewById<TextView>(R.id.indications).text = card.indications
        findViewById<TextView>(R.id.contraIndications).text = card.contraindications
        findViewById<TextView>(R.id.sideEffects).text = card.sideEffects
        findViewById<TextView>(R.id.guidance).text = card.guidance
        findViewById<TextView>(R.id.releaseForm).text = card.releaseForm
    }

    companion object {
        private const val ARGS_VERSION = "ARGS_VERSION"

        fun createIntent(context: Context, card: Card): Intent {
            val intent = Intent(context, DetailsActivity::class.java)
            intent.putExtra(ARGS_VERSION, card)
            return intent
        }
    }
}