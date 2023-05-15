package com.example.personality_style_test.caketest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.personality_style_test.HumorActivity;
import com.example.personality_style_test.R;


public class CakeTestResult2Fg extends Fragment {


    public CakeTestResult2Fg() {

    }


    public static CakeTestResult2Fg newInstance() {
        CakeTestResult2Fg fragment = new CakeTestResult2Fg();
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

        View CakeTestResult2 = inflater.inflate(R.layout.fragment_cake_test_result2_fg, container, false);

        Button cakeTestRestart = (Button) CakeTestResult2.findViewById(R.id.caketest_restart);
        Button cakeTestList = (Button) CakeTestResult2.findViewById(R.id.caketest_list);
        ImageButton cakeTestShare = (ImageButton) CakeTestResult2.findViewById(R.id.share_button);

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

        cakeTestShare.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent sharingIntent = new Intent(Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                //결과 내용 + 어플링크
                sharingIntent.putExtra(Intent.EXTRA_TEXT, "크리스마스 케이스 결과 - 슈톨렌! \n" + "https://play.google.com/store/apps/details?id=com.mk.personality_style_test&hl=ko");
                startActivity(Intent.createChooser(sharingIntent, "결과를 공유할 앱을 선택해주세요"));


            }
        });

        return CakeTestResult2;
    }
}