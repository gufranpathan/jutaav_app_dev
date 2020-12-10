package com.jutaav.baseandroid.extensions

import android.app.Activity
import android.graphics.Color
import com.nispok.snackbar.Snackbar
import kotlin.math.roundToInt

/**
 * Created by viking_93 on 10/12/2020
 **/
fun Activity.showSnackBar(message: String) {
    Snackbar.with(this)
        .text(message)
        .textColor(Color.RED)
        .color(Color.BLACK)
        .show(this)
}

fun Activity.dpToPx(dp: Int): Int {
    val density = resources.displayMetrics.density
    return (dp.toFloat() * density).roundToInt()
}

fun Activity.getMessaerHeight(width: Int, height: Int): Int {
    try {
        val displayMetrics = resources.displayMetrics
        val widthD = displayMetrics.widthPixels
        val heightD = displayMetrics.heightPixels
        return ((height.toDouble() * widthD.toDouble() * 0.95) / width).toInt()
    } catch (e: Exception) {
        e.printStackTrace()
    }

    return 0
}