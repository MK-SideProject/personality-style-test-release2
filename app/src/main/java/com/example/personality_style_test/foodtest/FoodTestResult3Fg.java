package com.example.personality_style_test.foodtest;

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

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FoodTestResult3Fg#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FoodTestResult3Fg extends Fragment {

    public FoodTestResult3Fg() {
        // Required empty public constructor
    }

    public static FoodTestResult3Fg newInstance() {
        FoodTestResult3Fg fragment = new FoodTestResult3Fg();
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
        View foodTestResult3Fg = inflater.inflate(R.layout.fragment_food_test_result3_fg, container, false);
        Button foodTestRestart = (Button) foodTestResult3Fg.findViewById(R.id.foodtest_restart);
        Button foodTestList = (Button) foodTestResult3Fg.findViewById(R.id.foodtest_list);
        ImageButton foodTestShare = (ImageButton) foodTestResult3Fg.findViewById(R.id.share_button);

        Activity thisActivity = getActivity();

        foodTestRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (thisActivity != null) {
                    startActivity(new Intent(thisActivity, FoodTestActivity.class));
                    thisActivity.finish();
                }
            }
        });
        foodTestList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (thisActivity != null) {
                    startActivity(new Intent(thisActivity, HumorActivity.class));
                    thisActivity.finish();
                }
            }
        });
        foodTestShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sharingIntent = new Intent(Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                sharingIntent.putExtra(Intent.EXTRA_TEXT, "음식테스트 결과 - 뭐든지 잘 먹는 당신! \n" + "https://play.google.com/store/apps/details?id=com.mk.personality_style_test&hl=ko");
                startActivity(Intent.createChooser(sharingIntent, "결과를 공유할 앱을 선택해 주세요."));
            }
        });

        return foodTestResult3Fg;
    }
}