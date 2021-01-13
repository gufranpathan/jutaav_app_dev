package com.jutaav.baseandroid.extensions

import android.app.Activity
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
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

fun AppCompatActivity.addFragment(fragment: Fragment, frameId: Int) {
    supportFragmentManager.inTransaction { add(frameId, fragment) }
}

fun AppCompatActivity.replaceFragment(fragment: Fragment, frameId: Int) {
    supportFragmentManager.inTransaction {
        replace(
            frameId,
            fragment
        ).addToBackStack(fragment.javaClass.name)
    }
}

inline fun FragmentManager.inTransaction(func: FragmentTransaction.() -> FragmentTransaction) {
    beginTransaction().func().commit()
}