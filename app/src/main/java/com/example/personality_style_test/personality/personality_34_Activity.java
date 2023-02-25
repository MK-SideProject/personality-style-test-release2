package com.example.personality_style_test.personality;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;

public class personality_34_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personality34);

        Button personality_34_yes = (Button) findViewById(R.id.personality_34_yes);
        Button personality_34_no = (Button) findViewById(R.id.personality_34_no);

        personality_34_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent33 = getIntent();
                Bundle bundle = intent33.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int n = bundle.getInt("n");
                int s = bundle.getInt("s");
                int f = bundle.getInt("f");
                int t = bundle.getInt("t");
                int p = bundle.getInt("p");
                int j = bundle.getInt("j");

                j+=1;

                Intent intent34 = new Intent(getBaseContext(), personality_35_Activity.class);
                intent34.putExtra("e", e);
                intent34.putExtra("i", i);
                intent34.putExtra("n", n);
                intent34.putExtra("s", s);
                intent34.putExtra("f", f);
                intent34.putExtra("t", t);
                intent34.putExtra("p", p);
                intent34.putExtra("j", j);

                startActivity(intent34);

            }
        });

        personality_34_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent33 = getIntent();
                Bundle bundle = intent33.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int n = bundle.getInt("n");
                int s = bundle.getInt("s");
                int f = bundle.getInt("f");
                int t = bundle.getInt("t");
                int p = bundle.getInt("p");
                int j = bundle.getInt("j");

                p+=1;

                Intent intent34 = new Intent(getBaseContext(), personality_35_Activity.class);
                intent34.putExtra("e", e);
                intent34.putExtra("i", i);
                intent34.putExtra("n", n);
                intent34.putExtra("s", s);
                intent34.putExtra("f", f);
                intent34.putExtra("t", t);
                intent34.putExtra("p", p);
                intent34.putExtra("j", j);

                startActivity(intent34);

            }
        });
    }
}