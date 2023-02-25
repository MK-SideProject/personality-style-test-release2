package com.example.personality_style_test.triptest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;


public class triptest_1_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triptest1);

        Button triptest_1_an1 = (Button) findViewById(R.id.triptest_1_an1);
        Button triptest_1_an2 = (Button) findViewById(R.id.triptest_1_an2);
        Button triptest_1_an3 = (Button) findViewById(R.id.triptest_1_an3);

        triptest_1_an1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

                String alone_x = "alone_x";

                Intent intent = new Intent(getBaseContext(), triptest_2_Activity.class);
                intent.putExtra("alone_x", alone_x);
                startActivity(intent);
            }
        });

        triptest_1_an2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

                String alone_x = "alone_x";

                Intent intent = new Intent(getBaseContext(), triptest_2_Activity.class);
                intent.putExtra("alone_x", alone_x);
                startActivity(intent);
            }
        });

        triptest_1_an3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

                String alone_o = "alone_o";

                Intent intent = new Intent(getBaseContext(), triptest_2_Activity.class);
                intent.putExtra("alone_o", alone_o);
                startActivity(intent);
            }
        });

    }
}