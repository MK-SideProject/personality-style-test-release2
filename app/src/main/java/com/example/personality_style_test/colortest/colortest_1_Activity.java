package com.example.personality_style_test.colortest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;


public class colortest_1_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colortest1);

        Button colortest_1_an1 = (Button) findViewById(R.id.colortest_1_an1);
        Button colortest_1_an2 = (Button) findViewById(R.id.colortest_1_an2);
        Button colortest_1_an3 = (Button) findViewById(R.id.colortest_1_an3);
        Button colortest_1_an4 = (Button) findViewById(R.id.colortest_1_an4);


        colortest_1_an1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String colortest_result5 = "result5";


                Intent intent = new Intent(getBaseContext(), colortest_2_Activity.class);
                intent.putExtra("colortest_result4", colortest_result5);

                startActivity(intent);
            }
        });
        colortest_1_an2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String colortest_result3 = "result3";
                //String colortest_result2 = "result2";

                Intent intent = new Intent(getBaseContext(), colortest_2_Activity.class);
                intent.putExtra("colortest_result3", colortest_result3);
                //intent.putExtra("colortest_result2", colortest_result2);

                startActivity(intent);
            }
        });
        colortest_1_an3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String colortest_result1 = "result1";



                Intent intent = new Intent(getBaseContext(), colortest_2_Activity.class);
                intent.putExtra("colortest_result1", colortest_result1);


                startActivity(intent);
            }
        });
        colortest_1_an4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //울트라 바이올렛
                String colortest_result4 = "result4";

                Intent intent = new Intent(getBaseContext(), colortest_2_Activity.class);
                intent.putExtra("colortest_result4", colortest_result4);

                startActivity(intent);
            }
        });
    }
}