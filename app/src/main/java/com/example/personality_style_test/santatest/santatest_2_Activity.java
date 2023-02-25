package com.example.personality_style_test.santatest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;


public class santatest_2_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_santatest2);

        Button santatest_2_an1 = (Button) findViewById(R.id.santatest_2_an1);
        Button santatest_2_an2 = (Button) findViewById(R.id.santatest_2_an2);

        santatest_2_an1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = getIntent();
                Bundle bundle = intent.getExtras();

                String santatest_result1 = bundle.getString("santatest_result1");
                String santatest_result2 ="result2";
                String santatest_result3 = bundle.getString("santatest_result3");
                String santatest_result4 = bundle.getString("santatest_result4");

                Intent intent2 = new Intent(getBaseContext(), santatest_3_Activity.class);
                intent2.putExtra("santatest_result1", santatest_result1);
                intent2.putExtra("santatest_result2", santatest_result2);
                intent2.putExtra("santatest_result3", santatest_result3);
                intent2.putExtra("santatest_result4", santatest_result4);

                startActivity(intent2);
            }
        });

        santatest_2_an2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = getIntent();
                Bundle bundle = intent.getExtras();

                String santatest_result1 = bundle.getString("santatest_result1");
                String santatest_result2 = bundle.getString("santatest_result2");
                String santatest_result3 = bundle.getString("santatest_result3");
                String santatest_result4 = bundle.getString("santatest_result4");

                Intent intent2 = new Intent(getBaseContext(), santatest_3_Activity.class);
                intent2.putExtra("santatest_result1", santatest_result1);
                intent2.putExtra("santatest_result2", santatest_result2);
                intent2.putExtra("santatest_result3", santatest_result3);
                intent2.putExtra("santatest_result4", santatest_result4);

                startActivity(intent2);
            }
        });

    }
}