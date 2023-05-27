package com.example.personality_style_test.colortest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;

public class colortest_4_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colortest4);

        Button colortest_4_an1 = (Button) findViewById(R.id.colortest_4_an1);
        Button colortest_4_an2 = (Button) findViewById(R.id.colortest_4_an2);
        Button colortest_4_an3 = (Button) findViewById(R.id.colortest_4_an3);
        Button colortest_4_an4 = (Button) findViewById(R.id.colortest_4_an4);

        colortest_4_an1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent3 = getIntent();
                Bundle bundle = intent3.getExtras();

                String colortest_result1 = bundle.getString("colortest_result1");
                String colortest_result2 = bundle.getString("colortest_result2");
                String colortest_result3 = bundle.getString("colortest_result3");
                String colortest_result4 = bundle.getString("colortest_result4");
                String colortest_result5 = bundle.getString("colortest_result5");

                Intent intent4 = new Intent(getBaseContext(), colortest_5_Activity.class);
                intent4.putExtra("colortest_result1", colortest_result1);
                intent4.putExtra("colortest_result2", colortest_result2);
                intent4.putExtra("colortest_result3", colortest_result3);
                intent4.putExtra("colortest_result4", colortest_result4);
                intent4.putExtra("colortest_result5", colortest_result5);
                startActivity(intent4);
            }
        });

        colortest_4_an2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent3 = getIntent();
                Bundle bundle = intent3.getExtras();

                String colortest_result1 = bundle.getString("colortest_result1");
                String colortest_result2 = bundle.getString("colortest_result2");
                String colortest_result3 = bundle.getString("colortest_result3");
                String colortest_result4 = bundle.getString("colortest_result4");
                String colortest_result5 = bundle.getString("colortest_result5");

                Intent intent4 = new Intent(getBaseContext(), colortest_5_Activity.class);
                intent4.putExtra("colortest_result1", colortest_result1);
                intent4.putExtra("colortest_result2", colortest_result2);
                intent4.putExtra("colortest_result3", colortest_result3);
                intent4.putExtra("colortest_result4", colortest_result4);
                intent4.putExtra("colortest_result5", colortest_result5);
                startActivity(intent4);
            }
        });

        colortest_4_an3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent3 = getIntent();
                Bundle bundle = intent3.getExtras();

                String colortest_result1 = bundle.getString("colortest_result1");
                String colortest_result2 = "result2";
                String colortest_result3 = bundle.getString("colortest_result3");
                String colortest_result4 = bundle.getString("colortest_result4");
                String colortest_result5 = bundle.getString("colortest_result5");

                Intent intent4 = new Intent(getBaseContext(), colortest_5_Activity.class);
                intent4.putExtra("colortest_result1", colortest_result1);
                intent4.putExtra("colortest_result2", colortest_result2);
                intent4.putExtra("colortest_result3", colortest_result3);
                intent4.putExtra("colortest_result4", colortest_result4);
                intent4.putExtra("colortest_result5", colortest_result5);
                startActivity(intent4);
            }
        });

        colortest_4_an4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent3 = getIntent();
                Bundle bundle = intent3.getExtras();

                String colortest_result1 = bundle.getString("colortest_result1");
                String colortest_result2 = bundle.getString("colortest_result2");
                String colortest_result3 = bundle.getString("colortest_result3");
                String colortest_result4 = bundle.getString("colortest_result4");
                String colortest_result5 = bundle.getString("colortest_result5");

                Intent intent4 = new Intent(getBaseContext(), colortest_5_Activity.class);
                intent4.putExtra("colortest_result1", colortest_result1);
                intent4.putExtra("colortest_result2", colortest_result2);
                intent4.putExtra("colortest_result3", colortest_result3);
                intent4.putExtra("colortest_result4", colortest_result4);
                intent4.putExtra("colortest_result5", colortest_result5);
                startActivity(intent4);
            }
        });
    }
}