package com.example.personality_style_test.bankingtest;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.personality_style_test.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BankingTest_4#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BankingTest_4 extends Fragment {

    //결과값 이동
    private String bankingtest_result1;
    private String bankingtest_result2;
    private String bankingtest_result3;

    public BankingTest_4() {
        // Required empty public constructor
    }


    public static BankingTest_4 newInstance(String param1, String param2) {
        BankingTest_4 fragment = new BankingTest_4();
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

        return BankingTest4;
    }
}