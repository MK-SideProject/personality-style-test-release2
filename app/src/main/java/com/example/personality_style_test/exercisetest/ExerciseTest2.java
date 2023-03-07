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


public class ExerciseTest2 extends Fragment {



    public ExerciseTest2() {

    }

    public static ExerciseTest2 newInstance() {
        ExerciseTest2 fragment = new ExerciseTest2();
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

        View exerciseTest2 = inflater.inflate(R.layout.fragment_exercise_test2, container, false);

        Button exerciseTest_2_an1 = (Button) exerciseTest2.findViewById(R.id.exercisetest_2_an1);
        Button exerciseTest_2_an2 = (Button) exerciseTest2.findViewById(R.id.exercisetest_2_an2);
        Button exerciseTest_2_an3 = (Button) exerciseTest2.findViewById(R.id.exercisetest_2_an3);

        ExerciseTest3 exerciseTest3 = new ExerciseTest3();
        Bundle bundle = new Bundle();

        //프래그먼트 이동 선언
        FragmentManager mnger = getActivity().getSupportFragmentManager();
        FragmentTransaction transaction = mnger.beginTransaction();

        exerciseTest_2_an1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //result 1= 홈트, 2 = 필라테스 , 3 = 헬스장, 4 = pt, 5=조깅
                String exerciseTestResult2 = "result2";
                String exerciseTestResult3 = "result3";
                String exerciseTestResult4 = "result4";

                //번틀 값 설정
                bundle.putString("exerciseTestResult2",exerciseTestResult2);
                bundle.putString("exerciseTestResult3",exerciseTestResult3);
                bundle.putString("exerciseTestResult4",exerciseTestResult4);
                exerciseTest3.setArguments(bundle);

                //이동
                transaction.replace(R.id.exercisetest_start_fragment, exerciseTest3);

                transaction.commit();
            }
        });

        exerciseTest_2_an2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //result 1= 홈트, 2 = 필라테스 , 3 = 헬스장, 4 = pt, 5=조깅
                String exerciseTestResult1 = "result1";

                //번틀 값 설정
                bundle.putString("exerciseTestResult1",exerciseTestResult1);
                exerciseTest3.setArguments(bundle);

                //이동
                transaction.replace(R.id.exercisetest_start_fragment, exerciseTest3);

                transaction.commit();
            }
        });
        exerciseTest_2_an3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //result 1= 홈트, 2 = 필라테스 , 3 = 헬스장, 4 = pt, 5=조깅
                String exerciseTestResult5 = "result5";

                //번틀 값 설정
                bundle.putString("exerciseTestResult5",exerciseTestResult5);
                exerciseTest3.setArguments(bundle);

                //이동
                transaction.replace(R.id.exercisetest_start_fragment, exerciseTest3);

                transaction.commit();
            }
        });

        return exerciseTest2;
    }
}