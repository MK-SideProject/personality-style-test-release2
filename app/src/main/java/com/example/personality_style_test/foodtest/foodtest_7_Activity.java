package com.example.personality_style_test.foodtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;

public class foodtest_7_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodtest7);

        Button foodtest_7_an1 = (Button) findViewById(R.id.foodtest_7_an1);
        Button foodtest_7_an2 = (Button) findViewById(R.id.foodtest_7_an2);

        foodtest_7_an1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent6 = getIntent();
                Bundle bundle = intent6.getExtras();

                int food_o = bundle.getInt("food_o");

                Intent intent7 = new Intent(getBaseContext(), foodtest_8_Activity.class);
                intent7.putExtra("food_o", food_o);

                startActivity(intent7);
            }
        });

        foodtest_7_an2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent6 = getIntent();
                Bundle bundle = intent6.getExtras();

                int food_o = bundle.getInt("food_o");
                food_o = food_o -1;
                Intent intent7 = new Intent(getBaseContext(), foodtest_8_Activity.class);
                intent7.putExtra("food_o", food_o);

                startActivity(intent7);
            }
        });
    }
}