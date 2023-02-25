package com.example.personality_style_test.exercisetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;


public class exercisetest_1_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercisetest1);

        Button exercisetest_1_an1 = (Button) findViewById(R.id.exercisetest_1_an1);
        Button exercisetest_1_an2 = (Button) findViewById(R.id.exercisetest_1_an2);
        Button exercisetest_1_an3 = (Button) findViewById(R.id.exercisetest_1_an3);

        exercisetest_1_an1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(getBaseContext(), exercisetest_2_Activity.class);

                startActivity(intent);
            }
        });

        exercisetest_1_an2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(getBaseContext(), exercisetest_2_Activity.class);

                startActivity(intent);
            }
        });

        exercisetest_1_an3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(getBaseContext(), exercisetest_2_Activity.class);

                startActivity(intent);
            }
        });
    }
}