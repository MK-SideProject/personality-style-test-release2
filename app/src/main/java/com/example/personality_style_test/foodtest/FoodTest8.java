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
 * Use the {@link FoodTest8#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FoodTest8 extends Fragment {

    private int foodTestResult;

    public FoodTest8() {
        // Required empty public constructor
    }

    public static FoodTest8 newInstance() {
        FoodTest8 fragment = new FoodTest8();
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
        View foodTest8 = inflater.inflate(R.layout.fragment_food_test8, container, false);
        Button foodTest8_an1 = (Button) foodTest8.findViewById(R.id.foodtest_8_an1);
        Button foodTest8_an2 = (Button) foodTest8.findViewById(R.id.foodtest_8_an2);

        Bundle bundle = getArguments();

        if (bundle != null) {
            foodTestResult = bundle.getInt("oodFood");

            FoodTest9 foodTest9 = new FoodTest9();
            Bundle bundleNext = new Bundle();

            FragmentManager manager = getActivity().getSupportFragmentManager();
            FragmentTransaction transaction = manager.beginTransaction();

            foodTest8_an1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    bundleNext.putInt("oodFood", foodTestResult);
                    foodTest9.setArguments(bundleNext);

                    transaction.replace(R.id.foodtest_start_fragment, foodTest9);
                    transaction.commit();
                }
            });

            foodTest8_an2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    bundleNext.putInt("oodFood", foodTestResult-1);
                    foodTest9.setArguments(bundleNext);

                    transaction.replace(R.id.foodtest_start_fragment, foodTest9);
                    transaction.commit();
                }
            });
        }
        return foodTest8;
    }
}