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


public class ExerciseTest4 extends Fragment {

    private String exerciseTestResult1;
    private String exerciseTestResult2;
    private String exerciseTestResult3;
    private String exerciseTestResult4;
    private String exerciseTestResult5;
    private String diet;

    public ExerciseTest4() {

    }


    public static ExerciseTest4 newInstance() {
        ExerciseTest4 fragment = new ExerciseTest4();
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

        View exerciseTest4 = inflater.inflate(R.layout.fragment_exercise_test4, container, false);

        Button exerciseTest_4_an1 = (Button) exerciseTest4.findViewById(R.id.exercisetest_4_an1);
        Button exerciseTest_4_an2 = (Button) exerciseTest4.findViewById(R.id.exercisetest_4_an2);


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


            //데이터 전달 및 프래그먼트 변경
            ExerciseTest5 exerciseTest5 = new ExerciseTest5();
            //전달할 번들 생성
            Bundle bundleNext = new Bundle();

            //프래그먼트 이동 선언
            FragmentManager mnger = getActivity().getSupportFragmentManager();
            FragmentTransaction transaction = mnger.beginTransaction();

            exerciseTest_4_an1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    //result 1= 홈트, 2 = 필라테스 , 3 = 헬스장, 4 = pt, 5=조깅
                    //번틀 값 설정
                    bundleNext.putString("exerciseTestResult1",exerciseTestResult1);
                    bundleNext.putString("exerciseTestResult2",exerciseTestResult2);
                    bundleNext.putString("exerciseTestResult3",exerciseTestResult3);
                    bundleNext.putString("exerciseTestResult4",exerciseTestResult4);
                    bundleNext.putString("exerciseTestResult5",exerciseTestResult5);
                    bundleNext.putString("diet",diet);
                    //다음 프래그먼트로 값 이동
                    exerciseTest5.setArguments(bundleNext);

                    //이동
                    transaction.replace(R.id.exercisetest_start_fragment, exerciseTest5);

                    transaction.addToBackStack(null).commit();
                }
            });

            exerciseTest_4_an2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    //result 1= 홈트, 2 = 필라테스 , 3 = 헬스장, 4 = pt, 5=조깅
                    //번틀 값 설정
                    bundleNext.putString("exerciseTestResult1",exerciseTestResult1);
                    bundleNext.putString("exerciseTestResult2",exerciseTestResult2);
                    bundleNext.putString("exerciseTestResult3",exerciseTestResult3);
                    bundleNext.putString("exerciseTestResult4",exerciseTestResult4);
                    bundleNext.putString("exerciseTestResult5",exerciseTestResult5);
                    bundleNext.putString("diet",diet);
                    //다음 프래그먼트로 값 이동
                    exerciseTest5.setArguments(bundleNext);

                    //이동
                    transaction.replace(R.id.exercisetest_start_fragment, exerciseTest5);

                    transaction.addToBackStack(null).commit();
                }
            });
        }

            return exerciseTest4;
    }
}