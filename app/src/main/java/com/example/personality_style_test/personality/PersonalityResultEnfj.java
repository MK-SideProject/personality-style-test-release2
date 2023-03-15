package com.example.personality_style_test.personality;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.personality_style_test.R;


public class PersonalityResultEnfj extends Fragment {


    public PersonalityResultEnfj() {

    }


    public static PersonalityResultEnfj newInstance(String param1, String param2) {
        PersonalityResultEnfj fragment = new PersonalityResultEnfj();
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

        View personalityResultEnfj = inflater.inflate(R.layout.fragment_personality_result_enfj, container, false);

        Button personalityTestRestart = (Button) personalityResultEnfj.findViewById(R.id.personalitytest_restart);
        Button personalityTestList = (Button) personalityResultEnfj.findViewById(R.id.personalitytest_list);

        return personalityResultEnfj;
    }
}