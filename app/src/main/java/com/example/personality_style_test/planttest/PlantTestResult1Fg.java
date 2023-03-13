package com.example.personality_style_test.planttest;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.personality_style_test.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PlantTestResult1Fg#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PlantTestResult1Fg extends Fragment {

    public PlantTestResult1Fg() {
        // Required empty public constructor
    }
    public static PlantTestResult1Fg newInstance() {
        PlantTestResult1Fg fragment = new PlantTestResult1Fg();
        Bundle args = new Bundle();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View plantTestResult1Fg = inflater.inflate(R.layout.fragment_plant_test_result1_fg, container, false);

        Button plantTestRestart = (Button) plantTestResult1Fg.findViewById(R.id.planttest_restart);
        Button plantTestList = (Button) plantTestResult1Fg.findViewById(R.id.planttest_list);

        return plantTestResult1Fg;
    }
}