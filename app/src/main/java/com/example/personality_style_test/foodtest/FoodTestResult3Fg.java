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
 * Use the {@link FoodTestResult3Fg#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FoodTestResult3Fg extends Fragment {

    public FoodTestResult3Fg() {
        // Required empty public constructor
    }

    public static FoodTestResult3Fg newInstance() {
        FoodTestResult3Fg fragment = new FoodTestResult3Fg();
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
        View foodTestResult3Fg = inflater.inflate(R.layout.fragment_food_test_result3_fg, container, false);
        Button foodTestRestart = (Button) foodTestResult3Fg.findViewById(R.id.foodtest_restart);
        Button foodTestList = (Button) foodTestResult3Fg.findViewById(R.id.foodtest_list);

        return foodTestResult3Fg;
    }
}