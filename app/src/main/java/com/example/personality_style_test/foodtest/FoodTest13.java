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
 * Use the {@link FoodTest13#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FoodTest13 extends Fragment {

    private int foodTestResult;

    public FoodTest13() {
        // Required empty public constructor
    }

    public static FoodTest13 newInstance() {
        FoodTest13 fragment = new FoodTest13();
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
        View foodTest13 = inflater.inflate(R.layout.fragment_food_test13, container, false);
        Button foodTest13_an1 = (Button) foodTest13.findViewById(R.id.foodtest_13_an1);
        Button foodTest13_an2 = (Button) foodTest13.findViewById(R.id.foodtest_13_an2);

        Bundle bundle = getArguments();

        if (bundle != null) {
            foodTestResult = bundle.getInt("oodFood");

            FoodTest14 foodTest14 = new FoodTest14();
            Bundle bundleNext = new Bundle();

            FragmentManager manager = getActivity().getSupportFragmentManager();
            FragmentTransaction transaction = manager.beginTransaction();

            foodTest13_an1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    bundleNext.putInt("oodFood", foodTestResult);
                    foodTest14.setArguments(bundleNext);

                    transaction.replace(R.id.foodtest_start_fragment, foodTest14);
                    transaction.commit();
                }
            });

            foodTest13_an2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    bundleNext.putInt("oodFood", foodTestResult-1);
                    foodTest14.setArguments(bundleNext);

                    transaction.replace(R.id.foodtest_start_fragment, foodTest14);
                    transaction.commit();
                }
            });
        }
        return foodTest13;
    }
}