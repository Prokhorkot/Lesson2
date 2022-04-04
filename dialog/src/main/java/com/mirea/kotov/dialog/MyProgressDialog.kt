package com.mirea.kotov.dialog

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.print.PrintAttributes
import android.view.Gravity
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.ProgressBar
import android.widget.TextView
import androidx.core.view.marginBottom
import androidx.fragment.app.DialogFragment

class MyProgressDialog: DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder: AlertDialog.Builder = AlertDialog.Builder(activity)
        val baseLayout: LinearLayout = LinearLayout(activity)
        baseLayout.setPadding(20, 20, 20, 20)

        baseLayout.orientation = LinearLayout.HORIZONTAL
        val progressBar: ProgressBar = ProgressBar(activity)

        val text: TextView = TextView(activity)
        text.setPadding(20, 20, 20, 20)
        text.gravity = Gravity.CENTER
        text.text = "Идет загрузка..."

        baseLayout.addView(progressBar)
        baseLayout.addView(text)
        builder.setView(baseLayout)
        return builder.create()
    }
}