package com.example.personality_style_test.santatest;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.personality_style_test.R;


public class SantaTestResult1Fg extends Fragment {


    public SantaTestResult1Fg() {

    }


    public static SantaTestResult1Fg newInstance() {
        SantaTestResult1Fg fragment = new SantaTestResult1Fg();
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

        View santaTestResult1 =  inflater.inflate(R.layout.fragment_santa_test_result1_fg, container, false);

        Button santaTestRestart = (Button) santaTestResult1.findViewById(R.id.santatest_restart);
        Button santaTestList = (Button) santaTestResult1.findViewById(R.id.santatest_list);

        return santaTestResult1;
    }
}