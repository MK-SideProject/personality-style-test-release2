package com.example.personality_style_test.bankingtest;

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

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BankingTest_3#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BankingTest_3 extends Fragment {

    //결과값 이동
    private String bankingtest_result1;
    private String bankingtest_result2;
    private String bankingtest_result3;

    public BankingTest_3() {
        // Required empty public constructor
    }

    public static BankingTest_3 newInstance(String param1, String param2) {
        BankingTest_3 fragment = new BankingTest_3();
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
        View BankingTest3 = inflater.inflate(R.layout.fragment_banking_test_3, container, false);

        Button bankingtest_3_an1 = (Button) BankingTest3.findViewById(R.id.bankingtest_3_an1);
        Button bankingtest_3_an2 = (Button) BankingTest3.findViewById(R.id.bankingtest_3_an2);
        Button bankingtest_3_an3 = (Button) BankingTest3.findViewById(R.id.bankingtest_3_an3);

        //전달한 번들 메소드 받기
        Bundle bundle = getArguments();

        //값이 있다면
        if(bundle != null) {
            bankingtest_result1 = bundle.getString("bankingtest_result1");
            bankingtest_result2 = bundle.getString("bankingtest_result2");
            bankingtest_result3 = bundle.getString("bankingtest_result3");


            //데이터 전달 및 프래그먼트 변경
            BankingTest_4 bankingTest_4 = new BankingTest_4();
            //전달할 번들 생성
            Bundle bundle_next = new Bundle();

            //프래그먼트 이동 선언
            FragmentManager mnger = getActivity().getSupportFragmentManager();
            FragmentTransaction transaction = mnger.beginTransaction();

            bankingtest_3_an1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    //번틀 값 설정
                    bundle_next.putString("bankingtest_result1",bankingtest_result1);
                    bundle_next.putString("bankingtest_result2",bankingtest_result2);
                    bundle_next.putString("bankingtest_result3",bankingtest_result3);
                    //다음 프래그먼트로 값 이동
                    bankingTest_4.setArguments(bundle_next);

                    //이동
                    transaction.replace(R.id.bankingtest_start_fragment, bankingTest_4);

                    transaction.commit();
                }
            });

            bankingtest_3_an2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    //번틀 값 설정
                    bundle_next.putString("bankingtest_result1",bankingtest_result1);
                    bundle_next.putString("bankingtest_result2",bankingtest_result2);
                    bundle_next.putString("bankingtest_result3",bankingtest_result3);
                    //다음 프래그먼트로 값 이동
                    bankingTest_4.setArguments(bundle_next);

                    //이동
                    transaction.replace(R.id.bankingtest_start_fragment, bankingTest_4);

                    transaction.commit();
                }
            });

            bankingtest_3_an3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    //해당 값이 null이라도 이 버튼을 누른다면 다음 프래그먼트때는 해당 값을 넘겨야한다.
                    bankingtest_result3 = "result3";
                    //번틀 값 설정
                    bundle_next.putString("bankingtest_result1",bankingtest_result1);
                    bundle_next.putString("bankingtest_result2",bankingtest_result2);
                    bundle_next.putString("bankingtest_result3",bankingtest_result3);
                    //다음 프래그먼트로 값 이동
                    bankingTest_4.setArguments(bundle_next);

                    //이동
                    transaction.replace(R.id.bankingtest_start_fragment, bankingTest_4);

                    transaction.commit();
                }
            });
        }
        return BankingTest3;
    }
}