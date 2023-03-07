package com.example.personality_style_test.santatest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;
import com.example.personality_style_test.bankingtest.bankingtest_1_Activity;
import com.example.personality_style_test.colortest.ColorTest1;

public class santatestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_santatest);

        Button santaTestStart = (Button) findViewById(R.id.santatest_start);

        santaTestStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 화면 전환 프래그먼트 선언 및 초기 화면 설정
                FragmentManager manager = getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();

                SantaTest1 santaTest1 = new SantaTest1();

                transaction.replace(R.id.santatest_start_fragment, santaTest1).commit();
            }
        });
    }
}