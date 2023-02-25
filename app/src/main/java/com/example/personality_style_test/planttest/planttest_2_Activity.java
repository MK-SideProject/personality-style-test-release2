package com.example.personality_style_test.planttest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;


public class planttest_2_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planttest2);

        Button planttest_2_an1 = (Button) findViewById(R.id.planttest_2_an1);
        Button planttest_2_an2 = (Button) findViewById(R.id.planttest_2_an2);
        Button planttest_2_an3 = (Button) findViewById(R.id.planttest_2_an3);

        planttest_2_an1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = getIntent();
                Bundle bundle = intent.getExtras();

                String planttest_result1 = bundle.getString("planttest_result1");
                String planttest_result2 = bundle.getString("planttest_result2");
                String planttest_result3 = bundle.getString("planttest_result3");

                Intent intent2 = new Intent(getBaseContext(), planttest_3_Activity.class);
                intent2.putExtra("planttest_result1", planttest_result1);
                intent2.putExtra("planttest_result2", planttest_result2);
                intent2.putExtra("planttest_result3", planttest_result3);
                startActivity(intent2);
            }
        });

        planttest_2_an2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = getIntent();
                Bundle bundle = intent.getExtras();

                String planttest_result1 = bundle.getString("planttest_result1");
                String planttest_result2 = bundle.getString("planttest_result2");
                String planttest_result3 = bundle.getString("planttest_result3");

                Intent intent2 = new Intent(getBaseContext(), planttest_3_Activity.class);
                intent2.putExtra("planttest_result1", planttest_result1);
                intent2.putExtra("planttest_result2", planttest_result2);
                intent2.putExtra("planttest_result3", planttest_result3);
                startActivity(intent2);
            }
        });

        planttest_2_an3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = getIntent();
                Bundle bundle = intent.getExtras();

                String planttest_result1 = bundle.getString("planttest_result1");
                String planttest_result2 = bundle.getString("planttest_result2");
                String planttest_result3 = bundle.getString("planttest_result3");

                Intent intent2 = new Intent(getBaseContext(), planttest_3_Activity.class);
                intent2.putExtra("planttest_result1", planttest_result1);
                intent2.putExtra("planttest_result2", planttest_result2);
                intent2.putExtra("planttest_result3", planttest_result3);
                startActivity(intent2);
            }
        });
    }
}