package com.example.personality_style_test.bankingtest;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.personality_style_test.R;


public class BankingTestResult1Fg extends Fragment {


    public BankingTestResult1Fg() {

    }

    public static BankingTestResult1Fg newInstance(String param1, String param2) {
        BankingTestResult1Fg fragment = new BankingTestResult1Fg();
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

        View BankingTestResult1 = inflater.inflate(R.layout.fragment_banking_test_result1, container, false);

        Button bankingTestRestart = (Button) BankingTestResult1.findViewById(R.id.bankingtest_restart);
        Button bankingTestList = (Button) BankingTestResult1.findViewById(R.id.bankingtest_list);

        return BankingTestResult1;
    }
}