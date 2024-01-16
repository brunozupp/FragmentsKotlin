package com.novelitech.fragmentskotlin

import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.novelitech.fragmentskotlin.databinding.ActivityDynamicFragmentBinding

class DynamicFragmentActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDynamicFragmentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDynamicFragmentBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val toolbar = binding.toolbar
        setSupportActionBar(toolbar)
        val actionBar: ActionBar? = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)
        actionBar?.setDisplayShowHomeEnabled(true)

        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()

        changeFragment(firstFragment)

        binding.btnFragment1.setOnClickListener {
            changeFragment(firstFragment)
        }

        binding.btnFragment2.setOnClickListener {
            changeFragment(secondFragment)
        }
    }

    private fun changeFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment, fragment)
            /**
             * This function makes that the fragment enters in the Stack Navigation, so if I click
             * in the bottom do go back from the device, it will go to the previous fragment.
             * BUT if I click in the go back arrow from Toolbar, it goes back to the previous activity straight.
             */
            // addToBackStack(null)
            commit()
        }
    }
}