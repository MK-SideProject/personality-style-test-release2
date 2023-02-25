package com.example.personality_style_test.exercisetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;

public class exercisetest_3_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercisetest3);

        Button exercisetest_3_an1 = (Button) findViewById(R.id.exercisetest_3_an1);
        Button exercisetest_3_an2 = (Button) findViewById(R.id.exercisetest_3_an2);
        Button exercisetest_3_an3 = (Button) findViewById(R.id.exercisetest_3_an3);

        exercisetest_3_an1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //result 1= 홈트, 2 = 필라테스 , 3 = 헬스장, 4 = pt, 5=조깅

                Intent intent = getIntent();
                Bundle bundle = intent.getExtras();

                String exercisetest_result1 = bundle.getString("exercisetest_result1");
                String exercisetest_result2 = bundle.getString("exercisetest_result2");
                String exercisetest_result3 = bundle.getString("exercisetest_result3");
                String exercisetest_result4 = bundle.getString("exercisetest_result4");
                String exercisetest_result5 = bundle.getString("exercisetest_result5");
                String diet ="diet";


                Intent intent2 = new Intent(getBaseContext(), exercisetest_4_Activity.class);
                intent2.putExtra("exercisetest_result1", exercisetest_result1);
                intent2.putExtra("exercisetest_result2", exercisetest_result2);
                intent2.putExtra("exercisetest_result3", exercisetest_result3);
                intent2.putExtra("exercisetest_result4", exercisetest_result4);
                intent2.putExtra("exercisetest_result5", exercisetest_result5);
                intent2.putExtra("diet", diet);
                startActivity(intent2);
            }
        });

        exercisetest_3_an2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //result 1= 홈트, 2 = 필라테스 , 3 = 헬스장, 4 = pt, 5=조깅

                Intent intent = getIntent();
                Bundle bundle = intent.getExtras();

                String exercisetest_result1 = bundle.getString("exercisetest_result1");
                String exercisetest_result2 = bundle.getString("exercisetest_result2");
                String exercisetest_result3 = bundle.getString("exercisetest_result3");
                String exercisetest_result4 = bundle.getString("exercisetest_result4");
                String exercisetest_result5 = bundle.getString("exercisetest_result5");
                String diet ="diet";


                Intent intent2 = new Intent(getBaseContext(), exercisetest_4_Activity.class);
                intent2.putExtra("exercisetest_result1", exercisetest_result1);
                intent2.putExtra("exercisetest_result2", exercisetest_result2);
                intent2.putExtra("exercisetest_result3", exercisetest_result3);
                intent2.putExtra("exercisetest_result4", exercisetest_result4);
                intent2.putExtra("exercisetest_result5", exercisetest_result5);
                intent2.putExtra("diet", diet);
                startActivity(intent2);
            }
        });

        exercisetest_3_an3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //result 1= 홈트, 2 = 필라테스 , 3 = 헬스장, 4 = pt, 5=조깅

                Intent intent = getIntent();
                Bundle bundle = intent.getExtras();

                String exercisetest_result1 = bundle.getString("exercisetest_result1");
                String exercisetest_result2 = "result2";
                String exercisetest_result3 = bundle.getString("exercisetest_result3");
                String exercisetest_result4 = bundle.getString("exercisetest_result4");
                String exercisetest_result5 = bundle.getString("exercisetest_result5");


                Intent intent2 = new Intent(getBaseContext(), exercisetest_4_Activity.class);
                intent2.putExtra("exercisetest_result1", exercisetest_result1);
                intent2.putExtra("exercisetest_result2", exercisetest_result2);
                intent2.putExtra("exercisetest_result3", exercisetest_result3);
                intent2.putExtra("exercisetest_result4", exercisetest_result4);
                intent2.putExtra("exercisetest_result5", exercisetest_result5);
                startActivity(intent2);
            }
        });
    }
}