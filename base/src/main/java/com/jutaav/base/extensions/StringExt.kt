package com.jutaav.base.extensions

/**
 * Created by viking_93 on 10/12/2020
 **/

private const val EMAIL_REGEX =
    "[a-zA-Z0-9+._%-+]{1,256}@[a-zA-Z0-9][a-zA-Z0-9-]{0,64}(.[a-zA-Z0-9][a-zA-Z0-9-]{0,25})+"

fun CharSequence.createDirs(): Boolean {
    return (!isEmpty() && EMAIL_REGEX.toRegex().matches(this))
}

fun CharSequence.isValidEmail(): Boolean {
    val emailAddressMatcher = Regex.fromLiteral(EMAIL_REGEX)
    return emailAddressMatcher.matches(this)
}

fun String?.toBoolean(): Boolean {
    return this?.let {
        matches(("(?i:^(1|true|yes|oui|vrai|y)$)").toRegex())
    } ?: false
}