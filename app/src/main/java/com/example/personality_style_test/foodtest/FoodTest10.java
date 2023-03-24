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
 * Use the {@link FoodTest10#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FoodTest10 extends Fragment {

    private int foodTestResult;

    public FoodTest10() {
        // Required empty public constructor
    }

    public static FoodTest10 newInstance() {
        FoodTest10 fragment = new FoodTest10();
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
        View foodTest10 = inflater.inflate(R.layout.fragment_food_test10, container, false);
        Button foodTest10_an1 = (Button) foodTest10.findViewById(R.id.foodtest_10_an1);
        Button foodTest10_an2 = (Button) foodTest10.findViewById(R.id.foodtest_10_an2);

        Bundle bundle = getArguments();

        if (bundle != null) {
            foodTestResult = bundle.getInt("oodFood");

            FoodTest11 foodTest11 = new FoodTest11();
            Bundle bundleNext = new Bundle();

            FragmentManager manager = getActivity().getSupportFragmentManager();
            FragmentTransaction transaction = manager.beginTransaction();

            foodTest10_an1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    bundleNext.putInt("oodFood", foodTestResult);
                    foodTest11.setArguments(bundleNext);

                    transaction.replace(R.id.foodtest_start_fragment, foodTest11);
                    transaction.addToBackStack(null).commit();                }
            });

            foodTest10_an2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    bundleNext.putInt("oodFood", foodTestResult-1);
                    foodTest11.setArguments(bundleNext);

                    transaction.replace(R.id.foodtest_start_fragment, foodTest11);
                    transaction.addToBackStack(null).commit();                }
            });
        }
        return foodTest10;
    }
}