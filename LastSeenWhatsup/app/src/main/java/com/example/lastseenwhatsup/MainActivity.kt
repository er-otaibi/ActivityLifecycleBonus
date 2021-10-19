package com.example.lastseenwhatsup

import android.icu.text.SimpleDateFormat
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.annotation.RequiresApi
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var tvText: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvText = findViewById(R.id.tvText)
    }

    override fun onResume() {
        tvText.append("\nOnline")
        super.onResume()
    }

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onPause() {
        tvText.append("\nLast Seen: ${SimpleDateFormat("hh:mm:ss a dd/M/yyyy").format(Date())}")
        super.onPause()
    }
}