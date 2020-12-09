package com.jutaav.extensions


/**
 * Created by viking_93 on 09/12/2020
 **/

fun Any.tag(): String {
    return this::class.java.simpleName
}