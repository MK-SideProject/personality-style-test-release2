package com.example.personality_style_test.personality;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;

public class personality_35_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personality35);

        Button personality_35_yes = (Button) findViewById(R.id.personality_35_yes);
        Button personality_35_no = (Button) findViewById(R.id.personality_35_no);

        personality_35_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent34 = getIntent();
                Bundle bundle = intent34.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int n = bundle.getInt("n");
                int s = bundle.getInt("s");
                int f = bundle.getInt("f");
                int t = bundle.getInt("t");
                int p = bundle.getInt("p");
                int j = bundle.getInt("j");

                s+=1;

                Intent intent35 = new Intent(getBaseContext(), personality_36_Activity.class);
                intent35.putExtra("e", e);
                intent35.putExtra("i", i);
                intent35.putExtra("n", n);
                intent35.putExtra("s", s);
                intent35.putExtra("f", f);
                intent35.putExtra("t", t);
                intent35.putExtra("p", p);
                intent35.putExtra("j", j);

                startActivity(intent35);

            }
        });

        personality_35_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent34 = getIntent();
                Bundle bundle = intent34.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int n = bundle.getInt("n");
                int s = bundle.getInt("s");
                int f = bundle.getInt("f");
                int t = bundle.getInt("t");
                int p = bundle.getInt("p");
                int j = bundle.getInt("j");

                n+=1;

                Intent intent35 = new Intent(getBaseContext(), personality_36_Activity.class);
                intent35.putExtra("e", e);
                intent35.putExtra("i", i);
                intent35.putExtra("n", n);
                intent35.putExtra("s", s);
                intent35.putExtra("f", f);
                intent35.putExtra("t", t);
                intent35.putExtra("p", p);
                intent35.putExtra("j", j);

                startActivity(intent35);

            }
        });
    }
}