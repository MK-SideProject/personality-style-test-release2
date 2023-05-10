package com.example.personality_style_test.triptest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;

public class TripTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triptest);

        Button tripTestStart = (Button) findViewById(R.id.triptest_start);

        tripTestStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 화면 전환 프래그먼트 선언 및 초기 화면 설정
                FragmentManager manager = getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();

                TripTest1 tripTest1 = new TripTest1();

                transaction.replace(R.id.triptest_start_fragment, tripTest1).commit();
            }
        });
    }
}