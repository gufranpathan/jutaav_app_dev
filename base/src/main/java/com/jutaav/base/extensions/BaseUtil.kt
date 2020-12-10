package com.jutaav.base.extensions

/**
 * Created by viking_93 on 10/12/2020
 **/

fun Any.tag(): String {
    return this::class.java.simpleName
}