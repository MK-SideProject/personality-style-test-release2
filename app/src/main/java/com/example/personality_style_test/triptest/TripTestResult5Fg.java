package com.example.personality_style_test.triptest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.personality_style_test.PersonalityActivity;
import com.example.personality_style_test.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TripTestResult5Fg#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TripTestResult5Fg extends Fragment {

    public TripTestResult5Fg() {
        // Required empty public constructor
    }

    public static TripTestResult5Fg newInstance() {
        TripTestResult5Fg fragment = new TripTestResult5Fg();
        Bundle args = new Bundle();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View tripTestResult5Fg = inflater.inflate(R.layout.fragment_trip_test_result5_fg, container, false);

        Button tripTestRestart = (Button) tripTestResult5Fg.findViewById(R.id.triptest_restart);
        Button tripTestList = (Button) tripTestResult5Fg.findViewById(R.id.triptest_list);
        ImageButton tripTestShare = (ImageButton) tripTestResult5Fg.findViewById(R.id.share_button);

        Activity thisActivity = getActivity();

        tripTestList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (thisActivity != null) {
//                    startActivity(new Intent(thisActivity, PersonalityActivity.class));
                    thisActivity.finish();
                }
            }
        });
        tripTestRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(thisActivity != null) {
                    startActivity(new Intent(thisActivity, TripTestActivity.class));
                    thisActivity.finish();
                }
            }
        });
        tripTestShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sharingIntent = new Intent(Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                sharingIntent.putExtra(Intent.EXTRA_TEXT, "여행테스트 결과 - 모두와 함께하는 여행을 가고픈 당신! \n" + "https://play.google.com/store/apps/details?id=com.mk.personality_style_test&hl=ko");
                startActivity(Intent.createChooser(sharingIntent, "결과를 공유할 앱을 선택해 주세요."));
            }
        });

        return tripTestResult5Fg;
    }
}