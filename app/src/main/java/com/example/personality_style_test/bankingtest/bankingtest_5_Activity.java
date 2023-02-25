package com.example.personality_style_test.bankingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import com.example.personality_style_test.R;

public class bankingtest_5_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bankingtest5);

        Button bankingtest_5_an1 = (Button) findViewById(R.id.bankingtest_5_an1);
        Button bankingtest_5_an2 = (Button) findViewById(R.id.bankingtest_5_an2);
        Button bankingtest_5_an3 = (Button) findViewById(R.id.bankingtest_5_an3);
        Button bankingtest_5_an4 = (Button) findViewById(R.id.bankingtest_5_an4);

        bankingtest_5_an1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent4 = getIntent();
                Bundle bundle = intent4.getExtras();

                String bankingtest_result1 = bundle.getString("bankingtest_result1");
                String bankingtest_result2 = bundle.getString("bankingtest_result2");
                String bankingtest_result3 = bundle.getString("bankingtest_result3");

                Intent intent5 = new Intent(getBaseContext(), bankingtest_6_Activity.class);
                intent5.putExtra("bankingtest_result1", bankingtest_result1);
                intent5.putExtra("bankingtest_result2", bankingtest_result2);
                intent5.putExtra("bankingtest_result3", bankingtest_result3);
                //Toast.makeText(getApplicationContext(), bankingtest_result1,Toast.LENGTH_SHORT).show();
                startActivity(intent5);
            }
        });

        bankingtest_5_an2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent4 = getIntent();
                Bundle bundle = intent4.getExtras();

                String bankingtest_result1 = bundle.getString("bankingtest_result1");
                String bankingtest_result2 = bundle.getString("bankingtest_result2");
                String bankingtest_result3 = bundle.getString("bankingtest_result3");

                Intent intent5 = new Intent(getBaseContext(), bankingtest_6_Activity.class);
                intent5.putExtra("bankingtest_result1", bankingtest_result1);
                intent5.putExtra("bankingtest_result2", bankingtest_result2);
                intent5.putExtra("bankingtest_result3", bankingtest_result3);
                //Toast.makeText(getApplicationContext(), bankingtest_result1,Toast.LENGTH_SHORT).show();
                startActivity(intent5);
            }
        });


        bankingtest_5_an3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent4 = getIntent();
                Bundle bundle = intent4.getExtras();

                String bankingtest_result1 = bundle.getString("bankingtest_result1");
                String bankingtest_result2 = bundle.getString("bankingtest_result2");
                String bankingtest_result3 = bundle.getString("bankingtest_result3");

                Intent intent5 = new Intent(getBaseContext(), bankingtest_6_Activity.class);
                intent5.putExtra("bankingtest_result1", bankingtest_result1);
                intent5.putExtra("bankingtest_result2", bankingtest_result2);
                intent5.putExtra("bankingtest_result3", bankingtest_result3);
                //Toast.makeText(getApplicationContext(), bankingtest_result1,Toast.LENGTH_SHORT).show();
                startActivity(intent5);
            }
        });

        bankingtest_5_an4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent4 = getIntent();
                Bundle bundle = intent4.getExtras();

                String bankingtest_result1 = bundle.getString("bankingtest_result1");
                String bankingtest_result2 = bundle.getString("bankingtest_result2");
                String bankingtest_result3 = bundle.getString("bankingtest_result3");

                Intent intent5 = new Intent(getBaseContext(), bankingtest_6_Activity.class);
                intent5.putExtra("bankingtest_result1", bankingtest_result1);
                intent5.putExtra("bankingtest_result2", bankingtest_result2);
                intent5.putExtra("bankingtest_result3", bankingtest_result3);
                //Toast.makeText(getApplicationContext(), bankingtest_result1,Toast.LENGTH_SHORT).show();
                startActivity(intent5);
            }
        });
    }
}