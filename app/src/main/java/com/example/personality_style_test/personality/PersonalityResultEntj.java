package com.example.personality_style_test.personality;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.personality_style_test.MainActivity;
import com.example.personality_style_test.R;


public class PersonalityResultEntj extends Fragment {



    public PersonalityResultEntj() {

    }


    public static PersonalityResultEntj newInstance(String param1, String param2) {
        PersonalityResultEntj fragment = new PersonalityResultEntj();
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

        View personalityResultEntj = inflater.inflate(R.layout.fragment_personality_result_entj, container, false);

        Button personalityTestRestart = (Button) personalityResultEntj.findViewById(R.id.personalitytest_restart);
        Button personalityTestList = (Button) personalityResultEntj.findViewById(R.id.personalitytest_list);
        ImageButton personalityTestShare = (ImageButton) personalityResultEntj.findViewById(R.id.share_button);

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
                    //startActivity(new Intent(thisActivity,  MainActivity.class));
                    //지금껀 종료
                    thisActivity.finish();
                }
            }
        });

        personalityTestShare.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent sharingIntent = new Intent(Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                //결과 내용 + 어플링크
                sharingIntent.putExtra(Intent.EXTRA_TEXT, "MBTI 테스트 결과 - 당신은 ENTJ \n" + "https://play.google.com/store/apps/details?id=com.mk.personality_style_test&hl=ko");
                startActivity(Intent.createChooser(sharingIntent, "결과를 공유할 앱을 선택해주세요"));


            }
        });
        return personalityResultEntj;
    }
}