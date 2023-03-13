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

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FoodTest15#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FoodTest15 extends Fragment {

    private int foodTestResult;

    public FoodTest15() {
        // Required empty public constructor
    }

    public static FoodTest15 newInstance() {
        FoodTest15 fragment = new FoodTest15();
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
        View foodTest15 = inflater.inflate(R.layout.fragment_food_test15, container, false);
        Button foodTest15_an1 = (Button) foodTest15.findViewById(R.id.foodtest_15_an1);
        Button foodTest15_an2 = (Button) foodTest15.findViewById(R.id.foodtest_15_an2);

        Bundle bundle = getArguments();

        if (bundle != null) {
            foodTestResult = bundle.getInt("oodFood");

            FragmentManager manager = getActivity().getSupportFragmentManager();
            FragmentTransaction transaction = manager.beginTransaction();

            // result screen
            FoodTestResult1Fg foodTestResult1Fg = new FoodTestResult1Fg();
            FoodTestResult2Fg foodTestResult2Fg = new FoodTestResult2Fg();
            FoodTestResult3Fg foodTestResult3Fg = new FoodTestResult3Fg();

            foodTest15_an1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (foodTestResult >= 10) {
                        transaction.replace(R.id.foodtest_start_fragment, foodTestResult3Fg);
                        transaction.commit();
                    } else if (foodTestResult >= 4) {
                        transaction.replace(R.id.foodtest_start_fragment, foodTestResult1Fg);
                        transaction.commit();
                    } else {
                        transaction.replace(R.id.foodtest_start_fragment, foodTestResult2Fg);
                        transaction.commit();
                    }
                }
            });

            foodTest15_an2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    foodTestResult = foodTestResult - 1;
                    if (foodTestResult >= 10) {
                        transaction.replace(R.id.foodtest_start_fragment, foodTestResult3Fg);
                        transaction.commit();
                    } else if (foodTestResult >= 4) {
                        transaction.replace(R.id.foodtest_start_fragment, foodTestResult1Fg);
                        transaction.commit();
                    } else {
                        transaction.replace(R.id.foodtest_start_fragment, foodTestResult2Fg);
                        transaction.commit();
                    }
                }
            });
        }
        return foodTest15;
    }
}