package com.example.personality_style_test.colortest;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.personality_style_test.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ColorTestResult2Fg#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ColorTestResult2Fg extends Fragment {


    public ColorTestResult2Fg() {
        // Required empty public constructor
    }

    public static ColorTestResult2Fg newInstance() {
        ColorTestResult2Fg fragment = new ColorTestResult2Fg();
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
        View colorTestResult2Fg = inflater.inflate(R.layout.fragment_color_test_result2_fg, container, false);

        Button colorTestRestart = (Button) colorTestResult2Fg.findViewById(R.id.colortest_restart);
        Button colorTestList = (Button) colorTestResult2Fg.findViewById(R.id.colortest_list);

        return colorTestResult2Fg;    }
}