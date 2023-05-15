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
import android.widget.ImageButton;

import com.example.personality_style_test.HumorActivity;
import com.example.personality_style_test.R;
import com.example.personality_style_test.onBackPressedListener;

public class SantaTestResult4Fg extends Fragment {


    public SantaTestResult4Fg() {

    }


    public static SantaTestResult4Fg newInstance() {
        SantaTestResult4Fg fragment = new SantaTestResult4Fg();
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

        View santaTestResult4 = inflater.inflate(R.layout.fragment_santa_test_result4_fg, container, false);

        Button santaTestRestart = (Button) santaTestResult4.findViewById(R.id.santatest_restart);
        Button santaTestList = (Button) santaTestResult4.findViewById(R.id.santatest_list);
        ImageButton santaTestShare = (ImageButton) santaTestResult4.findViewById(R.id.share_button);

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

        santaTestShare.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent sharingIntent = new Intent(Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                //결과 내용 + 어플링크
                sharingIntent.putExtra(Intent.EXTRA_TEXT, "산타테스트 결과 - 멋쟁이 산타 \n" + "https://play.google.com/store/apps/details?id=com.mk.personality_style_test&hl=ko");
                startActivity(Intent.createChooser(sharingIntent, "결과를 공유할 앱을 선택해주세요"));


            }
        });

        return santaTestResult4;
    }

}