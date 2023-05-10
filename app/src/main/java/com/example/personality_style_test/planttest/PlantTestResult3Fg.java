package com.example.personality_style_test.planttest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.personality_style_test.HumorActivity;
import com.example.personality_style_test.R;
import com.example.personality_style_test.foodtest.FoodTestActivity;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PlantTestResult3Fg#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PlantTestResult3Fg extends Fragment {

    public PlantTestResult3Fg() {
        // Required empty public constructor
    }
    public static PlantTestResult3Fg newInstance() {
        PlantTestResult3Fg fragment = new PlantTestResult3Fg();
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
        View plantTestResult3Fg = inflater.inflate(R.layout.fragment_plant_test_result3_fg, container, false);

        Button plantTestRestart = (Button) plantTestResult3Fg.findViewById(R.id.planttest_restart);
        Button plantTestList = (Button) plantTestResult3Fg.findViewById(R.id.planttest_list);
        Activity thisActivity = getActivity();

        plantTestRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (thisActivity != null) {
                    startActivity(new Intent(thisActivity, FoodTestActivity.class));
                    thisActivity.finish();
                }
            }
        });
        plantTestList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (thisActivity != null) {
                    startActivity(new Intent(thisActivity, HumorActivity.class));
                    thisActivity.finish();
                }
            }
        });

        return plantTestResult3Fg;
    }
}