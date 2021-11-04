package com.hadykahlout.mawahib.utils

import android.content.Context
import android.content.SharedPreferences

class PreferencesManager {

    companion object {

        fun getSharedPreferences(context: Context): SharedPreferences =
            context.getSharedPreferences(Commons.KEY_SHARED_FILE, Context.MODE_PRIVATE)

        fun getSharedEditor(context: Context): SharedPreferences.Editor =
            getSharedPreferences(context).edit()

    }

}