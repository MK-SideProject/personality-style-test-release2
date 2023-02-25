package com.example.personality_style_test.triptest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;

public class triptest_2_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triptest2);

        Button triptest_2_an1 = (Button) findViewById(R.id.triptest_2_an1);
        Button triptest_2_an2 = (Button) findViewById(R.id.triptest_2_an2);
        Button triptest_2_an3 = (Button) findViewById(R.id.triptest_2_an3);

        triptest_2_an1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {


                Intent intent = getIntent();
                Bundle bundle = intent.getExtras();

                String alone_x = bundle.getString("alone_x");
                String alone_o = bundle.getString("alone_o");

                Intent intent2 = new Intent(getBaseContext(), triptest_3_Activity.class);
                intent2.putExtra("alone_x", alone_x);
                intent2.putExtra("alone_o", alone_o);
                startActivity(intent2);
            }
        });

        triptest_2_an2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {


                Intent intent = getIntent();
                Bundle bundle = intent.getExtras();

                String alone_x = bundle.getString("alone_x");
                String alone_o = bundle.getString("alone_o");

                Intent intent2 = new Intent(getBaseContext(), triptest_3_Activity.class);
                intent2.putExtra("alone_x", alone_x);
                intent2.putExtra("alone_o", alone_o);
                startActivity(intent2);
            }
        });

        triptest_2_an3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {


                Intent intent = getIntent();
                Bundle bundle = intent.getExtras();

                String alone_x = bundle.getString("alone_x");
                String alone_o = bundle.getString("alone_o");

                Intent intent2 = new Intent(getBaseContext(), triptest_3_Activity.class);
                intent2.putExtra("alone_x", alone_x);
                intent2.putExtra("alone_o", alone_o);
                startActivity(intent2);
            }
        });

    }
}