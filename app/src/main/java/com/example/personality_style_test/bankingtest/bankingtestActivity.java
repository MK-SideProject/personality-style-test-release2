package com.example.personality_style_test.bankingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;

public class bankingtestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bankingtest);

        Button bankingtest_start = (Button) findViewById(R.id.bankingtest_start);

        bankingtest_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(getBaseContext(), bankingtest_1_Activity.class);

                startActivity(intent);
            }
        });

    }
}