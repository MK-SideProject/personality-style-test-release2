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


public class CakeTest7 extends Fragment {

    //결과값 이동
    private String cakeTestResult1;
    private String cakeTestResult2;
    private String cakeTestResult3;
    private String cakeTestResult4;

    public static CakeTest7 newInstance() {
        CakeTest7 fragment = new CakeTest7();
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

        View cakeTest7 =  inflater.inflate(R.layout.fragment_cake_test7, container, false);


        Button cakeTest_7_an1 = (Button) cakeTest7.findViewById(R.id.caketest_7_an1);
        Button cakeTest_7_an2 = (Button) cakeTest7.findViewById(R.id.caketest_7_an2);

        //전달한 번들 메소드 받기
        Bundle bundle = getArguments();


        //값이 있다면
        if(bundle != null) {
            cakeTestResult1 = bundle.getString("cakeTestResult1");
            cakeTestResult2 = bundle.getString("cakeTestResult2");
            cakeTestResult3 = bundle.getString("cakeTestResult3");
            cakeTestResult4 = bundle.getString("cakeTestResult4");


            //프래그먼트 이동 선언
            FragmentManager mnger = getActivity().getSupportFragmentManager();
            FragmentTransaction transaction = mnger.beginTransaction();


            CakeTestResult1Fg cakeTestResult1Fg = new CakeTestResult1Fg();
            CakeTestResult2Fg cakeTestResult2Fg = new CakeTestResult2Fg();
            CakeTestResult3Fg cakeTestResult3Fg = new CakeTestResult3Fg();
            CakeTestResult4Fg cakeTestResult4Fg = new CakeTestResult4Fg();

            cakeTest_7_an1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if (cakeTestResult4 != null && cakeTestResult4.equals("result4")) {
                        //이동
                        transaction.replace(R.id.caketest_start_fragment, cakeTestResult4Fg);
                        transaction.addToBackStack(null).commit();

                    } else if (cakeTestResult1 != null && cakeTestResult1.equals("result1")) {
                        //이동
                        transaction.replace(R.id.caketest_start_fragment, cakeTestResult1Fg);
                        transaction.addToBackStack(null).commit();

                    } else if (cakeTestResult3 != null && cakeTestResult3.equals("result3")) {
                        //이동
                        transaction.replace(R.id.caketest_start_fragment, cakeTestResult3Fg);
                        transaction.addToBackStack(null).commit();


                    } else {
                        //이동
                        transaction.replace(R.id.caketest_start_fragment, cakeTestResult2Fg);
                        transaction.addToBackStack(null).commit();
                    }


                }
            });

            cakeTest_7_an2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if (cakeTestResult4 != null && cakeTestResult4.equals("result4")) {
                        //이동
                        transaction.replace(R.id.caketest_start_fragment, cakeTestResult4Fg);
                        transaction.addToBackStack(null).commit();

                    } else if (cakeTestResult1 != null && cakeTestResult1.equals("result1")) {
                        //이동
                        transaction.replace(R.id.caketest_start_fragment, cakeTestResult1Fg);
                        transaction.addToBackStack(null).commit();

                    } else if (cakeTestResult3 != null && cakeTestResult3.equals("result3")) {
                        //이동
                        transaction.replace(R.id.caketest_start_fragment, cakeTestResult3Fg);
                        transaction.addToBackStack(null).commit();

                    } else {
                        //이동
                        transaction.replace(R.id.caketest_start_fragment, cakeTestResult2Fg);
                        transaction.addToBackStack(null).commit();
                    }

                }
            });

        }
        return cakeTest7;
    }
}