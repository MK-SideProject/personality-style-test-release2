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


public class CakeTest4 extends Fragment {

    //결과값 이동
    private String cakeTestResult1;
    private String cakeTestResult2;
    private String cakeTestResult3;
    private String cakeTestResult4;

    public CakeTest4() {

    }


    public static CakeTest4 newInstance() {
        CakeTest4 fragment = new CakeTest4();
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

        View cakeTest4 = inflater.inflate(R.layout.fragment_cake_test4, container, false);

        Button cakeTest_4_an1 = (Button) cakeTest4.findViewById(R.id.caketest_4_an1);
        Button cakeTest_4_an2 = (Button) cakeTest4.findViewById(R.id.caketest_4_an2);


        //전달한 번들 메소드 받기
        Bundle bundle = getArguments();


        //값이 있다면
        if(bundle != null) {
            cakeTestResult1 = bundle.getString("cakeTestResult1");
            cakeTestResult2 = bundle.getString("cakeTestResult2");
            cakeTestResult3 = bundle.getString("cakeTestResult3");
            cakeTestResult4 = bundle.getString("cakeTestResult4");


            //데이터 전달 및 프래그먼트 변경
            CakeTest5 cakeTest5 = new CakeTest5();
            //전달할 번들 생성
            Bundle bundleNext = new Bundle();

            //프래그먼트 이동 선언
            FragmentManager mnger = getActivity().getSupportFragmentManager();
            FragmentTransaction transaction = mnger.beginTransaction();

            cakeTest_4_an1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    //번틀 값 설정
                    bundleNext.putString("cakeTestResult1",cakeTestResult1);
                    bundleNext.putString("cakeTestResult2",cakeTestResult2);
                    bundleNext.putString("cakeTestResult3",cakeTestResult3);
                    bundleNext.putString("cakeTestResult4",cakeTestResult4);
                    //다음 프래그먼트로 값 이동
                    cakeTest5.setArguments(bundleNext);

                    //이동
                    transaction.replace(R.id.caketest_start_fragment, cakeTest5);

                    transaction.commit();
                }
            });

            cakeTest_4_an2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    //번틀 값 설정
                    bundleNext.putString("cakeTestResult1",cakeTestResult1);
                    bundleNext.putString("cakeTestResult2",cakeTestResult2);
                    bundleNext.putString("cakeTestResult3",cakeTestResult3);
                    bundleNext.putString("cakeTestResult4",cakeTestResult4);
                    //다음 프래그먼트로 값 이동
                    cakeTest5.setArguments(bundleNext);

                    //이동
                    transaction.replace(R.id.caketest_start_fragment, cakeTest5);

                    transaction.commit();
                }
            });

        }
        return cakeTest4;
    }
}