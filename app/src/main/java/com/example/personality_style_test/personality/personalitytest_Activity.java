package com.example.personality_style_test.personality;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;

public class personalitytest_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personalitytest);

        Button personalityTestStart = (Button) findViewById(R.id.personalitytest_start);

        personalityTestStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // 화면 전환 프래그먼트 선언 및 초기 화면 설정
                FragmentManager manager = getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();

                Personality1 personality1 = new Personality1();

                transaction.replace(R.id.personalitytest_start_fragment, personality1).commit();
            }
        });
    }
}