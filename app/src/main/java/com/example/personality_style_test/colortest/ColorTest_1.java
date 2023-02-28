package com.example.personality_style_test.colortest;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.personality_style_test.R;


public class ColorTest_1 extends Fragment {

    public ColorTest_1() {
        // Required empty public constructor
    }

    public static ColorTest_1 newInstance() {
        ColorTest_1 fragment = new ColorTest_1();
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
        View colorTest1 = inflater.inflate(R.layout.fragment_color_test_1, container, false);
        Button colorTest1_an1 = (Button) colorTest1.findViewById(R.id.colorTest1_an1);
        Button colorTest1_an2 = (Button) colorTest1.findViewById(R.id.colorTest1_an2);
        Button colorTest1_an3 = (Button) colorTest1.findViewById(R.id.colorTest1_an3);
        Button colorTest1_an4 = (Button) colorTest1.findViewById(R.id.colorTest1_an4);

        ColorTest_2 colorTest2 = new ColorTest_2();
        Bundle bundle = new Bundle();

        FragmentManager manager = getActivity().getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();

        colorTest1_an1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String colorTestResult5 = "result5";

                bundle.putString("colorTestResult4", colorTestResult5);
                colorTest2.setArguments(bundle);

                transaction.replace(R.id.colortest_start_fragment, colorTest2);
                transaction.commit();
            }
        });

        colorTest1_an2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String colorTestResult3 = "result3";

                bundle.putString("colorTestResult3", colorTestResult3);
                colorTest2.setArguments(bundle);

                transaction.replace(R.id.colortest_start_fragment, colorTest2);
                transaction.commit();
            }
        });

        colorTest1_an3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String colorTestResult1 = "result1";

                bundle.putString("colorTestResult1", colorTestResult1);
                colorTest2.setArguments(bundle);

                transaction.replace(R.id.colortest_start_fragment, colorTest2);
                transaction.commit();
            }
        });

        colorTest1_an4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String colorTestResult4 = "result4";

                bundle.putString("colorTestResult4", colorTestResult4);
                colorTest2.setArguments(bundle);

                transaction.replace(R.id.colortest_start_fragment, colorTest2);
                transaction.commit();
            }
        });

        return colorTest1;
    }
}