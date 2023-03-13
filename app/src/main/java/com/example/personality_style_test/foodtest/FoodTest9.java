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
 * Use the {@link FoodTest9#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FoodTest9 extends Fragment {

    private int foodTestResult;

    public FoodTest9() {
        // Required empty public constructor
    }

    public static FoodTest9 newInstance() {
        FoodTest9 fragment = new FoodTest9();
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
        View foodTest9 = inflater.inflate(R.layout.fragment_food_test9, container, false);
        Button foodTest9_an1 = (Button) foodTest9.findViewById(R.id.foodtest_9_an1);
        Button foodTest9_an2 = (Button) foodTest9.findViewById(R.id.foodtest_9_an2);

        Bundle bundle = getArguments();

        if (bundle != null) {
            foodTestResult = bundle.getInt("oodFood");

            FoodTest10 foodTest10 = new FoodTest10();
            Bundle bundleNext = new Bundle();

            FragmentManager manager = getActivity().getSupportFragmentManager();
            FragmentTransaction transaction = manager.beginTransaction();

            foodTest9_an1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    bundleNext.putInt("oodFood", foodTestResult);
                    foodTest10.setArguments(bundleNext);

                    transaction.replace(R.id.foodtest_start_fragment, foodTest10);
                    transaction.commit();
                }
            });

            foodTest9_an2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    bundleNext.putInt("oodFood", foodTestResult-1);
                    foodTest10.setArguments(bundleNext);

                    transaction.replace(R.id.foodtest_start_fragment, foodTest10);
                    transaction.commit();
                }
            });
        }
        return foodTest9;
    }
}