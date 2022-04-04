package com.mirea.kotov.dialog

import android.app.ProgressDialog
import android.app.TimePickerDialog.OnTimeSetListener
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickShowDialog(view: View){
        val dialogFragment = MyDialogFragment()
        dialogFragment.show(supportFragmentManager, "mirea")
    }

    fun onClickShowDateDialog(view: View){
        MyDateDialogFragment().show(supportFragmentManager, "mirea")
    }

    fun onClickShowTimeDialog(view: View){
        MyTimeDialogFragment().show(supportFragmentManager, "mirea")
    }

    fun onClickProgressDialog(view: View){
        MyProgressDialog().show(supportFragmentManager, "mirea")
    }

    fun onOkClicked() {
        Toast.makeText(
            applicationContext,
            "Вы выбрали кнопку \"Иду дальше\"!",
            Toast.LENGTH_LONG
        ).show()
    }

    fun onCancelClicked() {
        Toast.makeText(
            applicationContext,
            "Вы выбрали кнопку \"Нет\"!",
            Toast.LENGTH_LONG
        ).show()
    }

    fun onNeutralClicked() {
        Toast.makeText(
            applicationContext,
            "Вы выбрали кнопку \"На паузе\"!",
            Toast.LENGTH_LONG
        ).show()
    }
}