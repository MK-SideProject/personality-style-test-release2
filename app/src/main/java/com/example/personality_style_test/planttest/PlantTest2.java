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
import com.example.personality_style_test.colortest.ColorTest3;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PlantTest2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PlantTest2 extends Fragment {

    public PlantTest2() {
        // Required empty public constructor
    }

    public static PlantTest2 newInstance() {
        PlantTest2 fragment = new PlantTest2();
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
        View plantTest2 = inflater.inflate(R.layout.fragment_plant_test2, container, false);

        Button plantTest2_an1 = (Button) plantTest2.findViewById(R.id.planttest_2_an1);
        Button plantTest2_an2 = (Button) plantTest2.findViewById(R.id.planttest_2_an2);
        Button plantTest2_an3 = (Button) plantTest2.findViewById(R.id.planttest_2_an3);

        //전달한 번들 메소드 받기
        Bundle bundle = getArguments();

        //값이 있다면
        if (bundle != null) {
            String plantTestResult1 = bundle.getString("plantTestResult1");
            String plantTestResult2 = bundle.getString("plantTestResult2");
            String plantTestResult3 = bundle.getString("plantTestResult3");

            PlantTest3 plantTest3 = new PlantTest3();
            Bundle bundleNext = new Bundle();

            FragmentManager mnger = getActivity().getSupportFragmentManager();
            FragmentTransaction transaction = mnger.beginTransaction();

            bundleNext.putString("plantTestResult1", plantTestResult1);
            bundleNext.putString("plantTestResult2", plantTestResult2);
            bundleNext.putString("plantTestResult3", plantTestResult3);

            plantTest2_an1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    plantTest3.setArguments(bundleNext);
                    transaction.replace(R.id.planttest_start_fragment, plantTest3);
                    transaction.commit();
                }
            });

            //2번 버튼 클릭
            plantTest2_an2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    plantTest3.setArguments(bundleNext);
                    transaction.replace(R.id.planttest_start_fragment, plantTest3);
                    transaction.commit();
                }
            });

            plantTest2_an3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    plantTest3.setArguments(bundleNext);
                    transaction.replace(R.id.planttest_start_fragment, plantTest3);
                    transaction.commit();
                }
            });
        }
        return plantTest2;
    }
}