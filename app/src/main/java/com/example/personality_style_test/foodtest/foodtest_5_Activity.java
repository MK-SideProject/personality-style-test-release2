package com.example.personality_style_test.foodtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;

public class foodtest_5_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodtest5);

        Button foodtest_5_an1 = (Button) findViewById(R.id.foodtest_5_an1);
        Button foodtest_5_an2 = (Button) findViewById(R.id.foodtest_5_an2);

        foodtest_5_an1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent4 = getIntent();
                Bundle bundle = intent4.getExtras();

                int food_o = bundle.getInt("food_o");

                Intent intent5 = new Intent(getBaseContext(), foodtest_6_Activity.class);
                intent5.putExtra("food_o", food_o);

                startActivity(intent5);
            }
        });

        foodtest_5_an2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent4 = getIntent();
                Bundle bundle = intent4.getExtras();

                int food_o = bundle.getInt("food_o");
                food_o = food_o -1;

                Intent intent5 = new Intent(getBaseContext(), foodtest_6_Activity.class);
                intent5.putExtra("food_o", food_o);

                startActivity(intent5);
            }
        });
    }
}