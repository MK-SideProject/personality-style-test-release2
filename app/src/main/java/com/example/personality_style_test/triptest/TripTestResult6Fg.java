package com.example.personality_style_test.triptest;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.personality_style_test.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TripTestResult6Fg#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TripTestResult6Fg extends Fragment {

    public TripTestResult6Fg() {
        // Required empty public constructor
    }

    public static TripTestResult6Fg newInstance() {
        TripTestResult6Fg fragment = new TripTestResult6Fg();
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
        View tripTestResult6Fg = inflater.inflate(R.layout.fragment_trip_test_result6_fg, container, false);

        Button tripTestRestart = (Button) tripTestResult6Fg.findViewById(R.id.triptest_restart);
        Button tripTestList = (Button) tripTestResult6Fg.findViewById(R.id.triptest_list);

        return tripTestResult6Fg;
    }
}