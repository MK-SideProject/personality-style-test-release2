package com.example.personality_style_test.foodtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;

public class foodtest_11_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodtest11);

        Button foodtest_11_an1 = (Button) findViewById(R.id.foodtest_11_an1);
        Button foodtest_11_an2 = (Button) findViewById(R.id.foodtest_11_an2);


        foodtest_11_an1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent10 = getIntent();
                Bundle bundle = intent10.getExtras();

                int food_o = bundle.getInt("food_o");

                Intent intent11 = new Intent(getBaseContext(), foodtest_12_Activity.class);
                intent11.putExtra("food_o", food_o);

                startActivity(intent11);
            }
        });

        foodtest_11_an2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent10 = getIntent();
                Bundle bundle = intent10.getExtras();

                int food_o = bundle.getInt("food_o");
                food_o = food_o -1;

                Intent intent11 = new Intent(getBaseContext(), foodtest_12_Activity.class);
                intent11.putExtra("food_o", food_o);

                startActivity(intent11);
            }
        });
    }
}