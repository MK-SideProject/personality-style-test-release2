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


public class BankingTest3 extends Fragment {

    //결과값 이동
    private String bankingTestResult1;
    private String bankingTestResult2;
    private String bankingTestResult3;

    public BankingTest3() {

    }

    public static BankingTest3 newInstance() {
        BankingTest3 fragment = new BankingTest3();
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
        View bankingTest3 = inflater.inflate(R.layout.fragment_banking_test_3, container, false);

        Button bankingTest3_an1 = (Button) bankingTest3.findViewById(R.id.bankingtest_3_an1);
        Button bankingTest3_an2 = (Button) bankingTest3.findViewById(R.id.bankingtest_3_an2);
        Button bankingTest3_an3 = (Button) bankingTest3.findViewById(R.id.bankingtest_3_an3);

        //전달한 번들 메소드 받기
        Bundle bundle = getArguments();

        //값이 있다면
        if(bundle != null) {
            bankingTestResult1 = bundle.getString("bankingTestResult1");
            bankingTestResult2 = bundle.getString("bankingTestResult2");
            bankingTestResult3 = bundle.getString("bankingTestResult3");


            //데이터 전달 및 프래그먼트 변경
            BankingTest4 bankingTest4 = new BankingTest4();
            //전달할 번들 생성
            Bundle bundleNext = new Bundle();

            //프래그먼트 이동 선언
            FragmentManager mnger = getActivity().getSupportFragmentManager();
            FragmentTransaction transaction = mnger.beginTransaction();

            bankingTest3_an1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    //번틀 값 설정
                    bundleNext.putString("bankingTestResult1",bankingTestResult1);
                    bundleNext.putString("bankingTestResult2",bankingTestResult2);
                    bundleNext.putString("bankingTestResult3",bankingTestResult3);
                    //다음 프래그먼트로 값 이동
                    bankingTest4.setArguments(bundleNext);

                    //이동
                    transaction.replace(R.id.bankingtest_start_fragment, bankingTest4);

                    transaction.addToBackStack(null).commit();
                }
            });

            bankingTest3_an2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    //번틀 값 설정
                    bundleNext.putString("bankingTestResult1",bankingTestResult1);
                    bundleNext.putString("bankingTestResult2",bankingTestResult2);
                    bundleNext.putString("bankingTestResult3",bankingTestResult3);
                    //다음 프래그먼트로 값 이동
                    bankingTest4.setArguments(bundleNext);

                    //이동
                    transaction.replace(R.id.bankingtest_start_fragment, bankingTest4);

                    transaction.addToBackStack(null).commit();
                }
            });

            bankingTest3_an3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    //해당 값이 null이라도 이 버튼을 누른다면 다음 프래그먼트때는 해당 값을 넘겨야한다.
                    bankingTestResult3 = "result3";
                    //번틀 값 설정
                    bundleNext.putString("bankingTestResult1",bankingTestResult1);
                    bundleNext.putString("bankingTestResult2",bankingTestResult2);
                    bundleNext.putString("bankingTestResult3",bankingTestResult3);
                    //다음 프래그먼트로 값 이동
                    bankingTest4.setArguments(bundleNext);

                    //이동
                    transaction.replace(R.id.bankingtest_start_fragment, bankingTest4);

                    transaction.addToBackStack(null).commit();
                }
            });
        }
        return bankingTest3;
    }
}