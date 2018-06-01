package com.ppjun.android.androidnavigation

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import androidx.navigation.Navigation
import javax.inject.Inject


class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var person: Person

    @Inject
    lateinit var head: Head
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DaggerMainComponent.builder().build().inject(this)
        person.log()
        head.log()
    }

    override fun onSupportNavigateUp(): Boolean {
        return Navigation.findNavController(this, R.id.main_navigation).navigateUp()
    }


}
