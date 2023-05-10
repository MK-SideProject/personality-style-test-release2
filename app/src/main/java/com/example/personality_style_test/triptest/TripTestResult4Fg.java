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
 * Use the {@link TripTestResult4Fg#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TripTestResult4Fg extends Fragment {

    public TripTestResult4Fg() {
        // Required empty public constructor
    }

    public static TripTestResult4Fg newInstance() {
        TripTestResult4Fg fragment = new TripTestResult4Fg();
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
        View tripTestResult4Fg = inflater.inflate(R.layout.fragment_trip_test_result4_fg, container, false);

        Button tripTestRestart = (Button) tripTestResult4Fg.findViewById(R.id.triptest_restart);
        Button tripTestList = (Button) tripTestResult4Fg.findViewById(R.id.triptest_list);
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
        return tripTestResult4Fg;
    }
}