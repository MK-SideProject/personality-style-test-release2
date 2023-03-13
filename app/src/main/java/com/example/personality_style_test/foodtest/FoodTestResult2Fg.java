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
 * Use the {@link FoodTestResult2Fg#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FoodTestResult2Fg extends Fragment {

    public FoodTestResult2Fg() {
        // Required empty public constructor
    }

    public static FoodTestResult2Fg newInstance() {
        FoodTestResult2Fg fragment = new FoodTestResult2Fg();
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
        View foodTestResult2Fg = inflater.inflate(R.layout.fragment_food_test_result2_fg, container, false);
        Button foodTestRestart = (Button) foodTestResult2Fg.findViewById(R.id.foodtest_restart);
        Button foodTestList = (Button) foodTestResult2Fg.findViewById(R.id.foodtest_list);

        return foodTestResult2Fg;
    }
}