package com.example.personality_style_test.foodtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;

public class foodtest_10_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodtest10);

        Button foodtest_10_an1 = (Button) findViewById(R.id.foodtest_10_an1);
        Button foodtest_10_an2 = (Button) findViewById(R.id.foodtest_10_an2);

        foodtest_10_an1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent9 = getIntent();
                Bundle bundle = intent9.getExtras();

                int food_o = bundle.getInt("food_o");

                Intent intent10 = new Intent(getBaseContext(), foodtest_11_Activity.class);
                intent10.putExtra("food_o", food_o);

                startActivity(intent10);
            }
        });

        foodtest_10_an2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent9 = getIntent();
                Bundle bundle = intent9.getExtras();

                int food_o = bundle.getInt("food_o");
                food_o = food_o -1;

                Intent intent10 = new Intent(getBaseContext(), foodtest_11_Activity.class);
                intent10.putExtra("food_o", food_o);

                startActivity(intent10);
            }
        });
    }
}