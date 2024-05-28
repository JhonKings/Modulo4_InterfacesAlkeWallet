package com.example.wallet.fragments

import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation.findNavController
import com.example.wallet.R

class FragmentSingupPage_4 : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (arguments != null) {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_singup_page_4, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        /* final NavController navController = Navigation.findNavController(view);

        Button btnFragment1 = view.findViewById(R.id.button_back4);
        Button btnFragment2 = view.findViewById(R.id.button_home4);


        btnFragment1.setOnClickListener(v -> {

            Navigation.findNavController(v).navigate(R.id.fragmentLoginPage_3);

        });

        btnFragment2.setOnClickListener(v -> {

            Navigation.findNavController(v).navigate(R.id.fragmentSplashScreen_1);

        });*/
        val navController = findNavController(view)
        val handler = Handler()
        handler.postDelayed({ navController.navigate(R.id.fragmentHomePage_5) }, 3000)
    }
}