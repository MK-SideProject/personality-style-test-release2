package com.example.personality_style_test.caketest;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.personality_style_test.R;


public class CakeTestResult3Fg extends Fragment {



    public CakeTestResult3Fg() {

    }


    public static CakeTestResult3Fg newInstance() {
        CakeTestResult3Fg fragment = new CakeTestResult3Fg();
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

        View CakeTestResult3 = inflater.inflate(R.layout.fragment_cake_test_result3_fg, container, false);

        Button cakeTestRestart = (Button) CakeTestResult3.findViewById(R.id.caketest_restart);
        Button cakeTestList = (Button) CakeTestResult3.findViewById(R.id.caketest_list);

        return CakeTestResult3;
    }
}