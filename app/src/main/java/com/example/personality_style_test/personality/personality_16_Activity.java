package com.example.personality_style_test.personality;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;

public class personality_16_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personality16);

        Button personality_16_yes = (Button) findViewById(R.id.personality_16_yes);
        Button personality_16_no = (Button) findViewById(R.id.personality_16_no);

        personality_16_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent15 = getIntent();
                Bundle bundle = intent15.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int t = bundle.getInt("t");
                int f = bundle.getInt("f");
                int p = bundle.getInt("p");
                int j = bundle.getInt("j");
                int s = bundle.getInt("s");
                int n = bundle.getInt("n");

                j +=1;


                Intent intent16 = new Intent(getBaseContext(), personality_17_Activity.class);
                intent16.putExtra("e", e);
                intent16.putExtra("i", i);
                intent16.putExtra("f", f);
                intent16.putExtra("t", t);
                intent16.putExtra("p", p);
                intent16.putExtra("j", j);
                intent16.putExtra("s", s);
                intent16.putExtra("n", n);


                startActivity(intent16);
            }
        });

        personality_16_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent15 = getIntent();
                Bundle bundle = intent15.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int t = bundle.getInt("t");
                int f = bundle.getInt("f");
                int p = bundle.getInt("p");
                int j = bundle.getInt("j");
                int s = bundle.getInt("s");
                int n = bundle.getInt("n");

                p +=1;


                Intent intent16 = new Intent(getBaseContext(), personality_17_Activity.class);
                intent16.putExtra("e", e);
                intent16.putExtra("i", i);
                intent16.putExtra("f", f);
                intent16.putExtra("t", t);
                intent16.putExtra("p", p);
                intent16.putExtra("j", j);
                intent16.putExtra("s", s);
                intent16.putExtra("n", n);


                startActivity(intent16);
            }
        });
    }
}