package com.example.personality_style_test.exercisetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;

public class exercisetest_4_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercisetest4);

        Button exercisetest_4_an1 = (Button) findViewById(R.id.exercisetest_4_an1);
        Button exercisetest_4_an2 = (Button) findViewById(R.id.exercisetest_4_an2);

        exercisetest_4_an1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //result 1= 홈트, 2 = 필라테스 , 3 = 헬스장, 4 = pt, 5=조깅

                Intent intent2 = getIntent();
                Bundle bundle = intent2.getExtras();

                String exercisetest_result1 = bundle.getString("exercisetest_result1");
                String exercisetest_result2 = bundle.getString("exercisetest_result2");
                String exercisetest_result3 = bundle.getString("exercisetest_result3");
                String exercisetest_result4 = bundle.getString("exercisetest_result4");
                String exercisetest_result5 = bundle.getString("exercisetest_result5");
                String diet =bundle.getString("diet");


                Intent intent3 = new Intent(getBaseContext(), exercisetest_5_Activity.class);
                intent3.putExtra("exercisetest_result1", exercisetest_result1);
                intent3.putExtra("exercisetest_result2", exercisetest_result2);
                intent3.putExtra("exercisetest_result3", exercisetest_result3);
                intent3.putExtra("exercisetest_result4", exercisetest_result4);
                intent3.putExtra("exercisetest_result5", exercisetest_result5);
                intent3.putExtra("diet", diet);
                startActivity(intent3);
            }
        });

        exercisetest_4_an2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //result 1= 홈트, 2 = 필라테스 , 3 = 헬스장, 4 = pt, 5=조깅

                Intent intent2 = getIntent();
                Bundle bundle = intent2.getExtras();

                String exercisetest_result1 = bundle.getString("exercisetest_result1");
                String exercisetest_result2 = bundle.getString("exercisetest_result2");
                String exercisetest_result3 = bundle.getString("exercisetest_result3");
                String exercisetest_result4 = bundle.getString("exercisetest_result4");
                String exercisetest_result5 = bundle.getString("exercisetest_result5");
                String diet =bundle.getString("diet");


                Intent intent3 = new Intent(getBaseContext(), exercisetest_5_Activity.class);
                intent3.putExtra("exercisetest_result1", exercisetest_result1);
                intent3.putExtra("exercisetest_result2", exercisetest_result2);
                intent3.putExtra("exercisetest_result3", exercisetest_result3);
                intent3.putExtra("exercisetest_result4", exercisetest_result4);
                intent3.putExtra("exercisetest_result5", exercisetest_result5);
                intent3.putExtra("diet", diet);
                startActivity(intent3);
            }
        });

    }
}