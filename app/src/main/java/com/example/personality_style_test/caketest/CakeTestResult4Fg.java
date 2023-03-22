package com.example.personality_style_test.caketest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.personality_style_test.HumorActivity;
import com.example.personality_style_test.R;


public class CakeTestResult4Fg extends Fragment {



    public CakeTestResult4Fg() {

    }


    public static CakeTestResult4Fg newInstance() {
        CakeTestResult4Fg fragment = new CakeTestResult4Fg();
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

        View CakeTestResult4 = inflater.inflate(R.layout.fragment_cake_test_result4_fg, container, false);

        Button cakeTestRestart = (Button) CakeTestResult4.findViewById(R.id.caketest_restart);
        Button cakeTestList = (Button) CakeTestResult4.findViewById(R.id.caketest_list);

        //현재 액티비를 가져온다
        Activity thisActivity = getActivity();

        //다시하기 버튼
        cakeTestRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (thisActivity != null) {
                    //현재 액티비티가 null이 아니라면 액티비티 실행후
                    startActivity(new Intent(thisActivity, CakeTestActivity.class));
                    //지금껀 종료
                    thisActivity.finish();
                }
            }
        });

        cakeTestList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //현재 액티비를 가져온다
                if (thisActivity != null) {
                    //현재 액티비티가 null이 아니라면 목록을 불러온 후
                    startActivity(new Intent(thisActivity,  HumorActivity.class));
                    //지금껀 종료
                    thisActivity.finish();
                }
            }
        });

        return CakeTestResult4;
    }
}