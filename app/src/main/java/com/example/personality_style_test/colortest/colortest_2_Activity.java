package com.example.personality_style_test.colortest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;

public class colortest_2_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colortest2);

        Button colortest_2_an1 = (Button) findViewById(R.id.colortest_2_an1);
        Button colortest_2_an2 = (Button) findViewById(R.id.colortest_2_an2);
        Button colortest_2_an3 = (Button) findViewById(R.id.colortest_2_an3);
        Button colortest_2_an4 = (Button) findViewById(R.id.colortest_2_an4);

        colortest_2_an1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = getIntent();
                Bundle bundle = intent.getExtras();

                String colortest_result1 = bundle.getString("colortest_result1");
                String colortest_result2 = bundle.getString("colortest_result2");
                String colortest_result3 = bundle.getString("colortest_result3");
                String colortest_result4 = bundle.getString("colortest_result4");
                String colortest_result5 = bundle.getString("colortest_result4");

                Intent intent2 = new Intent(getBaseContext(), colortest_3_Activity.class);
                intent2.putExtra("colortest_result1", colortest_result1);
                intent2.putExtra("colortest_result2", colortest_result2);
                intent2.putExtra("colortest_result3", colortest_result3);
                intent2.putExtra("colortest_result4", colortest_result4);
                intent2.putExtra("colortest_result5", colortest_result5);
                startActivity(intent2);
            }
        });

        colortest_2_an2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = getIntent();
                Bundle bundle = intent.getExtras();

                String colortest_result1 = bundle.getString("colortest_result1");
                String colortest_result2 = bundle.getString("colortest_result2");
                String colortest_result3 = bundle.getString("colortest_result3");
                String colortest_result4 = bundle.getString("colortest_result4");
                String colortest_result5 = bundle.getString("colortest_result4");

                Intent intent2 = new Intent(getBaseContext(), colortest_3_Activity.class);
                intent2.putExtra("colortest_result1", colortest_result1);
                intent2.putExtra("colortest_result2", colortest_result2);
                intent2.putExtra("colortest_result3", colortest_result3);
                intent2.putExtra("colortest_result4", colortest_result4);
                intent2.putExtra("colortest_result5", colortest_result5);
                startActivity(intent2);
            }

        });

        colortest_2_an3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = getIntent();
                Bundle bundle = intent.getExtras();

                String colortest_result1 = bundle.getString("colortest_result1");
                String colortest_result2 = bundle.getString("colortest_result2");
                String colortest_result3 = bundle.getString("colortest_result3");
                String colortest_result4 = bundle.getString("colortest_result4");
                String colortest_result5 = bundle.getString("colortest_result5");

                Intent intent2 = new Intent(getBaseContext(), colortest_3_Activity.class);
                intent2.putExtra("colortest_result1", colortest_result1);
                intent2.putExtra("colortest_result2", colortest_result2);
                intent2.putExtra("colortest_result3", colortest_result3);
                intent2.putExtra("colortest_result4", colortest_result4);
                intent2.putExtra("colortest_result5", colortest_result5);
                startActivity(intent2);
            }
        });

        colortest_2_an4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = getIntent();
                Bundle bundle = intent.getExtras();

                String colortest_result1 = bundle.getString("colortest_result1");
                String colortest_result2 = bundle.getString("colortest_result2");
                String colortest_result3 = bundle.getString("colortest_result3");
                String colortest_result4 = bundle.getString("colortest_result4");
                String colortest_result5 = "result5";

                Intent intent2 = new Intent(getBaseContext(), colortest_3_Activity.class);
                intent2.putExtra("colortest_result1", colortest_result1);
                intent2.putExtra("colortest_result2", colortest_result2);
                intent2.putExtra("colortest_result3", colortest_result3);
                intent2.putExtra("colortest_result4", colortest_result4);
                intent2.putExtra("colortest_result5", colortest_result5);
                startActivity(intent2);
            }
        });


    }
}