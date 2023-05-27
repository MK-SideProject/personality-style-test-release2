package com.example.personality_style_test.foodtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;


public class foodtest_15_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodtest15);

        Button foodtest_15_an1 = (Button) findViewById(R.id.foodtest_15_an1);
        Button foodtest_15_an2 = (Button) findViewById(R.id.foodtest_15_an2);

        foodtest_15_an1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent14 = getIntent();
                Bundle bundle = intent14.getExtras();

                int food_o = bundle.getInt("food_o");

                if(food_o >= 10 ){
                    Intent intent15 = new Intent(getBaseContext(), foodtest_result3_Activity.class);
                    startActivity(intent15);
                }
                else if(food_o >= 4 && food_o <= 9){
                    Intent intent15 = new Intent(getBaseContext(), foodtest_result1_Activity.class);
                    startActivity(intent15);
                }
                else{
                    Intent intent15 = new Intent(getBaseContext(), foodtest_result2_Activity.class);
                    startActivity(intent15);

                }

            }
        });

        foodtest_15_an2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent14 = getIntent();
                Bundle bundle = intent14.getExtras();

                int food_o = bundle.getInt("food_o");
                food_o = food_o -1;

                if(food_o >= 10 ){
                    Intent intent15 = new Intent(getBaseContext(), foodtest_result3_Activity.class);
                    startActivity(intent15);
                }
                else if(food_o >= 4 && food_o <= 9){
                    Intent intent15 = new Intent(getBaseContext(), foodtest_result1_Activity.class);
                    startActivity(intent15);
                }
                else{
                    Intent intent15 = new Intent(getBaseContext(), foodtest_result2_Activity.class);
                    startActivity(intent15);

                }

            }
        });
    }
}