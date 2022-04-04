package com.mirea.kotov.intentfilter

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onOpenBrowserBtnClick(view: View){
        val address: Uri = Uri.parse("https://www.mirea.ru/")
        val openLinkIntent = Intent(Intent.ACTION_VIEW, address)

        if (openLinkIntent.resolveActivity(packageManager) != null) {
            startActivity(openLinkIntent)
        } else {
            Log.d("Intent", "Не получается обработать намерение!")
        }
    }

    fun onShareBtnClick(view:View){
        val shareIntent = Intent(Intent.ACTION_SEND)
        shareIntent.type = "text/plain"
        shareIntent.putExtra(Intent.EXTRA_SUBJECT, "MIREA")
        shareIntent.putExtra(Intent.EXTRA_TEXT, "ФАМИЛИЯ ИМЯ ОТЧЕСТВО")
        startActivity(Intent.createChooser(shareIntent, "МОИ ФИО"))
    }
}