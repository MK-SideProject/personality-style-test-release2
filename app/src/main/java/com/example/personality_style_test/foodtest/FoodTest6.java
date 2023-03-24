package com.example.personality_style_test.foodtest;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.personality_style_test.R;

public class FoodTest6 extends Fragment {

    private int foodTestResult;

    public FoodTest6() {
        // Required empty public constructor
    }

    public static FoodTest6 newInstance() {
        FoodTest6 fragment = new FoodTest6();
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
        View foodTest6 = inflater.inflate(R.layout.fragment_food_test6, container, false);
        Button foodTest6_an1 = (Button) foodTest6.findViewById(R.id.foodtest_6_an1);
        Button foodTest6_an2 = (Button) foodTest6.findViewById(R.id.foodtest_6_an2);

        Bundle bundle = getArguments();

        if (bundle != null) {
            foodTestResult = bundle.getInt("oodFood");

            FoodTest7 foodTest7 = new FoodTest7();
            Bundle bundleNext = new Bundle();

            FragmentManager manager = getActivity().getSupportFragmentManager();
            FragmentTransaction transaction = manager.beginTransaction();

            foodTest6_an1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    bundleNext.putInt("oodFood", foodTestResult);
                    foodTest7.setArguments(bundleNext);

                    transaction.replace(R.id.foodtest_start_fragment, foodTest7);
                    transaction.addToBackStack(null).commit();                }
            });

            foodTest6_an2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    bundleNext.putInt("oodFood", foodTestResult - 1);
                    foodTest7.setArguments(bundleNext);

                    transaction.replace(R.id.foodtest_start_fragment, foodTest7);
                    transaction.addToBackStack(null).commit();                }
            });
        }
        return foodTest6;
    }
}