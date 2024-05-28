package com.example.wallet

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.wallet.databinding.ActivityMainBinding
import com.example.wallet.databinding.FragmentLoginSingupPage2Binding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}