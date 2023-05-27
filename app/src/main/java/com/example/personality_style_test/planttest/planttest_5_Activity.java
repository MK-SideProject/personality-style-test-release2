package com.example.personality_style_test.planttest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;


public class planttest_5_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planttest5);

        Button planttest_5_an1 = (Button) findViewById(R.id.planttest_5_an1);
        Button planttest_5_an2 = (Button) findViewById(R.id.planttest_5_an2);
        Button planttest_5_an3 = (Button) findViewById(R.id.planttest_5_an3);

        planttest_5_an1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent4 = getIntent();
                Bundle bundle = intent4.getExtras();

                String planttest_result1 = bundle.getString("planttest_result1");
                String planttest_result2 = bundle.getString("planttest_result2");
                String planttest_result3 = bundle.getString("planttest_result3");

                if(planttest_result2!= null && planttest_result2.equals("result2") ){
                    Intent intent5 = new Intent(getBaseContext(), planttest_result2_Activity.class);
                    //Toast.makeText(getApplicationContext(), bankingtest_result1,Toast.LENGTH_SHORT).show();
                    startActivity(intent5);
                }
                else if(planttest_result3!= null && planttest_result3.equals("result3")){
                    Intent intent5 = new Intent(getBaseContext(), planttest_result3_Activity.class);
                    //Toast.makeText(getApplicationContext(), bankingtest_result1,Toast.LENGTH_SHORT).show();
                    startActivity(intent5);
                }
                else{
                    Intent intent5 = new Intent(getBaseContext(), planttest_result1_Activity.class);
                    //Toast.makeText(getApplicationContext(), bankingtest_result1,Toast.LENGTH_SHORT).show();
                    startActivity(intent5);

                }

            }
        });
        planttest_5_an2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent4 = getIntent();
                Bundle bundle = intent4.getExtras();

                String planttest_result1 = bundle.getString("planttest_result1");
                String planttest_result2 = "result2";
                String planttest_result3 = bundle.getString("planttest_result3");

                if(planttest_result2!= null && planttest_result2.equals("result2") ){
                    Intent intent5 = new Intent(getBaseContext(), planttest_result2_Activity.class);
                    //Toast.makeText(getApplicationContext(), bankingtest_result1,Toast.LENGTH_SHORT).show();
                    startActivity(intent5);
                }
                else if(planttest_result3!= null && planttest_result3.equals("result3")){
                    Intent intent5 = new Intent(getBaseContext(), planttest_result3_Activity.class);
                    //Toast.makeText(getApplicationContext(), bankingtest_result1,Toast.LENGTH_SHORT).show();
                    startActivity(intent5);
                }
                else{
                    Intent intent5 = new Intent(getBaseContext(), planttest_result1_Activity.class);
                    //Toast.makeText(getApplicationContext(), bankingtest_result1,Toast.LENGTH_SHORT).show();
                    startActivity(intent5);

                }
            }
        });
        planttest_5_an3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent4 = getIntent();
                Bundle bundle = intent4.getExtras();

                String planttest_result1 = bundle.getString("planttest_result1");
                String planttest_result2 = bundle.getString("planttest_result2");
                String planttest_result3 = bundle.getString("planttest_result3");

                if(planttest_result2!= null && planttest_result2.equals("result2") ){
                    Intent intent5 = new Intent(getBaseContext(), planttest_result2_Activity.class);
                    //Toast.makeText(getApplicationContext(), bankingtest_result1,Toast.LENGTH_SHORT).show();
                    startActivity(intent5);
                }
                else if(planttest_result3!= null && planttest_result3.equals("result3")){
                    Intent intent5 = new Intent(getBaseContext(), planttest_result3_Activity.class);
                    //Toast.makeText(getApplicationContext(), bankingtest_result1,Toast.LENGTH_SHORT).show();
                    startActivity(intent5);
                }
                else{
                    Intent intent5 = new Intent(getBaseContext(), planttest_result1_Activity.class);
                    //Toast.makeText(getApplicationContext(), bankingtest_result1,Toast.LENGTH_SHORT).show();
                    startActivity(intent5);

                }
            }
        });

    }
}