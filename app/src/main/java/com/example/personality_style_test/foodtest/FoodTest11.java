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
 * Use the {@link FoodTest11#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FoodTest11 extends Fragment {

    private int foodTestResult;

    public FoodTest11() {
        // Required empty public constructor
    }

    public static FoodTest11 newInstance() {
        FoodTest11 fragment = new FoodTest11();
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
        View foodTest11 = inflater.inflate(R.layout.fragment_food_test11, container, false);
        Button foodTest11_an1 = (Button) foodTest11.findViewById(R.id.foodtest_11_an1);
        Button foodTest11_an2 = (Button) foodTest11.findViewById(R.id.foodtest_11_an2);

        Bundle bundle = getArguments();

        if (bundle != null) {
            foodTestResult = bundle.getInt("oodFood");

            FoodTest12 foodTest12 = new FoodTest12();
            Bundle bundleNext = new Bundle();

            FragmentManager manager = getActivity().getSupportFragmentManager();
            FragmentTransaction transaction = manager.beginTransaction();

            foodTest11_an1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    bundleNext.putInt("oodFood", foodTestResult);
                    foodTest12.setArguments(bundleNext);

                    transaction.replace(R.id.foodtest_start_fragment, foodTest12);
                    transaction.commit();
                }
            });

            foodTest11_an2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    bundleNext.putInt("oodFood", foodTestResult-1);
                    foodTest12.setArguments(bundleNext);

                    transaction.replace(R.id.foodtest_start_fragment, foodTest12);
                    transaction.commit();
                }
            });
        }
        return foodTest11;
    }
}