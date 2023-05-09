package com.example.personality_style_test.bankingtest;





import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.personality_style_test.PersonalityActivity;
import com.example.personality_style_test.R;


public class BankingTestResult1Fg extends Fragment {


    public BankingTestResult1Fg() {

    }

    public static BankingTestResult1Fg newInstance(String param1, String param2) {
        BankingTestResult1Fg fragment = new BankingTestResult1Fg();
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

        View BankingTestResult1 = inflater.inflate(R.layout.fragment_banking_test_result1, container, false);

        Button bankingTestRestart = (Button) BankingTestResult1.findViewById(R.id.bankingtest_restart);
        Button bankingTestList = (Button) BankingTestResult1.findViewById(R.id.bankingtest_list);
        ImageButton bankingTestShare = (ImageButton) BankingTestResult1.findViewById(R.id.share_button);

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

        bankingTestShare.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent sharingIntent = new Intent(Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                //결과 내용 + 어플링크
                sharingIntent.putExtra(Intent.EXTRA_TEXT, "금융테스트 결과 - 완벽한 재테크 고목인 당신! \n" + "https://play.google.com/store/apps/details?id=com.mk.personality_style_test&hl=ko");
                startActivity(Intent.createChooser(sharingIntent, "결과를 공유할 앱을 선택해주세요"));


            }
        });

        return BankingTestResult1;
    }
}