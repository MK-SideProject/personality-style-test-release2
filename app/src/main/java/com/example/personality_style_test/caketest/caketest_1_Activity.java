package com.example.personality_style_test.caketest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;


public class caketest_1_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caketest1);

        Button caketest_1_an1 = (Button) findViewById(R.id.caketest_1_an1);
        Button caketest_1_an2 = (Button) findViewById(R.id.caketest_1_an2);
        Button caketest_1_an3 = (Button) findViewById(R.id.caketest_1_an3);


        caketest_1_an1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String caketest_result2 = "result2";

                Intent intent = new Intent(getBaseContext(), caketest_2_Activity.class);
                intent.putExtra("caketest_result2", caketest_result2);

                startActivity(intent);
            }
        });

        caketest_1_an2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String caketest_result3 = "result3";

                Intent intent = new Intent(getBaseContext(), caketest_2_Activity.class);
                //intent.putExtra("caketest_result1", caketest_result1);
                intent.putExtra("caketest_result3", caketest_result3);

                startActivity(intent);
            }
        });

        caketest_1_an3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String caketest_result4 = "result4";

                Intent intent = new Intent(getBaseContext(), caketest_2_Activity.class);
                intent.putExtra("caketest_result4", caketest_result4);


                startActivity(intent);
            }
        });

    }
}