package com.example.personality_style_test.personality;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.personality_style_test.R;


public class PersonalityResultIsfj extends Fragment {


    public PersonalityResultIsfj() {

    }


    public static PersonalityResultIsfj newInstance() {
        PersonalityResultIsfj fragment = new PersonalityResultIsfj();
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

        View personalityResultIsfj = inflater.inflate(R.layout.fragment_personality_result_isfj, container, false);

        Button personalityTestRestart = (Button) personalityResultIsfj.findViewById(R.id.personalitytest_restart);
        Button personalityTestList = (Button) personalityResultIsfj.findViewById(R.id.personalitytest_list);

        return personalityResultIsfj;
    }
}