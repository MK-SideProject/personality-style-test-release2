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


public class SantaTest3 extends Fragment {

    private String santaTestResult1;
    private String santaTestResult2;
    private String santaTestResult3;
    private String santaTestResult4;


    public SantaTest3() {
        // Required empty public constructor
    }

    public static SantaTest3 newInstance() {
        SantaTest3 fragment = new SantaTest3();
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

        View santaTest3 = inflater.inflate(R.layout.fragment_santa_test3, container, false);

        Button santaTest_3_an1 = (Button) santaTest3.findViewById(R.id.santatest_3_an1);
        Button santaTest_3_an2 = (Button) santaTest3.findViewById(R.id.santatest_3_an2);
        Button santaTest_3_an3 = (Button) santaTest3.findViewById(R.id.santatest_3_an3);

        //전달한 번들 메소드 받기
        Bundle bundle = getArguments();

        if(bundle != null) {
            santaTestResult1 = bundle.getString("santaTestResult1");
            santaTestResult2 = bundle.getString("santaTestResult2");
            santaTestResult3 = bundle.getString("santaTestResult3");
            santaTestResult4 = bundle.getString("santaTestResult4");


            //데이터 전달 및 프래그먼트 변경
            SantaTest4 santaTest4 = new SantaTest4();
            //전달할 번들 생성
            Bundle bundleNext = new Bundle();

            //프래그먼트 이동 선언
            FragmentManager mnger = getActivity().getSupportFragmentManager();
            FragmentTransaction transaction = mnger.beginTransaction();

            santaTest_3_an1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    santaTestResult2 = "result2";

                    bundleNext.putString("santaTestResult1", santaTestResult1);
                    bundleNext.putString("santaTestResult2", santaTestResult2);
                    bundleNext.putString("santaTestResult3", santaTestResult3);
                    bundleNext.putString("santaTestResult4", santaTestResult4);
                    santaTest4.setArguments(bundleNext);

                    transaction.replace(R.id.santatest_start_fragment, santaTest4);
                    transaction.addToBackStack(null).commit();
                }
            });

            santaTest_3_an2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    bundleNext.putString("santaTestResult1", santaTestResult1);
                    bundleNext.putString("santaTestResult2", santaTestResult2);
                    bundleNext.putString("santaTestResult3", santaTestResult3);
                    bundleNext.putString("santaTestResult4", santaTestResult4);
                    santaTest4.setArguments(bundleNext);


                    transaction.replace(R.id.santatest_start_fragment, santaTest4);
                    transaction.addToBackStack(null).commit();
                }
            });

            santaTest_3_an3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    santaTestResult4 = "result4";

                    bundleNext.putString("santaTestResult1", santaTestResult1);
                    bundleNext.putString("santaTestResult2", santaTestResult2);
                    bundleNext.putString("santaTestResult3", santaTestResult3);
                    bundleNext.putString("santaTestResult4", santaTestResult4);
                    santaTest4.setArguments(bundleNext);

                    transaction.replace(R.id.santatest_start_fragment, santaTest4);
                    transaction.addToBackStack(null).commit();
                }
            });

        }else{ //만약 넘어온 번들이 다 null이라면

            //데이터 전달 및 프래그먼트 변경
            SantaTest4 santaTest4 = new SantaTest4();
            //전달할 번들 생성
            Bundle bundleNext = new Bundle();

            //프래그먼트 이동 선언
            FragmentManager mnger = getActivity().getSupportFragmentManager();
            FragmentTransaction transaction = mnger.beginTransaction();

            santaTest_3_an1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    santaTestResult2 = "result2";

                    bundleNext.putString("santaTestResult2", santaTestResult2);
                    santaTest4.setArguments(bundleNext);

                    transaction.replace(R.id.santatest_start_fragment, santaTest4);
                    transaction.addToBackStack(null).commit();
                }
            });

            santaTest_3_an2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    transaction.replace(R.id.santatest_start_fragment, santaTest4);
                    transaction.addToBackStack(null).commit();
                }
            });

            santaTest_3_an3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    santaTestResult4 = "result4";

                    bundleNext.putString("santaTestResult4", santaTestResult4);
                    santaTest4.setArguments(bundleNext);

                    transaction.replace(R.id.santatest_start_fragment, santaTest4);
                    transaction.addToBackStack(null).commit();
                }
            });
        }

        return santaTest3;
    }
}