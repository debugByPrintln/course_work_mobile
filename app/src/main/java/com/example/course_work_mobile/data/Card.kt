package com.example.course_work_mobile.data

import android.os.Parcelable
import androidx.annotation.DrawableRes
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Card(
    val name: String,
    val alternativeNames: String,
    val pharmacologicGroup: String,
    val workMechanism: String,
    val indications: String,
    val contraindications: String,
    val sideEffects: String,
    val guidance: String,
    val releaseForm : String
):Parcelable