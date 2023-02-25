package com.example.personality_style_test.caketest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;


public class caketest_7_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caketest7);

        Button caketest_7_an1 = (Button) findViewById(R.id.caketest_7_an1);
        Button caketest_7_an2 = (Button) findViewById(R.id.caketest_7_an2);


        caketest_7_an1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent6 = getIntent();
                Bundle bundle = intent6.getExtras();

                String caketest_result1 = bundle.getString("caketest_result1");
                String caketest_result2 = bundle.getString("caketest_result2");
                String caketest_result3 = bundle.getString("caketest_result3");
                String caketest_result4 = bundle.getString("caketest_result4");


                if(caketest_result4!= null && caketest_result4.equals("result4") ){
                    Intent intent7 = new Intent(getBaseContext(), caketest_result4_Activity.class);
                    //Toast.makeText(getApplicationContext(), bankingtest_result1,Toast.LENGTH_SHORT).show();
                    startActivity(intent7);
                }
                else if(caketest_result1 != null && caketest_result1.equals("result1")){
                    Intent intent7 = new Intent(getBaseContext(), caketest_result1_Activity.class);
                    //Toast.makeText(getApplicationContext(), bankingtest_result1,Toast.LENGTH_SHORT).show();
                    startActivity(intent7);
                }
                else if(caketest_result3 !=null && caketest_result3.equals("result3")){
                    Intent intent7 = new Intent(getBaseContext(), caketest_result3_Activity.class);
                    //Toast.makeText(getApplicationContext(), bankingtest_result1,Toast.LENGTH_SHORT).show();
                    startActivity(intent7);

                }
                else{
                    Intent intent7 = new Intent(getBaseContext(), caketest_result2_Activity.class);
                    //Toast.makeText(getApplicationContext(), bankingtest_result1,Toast.LENGTH_SHORT).show();
                    startActivity(intent7);
                }


            }
        });

        caketest_7_an2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent6 = getIntent();
                Bundle bundle = intent6.getExtras();

                String caketest_result1 = bundle.getString("caketest_result1");
                String caketest_result2 = bundle.getString("caketest_result2");
                String caketest_result3 = bundle.getString("caketest_result3");
                String caketest_result4 = bundle.getString("ckaetest_result4");

                if(caketest_result4!= null && caketest_result4.equals("result4") ){
                    Intent intent7 = new Intent(getBaseContext(), caketest_result4_Activity.class);
                    //Toast.makeText(getApplicationContext(), bankingtest_result1,Toast.LENGTH_SHORT).show();
                    startActivity(intent7);
                }
                else if(caketest_result1!= null && caketest_result1.equals("result1")){
                    Intent intent7 = new Intent(getBaseContext(), caketest_result1_Activity.class);
                    //Toast.makeText(getApplicationContext(), bankingtest_result1,Toast.LENGTH_SHORT).show();
                    startActivity(intent7);
                }
                else if(caketest_result3 !=null && caketest_result3.equals("result3")){
                    Intent intent7 = new Intent(getBaseContext(), caketest_result3_Activity.class);
                    //Toast.makeText(getApplicationContext(), bankingtest_result1,Toast.LENGTH_SHORT).show();
                    startActivity(intent7);

                }
                else{
                    Intent intent7 = new Intent(getBaseContext(), caketest_result2_Activity.class);
                    //Toast.makeText(getApplicationContext(), bankingtest_result1,Toast.LENGTH_SHORT).show();
                    startActivity(intent7);
                }


            }
        });

    }
}