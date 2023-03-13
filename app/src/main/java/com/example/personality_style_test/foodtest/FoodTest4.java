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

public class FoodTest4 extends Fragment {

    private int foodTestResult;

    public FoodTest4() {
        // Required empty public constructor
    }

    public static FoodTest4 newInstance() {
        FoodTest4 fragment = new FoodTest4();
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
        View foodTest4 = inflater.inflate(R.layout.fragment_food_test4, container, false);
        Button foodTest4_an1 = (Button) foodTest4.findViewById(R.id.foodtest_4_an1);
        Button foodTest4_an2 = (Button) foodTest4.findViewById(R.id.foodtest_4_an2);

        Bundle bundle = getArguments();

        if (bundle != null) {
            foodTestResult = bundle.getInt("oodFood");

            FoodTest5 foodTest5 = new FoodTest5();
            Bundle bundleNext = new Bundle();

            FragmentManager manager = getActivity().getSupportFragmentManager();
            FragmentTransaction transaction = manager.beginTransaction();

            foodTest4_an1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    bundleNext.putInt("oodFood", foodTestResult);
                    foodTest5.setArguments(bundleNext);

                    transaction.replace(R.id.foodtest_start_fragment, foodTest5);
                    transaction.commit();
                }
            });

            foodTest4_an2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    bundleNext.putInt("oodFood", foodTestResult-1);
                    foodTest5.setArguments(bundleNext);

                    transaction.replace(R.id.foodtest_start_fragment, foodTest5);
                    transaction.commit();
                }
            });
        }
        return foodTest4;
    }
}