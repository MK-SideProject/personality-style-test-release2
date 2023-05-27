package com.example.personality_style_test.colortest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;

public class colortest_6_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colortest6);

        Button colortest_6_an1 = (Button) findViewById(R.id.colortest_6_an1);
        Button colortest_6_an2 = (Button) findViewById(R.id.colortest_6_an2);
        Button colortest_6_an3 = (Button) findViewById(R.id.colortest_6_an3);
        Button colortest_6_an4 = (Button) findViewById(R.id.colortest_6_an4);

        colortest_6_an1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent5 = getIntent();
                Bundle bundle = intent5.getExtras();

                String colortest_result1 = bundle.getString("colortest_result1");
                String colortest_result2 = bundle.getString("colortest_result2");
                String colortest_result3 = bundle.getString("colortest_result3");
                String colortest_result4 = bundle.getString("colortest_result4");
                String colortest_result5 = bundle.getString("colortest_result5");

                if(colortest_result4!= null && colortest_result4.equals("result4") ){
                    Intent intent6 = new Intent(getBaseContext(), colortest_result4_Activity.class);
                    //Toast.makeText(getApplicationContext(), bankingtest_result1,Toast.LENGTH_SHORT).show();
                    startActivity(intent6);
                }
                else if(colortest_result5!= null && colortest_result5.equals("result5")){
                    Intent intent6 = new Intent(getBaseContext(), colortest_result5_Activity.class);
                    //Toast.makeText(getApplicationContext(), bankingtest_result1,Toast.LENGTH_SHORT).show();
                    startActivity(intent6);
                }
                else if(colortest_result2!= null && colortest_result2.equals("result2")){
                    Intent intent6 = new Intent(getBaseContext(), colortest_result2_Activity.class);
                    //Toast.makeText(getApplicationContext(), bankingtest_result1,Toast.LENGTH_SHORT).show();
                    startActivity(intent6);

                }
                else if(colortest_result1!= null && colortest_result1.equals("result1")){
                    Intent intent6 = new Intent(getBaseContext(), colortest_result1_Activity.class);
                    //Toast.makeText(getApplicationContext(), bankingtest_result1,Toast.LENGTH_SHORT).show();
                    startActivity(intent6);
                }
                else{
                    Intent intent6 = new Intent(getBaseContext(), colortest_result3_Activity.class);
                    //Toast.makeText(getApplicationContext(), bankingtest_result1,Toast.LENGTH_SHORT).show();
                    startActivity(intent6);
                }



            }
        });

        colortest_6_an2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent5 = getIntent();
                Bundle bundle = intent5.getExtras();

                String colortest_result1 = bundle.getString("colortest_result1");
                String colortest_result2 = bundle.getString("colortest_result2");
                String colortest_result3 = bundle.getString("colortest_result3");
                String colortest_result4 = bundle.getString("colortest_result4");
                String colortest_result5 = bundle.getString("colortest_result5");

                if(colortest_result4!= null && colortest_result4.equals("result4") ){
                    Intent intent6 = new Intent(getBaseContext(), colortest_result4_Activity.class);
                    //Toast.makeText(getApplicationContext(), bankingtest_result1,Toast.LENGTH_SHORT).show();
                    startActivity(intent6);
                }
                else if(colortest_result5!= null && colortest_result5.equals("result5")){
                    Intent intent6 = new Intent(getBaseContext(), colortest_result5_Activity.class);
                    //Toast.makeText(getApplicationContext(), bankingtest_result1,Toast.LENGTH_SHORT).show();
                    startActivity(intent6);
                }
                else if(colortest_result2!= null && colortest_result2.equals("result2")){
                    Intent intent6 = new Intent(getBaseContext(), colortest_result2_Activity.class);
                    //Toast.makeText(getApplicationContext(), bankingtest_result1,Toast.LENGTH_SHORT).show();
                    startActivity(intent6);

                }
                else if(colortest_result1!= null && colortest_result1.equals("result1")){
                    Intent intent6 = new Intent(getBaseContext(), colortest_result1_Activity.class);
                    //Toast.makeText(getApplicationContext(), bankingtest_result1,Toast.LENGTH_SHORT).show();
                    startActivity(intent6);
                }
                else{
                    Intent intent6 = new Intent(getBaseContext(), colortest_result3_Activity.class);
                    //Toast.makeText(getApplicationContext(), bankingtest_result1,Toast.LENGTH_SHORT).show();
                    startActivity(intent6);
                }
            }
        });

        colortest_6_an3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent5 = getIntent();
                Bundle bundle = intent5.getExtras();

                String colortest_result1 = "result1";
                String colortest_result2 = bundle.getString("colortest_result2");
                String colortest_result3 = bundle.getString("colortest_result3");
                String colortest_result4 = bundle.getString("colortest_result4");
                String colortest_result5 = bundle.getString("colortest_result5");

                if(colortest_result4!= null && colortest_result4.equals("result4") ){
                    Intent intent6 = new Intent(getBaseContext(), colortest_result4_Activity.class);
                    //Toast.makeText(getApplicationContext(), bankingtest_result1,Toast.LENGTH_SHORT).show();
                    startActivity(intent6);
                }
                else if(colortest_result5!= null && colortest_result5.equals("result5")){
                    Intent intent6 = new Intent(getBaseContext(), colortest_result5_Activity.class);
                    //Toast.makeText(getApplicationContext(), bankingtest_result1,Toast.LENGTH_SHORT).show();
                    startActivity(intent6);
                }
                else if(colortest_result2!= null && colortest_result2.equals("result2")){
                    Intent intent6 = new Intent(getBaseContext(), colortest_result2_Activity.class);
                    //Toast.makeText(getApplicationContext(), bankingtest_result1,Toast.LENGTH_SHORT).show();
                    startActivity(intent6);

                }
                else if(colortest_result1!= null && colortest_result1.equals("result1")){
                    Intent intent6 = new Intent(getBaseContext(), colortest_result1_Activity.class);
                    //Toast.makeText(getApplicationContext(), bankingtest_result1,Toast.LENGTH_SHORT).show();
                    startActivity(intent6);
                }
                else{
                    Intent intent6 = new Intent(getBaseContext(), colortest_result3_Activity.class);
                    //Toast.makeText(getApplicationContext(), bankingtest_result1,Toast.LENGTH_SHORT).show();
                    startActivity(intent6);
                }
            }
        });

        colortest_6_an4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent5 = getIntent();
                Bundle bundle = intent5.getExtras();

                String colortest_result1 = bundle.getString("colortest_result1");
                String colortest_result2 = bundle.getString("colortest_result2");
                String colortest_result3 = bundle.getString("colortest_result3");
                String colortest_result4 = bundle.getString("colortest_result4");
                String colortest_result5 = bundle.getString("colortest_result5");

                if(colortest_result4!= null && colortest_result4.equals("result4") ){
                    Intent intent6 = new Intent(getBaseContext(), colortest_result4_Activity.class);
                    //Toast.makeText(getApplicationContext(), bankingtest_result1,Toast.LENGTH_SHORT).show();
                    startActivity(intent6);
                }
                else if(colortest_result5!= null && colortest_result5.equals("result5")){
                    Intent intent6 = new Intent(getBaseContext(), colortest_result5_Activity.class);
                    //Toast.makeText(getApplicationContext(), bankingtest_result1,Toast.LENGTH_SHORT).show();
                    startActivity(intent6);
                }
                else if(colortest_result2!= null && colortest_result2.equals("result2")){
                    Intent intent6 = new Intent(getBaseContext(), colortest_result2_Activity.class);
                    //Toast.makeText(getApplicationContext(), bankingtest_result1,Toast.LENGTH_SHORT).show();
                    startActivity(intent6);

                }
                else if(colortest_result1!= null && colortest_result1.equals("result1")){
                    Intent intent6 = new Intent(getBaseContext(), colortest_result1_Activity.class);
                    //Toast.makeText(getApplicationContext(), bankingtest_result1,Toast.LENGTH_SHORT).show();
                    startActivity(intent6);
                }
                else{
                    Intent intent6 = new Intent(getBaseContext(), colortest_result3_Activity.class);
                    //Toast.makeText(getApplicationContext(), bankingtest_result1,Toast.LENGTH_SHORT).show();
                    startActivity(intent6);
                }
            }
        });
    }
}