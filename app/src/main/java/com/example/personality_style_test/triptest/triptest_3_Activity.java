package com.example.personality_style_test.triptest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;

public class triptest_3_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triptest3);

        Button triptest_3_an1 = (Button) findViewById(R.id.triptest_3_an1);
        Button triptest_3_an2 = (Button) findViewById(R.id.triptest_3_an2);
        Button triptest_3_an3 = (Button) findViewById(R.id.triptest_3_an3);


        triptest_3_an1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {


                Intent intent2 = getIntent();
                Bundle bundle = intent2.getExtras();

                String alone_x = bundle.getString("alone_x");
                String alone_o = bundle.getString("alone_o");
                String plan_o = "plan_o";

                Intent intent3 = new Intent(getBaseContext(), triptest_4_Activity.class);
                intent3.putExtra("alone_x", alone_x);
                intent3.putExtra("alone_o", alone_o);
                intent3.putExtra("plan_o", plan_o);
                startActivity(intent3);
            }
        });

        triptest_3_an2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {


                Intent intent2 = getIntent();
                Bundle bundle = intent2.getExtras();

                String alone_x = bundle.getString("alone_x");
                String alone_o = bundle.getString("alone_o");
                String plan_o = "plan_o";

                Intent intent3 = new Intent(getBaseContext(), triptest_4_Activity.class);
                intent3.putExtra("alone_x", alone_x);
                intent3.putExtra("alone_o", alone_o);
                intent3.putExtra("plan_o", plan_o);
                startActivity(intent3);
            }
        });

        triptest_3_an3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {


                Intent intent2 = getIntent();
                Bundle bundle = intent2.getExtras();

                String alone_x = bundle.getString("alone_x");
                String alone_o = bundle.getString("alone_o");
                String plan_x = "plan_x";

                Intent intent3 = new Intent(getBaseContext(), triptest_4_Activity.class);
                intent3.putExtra("alone_x", alone_x);
                intent3.putExtra("alone_o", alone_o);
                intent3.putExtra("plan_x", plan_x);
                startActivity(intent3);
            }
        });


    }
}