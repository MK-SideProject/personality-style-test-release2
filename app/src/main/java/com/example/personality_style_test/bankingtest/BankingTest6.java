package com.example.personality_style_test.bankingtest;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.personality_style_test.R;


public class BankingTest6 extends Fragment {

    private String bankingTestResult1;
    private String bankingTestResult2;
    private String bankingTestResult3;

    public BankingTest6() {

    }


    public static BankingTest6 newInstance() {
        BankingTest6 fragment = new BankingTest6();
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
        View bankingTest6 = inflater.inflate(R.layout.fragment_banking_test_6, container, false);

        Button bankingTest6_an1 = (Button) bankingTest6.findViewById(R.id.bankingtest_6_an1);
        Button bankingTest6_an2 = (Button) bankingTest6.findViewById(R.id.bankingtest_6_an2);
        Button bankingTest6_an3 = (Button) bankingTest6.findViewById(R.id.bankingtest_6_an3);

        //전달한 번들 메소드 받기
        Bundle bundle = getArguments();


        if(bundle != null){

            bankingTestResult1 = bundle.getString("bankingTestResult1");
            bankingTestResult2 = bundle.getString("bankingTestResult2");
            bankingTestResult3 = bundle.getString("bankingTestResult3");

            //프래그먼트 이동 선언
            FragmentManager mnger = getActivity().getSupportFragmentManager();
            FragmentTransaction transaction = mnger.beginTransaction();

            BankingTestResult1Fg bankingTestResult1Fg = new BankingTestResult1Fg();
            BankingTestResult2Fg bankingTestResult2Fg = new BankingTestResult2Fg();
            BankingTestResult3Fg bankingTestResult3Fg = new BankingTestResult3Fg();

            bankingTest6_an1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {


                    if(bankingTestResult3 != null && bankingTestResult3.equals("result3") ){
                        //이동
                        transaction.replace(R.id.bankingtest_start_fragment, bankingTestResult3Fg);
                        transaction.commit();

                    }
                    else if(bankingTestResult1 != null && bankingTestResult1.equals("result1")){


                        transaction.replace(R.id.bankingtest_start_fragment, bankingTestResult1Fg);
                        transaction.commit();
                    }
                    else{

                        transaction.replace(R.id.bankingtest_start_fragment, bankingTestResult2Fg);
                        transaction.commit();

                    }


                }
            });

            bankingTest6_an2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if(bankingTestResult3 != null && bankingTestResult3.equals("result3") ){
                        //이동
                        transaction.replace(R.id.bankingtest_start_fragment, bankingTestResult3Fg);
                        transaction.commit();

                    }
                    else if(bankingTestResult1 != null && bankingTestResult1.equals("result1")){
                        transaction.replace(R.id.bankingtest_start_fragment, bankingTestResult1Fg);
                        transaction.commit();
                    }
                    else{
                        transaction.replace(R.id.bankingtest_start_fragment, bankingTestResult2Fg);
                        transaction.commit();

                    }
                }
            });

            bankingTest6_an3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    transaction.replace(R.id.bankingtest_start_fragment, bankingTestResult3Fg);
                    transaction.commit();
                }
            });

        }else{
            Toast.makeText(getContext(), "값이 없습니다", Toast.LENGTH_LONG).show();
        }

        return bankingTest6;
    }
}