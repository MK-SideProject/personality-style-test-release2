package com.example.personality_style_test.colortest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;

public class colortest_5_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colortest5);

        Button colortest_5_an1 = (Button) findViewById(R.id.colortest_5_an1);
        Button colortest_5_an2 = (Button) findViewById(R.id.colortest_5_an2);
        Button colortest_5_an3 = (Button) findViewById(R.id.colortest_5_an3);

        colortest_5_an1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent4 = getIntent();
                Bundle bundle = intent4.getExtras();

                String colortest_result1 = bundle.getString("colortest_result1");
                String colortest_result2 = bundle.getString("colortest_result2");
                String colortest_result3 = bundle.getString("colortest_result3");
                String colortest_result4 = "result4";
                String colortest_result5 = bundle.getString("colortest_result5");

                Intent intent5 = new Intent(getBaseContext(), colortest_6_Activity.class);
                intent5.putExtra("colortest_result1", colortest_result1);
                intent5.putExtra("colortest_result2", colortest_result2);
                intent5.putExtra("colortest_result3", colortest_result3);
                intent5.putExtra("colortest_result4", colortest_result4);
                intent5.putExtra("colortest_result5", colortest_result5);
                startActivity(intent5);
            }
        });

        colortest_5_an2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent4 = getIntent();
                Bundle bundle = intent4.getExtras();

                String colortest_result1 = bundle.getString("colortest_result1");
                String colortest_result2 = bundle.getString("colortest_result2");
                String colortest_result3 = bundle.getString("colortest_result3");
                String colortest_result4 = bundle.getString("colortest_resul4");
                String colortest_result5 = bundle.getString("colortest_result5");

                Intent intent5 = new Intent(getBaseContext(), colortest_6_Activity.class);
                intent5.putExtra("colortest_result1", colortest_result1);
                intent5.putExtra("colortest_result2", colortest_result2);
                intent5.putExtra("colortest_result3", colortest_result3);
                intent5.putExtra("colortest_result4", colortest_result4);
                intent5.putExtra("colortest_result5", colortest_result5);
                startActivity(intent5);
            }
        });

        colortest_5_an3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent4 = getIntent();
                Bundle bundle = intent4.getExtras();

                String colortest_result1 = bundle.getString("colortest_result1");
                String colortest_result2 = bundle.getString("colortest_result2");
                String colortest_result3 = bundle.getString("colortest_result3");
                String colortest_result4 = bundle.getString("colortest_result4");
                String colortest_result5 = "result5";

                Intent intent5 = new Intent(getBaseContext(), colortest_6_Activity.class);
                intent5.putExtra("colortest_result1", colortest_result1);
                intent5.putExtra("colortest_result2", colortest_result2);
                intent5.putExtra("colortest_result3", colortest_result3);
                intent5.putExtra("colortest_result4", colortest_result4);
                intent5.putExtra("colortest_result5", colortest_result5);
                startActivity(intent5);
            }
        });

    }
}