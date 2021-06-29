package com.arslan.testinginandroid.utils


import com.google.common.truth.Truth.assertThat
import org.junit.Test

class TimeUtilsTest{
    @Test
    fun `check date format returns the correct date string`(){
        val inputDate = "2021-06-11T18:00:00"
        val result = inputDate.toReadableDateFormat()
        assertThat(result).isEqualTo("11 Jun 2021 | 11:00 PM")
    }
    @Test
    fun `check wrong date format returns error message`(){
        val inputDate = "ghgdhgfhgfhhf"
        val result = inputDate.toReadableDateFormat()
        assertThat(result).isEqualTo("${Constants.WRONG_DATE} $inputDate")
    }
    @Test
    fun `check empty date format returns error message`(){
        val inputDate = ""
        val result = inputDate.toReadableDateFormat()
        assertThat(result).isEqualTo(Constants.EMPTY_DATE)
    }
    @Test
    fun `check null date format returns error message`(){
        val inputDate = null
        val result = inputDate.toReadableDateFormat()
        assertThat(result).isEqualTo(Constants.NULL_DATE)
    }
}