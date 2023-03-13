package com.example.personality_style_test.planttest;

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
 * Use the {@link PlantTest4#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PlantTest4 extends Fragment {
    private String plantTestResult3;

    public PlantTest4() {
        // Required empty public constructor
    }

    public static PlantTest4 newInstance() {
        PlantTest4 fragment = new PlantTest4();
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
        View plantTest4 = inflater.inflate(R.layout.fragment_plant_test4, container, false);

        Button plantTest4_an1 = (Button) plantTest4.findViewById(R.id.planttest_4_an1);
        Button plantTest4_an2 = (Button) plantTest4.findViewById(R.id.planttest_4_an2);
        Button plantTest4_an3 = (Button) plantTest4.findViewById(R.id.planttest_4_an3);

        Bundle bundle = getArguments();

        //값이 있다면
        if (bundle != null) {
            String plantTestResult1 = bundle.getString("plantTestResult1");
            String plantTestResult2 = bundle.getString("plantTestResult2");
            plantTestResult3 = bundle.getString("plantTestResult3");

            PlantTest5 plantTest5 = new PlantTest5();
            Bundle bundleNext = new Bundle();

            FragmentManager mnger = getActivity().getSupportFragmentManager();
            FragmentTransaction transaction = mnger.beginTransaction();

            bundleNext.putString("plantTestResult1", plantTestResult1);
            bundleNext.putString("plantTestResult2", plantTestResult2);

            plantTest4_an1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    bundleNext.putString("plantTestResult3", plantTestResult3);
                    plantTest5.setArguments(bundleNext);
                    transaction.replace(R.id.planttest_start_fragment, plantTest5);
                    transaction.commit();
                }
            });

            plantTest4_an2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    bundleNext.putString("plantTestResult3", plantTestResult3);
                    plantTest5.setArguments(bundleNext);
                    transaction.replace(R.id.planttest_start_fragment, plantTest5);
                    transaction.commit();
                }
            });

            plantTest4_an3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    plantTestResult3 = "result3";
                    bundleNext.putString("plantTestResult3", plantTestResult3);
                    plantTest5.setArguments(bundleNext);
                    transaction.replace(R.id.planttest_start_fragment, plantTest5);
                    transaction.commit();
                }
            });
        }
        return plantTest4;
    }
}