package com.example.personality_style_test.foodtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;

public class foodtest_3_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodtest3);

        Button foodtest_3_an1 = (Button) findViewById(R.id.foodtest_3_an1);
        Button foodtest_3_an2 = (Button) findViewById(R.id.foodtest_3_an2);

        foodtest_3_an1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                Intent intent2 = getIntent();
                Bundle bundle = intent2.getExtras();

                int food_o = bundle.getInt("food_o");

                Intent intent3 = new Intent(getBaseContext(), foodtest_4_Activity.class);
                intent3.putExtra("food_o", food_o);

                startActivity(intent3);
            }
        });

        foodtest_3_an2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                Intent intent2 = getIntent();
                Bundle bundle = intent2.getExtras();

                int food_o = bundle.getInt("food_o");
                food_o = food_o-1;

                Intent intent3 = new Intent(getBaseContext(), foodtest_4_Activity.class);
                intent3.putExtra("food_o", food_o);

                startActivity(intent3);
            }
        });
    }
}