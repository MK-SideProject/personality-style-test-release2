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
import com.example.personality_style_test.santatest.SantaTest3;


public class Personality2 extends Fragment {


    private int e;
    private int i;

    public Personality2() {

    }


    public static Personality2 newInstance() {
        Personality2 fragment = new Personality2();
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

        View personalityTest2 = inflater.inflate(R.layout.fragment_personality2, container, false);

        Button personality_2_yes = (Button) personalityTest2.findViewById(R.id.personality_2_yes);
        Button personality_2_no = (Button) personalityTest2.findViewById(R.id.personality_2_no);

        //전달한 번들 메소드 받기
        Bundle bundle = getArguments();


        //값이 있다면
        if(bundle != null) {
            e = bundle.getInt("e");
            i = bundle.getInt("i");

            //데이터 전달 및 프래그먼트 변경
            Personality3 personality3 = new Personality3();
            //전달할 번들 생성
            Bundle bundleNext = new Bundle();

            //프래그먼트 이동 선언
            FragmentManager mnger = getActivity().getSupportFragmentManager();
            FragmentTransaction transaction = mnger.beginTransaction();
            personality_2_yes.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int f = 0;
                    f += 1;

                    bundleNext.putInt("e", e);
                    bundleNext.putInt("i", i);
                    bundleNext.putInt("f", f);
                    personality3.setArguments(bundleNext);

                    transaction.replace(R.id.personalitytest_start_fragment, personality3);
                    transaction.addToBackStack(null).commit();
                }
            });

            personality_2_no.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int t = 0;
                    t += 1;

                    bundleNext.putInt("e", e);
                    bundleNext.putInt("i", i);
                    bundleNext.putInt("t", t);
                    personality3.setArguments(bundleNext);

                    transaction.replace(R.id.personalitytest_start_fragment, personality3);
                    transaction.addToBackStack(null).commit();
                }
            });
        }
        return personalityTest2;
    }
}