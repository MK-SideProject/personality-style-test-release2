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


public class Personality40 extends Fragment {

    private int e;
    private int i;
    private int f;
    private int t;
    private int p;
    private int j;
    private int s;
    private int n;

    public Personality40() {

    }


    public static Personality40 newInstance() {
        Personality40 fragment = new Personality40();
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

        View personalityTest40 = inflater.inflate(R.layout.fragment_personality40, container, false);

        Button personality_40_yes = (Button) personalityTest40.findViewById(R.id.personality_40_yes);
        Button personality_40_no = (Button) personalityTest40.findViewById(R.id.personality_40_no);

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


            //E결과
            PersonalityResultEnfj personalityResultEnfj = new PersonalityResultEnfj();
            PersonalityResultEnfp personalityResultEnfp = new PersonalityResultEnfp();
            PersonalityResultEntj personalityResultEntj = new PersonalityResultEntj();
            PersonalityResultEntp personalityResultEntp = new PersonalityResultEntp();
            PersonalityResultEsfj personalityResultEsfj = new PersonalityResultEsfj();
            PersonalityResultEsfp personalityResultEsfp = new PersonalityResultEsfp();
            PersonalityResultEstj personalityResultEstj = new PersonalityResultEstj();
            PersonalityResultEstp personalityResultEstp = new PersonalityResultEstp();

            //I결과
            PersonalityResultIntj personalityResultIntj = new PersonalityResultIntj();
            PersonalityResultIntp personalityResultIntp = new PersonalityResultIntp();
            PersonalityResultIsfj personalityResultIsfj = new PersonalityResultIsfj();
            PersonalityResultIsfp personalityResultIsfp = new PersonalityResultIsfp();
            PersonalityResultIstj personalityResultIstj = new PersonalityResultIstj();
            PersonalityResultIstp personalityResultIstp = new PersonalityResultIstp();
            PersonalityResultInfj personalityResultInfj = new PersonalityResultInfj();
            PersonalityResultInfp personalityResultInfp = new PersonalityResultInfp();

            //프래그먼트 이동 선언
            FragmentManager mnger = getActivity().getSupportFragmentManager();
            FragmentTransaction transaction = mnger.beginTransaction();

            personality_40_yes.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    n += 1;

                    //1
                    if (e > i && n > s && f > t && p > j) {
                        transaction.replace(R.id.personalitytest_start_fragment, personalityResultEnfp);
                        transaction.addToBackStack(null).commit();
                    }
                    //2
                    else if (e > i && n > s && f > t && p < j) {
                        transaction.replace(R.id.personalitytest_start_fragment, personalityResultEnfj);
                        transaction.addToBackStack(null).commit();
                    }
                    //3
                    else if (e > i && n > s && f < t && p > j) {
                        transaction.replace(R.id.personalitytest_start_fragment, personalityResultEntp);
                        transaction.addToBackStack(null).commit();
                    }
                    //4
                    else if (e > i && n > s && f < t && p < j) {
                        transaction.replace(R.id.personalitytest_start_fragment, personalityResultEntj);
                        transaction.addToBackStack(null).commit();
                    }
                    //5
                    else if (e > i && n < s && f > t && p > j) {
                        transaction.replace(R.id.personalitytest_start_fragment, personalityResultEsfp);
                        transaction.addToBackStack(null).commit();
                    }
                    //6
                    else if (e > i && n < s && f > t && p < j) {
                        transaction.replace(R.id.personalitytest_start_fragment, personalityResultEsfj);
                        transaction.addToBackStack(null).commit();
                    }
                    //7
                    else if (e > i && n < s && f < t && p > j) {
                        transaction.replace(R.id.personalitytest_start_fragment, personalityResultEstp);
                        transaction.addToBackStack(null).commit();
                    }//8
                    else if (e > i && n < s && f < t && p < j) {
                        transaction.replace(R.id.personalitytest_start_fragment, personalityResultEstj);
                        transaction.addToBackStack(null).commit();
                    }//9
                    if (e < i && n > s && f > t && p > j) {
                        transaction.replace(R.id.personalitytest_start_fragment, personalityResultInfp);
                        transaction.addToBackStack(null).commit();

                    } else if (e < i && n > s && f > t && p < j) {
                        transaction.replace(R.id.personalitytest_start_fragment, personalityResultInfj);
                        transaction.addToBackStack(null).commit();

                    } else if (e < i && n > s && f < t && p > j) {
                        transaction.replace(R.id.personalitytest_start_fragment, personalityResultIntp);
                        transaction.addToBackStack(null).commit();

                    } else if (e < i && n > s && f < t && p < j) {
                        transaction.replace(R.id.personalitytest_start_fragment, personalityResultIntj);
                        transaction.addToBackStack(null).commit();

                    } else if (e < i && n < s && f > t && p > j) {
                        transaction.replace(R.id.personalitytest_start_fragment, personalityResultIsfp);
                        transaction.addToBackStack(null).commit();

                    } else if (e < i && n < s && f > t && p < j) {
                        transaction.replace(R.id.personalitytest_start_fragment, personalityResultIsfj);
                        transaction.addToBackStack(null).commit();

                    } else if (e < i && n < s && f < t && p > j) {
                        transaction.replace(R.id.personalitytest_start_fragment, personalityResultIstp);
                        transaction.addToBackStack(null).commit();

                    } else if (e < i && n < s && f < t && p < j) {
                        transaction.replace(R.id.personalitytest_start_fragment, personalityResultIstj);
                        transaction.addToBackStack(null).commit();

                    } else {
                        transaction.replace(R.id.personalitytest_start_fragment, personalityResultEnfp);
                        transaction.addToBackStack(null).commit();


                    }


                }
            });

            personality_40_no.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    s += 1;

                    //1
                    if (e > i && n > s && f > t && p > j) {
                        transaction.replace(R.id.personalitytest_start_fragment, personalityResultEnfp);
                        transaction.addToBackStack(null).commit();
                    }
                    //2
                    else if (e > i && n > s && f > t && p < j) {
                        transaction.replace(R.id.personalitytest_start_fragment, personalityResultEnfj);
                        transaction.addToBackStack(null).commit();
                    }
                    //3
                    else if (e > i && n > s && f < t && p > j) {
                        transaction.replace(R.id.personalitytest_start_fragment, personalityResultEntp);
                        transaction.addToBackStack(null).commit();
                    }
                    //4
                    else if (e > i && n > s && f < t && p < j) {
                        transaction.replace(R.id.personalitytest_start_fragment, personalityResultEntj);
                        transaction.addToBackStack(null).commit();
                    }
                    //5
                    else if (e > i && n < s && f > t && p > j) {
                        transaction.replace(R.id.personalitytest_start_fragment, personalityResultEsfp);
                        transaction.addToBackStack(null).commit();
                    }
                    //6
                    else if (e > i && n < s && f > t && p < j) {
                        transaction.replace(R.id.personalitytest_start_fragment, personalityResultEsfj);
                        transaction.addToBackStack(null).commit();
                    }
                    //7
                    else if (e > i && n < s && f < t && p > j) {
                        transaction.replace(R.id.personalitytest_start_fragment, personalityResultEstp);
                        transaction.addToBackStack(null).commit();
                    }//8
                    else if (e > i && n < s && f < t && p < j) {
                        transaction.replace(R.id.personalitytest_start_fragment, personalityResultEstj);
                        transaction.addToBackStack(null).commit();
                    }//9
                    if (e < i && n > s && f > t && p > j) {
                        transaction.replace(R.id.personalitytest_start_fragment, personalityResultInfp);
                        transaction.addToBackStack(null).commit();

                    } else if (e < i && n > s && f > t && p < j) {
                        transaction.replace(R.id.personalitytest_start_fragment, personalityResultInfj);
                        transaction.addToBackStack(null).commit();

                    } else if (e < i && n > s && f < t && p > j) {
                        transaction.replace(R.id.personalitytest_start_fragment, personalityResultIntp);
                        transaction.addToBackStack(null).commit();

                    } else if (e < i && n > s && f < t && p < j) {
                        transaction.replace(R.id.personalitytest_start_fragment, personalityResultIntj);
                        transaction.addToBackStack(null).commit();

                    } else if (e < i && n < s && f > t && p > j) {
                        transaction.replace(R.id.personalitytest_start_fragment, personalityResultIsfp);
                        transaction.addToBackStack(null).commit();

                    } else if (e < i && n < s && f > t && p < j) {
                        transaction.replace(R.id.personalitytest_start_fragment, personalityResultIsfj);
                        transaction.addToBackStack(null).commit();

                    } else if (e < i && n < s && f < t && p > j) {
                        transaction.replace(R.id.personalitytest_start_fragment, personalityResultIstp);
                        transaction.addToBackStack(null).commit();

                    } else if (e < i && n < s && f < t && p < j) {
                        transaction.replace(R.id.personalitytest_start_fragment, personalityResultIstj);
                        transaction.addToBackStack(null).commit();

                    } else {
                        transaction.replace(R.id.personalitytest_start_fragment, personalityResultEnfp);
                        transaction.addToBackStack(null).commit();


                    }

                }
            });
        }
        return personalityTest40;
    }
}