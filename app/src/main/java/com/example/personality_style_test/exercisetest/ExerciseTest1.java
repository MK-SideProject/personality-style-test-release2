package com.example.personality_style_test.exercisetest;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.personality_style_test.R;
import com.example.personality_style_test.caketest.CakeTest2;


public class ExerciseTest1 extends Fragment {


    public ExerciseTest1() {

    }


    public static ExerciseTest1 newInstance() {
        ExerciseTest1 fragment = new ExerciseTest1();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View exerciseTest1 = inflater.inflate(R.layout.fragment_exercise_test1, container, false);

        Button exerciseTest_1_an1 = (Button) exerciseTest1.findViewById(R.id.exercisetest_1_an1);
        Button exerciseTest_1_an2 = (Button) exerciseTest1.findViewById(R.id.exercisetest_1_an2);
        Button exerciseTest_1_an3 = (Button) exerciseTest1.findViewById(R.id.exercisetest_1_an3);

        ExerciseTest2 exerciseTest2 = new ExerciseTest2();

        //프래그먼트 이동 선언
        FragmentManager mnger = getActivity().getSupportFragmentManager();
        FragmentTransaction transaction = mnger.beginTransaction();


        exerciseTest_1_an1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //이동
                transaction.replace(R.id.exercisetest_start_fragment, exerciseTest2);

                transaction.addToBackStack(null).commit();
            }
        });

        exerciseTest_1_an2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //이동
                transaction.replace(R.id.exercisetest_start_fragment, exerciseTest2);

                transaction.addToBackStack(null).commit();
            }
        });

        exerciseTest_1_an3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //이동
                transaction.replace(R.id.exercisetest_start_fragment, exerciseTest2);

                transaction.addToBackStack(null).commit();
            }
        });

        return exerciseTest1;
    }
}