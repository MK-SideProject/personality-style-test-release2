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

public class FoodTest5 extends Fragment {

    private int foodTestResult;

    public FoodTest5() {
        // Required empty public constructor
    }

    public static FoodTest5 newInstance() {
        FoodTest5 fragment = new FoodTest5();
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
        View foodTest5 = inflater.inflate(R.layout.fragment_food_test5, container, false);
        Button foodTest5_an1 = (Button) foodTest5.findViewById(R.id.foodtest_5_an1);
        Button foodTest5_an2 = (Button) foodTest5.findViewById(R.id.foodtest_5_an2);

        Bundle bundle = getArguments();

        if (bundle != null) {
            foodTestResult = bundle.getInt("oodFood");

            FoodTest6 foodTest6 = new FoodTest6();
            Bundle bundleNext = new Bundle();

            FragmentManager manager = getActivity().getSupportFragmentManager();
            FragmentTransaction transaction = manager.beginTransaction();

            foodTest5_an1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    bundleNext.putInt("oodFood", foodTestResult);
                    foodTest6.setArguments(bundleNext);

                    transaction.replace(R.id.foodtest_start_fragment, foodTest6);
                    transaction.addToBackStack(null).commit();                }
            });

            foodTest5_an2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    bundleNext.putInt("oodFood", foodTestResult - 1);
                    foodTest6.setArguments(bundleNext);

                    transaction.replace(R.id.foodtest_start_fragment, foodTest6);
                    transaction.addToBackStack(null).commit();                }
            });
        }
        return foodTest5;
    }
}