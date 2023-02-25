package com.example.personality_style_test.planttest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;


public class planttest_1_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planttest1);

        Button planttest_1_an1 = (Button) findViewById(R.id.planttest_1_an1);
        Button planttest_1_an2 = (Button) findViewById(R.id.planttest_1_an2);
        Button planttest_1_an3 = (Button) findViewById(R.id.planttest_1_an3);

        planttest_1_an1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String planttest_result1 = "result1";


                Intent intent = new Intent(getBaseContext(), planttest_2_Activity.class);
                intent.putExtra("planttest_result1", planttest_result1);

                startActivity(intent);
            }
        });

        planttest_1_an2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String planttest_result2 = "result2";


                Intent intent = new Intent(getBaseContext(), planttest_2_Activity.class);
                intent.putExtra("planttest_result2", planttest_result2);

                startActivity(intent);
            }
        });

        planttest_1_an3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String planttest_result1 = "result1";


                Intent intent = new Intent(getBaseContext(), planttest_2_Activity.class);
                intent.putExtra("planttest_result1", planttest_result1);

                startActivity(intent);
            }
        });

    }
}