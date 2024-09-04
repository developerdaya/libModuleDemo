package com.developerdaya.testlib

import android.content.Context
import android.widget.Toast

object TestLib {
    fun showToast(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()

    }
}