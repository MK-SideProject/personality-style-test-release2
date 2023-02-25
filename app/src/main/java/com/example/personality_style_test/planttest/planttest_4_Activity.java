package com.example.personality_style_test.planttest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;

public class planttest_4_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planttest4);

        Button planttest_4_an1 = (Button) findViewById(R.id.planttest_4_an1);
        Button planttest_4_an2 = (Button) findViewById(R.id.planttest_4_an2);
        Button planttest_4_an3 = (Button) findViewById(R.id.planttest_4_an3);

        planttest_4_an1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent3 = getIntent();
                Bundle bundle = intent3.getExtras();

                String planttest_result1 = bundle.getString("planttest_result1");
                String planttest_result2 = bundle.getString("planttest_result2");
                String planttest_result3 = bundle.getString("planttest_result3");

                Intent intent4 = new Intent(getBaseContext(), planttest_5_Activity.class);
                intent4.putExtra("planttest_result1", planttest_result1);
                intent4.putExtra("planttest_result2", planttest_result2);
                intent4.putExtra("planttest_result3", planttest_result3);
                startActivity(intent4);
            }
        });

        planttest_4_an2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent3 = getIntent();
                Bundle bundle = intent3.getExtras();

                String planttest_result1 = bundle.getString("planttest_result1");
                String planttest_result2 = bundle.getString("planttest_result2");
                String planttest_result3 = "result3";

                Intent intent4 = new Intent(getBaseContext(), planttest_5_Activity.class);
                intent4.putExtra("planttest_result1", planttest_result1);
                intent4.putExtra("planttest_result2", planttest_result2);
                intent4.putExtra("planttest_result3", planttest_result3);
                startActivity(intent4);
            }
        });

        planttest_4_an3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent3 = getIntent();
                Bundle bundle = intent3.getExtras();

                String planttest_result1 = bundle.getString("planttest_result1");
                String planttest_result2 = bundle.getString("planttest_result2");
                String planttest_result3 = bundle.getString("planttest_result3");

                Intent intent4 = new Intent(getBaseContext(), planttest_5_Activity.class);
                intent4.putExtra("planttest_result1", planttest_result1);
                intent4.putExtra("planttest_result2", planttest_result2);
                intent4.putExtra("planttest_result3", planttest_result3);
                startActivity(intent4);
            }
        });

    }
}