package com.example.personality_style_test.caketest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;

public class caketest_5_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caketest5);

        Button caketest_5_an1 = (Button) findViewById(R.id.caketest_5_an1);
        Button caketest_5_an2 = (Button) findViewById(R.id.caketest_5_an2);
        Button caketest_5_an3 = (Button) findViewById(R.id.caketest_5_an3);


        caketest_5_an1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent4 = getIntent();
                Bundle bundle = intent4.getExtras();

                String caketest_result1 = bundle.getString("caketest_result1");
                String caketest_result2 = bundle.getString("caketest_result2");
                String caketest_result3 = bundle.getString("caketest_result3");
                String caketest_result4 = bundle.getString("caketest_result4");

                Intent intent5 = new Intent(getBaseContext(), caketest_6_Activity.class);
                intent5.putExtra("caketest_result1", caketest_result1);
                intent5.putExtra("caketest_result2", caketest_result2);
                intent5.putExtra("caketest_result3", caketest_result3);
                intent5.putExtra("caketest_result4", caketest_result4);

                startActivity(intent5);
            }
        });

        caketest_5_an2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent4 = getIntent();
                Bundle bundle = intent4.getExtras();

                String caketest_result1 = bundle.getString("caketest_result1");
                String caketest_result2 = bundle.getString("caketest_result2");
                String caketest_result3 = bundle.getString("caketest_result3");
                String caketest_result4 = bundle.getString("caketest_result4");

                Intent intent5 = new Intent(getBaseContext(), caketest_6_Activity.class);
                intent5.putExtra("caketest_result1", caketest_result1);
                intent5.putExtra("caketest_result2", caketest_result2);
                intent5.putExtra("caketest_result3", caketest_result3);
                intent5.putExtra("caketest_result4", caketest_result4);

                startActivity(intent5);
            }
        });

        caketest_5_an3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent4 = getIntent();
                Bundle bundle = intent4.getExtras();

                String caketest_result1 = bundle.getString("caketest_result1");
                String caketest_result2 = bundle.getString("caketest_result2");
                String caketest_result3 = bundle.getString("caketest_result3");
                String caketest_result4 = bundle.getString("caketest_result4");

                Intent intent5 = new Intent(getBaseContext(), caketest_6_Activity.class);
                intent5.putExtra("caketest_result1", caketest_result1);
                intent5.putExtra("caketest_result2", caketest_result2);
                intent5.putExtra("caketest_result3", caketest_result3);
                intent5.putExtra("caketest_result4", caketest_result4);

                startActivity(intent5);
            }
        });
    }
}