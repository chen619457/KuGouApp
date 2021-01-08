package com.example.kugouapplication

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Classification (
        val title:String,val content:String,val image:Int,val music:String
):Parcelable
