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


public class FoodTest3 extends Fragment {

    private int foodTestResult;

    public FoodTest3() {
        // Required empty public constructor
    }

    public static FoodTest3 newInstance() {
        FoodTest3 fragment = new FoodTest3();
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
        View foodTest3 = inflater.inflate(R.layout.fragment_food_test3, container, false);
        Button foodTest3_an1 = (Button) foodTest3.findViewById(R.id.foodtest_3_an1);
        Button foodTest3_an2 = (Button) foodTest3.findViewById(R.id.foodtest_3_an2);

        Bundle bundle = getArguments();

        if (bundle != null) {
            foodTestResult = bundle.getInt("oodFood");

            FoodTest4 foodTest4 = new FoodTest4();
            Bundle bundleNext = new Bundle();

            FragmentManager manager = getActivity().getSupportFragmentManager();
            FragmentTransaction transaction = manager.beginTransaction();

            foodTest3_an1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    bundleNext.putInt("oodFood", foodTestResult);
                    foodTest4.setArguments(bundleNext);

                    transaction.replace(R.id.foodtest_start_fragment, foodTest4);
                    transaction.addToBackStack(null).commit();                }
            });

            foodTest3_an2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    bundleNext.putInt("oodFood", foodTestResult-1);
                    foodTest4.setArguments(bundleNext);

                    transaction.replace(R.id.foodtest_start_fragment, foodTest4);
                    transaction.addToBackStack(null).commit();                }
            });
        }
        return foodTest3;
    }
}