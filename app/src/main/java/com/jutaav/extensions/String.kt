package com.jutaav.extensions

import android.util.Patterns
import java.util.regex.Pattern

/**
 * Created by viking_93 on 08/12/2020
 **/

fun CharSequence.createDirs(): Boolean {
    return (!isEmpty() && Patterns.EMAIL_ADDRESS.matcher(this).matches())
}

fun CharSequence.isValidEmail(): Boolean {
    val emailAddressPatter = Pattern.compile(
        "[a-zA-Z0-9+._%-+]{1,256}" + "@"
                + "[a-zA-Z0-9][a-zA-Z0-9-]{0,64}" + "(" + "." + "[a-zA-Z0-9][a-zA-Z0-9-]{0,25}" + ")+"
    )
    return emailAddressPatter.matcher(this).matches()
}

fun String?.toBoolean(): Boolean {
    return this?.let {
        matches(("(?i:^(1|true|yes|oui|vrai|y)$)").toRegex())
    } ?: false
}