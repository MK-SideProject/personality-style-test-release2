package com.example.personality_style_test.personality;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.personality_style_test.R;


public class PersonalityResultEntj extends Fragment {



    public PersonalityResultEntj() {

    }


    public static PersonalityResultEntj newInstance(String param1, String param2) {
        PersonalityResultEntj fragment = new PersonalityResultEntj();
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

        View personalityResultEntj = inflater.inflate(R.layout.fragment_personality_result_entj, container, false);

        Button personalityTestRestart = (Button) personalityResultEntj.findViewById(R.id.personalitytest_restart);
        Button personalityTestList = (Button) personalityResultEntj.findViewById(R.id.personalitytest_list);

        return personalityResultEntj;
    }
}