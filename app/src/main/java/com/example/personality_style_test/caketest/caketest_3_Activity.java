package com.example.personality_style_test.caketest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;

public class caketest_3_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caketest3);

        Button caketest_3_an1 = (Button) findViewById(R.id.caketest_3_an1);
        Button caketest_3_an2 = (Button) findViewById(R.id.caketest_3_an2);
        Button caketest_3_an3 = (Button) findViewById(R.id.caketest_3_an3);


        caketest_3_an1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent2 = getIntent();
                Bundle bundle = intent2.getExtras();

                String caketest_result1 = bundle.getString("caketest_result1");
                String caketest_result2 = bundle.getString("caketest_result2");
                String caketest_result3 = bundle.getString("caketest_result3");
                String caketest_result4 = bundle.getString("caketest_result4");

                Intent intent3 = new Intent(getBaseContext(), caketest_4_Activity.class);
                intent3.putExtra("caketest_result1", caketest_result1);
                intent3.putExtra("caketest_result2", caketest_result2);
                intent3.putExtra("caketest_result3", caketest_result3);
                intent3.putExtra("caketest_result4", caketest_result4);

                startActivity(intent3);
            }
        });

        caketest_3_an2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent2 = getIntent();
                Bundle bundle = intent2.getExtras();

                String caketest_result1 = bundle.getString("caketest_result1");
                String caketest_result2 = bundle.getString("caketest_result2");
                String caketest_result3 = bundle.getString("caketest_result3");
                String caketest_result4 = bundle.getString("caketest_result4");

                Intent intent3 = new Intent(getBaseContext(), caketest_4_Activity.class);
                intent3.putExtra("caketest_result1", caketest_result1);
                intent3.putExtra("caketest_result2", caketest_result2);
                intent3.putExtra("caketest_result3", caketest_result3);
                intent3.putExtra("caketest_result4", caketest_result4);

                startActivity(intent3);
            }
        });

        caketest_3_an3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent2 = getIntent();
                Bundle bundle = intent2.getExtras();

                String caketest_result1 = bundle.getString("caketest_result1");
                String caketest_result2 = bundle.getString("caketest_result2");
                String caketest_result3 = bundle.getString("caketest_result3");
                String caketest_result4 = bundle.getString("caketest_result4");

                Intent intent3 = new Intent(getBaseContext(), caketest_4_Activity.class);
                intent3.putExtra("caketest_result1", caketest_result1);
                intent3.putExtra("caketest_result2", caketest_result2);
                intent3.putExtra("caketest_result3", caketest_result3);
                intent3.putExtra("caketest_result4", caketest_result4);

                startActivity(intent3);
            }
        });
    }
}