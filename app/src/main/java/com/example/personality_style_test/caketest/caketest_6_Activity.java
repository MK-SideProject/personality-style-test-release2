package com.example.personality_style_test.caketest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;

public class caketest_6_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caketest6);

        Button caketest_6_an1 = (Button) findViewById(R.id.caketest_6_an1);
        Button caketest_6_an2 = (Button) findViewById(R.id.caketest_6_an2);



        caketest_6_an1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent5 = getIntent();
                Bundle bundle = intent5.getExtras();

                String caketest_result1 = bundle.getString("caketest_result1");
                String caketest_result2 = bundle.getString("caketest_result2");
                String caketest_result3 = bundle.getString("caketest_result3");
                String caketest_result4 = bundle.getString("caketest_result4");

                Intent intent6 = new Intent(getBaseContext(), caketest_7_Activity.class);
                intent6.putExtra("caketest_result1", caketest_result1);
                intent6.putExtra("caketest_result2", caketest_result2);
                intent6.putExtra("caketest_result3", caketest_result3);
                intent6.putExtra("caketest_result4", caketest_result4);

                startActivity(intent6);
            }
        });

        caketest_6_an2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent5 = getIntent();
                Bundle bundle = intent5.getExtras();

                String caketest_result1 = bundle.getString("caketest_result1");
                String caketest_result2 = bundle.getString("caketest_result2");
                String caketest_result3 = bundle.getString("caketest_result3");
                String caketest_result4 = bundle.getString("caketest_result4");

                Intent intent6 = new Intent(getBaseContext(), caketest_7_Activity.class);
                intent6.putExtra("caketest_result1", caketest_result1);
                intent6.putExtra("caketest_result2", caketest_result2);
                intent6.putExtra("caketest_result3", caketest_result3);
                intent6.putExtra("caketest_result4", caketest_result4);

                startActivity(intent6);
            }
        });
    }
}