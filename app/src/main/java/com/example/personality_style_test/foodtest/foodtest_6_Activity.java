package com.example.personality_style_test.foodtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;

public class foodtest_6_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodtest6);

        Button foodtest_6_an1 = (Button) findViewById(R.id.foodtest_6_an1);
        Button foodtest_6_an2 = (Button) findViewById(R.id.foodtest_6_an2);

        foodtest_6_an1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent5 = getIntent();
                Bundle bundle = intent5.getExtras();

                int food_o = bundle.getInt("food_o");

                Intent intent6 = new Intent(getBaseContext(), foodtest_7_Activity.class);
                intent6.putExtra("food_o", food_o);

                startActivity(intent6);
            }
        });

        foodtest_6_an2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent5 = getIntent();
                Bundle bundle = intent5.getExtras();

                int food_o = bundle.getInt("food_o");
                food_o = food_o -1;

                Intent intent6 = new Intent(getBaseContext(), foodtest_7_Activity.class);
                intent6.putExtra("food_o", food_o);

                startActivity(intent6);
            }
        });
    }
}