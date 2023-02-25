package com.example.personality_style_test.santatest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;

public class santatest_5_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_santatest5);

        Button santatest_5_an1 = (Button) findViewById(R.id.santatest_5_an1);
        Button santatest_5_an2 = (Button) findViewById(R.id.santatest_5_an2);

        santatest_5_an1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent4 = getIntent();
                Bundle bundle = intent4.getExtras();

                String santatest_result1 = bundle.getString("santatest_result1");
                String santatest_result2 = bundle.getString("santatest_result2");
                String santatest_result3 = bundle.getString("santatest_result3");
                String santatest_result4 = bundle.getString("santatest_result4");

                Intent intent5 = new Intent(getBaseContext(), santatest_6_Activity.class);
                intent5.putExtra("santatest_result1", santatest_result1);
                intent5.putExtra("santatest_result2", santatest_result2);
                intent5.putExtra("santatest_result3", santatest_result3);
                intent5.putExtra("santatest_result4", santatest_result4);

                startActivity(intent5);
            }
        });

        santatest_5_an2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent4 = getIntent();
                Bundle bundle = intent4.getExtras();

                String santatest_result1 = "result1";
                String santatest_result2 = bundle.getString("santatest_result2");
                String santatest_result3 = bundle.getString("santatest_result3");
                String santatest_result4 = bundle.getString("santatest_result4");

                Intent intent5 = new Intent(getBaseContext(), santatest_6_Activity.class);
                intent5.putExtra("santatest_result1", santatest_result1);
                intent5.putExtra("santatest_result2", santatest_result2);
                intent5.putExtra("santatest_result3", santatest_result3);
                intent5.putExtra("santatest_result4", santatest_result4);

                startActivity(intent5);
            }
        });

    }
}