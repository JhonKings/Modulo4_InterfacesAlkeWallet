package com.example.wallet.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.wallet.R;


public class FragmentSingupPage_4 extends Fragment {


    public FragmentSingupPage_4() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_singup_page_4, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

       /* final NavController navController = Navigation.findNavController(view);

        Button btnFragment1 = view.findViewById(R.id.button_back4);
        Button btnFragment2 = view.findViewById(R.id.button_home4);


        btnFragment1.setOnClickListener(v -> {

            Navigation.findNavController(v).navigate(R.id.fragmentLoginPage_3);

        });

        btnFragment2.setOnClickListener(v -> {

            Navigation.findNavController(v).navigate(R.id.fragmentSplashScreen_1);

        });*/

        final NavController navController = Navigation.findNavController(view);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                navController.navigate(R.id.fragmentHomePage_5);
            }
        }, 3000);


    }
}