package com.example.personality_style_test.foodtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;
import com.example.personality_style_test.colortest.ColorTest1;

public class FoodTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodtest);

        Button foodTestStart = (Button) findViewById(R.id.foodtest_start);

        foodTestStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 화면 전환 프래그먼트 선언 및 초기 화면 설정
                FragmentManager manager = getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();

                FoodTest1 foodTest1 = new FoodTest1();

                transaction.replace(R.id.foodtest_start_fragment, foodTest1).commit();

            }
        });
    }
}