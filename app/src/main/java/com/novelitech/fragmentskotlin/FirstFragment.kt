package com.novelitech.fragmentskotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

//class FirstFragment : Fragment() {
//
//    // This is called after onCreate
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_first, container, false)
//    }
//
//    // Here the view is not created yet
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//    }
//
//    // It is called when all the views are created. Here I can access the views
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//    }
//}

// If I pass the reference from the specific layout in the constructor, I don't need onCreateView
class FirstFragment : Fragment(R.layout.fragment_first)