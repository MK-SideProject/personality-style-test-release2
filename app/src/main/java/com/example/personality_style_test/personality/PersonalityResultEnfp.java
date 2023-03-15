package com.example.personality_style_test.personality;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.personality_style_test.R;


public class PersonalityResultEnfp extends Fragment {



    public PersonalityResultEnfp() {

    }


    public static PersonalityResultEnfp newInstance() {
        PersonalityResultEnfp fragment = new PersonalityResultEnfp();
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

        View personalityResultEnfp = inflater.inflate(R.layout.fragment_personality_result_enfp, container, false);

        Button personalityTestRestart = (Button) personalityResultEnfp.findViewById(R.id.personalitytest_restart);
        Button personalityTestList = (Button) personalityResultEnfp.findViewById(R.id.personalitytest_list);

        return personalityResultEnfp;
    }
}