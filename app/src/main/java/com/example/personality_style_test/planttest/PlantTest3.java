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
 * Use the {@link PlantTest3#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PlantTest3 extends Fragment {

    public PlantTest3() {
        // Required empty public constructor
    }

    public static PlantTest3 newInstance() {
        PlantTest3 fragment = new PlantTest3();
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
        View plantTest3 = inflater.inflate(R.layout.fragment_plant_test3, container, false);

        Button plantTest3_an1 = (Button) plantTest3.findViewById(R.id.planttest_3_an1);
        Button plantTest3_an2 = (Button) plantTest3.findViewById(R.id.planttest_3_an2);
        Button plantTest3_an3 = (Button) plantTest3.findViewById(R.id.planttest_3_an3);

        Bundle bundle = getArguments();

        //값이 있다면
        if (bundle != null) {
            String plantTestResult1 = bundle.getString("plantTestResult1");
            String plantTestResult2 = bundle.getString("plantTestResult2");
            String plantTestResult3 = bundle.getString("plantTestResult3");

            PlantTest4 plantTest4 = new PlantTest4();
            Bundle bundleNext = new Bundle();

            FragmentManager mnger = getActivity().getSupportFragmentManager();
            FragmentTransaction transaction = mnger.beginTransaction();

            bundleNext.putString("plantTestResult1", plantTestResult1);
            bundleNext.putString("plantTestResult2", plantTestResult2);
            bundleNext.putString("plantTestResult3", plantTestResult3);

            plantTest3_an1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    plantTest4.setArguments(bundleNext);
                    transaction.replace(R.id.planttest_start_fragment, plantTest4);
                    transaction.commit();
                }
            });

            plantTest3_an2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    plantTest4.setArguments(bundleNext);
                    transaction.replace(R.id.planttest_start_fragment, plantTest4);
                    transaction.commit();
                }
            });

            plantTest3_an3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    plantTest4.setArguments(bundleNext);
                    transaction.replace(R.id.planttest_start_fragment, plantTest4);
                    transaction.commit();
                }
            });
        }
        return plantTest3;
    }
}