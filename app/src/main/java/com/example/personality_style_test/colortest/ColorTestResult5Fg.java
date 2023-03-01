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
 * Use the {@link ColorTestResult5Fg#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ColorTestResult5Fg extends Fragment {

    public ColorTestResult5Fg() {
        // Required empty public constructor
    }

    public static ColorTestResult5Fg newInstance(String param1, String param2) {
        ColorTestResult5Fg fragment = new ColorTestResult5Fg();
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
        View colorTestResult5Fg = inflater.inflate(R.layout.fragment_color_test_result5_fg, container, false);

        Button colorTestRestart = (Button) colorTestResult5Fg.findViewById(R.id.colortest_restart);
        Button colorTestList = (Button) colorTestResult5Fg.findViewById(R.id.colortest_list);

        return colorTestResult5Fg;    }
}