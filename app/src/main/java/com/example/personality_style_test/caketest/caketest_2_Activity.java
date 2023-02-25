package com.example.personality_style_test.caketest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;

public class caketest_2_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caketest2);

        Button caketest_2_an1 = (Button) findViewById(R.id.caketest_2_an1);
        Button caketest_2_an2 = (Button) findViewById(R.id.caketest_2_an2);
        Button caketest_2_an3 = (Button) findViewById(R.id.caketest_2_an3);

        caketest_2_an1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = getIntent();
                Bundle bundle = intent.getExtras();


                String caketest_result1 = bundle.getString("caketest_result1");
                String caketest_result2 = bundle.getString("caketest_result2");
                String caketest_result3 = bundle.getString("caketest_result3");
                String caketest_result4 = bundle.getString("caketest_result4");

                Intent intent2 = new Intent(getBaseContext(), caketest_3_Activity.class);
                intent2.putExtra("caketest_result1", caketest_result1);
                intent2.putExtra("caketest_result2", caketest_result2);
                intent2.putExtra("caketest_result3", caketest_result3);
                intent2.putExtra("caketest_result4", caketest_result4);

                startActivity(intent2);
            }
        });

        caketest_2_an2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = getIntent();
                Bundle bundle = intent.getExtras();

                String caketest_result1 = "result1";
                String caketest_result2 = bundle.getString("caketest_result2");
                String caketest_result3 = bundle.getString("caketest_result3");
                String caketest_result4 = bundle.getString("caketest_result4");

                Intent intent2 = new Intent(getBaseContext(), caketest_3_Activity.class);
                intent2.putExtra("caketest_result1", caketest_result1);
                intent2.putExtra("caketest_result2", caketest_result2);
                intent2.putExtra("caketest_result3", caketest_result3);
                intent2.putExtra("caketest_result4", caketest_result4);

                startActivity(intent2);
            }
        });

        caketest_2_an3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = getIntent();
                Bundle bundle = intent.getExtras();

                String caketest_result1 = bundle.getString("caketest_result1");
                String caketest_result2 = bundle.getString("caketest_result2");
                String caketest_result3 = bundle.getString("caketest_result3");
                String caketest_result4 = bundle.getString("caketest_result4");

                Intent intent2 = new Intent(getBaseContext(), caketest_3_Activity.class);
                intent2.putExtra("caketest_result1", caketest_result1);
                intent2.putExtra("caketest_result2", caketest_result2);
                intent2.putExtra("caketest_result3", caketest_result3);
                intent2.putExtra("caketest_result4", caketest_result4);

                startActivity(intent2);
            }
        });
    }
}