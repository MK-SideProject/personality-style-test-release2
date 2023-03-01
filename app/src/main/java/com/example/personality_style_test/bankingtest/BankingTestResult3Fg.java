package com.example.personality_style_test.bankingtest;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.personality_style_test.R;

public class BankingTestResult3Fg extends Fragment {


    public BankingTestResult3Fg() {

    }

    public static BankingTestResult3Fg newInstance(String param1, String param2) {
        BankingTestResult3Fg fragment = new BankingTestResult3Fg();
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

        View BankingTestResult3 = inflater.inflate(R.layout.fragment_banking_test_result3, container, false);

        Button bankingTestRestart = (Button) BankingTestResult3.findViewById(R.id.bankingtest_restart);
        Button bankingTestList = (Button) BankingTestResult3.findViewById(R.id.bankingtest_list);

        return BankingTestResult3;
    }
}