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
 * Use the {@link FoodTest7#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FoodTest7 extends Fragment {

    private int foodTestResult;

    public FoodTest7() {
        // Required empty public constructor
    }

    public static FoodTest7 newInstance() {
        FoodTest7 fragment = new FoodTest7();
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
        View foodTest7 = inflater.inflate(R.layout.fragment_food_test7, container, false);
        Button foodTest7_an1 = (Button) foodTest7.findViewById(R.id.foodtest_7_an1);
        Button foodTest7_an2 = (Button) foodTest7.findViewById(R.id.foodtest_7_an2);

        Bundle bundle = getArguments();

        if (bundle != null) {
            foodTestResult = bundle.getInt("oodFood");

            FoodTest8 foodTest8 = new FoodTest8();
            Bundle bundleNext = new Bundle();

            FragmentManager manager = getActivity().getSupportFragmentManager();
            FragmentTransaction transaction = manager.beginTransaction();

            foodTest7_an1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    bundleNext.putInt("oodFood", foodTestResult);
                    foodTest8.setArguments(bundleNext);

                    transaction.replace(R.id.foodtest_start_fragment, foodTest8);
                    transaction.commit();
                }
            });

            foodTest7_an2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    bundleNext.putInt("oodFood", foodTestResult-1);
                    foodTest8.setArguments(bundleNext);

                    transaction.replace(R.id.foodtest_start_fragment, foodTest8);
                    transaction.commit();
                }
            });
        }
        return foodTest7;
    }
}