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


public class Personality31 extends Fragment {

    private int e;
    private int i;
    private int f;
    private int t;
    private int p;
    private int j;
    private int s;
    private int n;

    public Personality31() {

    }


    public static Personality31 newInstance(String param1, String param2) {
        Personality31 fragment = new Personality31();
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

        View personalityTest31 = inflater.inflate(R.layout.fragment_personality31, container, false);

        Button personality_31_yes = (Button) personalityTest31.findViewById(R.id.personality_31_yes);
        Button personality_31_no = (Button) personalityTest31.findViewById(R.id.personality_31_no);

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
            s = bundle.getInt("s");
            n = bundle.getInt("n");


            //데이터 전달 및 프래그먼트 변경
            Personality32 personality32 = new Personality32();
            //전달할 번들 생성
            Bundle bundleNext = new Bundle();

            //프래그먼트 이동 선언
            FragmentManager mnger = getActivity().getSupportFragmentManager();
            FragmentTransaction transaction = mnger.beginTransaction();

            personality_31_yes.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    p += 1;

                    bundleNext.putInt("e", e);
                    bundleNext.putInt("i", i);
                    bundleNext.putInt("f", f);
                    bundleNext.putInt("t", t);
                    bundleNext.putInt("p", p);
                    bundleNext.putInt("j", j);
                    bundleNext.putInt("n", n);
                    bundleNext.putInt("s", s);
                    personality32.setArguments(bundleNext);

                    transaction.replace(R.id.personalitytest_start_fragment, personality32);
                    transaction.addToBackStack(null).commit();


                }
            });

            personality_31_no.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    j += 1;

                    bundleNext.putInt("e", e);
                    bundleNext.putInt("i", i);
                    bundleNext.putInt("f", f);
                    bundleNext.putInt("t", t);
                    bundleNext.putInt("p", p);
                    bundleNext.putInt("j", j);
                    bundleNext.putInt("n", n);
                    bundleNext.putInt("s", s);
                    personality32.setArguments(bundleNext);

                    transaction.replace(R.id.personalitytest_start_fragment, personality32);
                    transaction.addToBackStack(null).commit();


                }
            });
        }
        return personalityTest31;
    }
}