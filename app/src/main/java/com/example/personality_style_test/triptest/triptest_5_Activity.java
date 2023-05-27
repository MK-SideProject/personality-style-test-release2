package com.example.personality_style_test.triptest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;

public class triptest_5_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triptest5);

        Button triptest_5_an1 = (Button) findViewById(R.id.triptest_5_an1);
        Button triptest_5_an2 = (Button) findViewById(R.id.triptest_5_an2);

        triptest_5_an1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {


                Intent intent4 = getIntent();
                Bundle bundle = intent4.getExtras();

                String alone_x = bundle.getString("alone_x");
                String alone_o = bundle.getString("alone_o");
                String plan_o = bundle.getString("plan_o");
                String plan_x = bundle.getString("plan_x");
                String active_o = bundle.getString("active_o");
                String active_x = bundle.getString("active_x");


                Intent intent5 = new Intent(getBaseContext(), triptest_6_Activity.class);
                intent5.putExtra("alone_x", alone_x);
                intent5.putExtra("alone_o", alone_o);
                intent5.putExtra("plan_o", plan_o);
                intent5.putExtra("plan_x", plan_x);
                intent5.putExtra("active_o", active_o);
                intent5.putExtra("active_x", active_x);
                startActivity(intent5);
            }
        });
        triptest_5_an2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {


                Intent intent4 = getIntent();
                Bundle bundle = intent4.getExtras();

                String alone_x = bundle.getString("alone_x");
                String alone_o = bundle.getString("alone_o");
                String plan_o = bundle.getString("plan_o");
                String plan_x = bundle.getString("plan_x");
                String active_o = bundle.getString("active_o");
                String active_x = bundle.getString("active_x");


                Intent intent5 = new Intent(getBaseContext(), triptest_6_Activity.class);
                intent5.putExtra("alone_x", alone_x);
                intent5.putExtra("alone_o", alone_o);
                intent5.putExtra("plan_o", plan_o);
                intent5.putExtra("plan_x", plan_x);
                intent5.putExtra("active_o", active_o);
                intent5.putExtra("active_x", active_x);
                startActivity(intent5);
            }
        });

    }
}