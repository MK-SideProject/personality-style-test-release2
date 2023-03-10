package com.example.personality_style_test.bankingtest;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.personality_style_test.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BankingTestResult2Fg#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BankingTestResult2Fg extends Fragment {


    public BankingTestResult2Fg() {
        // Required empty public constructor
    }


    public static BankingTestResult2Fg newInstance(String param1, String param2) {
        BankingTestResult2Fg fragment = new BankingTestResult2Fg();
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

        View BankingTestResult2 = inflater.inflate(R.layout.fragment_banking_test_result2, container, false);

        Button bankingTestRestart = (Button) BankingTestResult2.findViewById(R.id.bankingtest_restart);
        Button bankingTestList = (Button) BankingTestResult2.findViewById(R.id.bankingtest_list);

        return BankingTestResult2;
    }
}