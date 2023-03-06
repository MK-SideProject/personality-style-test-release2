package com.example.personality_style_test.caketest;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.personality_style_test.R;


public class CakeTestResult2Fg extends Fragment {


    public CakeTestResult2Fg() {

    }


    public static CakeTestResult2Fg newInstance() {
        CakeTestResult2Fg fragment = new CakeTestResult2Fg();
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

        View CakeTestResult2 = inflater.inflate(R.layout.fragment_cake_test_result2_fg, container, false);

        return CakeTestResult2;
    }
}