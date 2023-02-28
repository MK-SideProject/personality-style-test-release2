package com.example.personality_style_test.colortest;

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
 * Use the {@link ColorTest_6#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ColorTest_6 extends Fragment {

    private String colorTestResult1;
    private String colorTestResult2;
    private String colorTestResult3;
    private String colorTestResult4;
    private String colorTestResult5;

    public ColorTest_6() {
        // Required empty public constructor
    }

    public static ColorTest_6 newInstance() {
        ColorTest_6 fragment = new ColorTest_6();
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
        View colorTest6 = inflater.inflate(R.layout.fragment_color_test_6, container, false);

        Button colorTest6_an1 = (Button) colorTest6.findViewById(R.id.colortest_6_an1);
        Button colorTest6_an2 = (Button) colorTest6.findViewById(R.id.colortest_6_an2);
        Button colorTest6_an3 = (Button) colorTest6.findViewById(R.id.colortest_6_an3);
        Button colorTest6_an4 = (Button) colorTest6.findViewById(R.id.colortest_6_an4);

        //전달한 번들 메소드 받기
        Bundle bundle = getArguments();

        //값이 있다면
        if (bundle != null) {
            colorTestResult1 = bundle.getString("colorTestResult1");
            colorTestResult2 = bundle.getString("colorTestResult2");
            colorTestResult3 = bundle.getString("colorTestResult3");
            colorTestResult4 = bundle.getString("colorTestResult4");
            colorTestResult5 = bundle.getString("colorTestResult5");

//            //데이터 전달 및 프래그먼트 변경
//            ColorTest_6 colorTest6 = new ColorTest_6();
//            //전달할 번들 생성
//            Bundle bundleNext = new Bundle();

            //프래그먼트 이동 선언
            FragmentManager mnger = getActivity().getSupportFragmentManager();
            FragmentTransaction transaction = mnger.beginTransaction();

            // result screen
            ColorTestResult1Fg colorTestResult1Fg = new ColorTestResult1Fg();
            ColorTestResult2Fg colorTestResult2Fg = new ColorTestResult2Fg();
            ColorTestResult3Fg colorTestResult3Fg = new ColorTestResult3Fg();
            ColorTestResult4Fg colorTestResult4Fg = new ColorTestResult4Fg();
            ColorTestResult5Fg colorTestResult5Fg = new ColorTestResult5Fg();

            //버튼 1번 클릭
            colorTest6_an1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if(colorTestResult4 != null && colorTestResult4.equals("result4") ){
                        //이동
                        transaction.replace(R.id.colortest_start_fragment, colorTestResult4Fg);
                        transaction.commit();
                    }
                    else if(colorTestResult5!= null && colorTestResult5.equals("result5")){
                        //이동
                        transaction.replace(R.id.colortest_start_fragment, colorTestResult5Fg);
                        transaction.commit();
                    }
                    else if(colorTestResult2!= null && colorTestResult2.equals("result2")){
                        //이동
                        transaction.replace(R.id.colortest_start_fragment, colorTestResult2Fg);
                        transaction.commit();
                    }
                    else if(colorTestResult1!= null && colorTestResult1.equals("result1")){
                        //이동
                        transaction.replace(R.id.colortest_start_fragment, colorTestResult1Fg);
                        transaction.commit();
                    }
                    else{
                        //이동
                        transaction.replace(R.id.colortest_start_fragment, colorTestResult3Fg);
                        transaction.commit();
                    }
                }
            });

            //2번 버튼 클릭
            colorTest6_an2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if(colorTestResult4!= null && colorTestResult4.equals("result4") ){
                        //이동
                        transaction.replace(R.id.colortest_start_fragment, colorTestResult4Fg);
                        transaction.commit();
                    }
                    else if(colorTestResult5!= null && colorTestResult5.equals("result5")){
                        //이동
                        transaction.replace(R.id.colortest_start_fragment, colorTestResult5Fg);
                        transaction.commit();
                    }
                    else if(colorTestResult2!= null && colorTestResult2.equals("result2")){
                        //이동
                        transaction.replace(R.id.colortest_start_fragment, colorTestResult2Fg);
                        transaction.commit();
                    }
                    else if(colorTestResult1!= null && colorTestResult1.equals("result1")){
                        //이동
                        transaction.replace(R.id.colortest_start_fragment, colorTestResult1Fg);
                        transaction.commit();
                    }
                    else{
                        //이동
                        transaction.replace(R.id.colortest_start_fragment, colorTestResult3Fg);
                        transaction.commit();
                    }
                }
            });

            //3번 버튼 클릭
            colorTest6_an3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(colorTestResult4!= null && colorTestResult4.equals("result4") ){
                        //이동
                        transaction.replace(R.id.colortest_start_fragment, colorTestResult4Fg);
                        transaction.commit();
                    }
                    else if(colorTestResult5!= null && colorTestResult5.equals("result5")){
                        //이동
                        transaction.replace(R.id.colortest_start_fragment, colorTestResult5Fg);
                        transaction.commit();
                    }
                    else if(colorTestResult2!= null && colorTestResult2.equals("result2")){
                        //이동
                        transaction.replace(R.id.colortest_start_fragment, colorTestResult2Fg);
                        transaction.commit();
                    }
                    else if(colorTestResult1!= null && colorTestResult1.equals("result1")){
                        //이동
                        transaction.replace(R.id.colortest_start_fragment, colorTestResult1Fg);
                        transaction.commit();
                    }
                    else{
                        //이동
                        transaction.replace(R.id.colortest_start_fragment, colorTestResult3Fg);
                        transaction.commit();
                    }
                }
            });

            //4번 버튼 클릭
            colorTest6_an4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if(colorTestResult4!= null && colorTestResult4.equals("result4") ){
                        //이동
                        transaction.replace(R.id.colortest_start_fragment, colorTestResult4Fg);
                        transaction.commit();
                    }
                    else if(colorTestResult5!= null && colorTestResult5.equals("result5")){
                        //이동
                        transaction.replace(R.id.colortest_start_fragment, colorTestResult5Fg);
                        transaction.commit();
                    }
                    else if(colorTestResult2!= null && colorTestResult2.equals("result2")){
                        //이동
                        transaction.replace(R.id.colortest_start_fragment, colorTestResult2Fg);
                        transaction.commit();
                    }
                    else if(colorTestResult1!= null && colorTestResult1.equals("result1")){
                        //이동
                        transaction.replace(R.id.colortest_start_fragment, colorTestResult1Fg);
                        transaction.commit();
                    }
                    else{
                        //이동
                        transaction.replace(R.id.colortest_start_fragment, colorTestResult3Fg);
                        transaction.commit();
                    }
                }
            });
        }
        return colorTest6;
    }
}