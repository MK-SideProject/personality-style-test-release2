package com.example.personality_style_test.santatest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;

public class santatest_6_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_santatest6);

        Button santatest_6_an1 = (Button) findViewById(R.id.santatest_6_an1);
        Button santatest_6_an2 = (Button) findViewById(R.id.santatest_6_an2);
        Button santatest_6_an3 = (Button) findViewById(R.id.santatest_6_an3);

        santatest_6_an1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent5 = getIntent();
                Bundle bundle = intent5.getExtras();

                String santatest_result1 = bundle.getString("santatest_result1");
                String santatest_result2 = bundle.getString("santatest_result2");
                String santatest_result3 = bundle.getString("santatest_result3");
                String santatest_result4 = bundle.getString("santatest_result4");

                if (santatest_result4!=null && santatest_result4.equals("result4")) {
                    Intent intent6 = new Intent(getBaseContext(), santatest_result4_Activity.class);
                    startActivity(intent6);
                }
                else if (santatest_result2 != null && santatest_result2.equals("result2")) {
                    Intent intent6 = new Intent(getBaseContext(), santatest_result2_Activity.class);
                    startActivity(intent6);
                }
                else if (santatest_result1 != null && santatest_result1.equals("result1")) {
                    Intent intent6 = new Intent(getBaseContext(), santatest_result1_Activity.class);
                    startActivity(intent6);
                }
                else {
                    Intent intent6 = new Intent(getBaseContext(), santatest_result3_Activity.class);
                    startActivity(intent6);
                }
            }
        });

        santatest_6_an2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent5 = getIntent();
                Bundle bundle = intent5.getExtras();

                String santatest_result1 = bundle.getString("santatest_result1");
                String santatest_result2 = bundle.getString("santatest_result2");
                String santatest_result3 = bundle.getString("santatest_result3");
                String santatest_result4 = bundle.getString("santatest_result4");

                if (santatest_result4!=null && santatest_result4.equals("result4")) {
                    Intent intent6 = new Intent(getBaseContext(), santatest_result4_Activity.class);
                    startActivity(intent6);
                }
                else if (santatest_result2 != null && santatest_result2.equals("result2")) {
                    Intent intent6 = new Intent(getBaseContext(), santatest_result2_Activity.class);
                    startActivity(intent6);
                }
                else if (santatest_result1 != null && santatest_result1.equals("result1")) {
                    Intent intent6 = new Intent(getBaseContext(), santatest_result1_Activity.class);
                    startActivity(intent6);
                }
                else {
                    Intent intent6 = new Intent(getBaseContext(), santatest_result3_Activity.class);
                    startActivity(intent6);
                }
            }
        });

        santatest_6_an3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent5 = getIntent();
                Bundle bundle = intent5.getExtras();

                String santatest_result1 = bundle.getString("santatest_result1");
                String santatest_result2 = bundle.getString("santatest_result2");
                String santatest_result3 = bundle.getString("santatest_result3");
                String santatest_result4 = bundle.getString("santatest_result4");

                if (santatest_result4!=null && santatest_result4.equals("result4")) {
                    Intent intent6 = new Intent(getBaseContext(), santatest_result4_Activity.class);
                    startActivity(intent6);
                }
                else if (santatest_result2 != null && santatest_result2.equals("result2")) {
                    Intent intent6 = new Intent(getBaseContext(), santatest_result2_Activity.class);
                    startActivity(intent6);
                }
                else if (santatest_result1 != null && santatest_result1.equals("result1")) {
                    Intent intent6 = new Intent(getBaseContext(), santatest_result1_Activity.class);
                    startActivity(intent6);
                }
                else {
                    Intent intent6 = new Intent(getBaseContext(), santatest_result3_Activity.class);
                    startActivity(intent6);
                }
            }
        });

    }
}