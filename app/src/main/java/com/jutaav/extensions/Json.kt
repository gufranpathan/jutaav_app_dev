package com.jutaav.extensions

import org.json.JSONArray
import org.json.JSONException
import org.json.JSONObject

/**
 * Created by viking_93 on 08/12/2020
 **/
@Throws(JSONException::class)
fun JSONObject.toMap(): Map<String, Any> {
    val map = java.util.HashMap<String, Any>()
    val keysItr = keys()
    while (keysItr.hasNext()) {
        val key = keysItr.next()
        var value = get(key)
        if (value is JSONArray) {
            value = value.toList()
        } else if (value is JSONObject) {
            value = value.toMap()
        }
        map[key] = value
    }
    return map
}

@Throws(org.json.JSONException::class)
fun JSONArray.toList(): List<*> {
    val list = java.util.ArrayList<Any>()
    for (i in 0 until length()) {
        var value = get(i)
        if (value is JSONArray) {
            value = toList()
        } else if (value is JSONObject) {
            value = value.toMap()
        }
        list.add(value)
    }
    return list
}