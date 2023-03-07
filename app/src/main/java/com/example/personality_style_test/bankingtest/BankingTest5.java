package com.example.personality_style_test.bankingtest;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.personality_style_test.R;


public class BankingTest5 extends Fragment {

    private String bankingTestResult1;
    private String bankingTestResult2;
    private String bankingTestResult3;

    public BankingTest5() {

    }


    public static BankingTest5 newInstance() {
        BankingTest5 fragment = new BankingTest5();
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

        //뷰 선언
        View bankingTest5 = inflater.inflate(R.layout.fragment_banking_test_5, container, false);

        Button bankingTest5_an1 = (Button) bankingTest5.findViewById(R.id.bankingtest_5_an1);
        Button bankingTest5_an2 = (Button) bankingTest5.findViewById(R.id.bankingtest_5_an2);
        Button bankingTest5_an3 = (Button) bankingTest5.findViewById(R.id.bankingtest_5_an3);
        Button bankingTest5_an4 = (Button) bankingTest5.findViewById(R.id.bankingtest_5_an3);

        //전달한 번들 메소드 받기
        Bundle bundle = getArguments();

        //값이 있다면
        if(bundle != null) {
            bankingTestResult1 = bundle.getString("bankingTestResult1");
            bankingTestResult2 = bundle.getString("bankingTestResult2");
            bankingTestResult3 = bundle.getString("bankingTestResult3");


            //데이터 전달 및 프래그먼트 변경
            BankingTest6 bankingTest6 = new BankingTest6();
            //전달할 번들 생성
            Bundle bundleNext = new Bundle();

            //프래그먼트 이동 선언
            FragmentManager mnger = getActivity().getSupportFragmentManager();
            FragmentTransaction transaction = mnger.beginTransaction();


            bankingTest5_an1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    //번틀 값 설정
                    bundleNext.putString("bankingTestResult1",bankingTestResult1);
                    bundleNext.putString("bankingTestResult2",bankingTestResult2);
                    bundleNext.putString("bankingTestResult3",bankingTestResult3);
                    //다음 프래그먼트로 값 이동
                    bankingTest6.setArguments(bundleNext);

                    //이동
                    transaction.replace(R.id.bankingtest_start_fragment, bankingTest6);

                    transaction.commit();
                }
            });

            bankingTest5_an2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    //번틀 값 설정
                    bundleNext.putString("bankingTestResult1",bankingTestResult1);
                    bundleNext.putString("bankingTestResult2",bankingTestResult2);
                    bundleNext.putString("bankingTestResult3",bankingTestResult3);
                    //다음 프래그먼트로 값 이동
                    bankingTest6.setArguments(bundleNext);

                    //이동
                    transaction.replace(R.id.bankingtest_start_fragment, bankingTest6);

                    transaction.commit();
                }
            });


            bankingTest5_an3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    //번틀 값 설정
                    bundleNext.putString("bankingTestResult1",bankingTestResult1);
                    bundleNext.putString("bankingTestResult2",bankingTestResult2);
                    bundleNext.putString("bankingTestResult3",bankingTestResult3);
                    //다음 프래그먼트로 값 이동
                    bankingTest6.setArguments(bundleNext);

                    //이동
                    transaction.replace(R.id.bankingtest_start_fragment, bankingTest6);

                    transaction.commit();
                }
            });

            bankingTest5_an4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    //번틀 값 설정
                    bundleNext.putString("bankingTestResult1",bankingTestResult1);
                    bundleNext.putString("bankingTestResult2",bankingTestResult2);
                    bundleNext.putString("bankingTestResult3",bankingTestResult3);
                    //다음 프래그먼트로 값 이동
                    bankingTest6.setArguments(bundleNext);

                    //이동
                    transaction.replace(R.id.bankingtest_start_fragment, bankingTest6);

                    transaction.commit();
                }
            });
        }
        return bankingTest5;
    }
}