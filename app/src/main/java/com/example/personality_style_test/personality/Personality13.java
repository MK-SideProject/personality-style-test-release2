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


public class Personality13 extends Fragment {

    private int e;
    private int i;
    private int f;
    private int t;
    private int p;
    private int j;
    private int s;
    private int n;

    public Personality13() {

    }


    public static Personality13 newInstance(String param1, String param2) {
        Personality13 fragment = new Personality13();
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

        View personalityTest13 = inflater.inflate(R.layout.fragment_personality13, container, false);

        Button personality_13_yes = (Button) personalityTest13.findViewById(R.id.personality_13_yes);
        Button personality_13_no = (Button) personalityTest13.findViewById(R.id.personality_13_no);

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
            Personality14 personality14 = new Personality14();
            //전달할 번들 생성
            Bundle bundleNext = new Bundle();

            //프래그먼트 이동 선언
            FragmentManager mnger = getActivity().getSupportFragmentManager();
            FragmentTransaction transaction = mnger.beginTransaction();

            personality_13_yes.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    f += 1;
                    bundleNext.putInt("e", e);
                    bundleNext.putInt("i", i);
                    bundleNext.putInt("f", f);
                    bundleNext.putInt("t", t);
                    bundleNext.putInt("p", p);
                    bundleNext.putInt("j", j);
                    bundleNext.putInt("n", n);
                    bundleNext.putInt("s", s);
                    personality14.setArguments(bundleNext);

                    transaction.replace(R.id.personalitytest_start_fragment, personality14);
                    transaction.addToBackStack(null).commit();
                }
            });

            personality_13_no.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    t += 1;

                    bundleNext.putInt("e", e);
                    bundleNext.putInt("i", i);
                    bundleNext.putInt("f", f);
                    bundleNext.putInt("t", t);
                    bundleNext.putInt("p", p);
                    bundleNext.putInt("j", j);
                    bundleNext.putInt("n", n);
                    bundleNext.putInt("s", s);
                    personality14.setArguments(bundleNext);

                    transaction.replace(R.id.personalitytest_start_fragment, personality14);
                    transaction.addToBackStack(null).commit();

                }
            });
        }
            return personalityTest13;
    }
}