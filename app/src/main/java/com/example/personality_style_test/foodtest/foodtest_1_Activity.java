package com.example.personality_style_test.foodtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;


public class foodtest_1_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodtest1);

        Button foodtest_1_an1 = (Button) findViewById(R.id.foodtest_1_an1);
        Button foodtest_1_an2 = (Button) findViewById(R.id.foodtest_1_an2);

        foodtest_1_an1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                int food_o = 15;

                Intent intent = new Intent(getBaseContext(), foodtest_2_Activity.class);
                intent.putExtra("food_o", food_o);

                startActivity(intent);
            }
        });

        foodtest_1_an2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                int food_o = 15;
                food_o = food_o - 1;

                Intent intent = new Intent(getBaseContext(), foodtest_2_Activity.class);
                intent.putExtra("food_o", food_o);
                startActivity(intent);
            }
        });
    }
}