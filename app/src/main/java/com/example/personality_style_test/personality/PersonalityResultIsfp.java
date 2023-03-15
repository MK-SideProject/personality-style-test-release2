package com.example.personality_style_test.personality;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.personality_style_test.R;


public class PersonalityResultIsfp extends Fragment {


    public PersonalityResultIsfp() {

    }


    public static PersonalityResultIsfp newInstance() {
        PersonalityResultIsfp fragment = new PersonalityResultIsfp();
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

        View personalityResultIsfp = inflater.inflate(R.layout.fragment_personality_result_isfp, container, false);

        Button personalityTestRestart = (Button) personalityResultIsfp.findViewById(R.id.personalitytest_restart);
        Button personalityTestList = (Button) personalityResultIsfp.findViewById(R.id.personalitytest_list);

        return personalityResultIsfp;
    }
}