package com.example.personality_style_test.personality;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;

public class personality_23_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personality23);

        Button personality_23_yes = (Button) findViewById(R.id.personality_23_yes);
        Button personality_23_no = (Button) findViewById(R.id.personality_23_no);

        personality_23_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent22 = getIntent();
                Bundle bundle = intent22.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int n = bundle.getInt("n");
                int s = bundle.getInt("s");
                int f = bundle.getInt("f");
                int t = bundle.getInt("t");
                int p = bundle.getInt("p");
                int j = bundle.getInt("j");

                e+=1;

                Intent intent23 = new Intent(getBaseContext(), personality_24_Activity.class);
                intent23.putExtra("e", e);
                intent23.putExtra("i", i);
                intent23.putExtra("n", n);
                intent23.putExtra("s", s);
                intent23.putExtra("f", f);
                intent23.putExtra("t", t);
                intent23.putExtra("p", p);
                intent23.putExtra("j", j);

                startActivity(intent23);

            }
        });

        personality_23_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent22 = getIntent();
                Bundle bundle = intent22.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int n = bundle.getInt("n");
                int s = bundle.getInt("s");
                int f = bundle.getInt("f");
                int t = bundle.getInt("t");
                int p = bundle.getInt("p");
                int j = bundle.getInt("j");

                i+=1;

                Intent intent23 = new Intent(getBaseContext(), personality_24_Activity.class);
                intent23.putExtra("e", e);
                intent23.putExtra("i", i);
                intent23.putExtra("n", n);
                intent23.putExtra("s", s);
                intent23.putExtra("f", f);
                intent23.putExtra("t", t);
                intent23.putExtra("p", p);
                intent23.putExtra("j", j);

                startActivity(intent23);

            }
        });
    }
}