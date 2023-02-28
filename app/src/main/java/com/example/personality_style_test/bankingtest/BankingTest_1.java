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


public class BankingTest_1 extends Fragment {


    public BankingTest_1() {
        // Required empty public constructor
    }


    public static BankingTest_1 newInstance() {
        BankingTest_1 fragment = new BankingTest_1();
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

        View BankingTest1 = inflater.inflate(R.layout.fragment_banking_test_1, container, false);
        Button bankingTest1_an1 = (Button) BankingTest1.findViewById(R.id.bankingtest_1_an1);
        Button bankingTest1_an2 = (Button) BankingTest1.findViewById(R.id.bankingtest_1_an2);
        Button bankingTest1_an3 = (Button) BankingTest1.findViewById(R.id.bankingtest_1_an3);

        //bankingtest_1 -> bankingtest_2로 데이터 전달 및 프래그먼트 변경
        BankingTest_2 bankingTest_2 = new BankingTest_2();
        Bundle bundle = new Bundle();

        //프래그먼트 이동 선언
        FragmentManager mnger = getActivity().getSupportFragmentManager();
        FragmentTransaction transaction = mnger.beginTransaction();

        bankingTest1_an1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String bankigTestResult1 = "result1";
                //번틀 값 설정
                bundle.putString("bankigTestResult1",bankigTestResult1);
                bankingTest_2.setArguments(bundle);

                //이동
                transaction.replace(R.id.bankingtest_start_fragment, bankingTest_2);

                transaction.commit();


            }


        });

        bankingTest1_an2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String bankingTestResult2 = "result2";

                //번틀 값 설정
                bundle.putString("bankingTestResult2",bankingTestResult2);
                bankingTest_2.setArguments(bundle);

                //이동
                transaction.replace(R.id.bankingtest_start_fragment, bankingTest_2);

                transaction.commit();
            }
        });

        bankingTest1_an3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String bankingTestResult3 = "result3";

                //번틀 값 설정
                bundle.putString("bankingTestResult3",bankingTestResult3);
                bankingTest_2.setArguments(bundle);

                //이동
                transaction.replace(R.id.bankingtest_start_fragment, bankingTest_2);

                transaction.commit();
            }
        });

        return BankingTest1;
    }
}