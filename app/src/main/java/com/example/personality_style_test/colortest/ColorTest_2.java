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
import com.example.personality_style_test.colortest.ColorTest_3;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ColorTest_2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ColorTest_2 extends Fragment {

    private String colorTestResult1;
    private String colorTestResult2;
    private String colorTestResult3;
    private String colorTestResult4;
    private String colorTestResult5;

    public ColorTest_2() {
        // Required empty public constructor
    }

    public static ColorTest_2 newInstance() {
        ColorTest_2 fragment = new ColorTest_2();
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
        View colorTest2 = inflater.inflate(R.layout.fragment_color_test_2, container, false);

        Button colorTest2_an1 = (Button) colorTest2.findViewById(R.id.colortest_2_an1);
        Button colorTest2_an2 = (Button) colorTest2.findViewById(R.id.colortest_2_an2);
        Button colorTest2_an3 = (Button) colorTest2.findViewById(R.id.colortest_2_an3);
        Button colorTest2_an4 = (Button) colorTest2.findViewById(R.id.colortest_2_an4);

        //전달한 번들 메소드 받기
        Bundle bundle = getArguments();

        //값이 있다면
        if(bundle != null){
            colorTestResult1 = bundle.getString("colorTestResult1");
            colorTestResult2 = bundle.getString("colorTestResult2");
            colorTestResult3 = bundle.getString("colorTestResult3");
            colorTestResult4 = bundle.getString("colorTestResult4");
            colorTestResult5 = bundle.getString("colorTestResult4");

            //데이터 전달 및 프래그먼트 변경
            ColorTest_3 colorTest3 = new ColorTest_3();
            //전달할 번들 생성
            Bundle bundleNext = new Bundle();

            //프래그먼트 이동 선언
            FragmentManager mnger = getActivity().getSupportFragmentManager();
            FragmentTransaction transaction = mnger.beginTransaction();

            //버튼 1번 클릭
            colorTest2_an1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    //번틀 값 설정
                    bundleNext.putString("colorTestResult1",colorTestResult1);
                    bundleNext.putString("colorTestResult2",colorTestResult2);
                    bundleNext.putString("colorTestResult3",colorTestResult3);
                    bundleNext.putString("colorTestResult4",colorTestResult4);
                    bundleNext.putString("colorTestResult5",colorTestResult5);
                    //다음 프래그먼트로 값 이동
                    colorTest3.setArguments(bundleNext);

                    //이동
                    transaction.replace(R.id.colortest_start_fragment, colorTest3);
                    transaction.commit();
                }
            });

            //2번 버튼 클릭
            colorTest2_an2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    //번틀 값 설정
                    bundleNext.putString("colorTestResult1",colorTestResult1);
                    bundleNext.putString("colorTestResult2",colorTestResult2);
                    bundleNext.putString("colorTestResult3",colorTestResult3);
                    bundleNext.putString("colorTestResult4",colorTestResult4);
                    bundleNext.putString("colorTestResult5",colorTestResult5);
                    colorTest3.setArguments(bundleNext);

                    //이동
                    transaction.replace(R.id.colortest_start_fragment, colorTest3);

                    transaction.commit();
                }
            });

            //3번 버튼 클릭
            colorTest2_an3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    //번틀 값 설정
                    bundleNext.putString("colorTestResult1",colorTestResult1);
                    bundleNext.putString("colorTestResult2",colorTestResult2);
                    bundleNext.putString("colorTestResult3",colorTestResult3);
                    bundleNext.putString("colorTestResult4",colorTestResult4);
                    bundleNext.putString("colorTestResult5",colorTestResult5);
                    colorTest3.setArguments(bundleNext);

                    //이동
                    transaction.replace(R.id.colortest_start_fragment, colorTest3);

                    transaction.commit();
                }
            });

            colorTest2_an4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    colorTestResult5 = "result5";

                    //번틀 값 설정
                    bundleNext.putString("colorTestResult1",colorTestResult1);
                    bundleNext.putString("colorTestResult2",colorTestResult2);
                    bundleNext.putString("colorTestResult3",colorTestResult3);
                    bundleNext.putString("colorTestResult4",colorTestResult4);
                    bundleNext.putString("colorTestResult5",colorTestResult5);
                    colorTest3.setArguments(bundleNext);

                    //이동
                    transaction.replace(R.id.colortest_start_fragment, colorTest3);

                    transaction.commit();
                }
            });
        }
        return colorTest2;
    }
}