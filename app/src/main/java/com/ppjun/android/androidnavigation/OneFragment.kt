package com.ppjun.android.androidnavigation

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation

import kotlinx.android.synthetic.main.one_ui.view.*

class OneFragment :Fragment(){

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
       val view=inflater.inflate(R.layout.one_ui,container,false)
        view.toTwo.setOnClickListener {
            val bundle=Bundle().apply {
                putString("key","two")
            }
            Navigation.findNavController(it).navigate(R.id.action_two,bundle)
        }
        return view
    }
}