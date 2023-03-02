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

public class FoodTest2 extends Fragment {

    private int foodTestResult;

    public FoodTest2() {
        // Required empty public constructor
    }

    public static FoodTest2 newInstance() {
        FoodTest2 fragment = new FoodTest2();
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
        View foodTest2 = inflater.inflate(R.layout.fragment_food_test2, container, false);
        Button foodTest2_an1 = (Button) foodTest2.findViewById(R.id.foodtest_2_an1);
        Button foodTest2_an2 = (Button) foodTest2.findViewById(R.id.foodtest_2_an2);

        Bundle bundle = getArguments();

        if (bundle != null) {
            foodTestResult = bundle.getInt("oodFood");

            FoodTest3 foodTest3 = new FoodTest3();
            Bundle bundleNext = new Bundle();

            FragmentManager manager = getActivity().getSupportFragmentManager();
            FragmentTransaction transaction = manager.beginTransaction();

            foodTest2_an1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    bundleNext.putInt("oodFood", foodTestResult);
                    foodTest3.setArguments(bundleNext);

                    transaction.replace(R.id.foodtest_start_fragment, foodTest3);
                    transaction.commit();
                }
            });

            foodTest2_an2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    bundleNext.putInt("oodFood", foodTestResult-1);
                    foodTest3.setArguments(bundleNext);

                    transaction.replace(R.id.foodtest_start_fragment, foodTest3);
                    transaction.commit();
                }
            });
        }
        return foodTest2;
    }
}