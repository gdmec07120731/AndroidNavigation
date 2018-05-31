package com.ppjun.android.androidnavigation

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import androidx.navigation.Navigation


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onSupportNavigateUp(): Boolean {
       return  Navigation.findNavController(this,R.id.main_navigation).navigateUp()
    }




}
