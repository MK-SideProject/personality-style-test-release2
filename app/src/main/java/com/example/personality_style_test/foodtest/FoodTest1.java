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

public class FoodTest1 extends Fragment {

    public FoodTest1() {
        // Required empty public constructor
    }

    public static FoodTest1 newInstance() {
        FoodTest1 fragment = new FoodTest1();
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
        View foodTest1 = inflater.inflate(R.layout.fragment_food_test1, container, false);
        Button foodTest1_an1 = (Button) foodTest1.findViewById(R.id.foodtest_1_an1);
        Button foodTest1_an2 = (Button) foodTest1.findViewById(R.id.foodtest_1_an2);

        FoodTest2 foodTest2 = new FoodTest2();
        Bundle bundle = new Bundle();

        FragmentManager manager = getActivity().getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();

        int oodFood = 15;
        foodTest1_an1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bundle.putInt("oodFood", oodFood);
                foodTest2.setArguments(bundle);

                transaction.replace(R.id.foodtest_start_fragment, foodTest2);
                transaction.addToBackStack(null).commit();
            }
        });

        foodTest1_an2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bundle.putInt("oodFood", oodFood - 1);
                foodTest2.setArguments(bundle);

                transaction.replace(R.id.foodtest_start_fragment, foodTest2);
                transaction.addToBackStack(null).commit();            }
        });

        return foodTest1;
    }
}