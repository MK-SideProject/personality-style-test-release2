package com.example.personality_style_test.foodtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;

public class foodtest_9_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodtest9);

        Button foodtest_9_an1 = (Button) findViewById(R.id.foodtest_9_an1);
        Button foodtest_9_an2 = (Button) findViewById(R.id.foodtest_9_an2);


        foodtest_9_an1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent8 = getIntent();
                Bundle bundle = intent8.getExtras();

                int food_o = bundle.getInt("food_o");

                Intent intent9 = new Intent(getBaseContext(), foodtest_10_Activity.class);
                intent9.putExtra("food_o", food_o);

                startActivity(intent9);
            }
        });

        foodtest_9_an2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent8 = getIntent();
                Bundle bundle = intent8.getExtras();

                int food_o = bundle.getInt("food_o");

                food_o = food_o -1;
                Intent intent9 = new Intent(getBaseContext(), foodtest_10_Activity.class);
                intent9.putExtra("food_o", food_o);

                startActivity(intent9);
            }
        });
    }
}