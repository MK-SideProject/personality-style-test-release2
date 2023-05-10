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


public class Personality3 extends Fragment {

    private int e;
    private int i;
    private int f;
    private int t;

    public Personality3() {

    }


    public static Personality3 newInstance() {
        Personality3 fragment = new Personality3();
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

        View personalityTest3 = inflater.inflate(R.layout.fragment_personality3, container, false);

        Button personality_3_yes = (Button) personalityTest3.findViewById(R.id.personality_3_yes);
        Button personality_3_no = (Button) personalityTest3.findViewById(R.id.personality_3_no);

        //전달한 번들 메소드 받기
        Bundle bundle = getArguments();


        //값이 있다면
        if(bundle != null) {
            e = bundle.getInt("e");
            i = bundle.getInt("i");
            f = bundle.getInt("f");
            t = bundle.getInt("t");

            //데이터 전달 및 프래그먼트 변경
            Personality4 personality4 = new Personality4();
            //전달할 번들 생성
            Bundle bundleNext = new Bundle();

            //프래그먼트 이동 선언
            FragmentManager mnger = getActivity().getSupportFragmentManager();
            FragmentTransaction transaction = mnger.beginTransaction();
            personality_3_yes.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    int p = 0;
                    p += 1;

                    bundleNext.putInt("e", e);
                    bundleNext.putInt("i", i);
                    bundleNext.putInt("f", f);
                    bundleNext.putInt("t", t);
                    bundleNext.putInt("p", p);
                    personality4.setArguments(bundleNext);

                    transaction.replace(R.id.personalitytest_start_fragment, personality4);
                    transaction.addToBackStack(null).commit();

                }
            });

            personality_3_no.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    int j = 0;
                    j += 1;

                    bundleNext.putInt("e", e);
                    bundleNext.putInt("i", i);
                    bundleNext.putInt("f", f);
                    bundleNext.putInt("t", t);
                    bundleNext.putInt("j", j);
                    personality4.setArguments(bundleNext);

                    transaction.replace(R.id.personalitytest_start_fragment, personality4);
                    transaction.addToBackStack(null).commit();
                }
            });
        }
        return personalityTest3;
    }
}