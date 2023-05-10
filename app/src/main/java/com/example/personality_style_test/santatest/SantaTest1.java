package com.example.personality_style_test.santatest;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.personality_style_test.R;
import com.example.personality_style_test.colortest.ColorTest2;


public class SantaTest1 extends Fragment {


    public SantaTest1() {

    }


    public static SantaTest1 newInstance() {
        SantaTest1 fragment = new SantaTest1();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View santaTest1 = inflater.inflate(R.layout.fragment_santa_test1, container, false);

        Button santaTest_1_an1 = (Button) santaTest1.findViewById(R.id.santatest_1_an1);
        Button santaTest_1_an2 = (Button) santaTest1.findViewById(R.id.santatest_1_an2);

        SantaTest2 santaTest2 = new SantaTest2();
        Bundle bundle = new Bundle();

        FragmentManager manager = getActivity().getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();

        santaTest_1_an1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

                transaction.replace(R.id.santatest_start_fragment, santaTest2);
                transaction.addToBackStack(null).commit();
            }
        });

        santaTest_1_an2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String santaTestResult4 = "result4";

                bundle.putString("santaTestResult4", santaTestResult4);
                santaTest2.setArguments(bundle);

                transaction.replace(R.id.santatest_start_fragment, santaTest2);
                transaction.addToBackStack(null).commit();


            }
        });

        return santaTest1;
    }
}