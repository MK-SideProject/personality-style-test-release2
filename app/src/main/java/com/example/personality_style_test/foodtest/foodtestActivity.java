package com.example.personality_style_test.foodtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;
import com.example.personality_style_test.bankingtest.bankingtest_1_Activity;

public class foodtestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodtest);

        Button foodtest_start = (Button) findViewById(R.id.foodtest_start);

        foodtest_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(getBaseContext(), foodtest_1_Activity.class);

                startActivity(intent);
            }
        });
    }
}