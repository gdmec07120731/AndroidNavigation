package com.ppjun.android.androidnavigation

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation

import kotlinx.android.synthetic.main.two_ui.view.*

class TwoFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.two_ui, container, false)
        view.twoToPrevious.setOnClickListener{
           // Navigation.findNavController(it).navigate(R.id.action_one,null)
        }
       // createNavigateOnClickListener 返回viewOnclicklistener 最后调用了Navigation.findNavController(it).navigate

        view.twoToPrevious.setOnClickListener( Navigation.createNavigateOnClickListener(R.id.action_one,null))
        view.twoToThree.setOnClickListener {
            val bundle=Bundle().apply{
                putString("key","three")
            }
            Navigation.findNavController(it).navigate(R.id.action_three,bundle)
        }
        view.twoValue.text = arguments?.get("key").toString()

        return view
    }
}