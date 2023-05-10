package com.example.personality_style_test.personality;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.personality_style_test.R;
import com.example.personality_style_test.colortest.ColorTest2;


public class Personality1 extends Fragment {


    public Personality1() {

    }


    public static Personality1 newInstance() {
        Personality1 fragment = new Personality1();
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
        View personalityTest1 = inflater.inflate(R.layout.fragment_personality1, container, false);

        Button personality_1_yes = (Button) personalityTest1.findViewById(R.id.personality_1_yes);
        Button personality_1_no = (Button) personalityTest1.findViewById(R.id.personality_1_no);

        Personality2 personality2 = new Personality2();
        Bundle bundle = new Bundle();

        FragmentManager manager = getActivity().getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();

        personality_1_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int e = 0;
                e +=1;

                bundle.putInt("e", e);
                personality2.setArguments(bundle);

                transaction.replace(R.id.personalitytest_start_fragment, personality2);
                transaction.addToBackStack(null).commit();
            }
        });

        personality_1_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                int i = 0;
                i +=1;

                bundle.putInt("i", i);
                personality2.setArguments(bundle);

                transaction.replace(R.id.personalitytest_start_fragment, personality2);
                transaction.addToBackStack(null).commit();
            }
        });

        return personalityTest1;
    }
}