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

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BankingTest_1#newInstance} factory method to
 * create an instance of this fragment.
 */
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

        View BankingTest1 = inflater.inflate(R.layout.fragment_bankingtest_1, container, false);
        Button bankingtest_1_an1 = (Button) BankingTest1.findViewById(R.id.bankingtest_1_an1);
        Button bankingtest_1_an2 = (Button) BankingTest1.findViewById(R.id.bankingtest_1_an2);
        Button bankingtest_1_an3 = (Button) BankingTest1.findViewById(R.id.bankingtest_1_an3);

        //bankingtest_1 -> bankingtest_2로 데이터 전달 및 프래그먼트 변경
        BankingTest_2 bankingtest_2 = new BankingTest_2();
        Bundle bundle = new Bundle();

        //프래그먼트 이동 선언
        FragmentManager mnger = getActivity().getSupportFragmentManager();
        FragmentTransaction transaction = mnger.beginTransaction();

        bankingtest_1_an1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String bankigtest_result1 = "result1";
                //번틀 값 설정
                bundle.putString("bankingtest_result1",bankigtest_result1);
                bankingtest_2.setArguments(bundle);

                //이동
                transaction.replace(R.id.bankingtest_start_fragment, bankingtest_2);

                transaction.commit();


            }


        });

        bankingtest_1_an2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String bankingtest_result2 = "result2";

                //번틀 값 설정
                bundle.putString("bankingtest_result2",bankingtest_result2);
                bankingtest_2.setArguments(bundle);

                //이동
                transaction.replace(R.id.bankingtest_start_fragment, bankingtest_2);

                transaction.commit();
            }
        });

        bankingtest_1_an3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String bankingtest_result3 = "result3";

                //번틀 값 설정
                bundle.putString("bankingtest_result3",bankingtest_result3);
                bankingtest_2.setArguments(bundle);

                //이동
                transaction.replace(R.id.bankingtest_start_fragment, bankingtest_2);

                transaction.commit();
            }
        });

        return BankingTest1;
    }
}