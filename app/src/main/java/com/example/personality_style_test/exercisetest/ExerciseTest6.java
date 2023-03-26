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


public class ExerciseTest6 extends Fragment {

    private String exerciseTestResult1;
    private String exerciseTestResult2;
    private String exerciseTestResult3;
    private String exerciseTestResult4;
    private String exerciseTestResult5;
    private String diet;


    public ExerciseTest6() {

    }


    public static ExerciseTest6 newInstance() {
        ExerciseTest6 fragment = new ExerciseTest6();
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

        View exerciseTest6 = inflater.inflate(R.layout.fragment_exercise_test6, container, false);

        Button exerciseTest_6_an1 = (Button) exerciseTest6.findViewById(R.id.exercisetest_6_an1);
        Button exerciseTest_6_an2 = (Button) exerciseTest6.findViewById(R.id.exercisetest_6_an2);
        Button exerciseTest_6_an3 = (Button) exerciseTest6.findViewById(R.id.exercisetest_6_an3);
        Button exerciseTest_6_an4 = (Button) exerciseTest6.findViewById(R.id.exercisetest_6_an4);

        //전달한 번들 메소드 받기
        Bundle bundle = getArguments();


        //값이 있다면
        if(bundle != null) {
            exerciseTestResult1 = bundle.getString("exerciseTestResult1");
            exerciseTestResult2 = bundle.getString("exerciseTestResult2");
            exerciseTestResult3 = bundle.getString("exerciseTestResult3");
            exerciseTestResult4 = bundle.getString("exerciseTestResult4");
            exerciseTestResult5 = bundle.getString("exerciseTestResult5");
            diet = bundle.getString("diet");


            ExerciseTestResult1Fg exerciseTestResult1Fg = new ExerciseTestResult1Fg();
            ExerciseTestResult2Fg exerciseTestResult2Fg = new ExerciseTestResult2Fg();
            ExerciseTestResult3Fg exerciseTestResult3Fg = new ExerciseTestResult3Fg();
            ExerciseTestResult4Fg exerciseTestResult4Fg = new ExerciseTestResult4Fg();
            ExerciseTestResult5Fg exerciseTestResult5Fg = new ExerciseTestResult5Fg();


            //프래그먼트 이동 선언
            FragmentManager mnger = getActivity().getSupportFragmentManager();
            FragmentTransaction transaction = mnger.beginTransaction();

            exerciseTest_6_an1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    //result 1= 홈트, 2 = 필라테스 , 3 = 헬스장, 4 = pt, 5=조깅
                    exerciseTestResult1 = "result1";

                    if (exerciseTestResult1 != null && exerciseTestResult1.equals("result1")) {
                        //이동
                        transaction.replace(R.id.exercisetest_start_fragment, exerciseTestResult1Fg);
                        transaction.addToBackStack(null).commit();

                    } else if ((exerciseTestResult4 != null && exerciseTestResult4.equals("result4")) && (diet != null && diet.equals("diet"))) {
                        //이동
                        transaction.replace(R.id.exercisetest_start_fragment, exerciseTestResult4Fg);
                        transaction.addToBackStack(null).commit();

                    } else if (exerciseTestResult2 != null && exerciseTestResult2.equals("result2")) {
                        //이동
                        transaction.replace(R.id.exercisetest_start_fragment, exerciseTestResult2Fg);
                        transaction.addToBackStack(null).commit();

                    } else if (exerciseTestResult3 != null && exerciseTestResult3.equals("result3")) {
                        //이동
                        transaction.replace(R.id.exercisetest_start_fragment, exerciseTestResult3Fg);
                        transaction.addToBackStack(null).commit();

                    } else {
                        //이동
                        transaction.replace(R.id.exercisetest_start_fragment, exerciseTestResult5Fg);
                        transaction.addToBackStack(null).commit();

                    }


                }
            });

            exerciseTest_6_an2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    //result 1= 홈트, 2 = 필라테스 , 3 = 헬스장, 4 = pt, 5=조깅
                    exerciseTestResult3 = "result3";

                    if (exerciseTestResult1 != null && exerciseTestResult1.equals("result1")) {
                        //이동
                        transaction.replace(R.id.exercisetest_start_fragment, exerciseTestResult1Fg);
                        transaction.addToBackStack(null).commit();

                    } else if ((exerciseTestResult4 != null && exerciseTestResult4.equals("result4")) && (diet != null && diet.equals("diet"))) {
                        //이동
                        transaction.replace(R.id.exercisetest_start_fragment, exerciseTestResult4Fg);
                        transaction.addToBackStack(null).commit();

                    } else if (exerciseTestResult2 != null && exerciseTestResult2.equals("result2")) {
                        //이동
                        transaction.replace(R.id.exercisetest_start_fragment, exerciseTestResult2Fg);
                        transaction.addToBackStack(null).commit();

                    } else if (exerciseTestResult3 != null && exerciseTestResult3.equals("result3")) {
                        //이동
                        transaction.replace(R.id.exercisetest_start_fragment, exerciseTestResult3Fg);
                        transaction.addToBackStack(null).commit();

                    } else {
                        //이동
                        transaction.replace(R.id.exercisetest_start_fragment, exerciseTestResult5Fg);
                        transaction.addToBackStack(null).commit();
                    }


                }
            });

            exerciseTest_6_an3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    //result 1= 홈트, 2 = 필라테스 , 3 = 헬스장, 4 = pt, 5=조깅
                    exerciseTestResult2 = "result2";
                    exerciseTestResult4 = "result4";

                    if (exerciseTestResult1 != null && exerciseTestResult1.equals("result1")) {
                        //이동
                        transaction.replace(R.id.exercisetest_start_fragment, exerciseTestResult1Fg);
                        transaction.addToBackStack(null).commit();

                    } else if ((exerciseTestResult4 != null && exerciseTestResult4.equals("result4")) && (diet != null && diet.equals("diet"))) {
                        //이동
                        transaction.replace(R.id.exercisetest_start_fragment, exerciseTestResult4Fg);
                        transaction.addToBackStack(null).commit();

                    } else if (exerciseTestResult2 != null && exerciseTestResult2.equals("result2")) {
                        //이동
                        transaction.replace(R.id.exercisetest_start_fragment, exerciseTestResult2Fg);
                        transaction.addToBackStack(null).commit();

                    } else if (exerciseTestResult3 != null && exerciseTestResult3.equals("result3")) {
                        //이동
                        transaction.replace(R.id.exercisetest_start_fragment, exerciseTestResult3Fg);
                        transaction.addToBackStack(null).commit();

                    } else {
                        //이동
                        transaction.replace(R.id.exercisetest_start_fragment, exerciseTestResult5Fg);
                        transaction.addToBackStack(null).commit();
                    }

                }
            });
            exerciseTest_6_an4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    //result 1= 홈트, 2 = 필라테스 , 3 = 헬스장, 4 = pt, 5=조깅

                    if (exerciseTestResult1 != null && exerciseTestResult1.equals("result1")) {
                        //이동
                        transaction.replace(R.id.exercisetest_start_fragment, exerciseTestResult1Fg);
                        transaction.addToBackStack(null).commit();

                    } else if ((exerciseTestResult4 != null && exerciseTestResult4.equals("result4")) && (diet != null && diet.equals("diet"))) {
                        //이동
                        transaction.replace(R.id.exercisetest_start_fragment, exerciseTestResult4Fg);
                        transaction.addToBackStack(null).commit();

                    } else if (exerciseTestResult2 != null && exerciseTestResult2.equals("result2")) {
                        //이동
                        transaction.replace(R.id.exercisetest_start_fragment, exerciseTestResult2Fg);
                        transaction.addToBackStack(null).commit();

                    } else if (exerciseTestResult3 != null && exerciseTestResult3.equals("result3")) {
                        //이동
                        transaction.replace(R.id.exercisetest_start_fragment, exerciseTestResult3Fg);
                        transaction.addToBackStack(null).commit();

                    } else {
                        //이동
                        transaction.replace(R.id.exercisetest_start_fragment, exerciseTestResult5Fg);
                        transaction.addToBackStack(null).commit();
                    }

                }
            });
        }

            return exerciseTest6;
    }
}