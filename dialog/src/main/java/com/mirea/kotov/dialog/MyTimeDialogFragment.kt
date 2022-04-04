package com.mirea.kotov.dialog

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.widget.TimePicker
import androidx.fragment.app.DialogFragment

class MyTimeDialogFragment: DialogFragment(){

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder: AlertDialog.Builder = AlertDialog.Builder(activity)
        builder.setView(R.layout.custom_time_picker)
        return builder.create()
    }
}