package com.arslan.testinginandroid.utils

import android.annotation.SuppressLint
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*
@SuppressLint("SimpleDateFormat")
fun String?.toReadableDateFormat(): String{
    if (this == null){
        return Constants.NULL_DATE
    }
    if (this.isEmpty()){
        return Constants.EMPTY_DATE
    }
    return try {
        val simpleDateFormat = SimpleDateFormat(Constants.DATE_FORMAT_UTC)
        simpleDateFormat.timeZone = TimeZone.getTimeZone("UTC")
        val dateObj = simpleDateFormat.parse(this)
        SimpleDateFormat(Constants.READABLE_DATE_FORMAT).format(dateObj)
    }catch (e:ParseException){
        e.printStackTrace()
        "${Constants.WRONG_DATE} $this"
    }

}