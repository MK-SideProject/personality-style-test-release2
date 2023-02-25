package com.example.personality_style_test.bankingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;

public class bankingtest_1_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bankingtest1);


        Button bankingtest_1_an1 = (Button) findViewById(R.id.bankingtest_1_an1);
        Button bankingtest_1_an2 = (Button) findViewById(R.id.bankingtest_1_an2);
        Button bankingtest_1_an3 = (Button) findViewById(R.id.bankingtest_1_an3);

        bankingtest_1_an1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String bankigtest_result1 = "result1";

                Intent intent = new Intent(getBaseContext(), bankingtest_2_Activity.class);
                intent.putExtra("bankingtest_result1", bankigtest_result1);

                startActivity(intent);
            }
        });

        bankingtest_1_an2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String bankingtest_result2 = "result2";

                Intent intent = new Intent(getBaseContext(), bankingtest_2_Activity.class);
                intent.putExtra("bankingtest_result2", bankingtest_result2);

                startActivity(intent);
            }
        });

        bankingtest_1_an3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String bankingtest_result3 = "result3";

                Intent intent = new Intent(getBaseContext(), bankingtest_2_Activity.class);
                intent.putExtra("bankingtest_result3", bankingtest_result3);

                startActivity(intent);
            }
        });

    }
}