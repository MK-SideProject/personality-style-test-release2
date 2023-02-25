package com.example.personality_style_test.triptest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;

public class triptest_4_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triptest4);

        Button triptest_4_an1 = (Button) findViewById(R.id.triptest_4_an1);
        Button triptest_4_an2 = (Button) findViewById(R.id.triptest_4_an2);
        Button triptest_4_an3 = (Button) findViewById(R.id.triptest_4_an3);

        triptest_4_an1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {


                Intent intent3 = getIntent();
                Bundle bundle = intent3.getExtras();

                String alone_x = bundle.getString("alone_x");
                String alone_o = bundle.getString("alone_o");
                String plan_o = bundle.getString("plan_o");
                String plan_x = bundle.getString("plan_x");
                String active_o = "active_o";


                Intent intent4 = new Intent(getBaseContext(), triptest_5_Activity.class);
                intent4.putExtra("alone_x", alone_x);
                intent4.putExtra("alone_o", alone_o);
                intent4.putExtra("plan_o", plan_o);
                intent4.putExtra("plan_x", plan_x);
                intent4.putExtra("active_o", active_o);
                startActivity(intent4);
            }
        });
        triptest_4_an2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {


                Intent intent3 = getIntent();
                Bundle bundle = intent3.getExtras();

                String alone_x = bundle.getString("alone_x");
                String alone_o = bundle.getString("alone_o");
                String plan_o = bundle.getString("plan_o");
                String plan_x = bundle.getString("plan_x");
                String active_o = "active_o";


                Intent intent4 = new Intent(getBaseContext(), triptest_5_Activity.class);
                intent4.putExtra("alone_x", alone_x);
                intent4.putExtra("alone_o", alone_o);
                intent4.putExtra("plan_o", plan_o);
                intent4.putExtra("plan_x", plan_x);
                intent4.putExtra("active_o", active_o);
                startActivity(intent4);
            }
        });

        triptest_4_an3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {


                Intent intent3 = getIntent();
                Bundle bundle = intent3.getExtras();

                String alone_x = bundle.getString("alone_x");
                String alone_o = bundle.getString("alone_o");
                String plan_o = bundle.getString("plan_o");
                String plan_x = bundle.getString("plan_x");
                String active_x = "active_x";


                Intent intent4 = new Intent(getBaseContext(), triptest_5_Activity.class);
                intent4.putExtra("alone_x", alone_x);
                intent4.putExtra("alone_o", alone_o);
                intent4.putExtra("plan_o", plan_o);
                intent4.putExtra("plan_x", plan_x);
                intent4.putExtra("active_x", active_x);
                startActivity(intent4);
            }
        });


    }
}