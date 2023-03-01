package com.example.personality_style_test.bankingtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;

public class BankingTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bankingtest);

        Button bankingTestStart = (Button) findViewById(R.id.bankingtest_start);

        bankingTestStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                // 화면 전환 프래그먼트 선언 및 초기 화면 설정
                FragmentManager manager = getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();

                BankingTest1 BankingTest1 = new BankingTest1();

                transaction.replace(R.id.bankingtest_start_fragment, BankingTest1).commit();
            }
        });

    }
}