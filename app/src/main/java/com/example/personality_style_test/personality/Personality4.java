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


public class Personality4 extends Fragment {


    private int e;
    private int i;
    private int f;
    private int t;
    private int p;
    private int j;

    public Personality4() {

    }


    public static Personality4 newInstance() {
        Personality4 fragment = new Personality4();
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

        View personalityTest4 = inflater.inflate(R.layout.fragment_personality4, container, false);

        Button personality_4_yes = (Button) personalityTest4.findViewById(R.id.personality_4_yes);
        Button personality_4_no = (Button) personalityTest4.findViewById(R.id.personality_4_no);

        //전달한 번들 메소드 받기
        Bundle bundle = getArguments();


        //값이 있다면
        if(bundle != null) {
            e = bundle.getInt("e");
            i = bundle.getInt("i");
            f = bundle.getInt("f");
            t = bundle.getInt("t");
            p = bundle.getInt("p");
            j = bundle.getInt("j");


            //데이터 전달 및 프래그먼트 변경
            Personality5 personality5 = new Personality5();
            //전달할 번들 생성
            Bundle bundleNext = new Bundle();

            //프래그먼트 이동 선언
            FragmentManager mnger = getActivity().getSupportFragmentManager();
            FragmentTransaction transaction = mnger.beginTransaction();

            personality_4_yes.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    i += 1;

                    bundleNext.putInt("e", e);
                    bundleNext.putInt("i", i);
                    bundleNext.putInt("f", f);
                    bundleNext.putInt("t", t);
                    bundleNext.putInt("p", p);
                    bundleNext.putInt("j", j);
                    personality5.setArguments(bundleNext);

                    transaction.replace(R.id.personalitytest_start_fragment, personality5);
                    transaction.addToBackStack(null).commit();

                }
            });

            personality_4_no.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    e += 1;

                    bundleNext.putInt("e", e);
                    bundleNext.putInt("i", i);
                    bundleNext.putInt("f", f);
                    bundleNext.putInt("t", t);
                    bundleNext.putInt("p", p);
                    bundleNext.putInt("j", j);
                    personality5.setArguments(bundleNext);

                    transaction.replace(R.id.personalitytest_start_fragment, personality5);
                    transaction.addToBackStack(null).commit();
                }
            });
        }
        return personalityTest4;
    }
}