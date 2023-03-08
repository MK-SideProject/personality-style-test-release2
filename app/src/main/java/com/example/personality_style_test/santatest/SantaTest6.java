package com.example.personality_style_test.santatest;

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


public class SantaTest6 extends Fragment {

    private String santaTestResult1;
    private String santaTestResult2;
    private String santaTestResult3;
    private String santaTestResult4;

    public SantaTest6() {

    }


    public static SantaTest6 newInstance(String param1, String param2) {
        SantaTest6 fragment = new SantaTest6();
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

        View santaTest6 = inflater.inflate(R.layout.fragment_santa_test6, container, false);

        Button santaTest_6_an1 = (Button) santaTest6.findViewById(R.id.santatest_6_an1);
        Button santaTest_6_an2 = (Button) santaTest6.findViewById(R.id.santatest_6_an2);
        Button santaTest_6_an3 = (Button) santaTest6.findViewById(R.id.santatest_6_an3);

        //전달한 번들 메소드 받기
        Bundle bundle = getArguments();


        //값이 있다면
        if(bundle != null) {
            santaTestResult1 = bundle.getString("santaTestResult1");
            santaTestResult2 = bundle.getString("santaTestResult2");
            santaTestResult3 = bundle.getString("santaTestResult3");
            santaTestResult4 = bundle.getString("santaTestResult4");


            //데이터 전달 및 프래그먼트 변경
            SantaTestResult1Fg santaTestResult1Fg = new SantaTestResult1Fg();
            SantaTestResult2Fg santaTestResult2Fg = new SantaTestResult2Fg();
            SantaTestResult3Fg santaTestResult3Fg = new SantaTestResult3Fg();
            SantaTestResult4Fg santaTestResult4Fg = new SantaTestResult4Fg();

            //전달할 번들 생성
            Bundle bundleNext = new Bundle();

            //프래그먼트 이동 선언
            FragmentManager mnger = getActivity().getSupportFragmentManager();
            FragmentTransaction transaction = mnger.beginTransaction();

            santaTest_6_an1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if (santaTestResult4 != null && santaTestResult4.equals("result4")) {
                        transaction.replace(R.id.santatest_start_fragment, santaTestResult4Fg);
                        transaction.commit();

                    } else if (santaTestResult2 != null && santaTestResult2.equals("result2")) {
                        transaction.replace(R.id.santatest_start_fragment, santaTestResult2Fg);
                        transaction.commit();

                    } else if (santaTestResult1 != null && santaTestResult1.equals("result1")) {
                        transaction.replace(R.id.santatest_start_fragment, santaTestResult1Fg);
                        transaction.commit();
                    } else {
                        transaction.replace(R.id.santatest_start_fragment, santaTestResult3Fg);
                        transaction.commit();
                    }
                }
            });

            santaTest_6_an2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {


                    if (santaTestResult4 != null && santaTestResult4.equals("result4")) {
                        transaction.replace(R.id.santatest_start_fragment, santaTestResult4Fg);
                        transaction.commit();

                    } else if (santaTestResult2 != null && santaTestResult2.equals("result2")) {
                        transaction.replace(R.id.santatest_start_fragment, santaTestResult2Fg);
                        transaction.commit();

                    } else if (santaTestResult1 != null && santaTestResult1.equals("result1")) {
                        transaction.replace(R.id.santatest_start_fragment, santaTestResult1Fg);
                        transaction.commit();
                    } else {
                        transaction.replace(R.id.santatest_start_fragment, santaTestResult3Fg);
                        transaction.commit();
                    }
                }
            });

            santaTest_6_an3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {


                    if (santaTestResult4 != null && santaTestResult4.equals("result4")) {
                        transaction.replace(R.id.santatest_start_fragment, santaTestResult4Fg);
                        transaction.commit();

                    } else if (santaTestResult2 != null && santaTestResult2.equals("result2")) {
                        transaction.replace(R.id.santatest_start_fragment, santaTestResult2Fg);
                        transaction.commit();

                    } else if (santaTestResult1 != null && santaTestResult1.equals("result1")) {
                        transaction.replace(R.id.santatest_start_fragment, santaTestResult1Fg);
                        transaction.commit();
                    } else {
                        transaction.replace(R.id.santatest_start_fragment, santaTestResult3Fg);
                        transaction.commit();
                    }
                }
            });
        }

        return santaTest6;
    }
}