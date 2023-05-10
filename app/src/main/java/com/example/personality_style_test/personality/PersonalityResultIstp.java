package com.example.personality_style_test.personality;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.personality_style_test.MainActivity;
import com.example.personality_style_test.R;


public class PersonalityResultIstp extends Fragment {


    public PersonalityResultIstp() {

    }


    public static PersonalityResultIstp newInstance() {
        PersonalityResultIstp fragment = new PersonalityResultIstp();
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

        View personalityResultIstp = inflater.inflate(R.layout.fragment_personality_result_istp, container, false);

        Button personalityTestRestart = (Button) personalityResultIstp.findViewById(R.id.personalitytest_restart);
        Button personalityTestList = (Button) personalityResultIstp.findViewById(R.id.personalitytest_list);

        //현재 액티비를 가져온다
        Activity thisActivity = getActivity();

        //다시하기 버튼
        personalityTestRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (thisActivity != null) {
                    //현재 액티비티가 null이 아니라면 액티비티 실행후
                    startActivity(new Intent(thisActivity, personalitytest_Activity.class));
                    //지금껀 종료
                    thisActivity.finish();
                }
            }
        });

        personalityTestList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //현재 액티비를 가져온다
                if (thisActivity != null) {
                    //현재 액티비티가 null이 아니라면 목록을 불러온 후
                    startActivity(new Intent(thisActivity,  MainActivity.class));
                    //지금껀 종료
                    thisActivity.finish();
                }
            }
        });

        return personalityResultIstp;
    }
}