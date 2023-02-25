package com.example.personality_style_test.exercisetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;


public class exercisetest_6_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercisetest6);

        Button exercisetest_6_an1 = (Button) findViewById(R.id.exercisetest_6_an1);
        Button exercisetest_6_an2 = (Button) findViewById(R.id.exercisetest_6_an2);
        Button exercisetest_6_an3 = (Button) findViewById(R.id.exercisetest_6_an3);
        Button exercisetest_6_an4 = (Button) findViewById(R.id.exercisetest_6_an4);

        exercisetest_6_an1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //result 1= 홈트, 2 = 필라테스 , 3 = 헬스장, 4 = pt, 5=조깅

                Intent intent4 = getIntent();
                Bundle bundle = intent4.getExtras();

                String exercisetest_result1 = "result1";
                String exercisetest_result2 = bundle.getString("exercisetest_result2");
                String exercisetest_result3 = bundle.getString("exercisetest_result3");
                String exercisetest_result4 = bundle.getString("exercisetest_result4");
                String exercisetest_result5 = bundle.getString("exercisetest_result5");
                String diet =bundle.getString("diet");


                if(exercisetest_result1!= null && exercisetest_result1.equals("result1") ){
                    Intent intent5 = new Intent(getBaseContext(), exercisetest_result1_Activity.class);
                    startActivity(intent5);
                }
                else if((exercisetest_result4!= null && exercisetest_result4.equals("result4")) && ( diet !=null && diet.equals("diet")) ){
                    Intent intent5 = new Intent(getBaseContext(), exercisetest_result4_Activity.class);
                    startActivity(intent5);
                }
                else if(exercisetest_result2!= null && exercisetest_result2.equals("result2")){
                    Intent intent5 = new Intent(getBaseContext(), exercisetest_result2_Activity.class);
                    startActivity(intent5);

                }
                else if(exercisetest_result3!= null && exercisetest_result3.equals("result3")){
                    Intent intent5 = new Intent(getBaseContext(), exercisetest_result3_Activity.class);
                    startActivity(intent5);
                }
                else{
                    Intent intent5 = new Intent(getBaseContext(), exercisetest_result5_Activity.class);
                    startActivity(intent5);
                }


            }
        });

        exercisetest_6_an2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //result 1= 홈트, 2 = 필라테스 , 3 = 헬스장, 4 = pt, 5=조깅

                Intent intent4 = getIntent();
                Bundle bundle = intent4.getExtras();

                String exercisetest_result1 = bundle.getString("exercisetest_result1");
                String exercisetest_result2 = bundle.getString("exercisetest_result2");
                String exercisetest_result3 = "result3";
                String exercisetest_result4 = bundle.getString("exercisetest_result4");
                String exercisetest_result5 = bundle.getString("exercisetest_result5");
                String diet =bundle.getString("diet");


                if(exercisetest_result1!= null && exercisetest_result1.equals("result1") ){
                    Intent intent5 = new Intent(getBaseContext(), exercisetest_result1_Activity.class);
                    startActivity(intent5);
                }
                else if((exercisetest_result4!= null && exercisetest_result4.equals("result4")) && ( diet !=null && diet.equals("diet")) ){
                    Intent intent5 = new Intent(getBaseContext(), exercisetest_result4_Activity.class);
                    startActivity(intent5);
                }
                else if(exercisetest_result2!= null && exercisetest_result2.equals("result2")){
                    Intent intent5 = new Intent(getBaseContext(), exercisetest_result2_Activity.class);
                    startActivity(intent5);

                }
                else if(exercisetest_result3!= null && exercisetest_result3.equals("result3")){
                    Intent intent5 = new Intent(getBaseContext(), exercisetest_result3_Activity.class);
                    startActivity(intent5);
                }
                else{
                    Intent intent5 = new Intent(getBaseContext(), exercisetest_result5_Activity.class);
                    startActivity(intent5);
                }


            }
        });

        exercisetest_6_an3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //result 1= 홈트, 2 = 필라테스 , 3 = 헬스장, 4 = pt, 5=조깅

                Intent intent4 = getIntent();
                Bundle bundle = intent4.getExtras();

                String exercisetest_result1 = bundle.getString("exercisetest_result1");
                String exercisetest_result2 = "result2";
                String exercisetest_result3 = bundle.getString("exercisetest_result3");
                String exercisetest_result4 = "result4";
                String exercisetest_result5 = bundle.getString("exercisetest_result5");
                String diet =bundle.getString("diet");


                if(exercisetest_result1!= null && exercisetest_result1.equals("result1") ){
                    Intent intent5 = new Intent(getBaseContext(), exercisetest_result1_Activity.class);
                    startActivity(intent5);
                }
                else if((exercisetest_result4!= null && exercisetest_result4.equals("result4")) && ( diet !=null && diet.equals("diet")) ){
                    Intent intent5 = new Intent(getBaseContext(), exercisetest_result4_Activity.class);
                    startActivity(intent5);
                }
                else if(exercisetest_result2!= null && exercisetest_result2.equals("result2")){
                    Intent intent5 = new Intent(getBaseContext(), exercisetest_result2_Activity.class);
                    startActivity(intent5);

                }
                else if(exercisetest_result3!= null && exercisetest_result3.equals("result3")){
                    Intent intent5 = new Intent(getBaseContext(), exercisetest_result3_Activity.class);
                    startActivity(intent5);
                }
                else{
                    Intent intent5 = new Intent(getBaseContext(), exercisetest_result5_Activity.class);
                    startActivity(intent5);
                }


            }
        });
        exercisetest_6_an4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //result 1= 홈트, 2 = 필라테스 , 3 = 헬스장, 4 = pt, 5=조깅

                Intent intent4 = getIntent();
                Bundle bundle = intent4.getExtras();

                String exercisetest_result1 = bundle.getString("exercisetest_result1");
                String exercisetest_result2 = bundle.getString("exercisetest_result2");
                String exercisetest_result3 = bundle.getString("exercisetest_result3");
                String exercisetest_result4 = bundle.getString("exercisetest_result4");
                String exercisetest_result5 = bundle.getString("exercisetest_result5");
                String diet =bundle.getString("diet");


                if(exercisetest_result1!= null && exercisetest_result1.equals("result1") ){
                    Intent intent5 = new Intent(getBaseContext(), exercisetest_result1_Activity.class);
                    startActivity(intent5);
                }
                else if((exercisetest_result4!= null && exercisetest_result4.equals("result4")) && ( diet !=null && diet.equals("diet")) ){
                    Intent intent5 = new Intent(getBaseContext(), exercisetest_result4_Activity.class);
                    startActivity(intent5);
                }
                else if(exercisetest_result2!= null && exercisetest_result2.equals("result2")){
                    Intent intent5 = new Intent(getBaseContext(), exercisetest_result2_Activity.class);
                    startActivity(intent5);

                }
                else if(exercisetest_result3!= null && exercisetest_result3.equals("result3")){
                    Intent intent5 = new Intent(getBaseContext(), exercisetest_result3_Activity.class);
                    startActivity(intent5);
                }
                else{
                    Intent intent5 = new Intent(getBaseContext(), exercisetest_result5_Activity.class);
                    startActivity(intent5);
                }


            }
        });
    }
}