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
 * Use the {@link PlantTest1#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PlantTest1 extends Fragment {

    public PlantTest1() {
        // Required empty public constructor
    }
    public static PlantTest1 newInstance() {
        PlantTest1 fragment = new PlantTest1();
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
        View plantTest1 = inflater.inflate(R.layout.fragment_plant_test1, container, false);
        Button plantTest1_an1 = (Button) plantTest1.findViewById(R.id.planttest_1_an1);
        Button plantTest1_an2 = (Button) plantTest1.findViewById(R.id.planttest_1_an2);
        Button plantTest1_an3 = (Button) plantTest1.findViewById(R.id.planttest_1_an3);

        PlantTest2 plantTest2 = new PlantTest2();
        Bundle bundle = new Bundle();

        FragmentManager manager = getActivity().getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();

        plantTest1_an1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String plantTestResult1 = "result1";

                bundle.putString("result1", plantTestResult1);
                plantTest2.setArguments(bundle);

                transaction.replace(R.id.planttest_start_fragment, plantTest2);
                transaction.addToBackStack(null).commit();
            }
        });
        plantTest1_an2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String plantTestResult2 = "result2";

                bundle.putString("result1", plantTestResult2);
                plantTest2.setArguments(bundle);

                transaction.replace(R.id.planttest_start_fragment, plantTest2);
                transaction.addToBackStack(null).commit();
            }
        });
        plantTest1_an3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String plantTestResult1 = "result1";

                bundle.putString("result1", plantTestResult1);
                plantTest2.setArguments(bundle);

                transaction.replace(R.id.planttest_start_fragment, plantTest2);
                transaction.addToBackStack(null).commit();
            }
        });
        return plantTest1;
    }
}