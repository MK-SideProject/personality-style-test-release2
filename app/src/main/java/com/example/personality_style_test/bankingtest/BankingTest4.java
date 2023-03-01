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


public class BankingTest4 extends Fragment {

    //결과값 이동
    private String bankingTestResult1;
    private String bankingTestResult2;
    private String bankingTestResult3;

    public BankingTest4() {
        // Required empty public constructor
    }


    public static BankingTest4 newInstance() {
        BankingTest4 fragment = new BankingTest4();
        Bundle args = new Bundle();
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
        View BankingTest4 = inflater.inflate(R.layout.fragment_banking_test_4, container, false);

        //버튼 연결
        Button bankingTest4_an1 = (Button) BankingTest4.findViewById(R.id.bankingtest_4_an1);
        Button bankingTest4_an2 = (Button) BankingTest4.findViewById(R.id.bankingtest_4_an2);
        Button bankingTest4_an3 = (Button) BankingTest4.findViewById(R.id.bankingtest_4_an3);

        //전달한 번들 메소드 받기
        Bundle bundle = getArguments();

        //값이 있다면
        if(bundle != null) {
            bankingTestResult1 = bundle.getString("bankingTestResult1");
            bankingTestResult2 = bundle.getString("bankingTestResult2");
            bankingTestResult3 = bundle.getString("bankingTestResult3");


            //데이터 전달 및 프래그먼트 변경
            BankingTest5 bankingTest_5 = new BankingTest5();
            //전달할 번들 생성
            Bundle bundleNext = new Bundle();

            //프래그먼트 이동 선언
            FragmentManager mnger = getActivity().getSupportFragmentManager();
            FragmentTransaction transaction = mnger.beginTransaction();


            bankingTest4_an1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    //번틀 값 설정
                    bundleNext.putString("bankingTestResult1",bankingTestResult1);
                    bundleNext.putString("bankingTestResult2",bankingTestResult2);
                    bundleNext.putString("bankingTestResult3",bankingTestResult3);
                    //다음 프래그먼트로 값 이동
                    bankingTest_5.setArguments(bundleNext);

                    //이동
                    transaction.replace(R.id.bankingtest_start_fragment, bankingTest_5);

                    transaction.commit();
                }
            });

            bankingTest4_an2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    //번틀 값 설정
                    bundleNext.putString("bankingTestResult1",bankingTestResult1);
                    bundleNext.putString("bankingTestResult2",bankingTestResult2);
                    bundleNext.putString("bankingTestResult3",bankingTestResult3);
                    //다음 프래그먼트로 값 이동
                    bankingTest_5.setArguments(bundleNext);

                    //이동
                    transaction.replace(R.id.bankingtest_start_fragment, bankingTest_5);

                    transaction.commit();
                }
            });

            bankingTest4_an3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    //번틀 값 설정
                    bundleNext.putString("bankingTestResult1",bankingTestResult1);
                    bundleNext.putString("bankingTestResult2",bankingTestResult2);
                    bundleNext.putString("bankingTestResult3",bankingTestResult3);
                    //다음 프래그먼트로 값 이동
                    bankingTest_5.setArguments(bundleNext);

                    //이동
                    transaction.replace(R.id.bankingtest_start_fragment, bankingTest_5);

                    transaction.commit();
                }
            });
        }

        return BankingTest4;
    }
}