package com.ppjun.android.androidnavigation

import android.util.Log
import javax.inject.Inject

class Person @Inject constructor(var head:Head) {


    fun log(){

        Log.i("debug=","person")
    }
}