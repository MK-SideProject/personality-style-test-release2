package com.example.personality_style_test.caketest;

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


public class CakeTest1 extends Fragment {


    public CakeTest1() {

    }

    public static CakeTest1 newInstance() {
        CakeTest1 fragment = new CakeTest1();
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

        View CakeTest1 =  inflater.inflate(R.layout.fragment_cake_test1, container, false);
        Button caketest_1_an1 = (Button) CakeTest1.findViewById(R.id.caketest_1_an1);
        Button caketest_1_an2 = (Button) CakeTest1.findViewById(R.id.caketest_1_an2);
        Button caketest_1_an3 = (Button) CakeTest1.findViewById(R.id.caketest_1_an3);


        CakeTest2 cakeTest2 = new CakeTest2();
        Bundle bundle = new Bundle();

        //프래그먼트 이동 선언
        FragmentManager mnger = getActivity().getSupportFragmentManager();
        FragmentTransaction transaction = mnger.beginTransaction();

        caketest_1_an1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String CakeTestResult2 = "result2";

                //번틀 값 설정
                bundle.putString("CakeTestResult2",CakeTestResult2);
                cakeTest2.setArguments(bundle);

                //이동
                transaction.replace(R.id.caketest_start_fragment, cakeTest2);

                transaction.commit();
            }
        });

        caketest_1_an2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String CakeTestResult3 = "result3";

                //번틀 값 설정
                bundle.putString("CakeTestResult3",CakeTestResult3);
                cakeTest2.setArguments(bundle);

                //이동
                transaction.replace(R.id.caketest_start_fragment, cakeTest2);

                transaction.commit();
            }
        });

        caketest_1_an3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String CakeTestResult4 = "result4";

                //번틀 값 설정
                bundle.putString("CakeTestResult4",CakeTestResult4);
                cakeTest2.setArguments(bundle);

                //이동
                transaction.replace(R.id.caketest_start_fragment, cakeTest2);

                transaction.commit();
            }
        });
        return CakeTest1;
    }
}