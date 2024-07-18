package com.jeady.compose.util

import android.content.Context
import android.widget.Toast

object Common{
    fun showToast(context: Context, title: String){
        Toast.makeText(context, title, Toast.LENGTH_SHORT).show()
    }
}