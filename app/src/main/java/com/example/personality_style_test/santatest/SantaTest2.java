package com.example.personality_style_test.santatest;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.personality_style_test.R;
import com.example.personality_style_test.exercisetest.ExerciseTest4;

public class SantaTest2 extends Fragment {


    private String santaTestResult2;
    private String santaTestResult4;


    public SantaTest2() {

    }

    public static SantaTest2 newInstance(String param1, String param2) {
        SantaTest2 fragment = new SantaTest2();
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

        View santaTest2 = inflater.inflate(R.layout.fragment_santa_test2, container, false);

        Button santaTest_2_an1 = (Button) santaTest2.findViewById(R.id.santatest_2_an1);
        Button santaTest_2_an2 = (Button) santaTest2.findViewById(R.id.santatest_2_an2);

        //전달한 번들 메소드 받기
        Bundle bundle = getArguments();


        if(bundle != null) {

            //데이터 전달 및 프래그먼트 변경
            SantaTest3 santaTest3 = new SantaTest3();
            //전달할 번들 생성
            Bundle bundleNext = new Bundle();

            //프래그먼트 이동 선언
            FragmentManager mnger = getActivity().getSupportFragmentManager();
            FragmentTransaction transaction = mnger.beginTransaction();

            santaTest_2_an1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    santaTestResult2 = "result2";

                    santaTestResult4 = bundle.getString("santaTestResult4");

                    bundleNext.putString("santaTestResult2", santaTestResult2);
                    bundleNext.putString("santaTestResult4", santaTestResult4);
                    santaTest3.setArguments(bundleNext);


                    transaction.replace(R.id.santatest_start_fragment, santaTest3);
                    transaction.addToBackStack(null).commit();
                }
            });

            santaTest_2_an2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    santaTestResult4 = bundle.getString("santaTestResult4");

                    bundleNext.putString("santaTestResult4", santaTestResult4);
                    santaTest3.setArguments(bundleNext);

                    transaction.replace(R.id.santatest_start_fragment, santaTest3);
                    transaction.addToBackStack(null).commit();
                }
            });

        }else{
            //데이터 전달 및 프래그먼트 변경
            SantaTest3 santaTest3 = new SantaTest3();
            //전달할 번들 생성
            Bundle bundleNext = new Bundle();

            //프래그먼트 이동 선언
            FragmentManager mnger = getActivity().getSupportFragmentManager();
            FragmentTransaction transaction = mnger.beginTransaction();

            santaTest_2_an1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    santaTestResult2 = "result2";

                    bundleNext.putString("santaTestResult2", santaTestResult2);

                    santaTest3.setArguments(bundleNext);


                    transaction.replace(R.id.santatest_start_fragment, santaTest3);
                    transaction.addToBackStack(null).commit();
                }
            });

            santaTest_2_an2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    transaction.replace(R.id.santatest_start_fragment, santaTest3);
                    transaction.addToBackStack(null).commit();
                }
            });
        }

        return santaTest2;
    }
}