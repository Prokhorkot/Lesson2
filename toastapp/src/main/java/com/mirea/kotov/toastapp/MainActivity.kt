package com.mirea.kotov.toastapp

import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inflater = layoutInflater
        val container = findViewById<ViewGroup>(R.id.custom_toast_container)
        val layout: View = inflater.inflate(R.layout.custom_toast, container)
        val text: TextView = layout.findViewById(R.id.text)
        text.text = "Здравствуй MIREA! ФИО"
        with (Toast(applicationContext)) {
            setGravity(Gravity.BOTTOM, 0, 0)
            duration = Toast.LENGTH_LONG
            view = layout
            show()
        }
    }
}