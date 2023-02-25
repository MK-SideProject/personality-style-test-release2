package com.example.personality_style_test.bankingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import com.example.personality_style_test.R;

public class bankingtest_6_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bankingtest6);

        Button bankingtest_6_an1 = (Button) findViewById(R.id.bankingtest_6_an1);
        Button bankingtest_6_an2 = (Button) findViewById(R.id.bankingtest_6_an2);
        Button bankingtest_6_an3 = (Button) findViewById(R.id.bankingtest_6_an3);

        bankingtest_6_an1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent5 = getIntent();
                Bundle bundle = intent5.getExtras();

                String bankingtest_result1 = bundle.getString("bankingtest_result1");
                String bankingtest_result2 = bundle.getString("bankingtest_result2");
                String bankingtest_result3 = bundle.getString("bankingtest_result3");

                if(bankingtest_result3!= null && bankingtest_result3.equals("result3") ){
                    Intent intent6 = new Intent(getBaseContext(), bankingtest_result3_Activity.class);
                    //Toast.makeText(getApplicationContext(), bankingtest_result1,Toast.LENGTH_SHORT).show();
                    startActivity(intent6);
                }
                else if(bankingtest_result1!= null && bankingtest_result1.equals("result1")){
                    Intent intent6 = new Intent(getBaseContext(), bankingtest_result1_Activity.class);
                    //Toast.makeText(getApplicationContext(), bankingtest_result1,Toast.LENGTH_SHORT).show();
                    startActivity(intent6);
                }
                else{
                    Intent intent6 = new Intent(getBaseContext(), bankingtest_result2_Activity.class);
                    //Toast.makeText(getApplicationContext(), bankingtest_result1,Toast.LENGTH_SHORT).show();
                    startActivity(intent6);

                }


            }
        });

        bankingtest_6_an2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent5 = getIntent();
                Bundle bundle = intent5.getExtras();

                String bankingtest_result1 = bundle.getString("bankingtest_result1");
                String bankingtest_result2 = bundle.getString("bankingtest_result2");
                String bankingtest_result3 = bundle.getString("bankingtest_result3");

                if(bankingtest_result3!= null && bankingtest_result3.equals("result3") ){
                    Intent intent6 = new Intent(getBaseContext(), bankingtest_result3_Activity.class);
                    //Toast.makeText(getApplicationContext(), bankingtest_result1,Toast.LENGTH_SHORT).show();
                    startActivity(intent6);
                }
                else if(bankingtest_result1!= null && bankingtest_result1.equals("result1")){
                    Intent intent6 = new Intent(getBaseContext(), bankingtest_result1_Activity.class);
                    //Toast.makeText(getApplicationContext(), bankingtest_result1,Toast.LENGTH_SHORT).show();
                    startActivity(intent6);
                }
                else{
                    Intent intent6 = new Intent(getBaseContext(), bankingtest_result2_Activity.class);
                    //Toast.makeText(getApplicationContext(), bankingtest_result1,Toast.LENGTH_SHORT).show();
                    startActivity(intent6);

                }
             }
        });

        bankingtest_6_an3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                Intent intent5 = getIntent();
//                Bundle bundle = intent5.getExtras();

//                String bankingtest_result1 = bundle.getString("bankingtest_result1");
//                String bankingtest_result2 = bundle.getString("bankingtest_result2");
//                String bankingtest_result3 = "result3";

                Intent intent6 = new Intent(getBaseContext(), bankingtest_result3_Activity.class);
                //Toast.makeText(getApplicationContext(), bankingtest_result1,Toast.LENGTH_SHORT).show();
                startActivity(intent6);
            }
        });
    }
}