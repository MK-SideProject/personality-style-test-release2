package com.example.personality_style_test.personality;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.personality_style_test.R;


public class PersonalityResultEstp extends Fragment {



    public PersonalityResultEstp() {

    }


    public static PersonalityResultEstp newInstance() {
        PersonalityResultEstp fragment = new PersonalityResultEstp();
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

        View personalityResultEstp = inflater.inflate(R.layout.fragment_personality_result_estp, container, false);

        Button personalityTestRestart = (Button) personalityResultEstp.findViewById(R.id.personalitytest_restart);
        Button personalityTestList = (Button) personalityResultEstp.findViewById(R.id.personalitytest_list);

        return personalityResultEstp;
    }
}