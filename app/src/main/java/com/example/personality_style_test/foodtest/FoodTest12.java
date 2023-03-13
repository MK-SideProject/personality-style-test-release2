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
 * Use the {@link FoodTest12#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FoodTest12 extends Fragment {

    private int foodTestResult;

    public FoodTest12() {
        // Required empty public constructor
    }

    public static FoodTest12 newInstance() {
        FoodTest12 fragment = new FoodTest12();
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
        View foodTest12 = inflater.inflate(R.layout.fragment_food_test12, container, false);
        Button foodTest12_an1 = (Button) foodTest12.findViewById(R.id.foodtest_12_an1);
        Button foodTest12_an2 = (Button) foodTest12.findViewById(R.id.foodtest_12_an2);

        Bundle bundle = getArguments();

        if (bundle != null) {
            foodTestResult = bundle.getInt("oodFood");

            FoodTest13 foodTest13 = new FoodTest13();
            Bundle bundleNext = new Bundle();

            FragmentManager manager = getActivity().getSupportFragmentManager();
            FragmentTransaction transaction = manager.beginTransaction();

            foodTest12_an1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    bundleNext.putInt("oodFood", foodTestResult);
                    foodTest13.setArguments(bundleNext);

                    transaction.replace(R.id.foodtest_start_fragment, foodTest13);
                    transaction.commit();
                }
            });

            foodTest12_an2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    bundleNext.putInt("oodFood", foodTestResult-1);
                    foodTest13.setArguments(bundleNext);

                    transaction.replace(R.id.foodtest_start_fragment, foodTest13);
                    transaction.commit();
                }
            });
        }
        return foodTest12;

    }
}