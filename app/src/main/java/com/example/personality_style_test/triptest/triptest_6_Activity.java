package com.example.personality_style_test.triptest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;

public class triptest_6_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triptest6);

        Button triptest_6_an1 = (Button) findViewById(R.id.triptest_6_an1);
        Button triptest_6_an2 = (Button) findViewById(R.id.triptest_6_an2);

        triptest_6_an1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {


                Intent intent5 = getIntent();
                Bundle bundle = intent5.getExtras();

                String alone_x = bundle.getString("alone_x");
                String alone_o = bundle.getString("alone_o");
                String plan_o = bundle.getString("plan_o");
                String plan_x = "plan_x";
                String active_o = bundle.getString("active_o");
                String active_x = bundle.getString("active_x");


                Intent intent6 = new Intent(getBaseContext(), triptest_7_Activity.class);
                intent6.putExtra("alone_x", alone_x);
                intent6.putExtra("alone_o", alone_o);
                intent6.putExtra("plan_o", plan_o);
                intent6.putExtra("plan_x", plan_x);
                intent6.putExtra("active_o", active_o);
                intent6.putExtra("active_x", active_x);
                startActivity(intent6);
            }
        });

        triptest_6_an2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {


                Intent intent5 = getIntent();
                Bundle bundle = intent5.getExtras();

                String alone_x = bundle.getString("alone_x");
                String alone_o = bundle.getString("alone_o");
                String plan_o = "plan_o";
                String plan_x = bundle.getString("plan_x");
                String active_o = bundle.getString("active_o");
                String active_x = bundle.getString("active_x");


                Intent intent6 = new Intent(getBaseContext(), triptest_7_Activity.class);
                intent6.putExtra("alone_x", alone_x);
                intent6.putExtra("alone_o", alone_o);
                intent6.putExtra("plan_o", plan_o);
                intent6.putExtra("plan_x", plan_x);
                intent6.putExtra("active_o", active_o);
                intent6.putExtra("active_x", active_x);
                startActivity(intent6);
            }
        });
    }
}