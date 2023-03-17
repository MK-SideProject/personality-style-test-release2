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


public class SantaTest5 extends Fragment {

    private String santaTestResult1;
    private String santaTestResult2;
    private String santaTestResult3;
    private String santaTestResult4;

    public SantaTest5() {

    }


    public static SantaTest5 newInstance(String param1, String param2) {
        SantaTest5 fragment = new SantaTest5();
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

        View santaTest5 = inflater.inflate(R.layout.fragment_santa_test5, container, false);

        Button santaTest_5_an1 = (Button) santaTest5.findViewById(R.id.santatest_5_an1);
        Button santaTest_5_an2 = (Button) santaTest5.findViewById(R.id.santatest_5_an2);

        //전달한 번들 메소드 받기
        Bundle bundle = getArguments();


        //값이 있다면
        if(bundle != null) {
            santaTestResult1 = bundle.getString("santaTestResult1");
            santaTestResult2 = bundle.getString("santaTestResult2");
            santaTestResult3 = bundle.getString("santaTestResult3");
            santaTestResult4 = bundle.getString("santaTestResult4");


            //데이터 전달 및 프래그먼트 변경
            SantaTest6 santaTest6 = new SantaTest6();
            //전달할 번들 생성
            Bundle bundleNext = new Bundle();

            //프래그먼트 이동 선언
            FragmentManager mnger = getActivity().getSupportFragmentManager();
            FragmentTransaction transaction = mnger.beginTransaction();

            santaTest_5_an1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    bundleNext.putString("santaTestResult1", santaTestResult1);
                    bundleNext.putString("santaTestResult2", santaTestResult2);
                    bundleNext.putString("santaTestResult3", santaTestResult3);
                    bundleNext.putString("santaTestResult4", santaTestResult4);
                    santaTest6.setArguments(bundle);

                    transaction.replace(R.id.santatest_start_fragment, santaTest6);
                    transaction.addToBackStack(null).commit();
                }
            });

            santaTest_5_an2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    santaTestResult1 = "result1";
                    bundleNext.putString("santaTestResult1", santaTestResult1);
                    bundleNext.putString("santaTestResult2", santaTestResult2);
                    bundleNext.putString("santaTestResult3", santaTestResult3);
                    bundleNext.putString("santaTestResult4", santaTestResult4);
                    santaTest6.setArguments(bundle);

                    transaction.replace(R.id.santatest_start_fragment, santaTest6);
                    transaction.addToBackStack(null).commit();

                }
            });
        }
        return santaTest5;
    }
}