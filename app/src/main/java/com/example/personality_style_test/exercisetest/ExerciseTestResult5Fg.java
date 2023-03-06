package com.example.personality_style_test.exercisetest;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.personality_style_test.R;

public class ExerciseTestResult5Fg extends Fragment {


    public ExerciseTestResult5Fg() {

    }


    public static ExerciseTestResult5Fg newInstance() {
        ExerciseTestResult5Fg fragment = new ExerciseTestResult5Fg();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View ExerciseTestResult5 = inflater.inflate(R.layout.fragment_exercise_test_result5_fg, container, false);

        Button exerciseTestRestart = (Button) ExerciseTestResult5.findViewById(R.id.exercisetest_restart);
        Button exerciseTestList = (Button) ExerciseTestResult5.findViewById(R.id.exercisetest_list);

        return ExerciseTestResult5;
    }
}