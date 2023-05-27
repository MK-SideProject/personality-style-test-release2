package com.example.personality_style_test.foodtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;

public class foodtest_8_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodtest8);

        Button foodtest_8_an1 = (Button) findViewById(R.id.foodtest_8_an1);
        Button foodtest_8_an2 = (Button) findViewById(R.id.foodtest_8_an2);

        foodtest_8_an1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent7 = getIntent();
                Bundle bundle = intent7.getExtras();

                int food_o = bundle.getInt("food_o");

                Intent intent8 = new Intent(getBaseContext(), foodtest_9_Activity.class);
                intent8.putExtra("food_o", food_o);

                startActivity(intent8);
            }
        });

        foodtest_8_an2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent7 = getIntent();
                Bundle bundle = intent7.getExtras();

                int food_o = bundle.getInt("food_o");
                food_o = food_o -1;
                Intent intent8 = new Intent(getBaseContext(), foodtest_9_Activity.class);
                intent8.putExtra("food_o", food_o);

                startActivity(intent8);
            }
        });
    }
}