package com.example.personality_style_test.exercisetest;

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


public class ExerciseTestResult4Fg extends Fragment {


    public ExerciseTestResult4Fg() {

    }


    public static ExerciseTestResult4Fg newInstance() {
        ExerciseTestResult4Fg fragment = new ExerciseTestResult4Fg();
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

        View ExerciseTestResult4 = inflater.inflate(R.layout.fragment_exercise_test_result4_fg, container, false);

        Button exerciseTestRestart = (Button) ExerciseTestResult4.findViewById(R.id.exercisetest_restart);
        Button exerciseTestList = (Button) ExerciseTestResult4.findViewById(R.id.exercisetest_list);

        //현재 액티비를 가져온다
        Activity thisActivity = getActivity();

        //다시하기 버튼
        exerciseTestRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (thisActivity != null) {
                    //현재 액티비티가 null이 아니라면 액티비티 실행후
                    startActivity(new Intent(thisActivity, exercisetestActivity.class));
                    //지금껀 종료
                    thisActivity.finish();
                }
            }
        });

        exerciseTestList.setOnClickListener(new View.OnClickListener() {
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


        return ExerciseTestResult4;
    }
}