package com.example.androidkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputFilter
import kotlinx.android.synthetic.main.activity_basic_widjet.*

class BasicWidjet : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basic_widjet)

        val text : String = edit1.text.toString()
        edit1.setFilters(
            arrayOf<InputFilter>(
                InputFilter.LengthFilter(3)))
    }
}