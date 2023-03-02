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
 * Use the {@link FoodTest14#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FoodTest14 extends Fragment {

    private int foodTestResult;

    public FoodTest14() {
        // Required empty public constructor
    }

    public static FoodTest14 newInstance() {
        FoodTest14 fragment = new FoodTest14();
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
        View foodTest14 = inflater.inflate(R.layout.fragment_food_test14, container, false);
        Button foodTest14_an1 = (Button) foodTest14.findViewById(R.id.foodtest_14_an1);
        Button foodTest14_an2 = (Button) foodTest14.findViewById(R.id.foodtest_14_an2);

        Bundle bundle = getArguments();

        if (bundle != null) {
            foodTestResult = bundle.getInt("oodFood");

            FoodTest15 foodTest15 = new FoodTest15();
            Bundle bundleNext = new Bundle();

            FragmentManager manager = getActivity().getSupportFragmentManager();
            FragmentTransaction transaction = manager.beginTransaction();

            foodTest14_an1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    bundleNext.putInt("oodFood", foodTestResult);
                    foodTest15.setArguments(bundleNext);

                    transaction.replace(R.id.foodtest_start_fragment, foodTest15);
                    transaction.commit();
                }
            });

            foodTest14_an2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    bundleNext.putInt("oodFood", foodTestResult-1);
                    foodTest15.setArguments(bundleNext);

                    transaction.replace(R.id.foodtest_start_fragment, foodTest15);
                    transaction.commit();
                }
            });
        }
        return foodTest14;
    }
}