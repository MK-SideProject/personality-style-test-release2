package com.example.personality_style_test.exercisetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;

public class exercisetest_5_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercisetest5);


        Button exercisetest_5_an1 = (Button) findViewById(R.id.exercisetest_5_an1);
        Button exercisetest_5_an2 = (Button) findViewById(R.id.exercisetest_5_an2);

        exercisetest_5_an1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //result 1= 홈트, 2 = 필라테스 , 3 = 헬스장, 4 = pt, 5=조깅

                Intent intent3 = getIntent();
                Bundle bundle = intent3.getExtras();

                String exercisetest_result1 = bundle.getString("exercisetest_result1");
                String exercisetest_result2 = bundle.getString("exercisetest_result2");
                String exercisetest_result3 = bundle.getString("exercisetest_result3");
                String exercisetest_result4 = bundle.getString("exercisetest_result4");
                String exercisetest_result5 = bundle.getString("exercisetest_result5");
                String diet =bundle.getString("diet");


                Intent intent4 = new Intent(getBaseContext(), exercisetest_6_Activity.class);
                intent4.putExtra("exercisetest_result1", exercisetest_result1);
                intent4.putExtra("exercisetest_result2", exercisetest_result2);
                intent4.putExtra("exercisetest_result3", exercisetest_result3);
                intent4.putExtra("exercisetest_result4", exercisetest_result4);
                intent4.putExtra("exercisetest_result5", exercisetest_result5);
                intent4.putExtra("diet", diet);
                startActivity(intent4);
            }
        });

        exercisetest_5_an2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //result 1= 홈트, 2 = 필라테스 , 3 = 헬스장, 4 = pt, 5=조깅

                Intent intent3 = getIntent();
                Bundle bundle = intent3.getExtras();

                String exercisetest_result1 = bundle.getString("exercisetest_result1");
                String exercisetest_result2 = "result2";
                String exercisetest_result3 = bundle.getString("exercisetest_result3");
                String exercisetest_result4 = "result4";
                String exercisetest_result5 = bundle.getString("exercisetest_result5");
                String diet =bundle.getString("diet");


                Intent intent4 = new Intent(getBaseContext(), exercisetest_6_Activity.class);
                intent4.putExtra("exercisetest_result1", exercisetest_result1);
                intent4.putExtra("exercisetest_result2", exercisetest_result2);
                intent4.putExtra("exercisetest_result3", exercisetest_result3);
                intent4.putExtra("exercisetest_result4", exercisetest_result4);
                intent4.putExtra("exercisetest_result5", exercisetest_result5);
                intent4.putExtra("diet", diet);
                startActivity(intent4);
            }
        });

    }
}