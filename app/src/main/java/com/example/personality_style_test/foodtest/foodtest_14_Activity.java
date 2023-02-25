package com.example.personality_style_test.foodtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;

public class foodtest_14_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodtest14);

        Button foodtest_14_an1 = (Button) findViewById(R.id.foodtest_14_an1);
        Button foodtest_14_an2 = (Button) findViewById(R.id.foodtest_14_an2);

        foodtest_14_an1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent13 = getIntent();
                Bundle bundle = intent13.getExtras();

                int food_o = bundle.getInt("food_o");

                Intent intent14 = new Intent(getBaseContext(), foodtest_15_Activity.class);
                intent14.putExtra("food_o", food_o);

                startActivity(intent14);
            }
        });

        foodtest_14_an2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent13 = getIntent();
                Bundle bundle = intent13.getExtras();

                int food_o = bundle.getInt("food_o");
                food_o = food_o -1;

                Intent intent14 = new Intent(getBaseContext(), foodtest_15_Activity.class);
                intent14.putExtra("food_o", food_o);

                startActivity(intent14);
            }
        });

    }
}