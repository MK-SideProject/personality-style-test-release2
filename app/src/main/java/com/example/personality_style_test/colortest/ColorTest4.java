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

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ColorTest4#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ColorTest4 extends Fragment {

    private String colorTestResult1;
    private String colorTestResult2;
    private String colorTestResult3;
    private String colorTestResult4;
    private String colorTestResult5;

    public ColorTest4() {
        // Required empty public constructor
    }

    public static ColorTest4 newInstance() {
        ColorTest4 fragment = new ColorTest4();
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
        View colorTest4 = inflater.inflate(R.layout.fragment_color_test_4, container, false);

        Button colorTest4_an1 = (Button) colorTest4.findViewById(R.id.colortest_4_an1);
        Button colorTest4_an2 = (Button) colorTest4.findViewById(R.id.colortest_4_an2);
        Button colorTest4_an3 = (Button) colorTest4.findViewById(R.id.colortest_4_an3);
        Button colorTest4_an4 = (Button) colorTest4.findViewById(R.id.colortest_4_an4);

        //전달한 번들 메소드 받기
        Bundle bundle = getArguments();

        //값이 있다면
        if (bundle != null) {
            colorTestResult1 = bundle.getString("colorTestResult1");
            colorTestResult2 = bundle.getString("colorTestResult2");
            colorTestResult3 = bundle.getString("colorTestResult3");
            colorTestResult4 = bundle.getString("colorTestResult4");
            colorTestResult5 = bundle.getString("colorTestResult5");

            //데이터 전달 및 프래그먼트 변경
            ColorTest5 colorTest5 = new ColorTest5();
            //전달할 번들 생성
            Bundle bundleNext = new Bundle();

            //프래그먼트 이동 선언
            FragmentManager mnger = getActivity().getSupportFragmentManager();
            FragmentTransaction transaction = mnger.beginTransaction();

            //버튼 1번 클릭
            colorTest4_an1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    //번틀 값 설정
                    bundleNext.putString("colorTestResult1", colorTestResult1);
                    bundleNext.putString("colorTestResult2", colorTestResult2);
                    bundleNext.putString("colorTestResult3", colorTestResult3);
                    bundleNext.putString("colorTestResult4", colorTestResult4);
                    bundleNext.putString("colorTestResult5", colorTestResult5);
                    //다음 프래그먼트로 값 이동
                    colorTest5.setArguments(bundleNext);

                    //이동
                    transaction.replace(R.id.colortest_start_fragment, colorTest5);
                    transaction.addToBackStack(null).commit();
                }
            });

            //2번 버튼 클릭
            colorTest4_an2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    //번틀 값 설정
                    bundleNext.putString("colorTestResult1", colorTestResult1);
                    bundleNext.putString("colorTestResult2", colorTestResult2);
                    bundleNext.putString("colorTestResult3", colorTestResult3);
                    bundleNext.putString("colorTestResult4", colorTestResult4);
                    bundleNext.putString("colorTestResult5", colorTestResult5);
                    colorTest5.setArguments(bundleNext);

                    //이동
                    transaction.replace(R.id.colortest_start_fragment, colorTest5);
                    transaction.addToBackStack(null).commit();
                }
            });

            //3번 버튼 클릭
            colorTest4_an3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    colorTestResult2 = "result2";

                    //번틀 값 설정
                    bundleNext.putString("colorTestResult1", colorTestResult1);
                    bundleNext.putString("colorTestResult2", colorTestResult2);
                    bundleNext.putString("colorTestResult3", colorTestResult3);
                    bundleNext.putString("colorTestResult4", colorTestResult4);
                    bundleNext.putString("colorTestResult5", colorTestResult5);
                    colorTest5.setArguments(bundleNext);

                    //이동
                    transaction.replace(R.id.colortest_start_fragment, colorTest5);
                    transaction.addToBackStack(null).commit();

                }
            });

            colorTest4_an4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    //번틀 값 설정
                    bundleNext.putString("colorTestResult1", colorTestResult1);
                    bundleNext.putString("colorTestResult2", colorTestResult2);
                    bundleNext.putString("colorTestResult3", colorTestResult3);
                    bundleNext.putString("colorTestResult4", colorTestResult4);
                    bundleNext.putString("colorTestResult5", colorTestResult5);
                    colorTest5.setArguments(bundleNext);

                    //이동
                    transaction.replace(R.id.colortest_start_fragment, colorTest5);
                    transaction.addToBackStack(null).commit();
                }
            });
        }
        return colorTest4;
    }
}