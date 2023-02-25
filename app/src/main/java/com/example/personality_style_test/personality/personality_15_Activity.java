package com.example.personality_style_test.personality;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;

public class personality_15_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personality15);

        Button personality_15_yes = (Button) findViewById(R.id.personality_15_yes);
        Button personality_15_no = (Button) findViewById(R.id.personality_15_no);

        personality_15_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent14 = getIntent();
                Bundle bundle = intent14.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int t = bundle.getInt("t");
                int f = bundle.getInt("f");
                int p = bundle.getInt("p");
                int j = bundle.getInt("j");
                int s = bundle.getInt("s");
                int n = bundle.getInt("n");

                n +=1;


                Intent intent15 = new Intent(getBaseContext(), personality_16_Activity.class);
                intent15.putExtra("e", e);
                intent15.putExtra("i", i);
                intent15.putExtra("f", f);
                intent15.putExtra("t", t);
                intent15.putExtra("p", p);
                intent15.putExtra("j", j);
                intent15.putExtra("s", s);
                intent15.putExtra("n", n);


                startActivity(intent15);
            }
        });

        personality_15_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent14 = getIntent();
                Bundle bundle = intent14.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int t = bundle.getInt("t");
                int f = bundle.getInt("f");
                int p = bundle.getInt("p");
                int j = bundle.getInt("j");
                int s = bundle.getInt("s");
                int n = bundle.getInt("n");

                s +=1;


                Intent intent15 = new Intent(getBaseContext(), personality_16_Activity.class);
                intent15.putExtra("e", e);
                intent15.putExtra("i", i);
                intent15.putExtra("f", f);
                intent15.putExtra("t", t);
                intent15.putExtra("p", p);
                intent15.putExtra("j", j);
                intent15.putExtra("s", s);
                intent15.putExtra("n", n);


                startActivity(intent15);
            }
        });
    }
}