package com.ppjun.android.androidnavigation

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.three_ui.view.*
import kotlinx.android.synthetic.main.two_ui.view.*

class ThreeFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.three_ui, container, false)
        view.threeToPrevious.setOnClickListener {
            Navigation.findNavController(it).navigateUp()
        }

        view.threeValue.text = arguments?.get("key").toString()
        return view

    }
}