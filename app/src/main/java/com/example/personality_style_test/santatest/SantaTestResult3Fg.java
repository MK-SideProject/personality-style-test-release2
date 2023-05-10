package com.example.personality_style_test.santatest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.personality_style_test.HumorActivity;
import com.example.personality_style_test.R;
import com.example.personality_style_test.onBackPressedListener;


public class SantaTestResult3Fg extends Fragment {

    public SantaTestResult3Fg() {

    }



    public static SantaTestResult3Fg newInstance() {
        SantaTestResult3Fg fragment = new SantaTestResult3Fg();
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

        View santaTestResult3 = inflater.inflate(R.layout.fragment_santa_test_result3_fg, container, false);

        Button santaTestRestart = (Button) santaTestResult3.findViewById(R.id.santatest_restart);
        Button santaTestList = (Button) santaTestResult3.findViewById(R.id.santatest_list);

        //현재 액티비를 가져온다
        Activity thisActivity = getActivity();

        //다시하기 버튼
        santaTestRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (thisActivity != null) {
                    //현재 액티비티가 null이 아니라면 액티비티 실행후
                    startActivity(new Intent(thisActivity, santatestActivity.class));
                    //지금껀 종료
                    thisActivity.finish();
                }
            }
        });

        santaTestList.setOnClickListener(new View.OnClickListener() {
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

        return santaTestResult3;
    }

}