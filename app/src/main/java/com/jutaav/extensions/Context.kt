package com.jutaav.extensions

import android.content.Context
import android.content.SharedPreferences
import android.net.ConnectivityManager
import android.net.ConnectivityManager.TYPE_MOBILE
import android.net.ConnectivityManager.TYPE_WIFI
import android.net.wifi.WifiManager
import android.widget.Toast
import android.widget.Toast.LENGTH_LONG
import android.widget.Toast.LENGTH_SHORT
import androidx.core.content.ContextCompat


/**
 * Created by viking_93 on 07/12/2020
 **/

fun Context.showShortToast(message: String) {
    Toast.makeText(this, message, LENGTH_SHORT).show()
}

fun Context.showLongToast(message: String) {
    Toast.makeText(this, message, LENGTH_LONG).show()
}

fun Context.getIpAddress(): String {
    var ipAddress = ""
    try {
        val wifiManager = getSystemService<WifiManager>()
        ipAddress = wifiManager.connectionInfo.ipAddress.toString()
    } catch (e: Exception) {
        e.printStackTrace()
    }

    return ipAddress
}

fun Context.isConnectedToNetwork(): Boolean {
    val activeNetwork = getSystemService<ConnectivityManager>().activeNetworkInfo
    return activeNetwork != null && activeNetwork.isConnectedOrConnecting
}

fun Context.isNetworkAvailable(): Boolean {
    val connec = getSystemService<ConnectivityManager>()
    // ARE WE CONNECTED TO THE NET
    if (connec.getNetworkInfo(TYPE_MOBILE)?.state == android.net.NetworkInfo.State.CONNECTED ||
        connec.getNetworkInfo(TYPE_WIFI)?.state == android.net.NetworkInfo.State.CONNECTING
    ) {
        return true
    } else if (connec.getNetworkInfo(TYPE_MOBILE)?.state == android.net.NetworkInfo.State.DISCONNECTED ||
        connec.getNetworkInfo(TYPE_WIFI)?.state == android.net.NetworkInfo.State.DISCONNECTED
    ) {
        return false
    }
    return false
}

inline fun <reified T : Any> Context.getSystemService(): T {
    return ContextCompat.getSystemService(this, T::class.java)!!
}

fun Context.getApplicationVersion(): String {
    var version = ""
    val verCode: Int
    return try {
        val info = packageManager.getPackageInfo(packageName, 0)
        version = info.versionName
        version
    } catch (e: Exception) {
        e.printStackTrace()
        version
    }
}

fun Context.getPreference(prefName: String): SharedPreferences {
    return getPreference(prefName)
}