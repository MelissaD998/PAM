package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.title);
        val button = findViewById<Button>(R.id.button);
        val reset = findViewById<Button>(R.id.reset);
        val datePicker = findViewById<DatePicker>(R.id.givenDate);
        val result = findViewById<TextView>(R.id.result)
        val currentYear = datePicker.year

        button.setOnClickListener {
            val birthdayYear = datePicker.year
            if (birthdayYear > currentYear || birthdayYear == currentYear) {
                result.text = "Incorrect"
            } else {
                val age = currentYear - birthdayYear
                result.text = "Your age is $age"
            }
        }

        reset.setOnClickListener {
            result.text = "Result"
        }

    }
}