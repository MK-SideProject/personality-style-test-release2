package com.example.personality_style_test.exercisetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;

public class exercisetest_2_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercisetest2);

        Button exercisetest_2_an1 = (Button) findViewById(R.id.exercisetest_2_an1);
        Button exercisetest_2_an2 = (Button) findViewById(R.id.exercisetest_2_an2);
        Button exercisetest_2_an3 = (Button) findViewById(R.id.exercisetest_2_an3);

        exercisetest_2_an1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //result 1= 홈트, 2 = 필라테스 , 3 = 헬스장, 4 = pt, 5=조깅
                String exercisetest_result2 = "result2";
                String exercisetest_result3 = "result3";
                String exercisetest_result4 = "result4";

                Intent intent = new Intent(getBaseContext(), exercisetest_3_Activity.class);
                intent.putExtra("exercisetest_result2", exercisetest_result2);
                intent.putExtra("exercisetest_result3", exercisetest_result3);
                intent.putExtra("exercisetest_result4", exercisetest_result4);
                startActivity(intent);
            }
        });

        exercisetest_2_an2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //result 1= 홈트, 2 = 필라테스 , 3 = 헬스장, 4 = pt, 5=조깅
                String exercisetest_result1 = "result1";


                Intent intent = new Intent(getBaseContext(), exercisetest_3_Activity.class);
                intent.putExtra("exercisetest_result1", exercisetest_result1);
                startActivity(intent);
            }
        });
        exercisetest_2_an3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //result 1= 홈트, 2 = 필라테스 , 3 = 헬스장, 4 = pt, 5=조깅
                String exercisetest_result5 = "result5";


                Intent intent = new Intent(getBaseContext(), exercisetest_3_Activity.class);
                intent.putExtra("exercisetest_result5", exercisetest_result5);
                startActivity(intent);
            }
        });
    }
}