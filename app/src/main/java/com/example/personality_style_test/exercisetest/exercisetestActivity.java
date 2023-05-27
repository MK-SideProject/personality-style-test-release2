package com.example.personality_style_test.exercisetest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;

public class exercisetestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercisetest);

        Button exerciseTestStart = (Button) findViewById(R.id.exercisetest_start);

        exerciseTestStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // 화면 전환 프래그먼트 선언 및 초기 화면 설정
                FragmentManager manager = getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();

                ExerciseTest1 exerciseTest1 = new ExerciseTest1();

                transaction.replace(R.id.exercisetest_start_fragment, exerciseTest1).commit();
            }
        });
    }
}