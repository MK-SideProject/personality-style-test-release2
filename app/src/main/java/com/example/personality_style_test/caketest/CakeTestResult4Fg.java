package com.example.personality_style_test.caketest;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.personality_style_test.R;


public class CakeTestResult4Fg extends Fragment {



    public CakeTestResult4Fg() {

    }


    public static CakeTestResult4Fg newInstance() {
        CakeTestResult4Fg fragment = new CakeTestResult4Fg();
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

        View CakeTestResult4 = inflater.inflate(R.layout.fragment_cake_test_result4_fg, container, false);

        Button cakeTestRestart = (Button) CakeTestResult4.findViewById(R.id.caketest_restart);
        Button cakeTestList = (Button) CakeTestResult4.findViewById(R.id.caketest_list);

        return CakeTestResult4;
    }
}