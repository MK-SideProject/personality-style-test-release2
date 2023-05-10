package com.example.personality_style_test.triptest;

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

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TripTestResult7Fg#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TripTestResult7Fg extends Fragment {

    public TripTestResult7Fg() {
        // Required empty public constructor
    }

    public static TripTestResult7Fg newInstance() {
        TripTestResult7Fg fragment = new TripTestResult7Fg();
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
        View tripTestResult7Fg = inflater.inflate(R.layout.fragment_trip_test_result7_fg, container, false);

        Button tripTestRestart = (Button) tripTestResult7Fg.findViewById(R.id.triptest_restart);
        Button tripTestList = (Button) tripTestResult7Fg.findViewById(R.id.triptest_list);
        Activity thisActivity = getActivity();

        tripTestList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (thisActivity != null) {
                    startActivity(new Intent(thisActivity, PersonalityActivity.class));
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
        return tripTestResult7Fg;
    }
}