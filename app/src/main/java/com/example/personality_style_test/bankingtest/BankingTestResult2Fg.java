package com.example.personality_style_test.bankingtest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.personality_style_test.PersonalityActivity;
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

        //현재 액티비를 가져온다
        Activity thisActivity = getActivity();

        //다시하기 버튼
        bankingTestRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (thisActivity != null) {
                    //현재 액티비티가 null이 아니라면 액티비티 실행후
                    startActivity(new Intent(thisActivity, BankingTestActivity.class));
                    //지금껀 종료
                    thisActivity.finish();
                }
            }
        });

        bankingTestList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //현재 액티비를 가져온다
                if (thisActivity != null) {
                    //현재 액티비티가 null이 아니라면 목록을 불러온 후
                    startActivity(new Intent(thisActivity,  PersonalityActivity.class));
                    //지금껀 종료
                    thisActivity.finish();
                }
            }
        });

        return BankingTestResult2;
    }
}