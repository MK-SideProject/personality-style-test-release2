package com.example.personality_style_test.personality;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;

public class personality_31_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personality31);

        Button personality_31_yes = (Button) findViewById(R.id.personality_31_yes);
        Button personality_31_no = (Button) findViewById(R.id.personality_31_no);

        personality_31_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent30 = getIntent();
                Bundle bundle = intent30.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int n = bundle.getInt("n");
                int s = bundle.getInt("s");
                int f = bundle.getInt("f");
                int t = bundle.getInt("t");
                int p = bundle.getInt("p");
                int j = bundle.getInt("j");

                p+=1;

                Intent intent31 = new Intent(getBaseContext(), personality_32_Activity.class);
                intent31.putExtra("e", e);
                intent31.putExtra("i", i);
                intent31.putExtra("n", n);
                intent31.putExtra("s", s);
                intent31.putExtra("f", f);
                intent31.putExtra("t", t);
                intent31.putExtra("p", p);
                intent31.putExtra("j", j);

                startActivity(intent31);

            }
        });

        personality_31_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent30 = getIntent();
                Bundle bundle = intent30.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int n = bundle.getInt("n");
                int s = bundle.getInt("s");
                int f = bundle.getInt("f");
                int t = bundle.getInt("t");
                int p = bundle.getInt("p");
                int j = bundle.getInt("j");

                j+=1;

                Intent intent31 = new Intent(getBaseContext(), personality_32_Activity.class);
                intent31.putExtra("e", e);
                intent31.putExtra("i", i);
                intent31.putExtra("n", n);
                intent31.putExtra("s", s);
                intent31.putExtra("f", f);
                intent31.putExtra("t", t);
                intent31.putExtra("p", p);
                intent31.putExtra("j", j);

                startActivity(intent31);

            }
        });
    }
}