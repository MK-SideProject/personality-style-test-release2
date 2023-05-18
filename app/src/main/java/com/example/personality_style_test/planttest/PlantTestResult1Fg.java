package com.example.personality_style_test.planttest;

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
import com.example.personality_style_test.PersonalityActivity;
import com.example.personality_style_test.R;
import com.example.personality_style_test.foodtest.FoodTestActivity;


public class PlantTestResult1Fg extends Fragment {

    public PlantTestResult1Fg() {
        // Required empty public constructor
    }
    public static PlantTestResult1Fg newInstance() {
        PlantTestResult1Fg fragment = new PlantTestResult1Fg();
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
        View plantTestResult1Fg = inflater.inflate(R.layout.fragment_plant_test_result1_fg, container, false);

        Button plantTestRestart = (Button) plantTestResult1Fg.findViewById(R.id.planttest_restart);
        Button plantTestList = (Button) plantTestResult1Fg.findViewById(R.id.planttest_list);
        ImageButton plantTestShare = (ImageButton) plantTestResult1Fg.findViewById(R.id.share_button);

        Activity thisActivity = getActivity();

        plantTestRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (thisActivity != null) {
                    startActivity(new Intent(thisActivity, PlantTestActivity.class));
                    thisActivity.finish();
                }
            }
        });
        plantTestList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (thisActivity != null) {
//                    startActivity(new Intent(thisActivity, PersonalityActivity.class));
                    thisActivity.finish();
                }
            }
        });
        plantTestShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sharingIntent = new Intent(Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                sharingIntent.putExtra(Intent.EXTRA_TEXT, "식물테스트 결과 - 베이직한 색을 선호하는 당신! \n" + "https://play.google.com/store/apps/details?id=com.mk.personality_style_test&hl=ko");
                startActivity(Intent.createChooser(sharingIntent, "결과를 공유할 앱을 선택해 주세요."));
            }
        });
        return plantTestResult1Fg;
    }
}