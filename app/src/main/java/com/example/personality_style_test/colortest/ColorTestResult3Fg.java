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
 * Use the {@link ColorTestResult3Fg#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ColorTestResult3Fg extends Fragment {

    public ColorTestResult3Fg() {
        // Required empty public constructor
    }

    public static ColorTestResult3Fg newInstance(String param1, String param2) {
        ColorTestResult3Fg fragment = new ColorTestResult3Fg();
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
        View colorTestResult3Fg = inflater.inflate(R.layout.fragment_color_test_result3_fg, container, false);

        Button colorTestRestart = (Button) colorTestResult3Fg.findViewById(R.id.colortest_restart);
        Button colorTestList = (Button) colorTestResult3Fg.findViewById(R.id.colortest_list);

        return colorTestResult3Fg;
    }
}