package com.example.personality_style_test.foodtest;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.personality_style_test.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FoodTestResult1Fg#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FoodTestResult1Fg extends Fragment {

    public FoodTestResult1Fg() {
        // Required empty public constructor
    }

    public static FoodTestResult1Fg newInstance() {
        FoodTestResult1Fg fragment = new FoodTestResult1Fg();
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
        View foodTestResult1Fg = inflater.inflate(R.layout.fragment_food_test_result1_fg, container, false);
        Button foodTestRestart = (Button) foodTestResult1Fg.findViewById(R.id.foodtest_restart);
        Button foodTestList = (Button) foodTestResult1Fg.findViewById(R.id.foodtest_list);

        return foodTestResult1Fg;
    }
}