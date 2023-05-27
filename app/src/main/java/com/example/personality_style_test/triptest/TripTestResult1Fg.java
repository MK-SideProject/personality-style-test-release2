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
import com.example.personality_style_test.colortest.ColorTestActivity;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TripTestResult1Fg#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TripTestResult1Fg extends Fragment {


    public TripTestResult1Fg() {
        // Required empty public constructor
    }

    public static TripTestResult1Fg newInstance() {
        TripTestResult1Fg fragment = new TripTestResult1Fg();
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
        View tripTestResult1Fg = inflater.inflate(R.layout.fragment_trip_test_result1_fg, container, false);

        Button tripTestRestart = (Button) tripTestResult1Fg.findViewById(R.id.triptest_restart);
        Button tripTestList = (Button) tripTestResult1Fg.findViewById(R.id.triptest_list);
        ImageButton tripTestShare = (ImageButton) tripTestResult1Fg.findViewById(R.id.share_button);

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
                sharingIntent.putExtra(Intent.EXTRA_TEXT, "여행테스트 결과 - 꼼꼼한 혼행족인 당신! \n" + "https://play.google.com/store/apps/details?id=com.mk.personality_style_test&hl=ko");
                startActivity(Intent.createChooser(sharingIntent, "결과를 공유할 앱을 선택해 주세요."));
            }
        });
        return tripTestResult1Fg;
    }
}