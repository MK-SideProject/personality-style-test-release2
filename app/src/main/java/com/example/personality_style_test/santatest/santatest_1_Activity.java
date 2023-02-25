package com.example.personality_style_test.santatest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;


public class santatest_1_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_santatest1);

        Button santatest_1_an1 = (Button) findViewById(R.id.santatest_1_an1);
        Button santatest_1_an2 = (Button) findViewById(R.id.santatest_1_an2);

        santatest_1_an1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                String santatest_result3 = "0";
                String santatest_result2 = "0";
                String santatest_result1 = "0";

                Intent intent = new Intent(getBaseContext(), santatest_2_Activity.class);
                intent.putExtra("santatest_result3", santatest_result3);
                intent.putExtra("santatest_result2", santatest_result2);
                intent.putExtra("santatest_result1", santatest_result1);
                startActivity(intent);
            }
        });

        santatest_1_an2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String santatest_result4 = "result4";

                Intent intent = new Intent(getBaseContext(), santatest_2_Activity.class);
                intent.putExtra("santatest_result4", santatest_result4);

                startActivity(intent);
            }
        });

    }
}