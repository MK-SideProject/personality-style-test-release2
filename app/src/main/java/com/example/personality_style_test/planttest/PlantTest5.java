package com.example.personality_style_test.planttest;

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

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PlantTest5#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PlantTest5 extends Fragment {

    private String plantTestResult1, plantTestResult2, plantTestResult3;

    public PlantTest5() {
        // Required empty public constructor
    }

    public static PlantTest5 newInstance() {
        PlantTest5 fragment = new PlantTest5();
        Bundle args = new Bundle();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View plantTest5 = inflater.inflate(R.layout.fragment_plant_test5, container, false);

        Button plantTest5_an1 = (Button) plantTest5.findViewById(R.id.planttest_5_an1);
        Button plantTest5_an2 = (Button) plantTest5.findViewById(R.id.planttest_5_an2);
        Button plantTest5_an3 = (Button) plantTest5.findViewById(R.id.planttest_5_an3);

        Bundle bundle = getArguments();

        //값이 있다면
        if (bundle!=null) {
            plantTestResult1 = bundle.getString("plantTestResult1");
            plantTestResult2 = bundle.getString("plantTestResult2");
            plantTestResult3 = bundle.getString("plantTestResult3");

            FragmentManager mnger = getActivity().getSupportFragmentManager();
            FragmentTransaction transaction = mnger.beginTransaction();

            PlantTestResult1Fg plantTestResult1Fg = new PlantTestResult1Fg();
            PlantTestResult2Fg plantTestResult2Fg = new PlantTestResult2Fg();
            PlantTestResult3Fg plantTestResult3Fg = new PlantTestResult3Fg();


            plantTest5_an1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                        if (plantTestResult2 != null && plantTestResult2.equals("result2")) {
                            transaction.replace(R.id.planttest_start_fragment, plantTestResult2Fg);
                            transaction.commit();
                        } else if (plantTestResult3!=null && plantTestResult3.equals("result3")) {
                            transaction.replace(R.id.planttest_start_fragment, plantTestResult3Fg);
                            transaction.commit();
                        } else {
                            transaction.replace(R.id.planttest_start_fragment, plantTestResult1Fg);
                            transaction.commit();
                        }
                }
            });

            plantTest5_an2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    plantTestResult2 = "result2";

                    transaction.replace(R.id.planttest_start_fragment, plantTestResult2Fg);
                    transaction.commit();
                }
            });

            plantTest5_an3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (plantTestResult2 != null && plantTestResult2.equals("result2")) {
                        transaction.replace(R.id.planttest_start_fragment, plantTestResult2Fg);
                        transaction.commit();
                    } else if (plantTestResult3 != null && plantTestResult3.equals("result3")) {
                        transaction.replace(R.id.planttest_start_fragment, plantTestResult3Fg);
                        transaction.commit();
                    } else {
                        transaction.replace(R.id.planttest_start_fragment, plantTestResult1Fg);
                        transaction.commit();
                    }
                }
            });
        }
        else {
//            plantTestResult1 = bundle.getString("plantTestResult1");
//            plantTestResult2 = bundle.getString("plantTestResult2");
//            plantTestResult3 = bundle.getString("plantTestResult3");

            FragmentManager mnger = getActivity().getSupportFragmentManager();
            FragmentTransaction transaction = mnger.beginTransaction();

            PlantTestResult1Fg plantTestResult1Fg = new PlantTestResult1Fg();

            transaction.replace(R.id.planttest_start_fragment, plantTestResult1Fg);
            transaction.commit();
        }
        return plantTest5;
    }
}