package com.example.personality_style_test.personality;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;

public class personality_24_Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personality24);

        Button personality_24_yes = (Button) findViewById(R.id.personality_24_yes);
        Button personality_24_no = (Button) findViewById(R.id.personality_24_no);

        personality_24_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent23 = getIntent();
                Bundle bundle = intent23.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int n = bundle.getInt("n");
                int s = bundle.getInt("s");
                int f = bundle.getInt("f");
                int t = bundle.getInt("t");
                int p = bundle.getInt("p");
                int j = bundle.getInt("j");

                s+=1;

                Intent intent24 = new Intent(getBaseContext(), personality_25_Activity.class);
                intent24.putExtra("e", e);
                intent24.putExtra("i", i);
                intent24.putExtra("n", n);
                intent24.putExtra("s", s);
                intent24.putExtra("f", f);
                intent24.putExtra("t", t);
                intent24.putExtra("p", p);
                intent24.putExtra("j", j);

                startActivity(intent24);

            }
        });

        personality_24_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent23 = getIntent();
                Bundle bundle = intent23.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int n = bundle.getInt("n");
                int s = bundle.getInt("s");
                int f = bundle.getInt("f");
                int t = bundle.getInt("t");
                int p = bundle.getInt("p");
                int j = bundle.getInt("j");

                n+=1;

                Intent intent24 = new Intent(getBaseContext(), personality_25_Activity.class);
                intent24.putExtra("e", e);
                intent24.putExtra("i", i);
                intent24.putExtra("n", n);
                intent24.putExtra("s", s);
                intent24.putExtra("f", f);
                intent24.putExtra("t", t);
                intent24.putExtra("p", p);
                intent24.putExtra("j", j);

                startActivity(intent24);

            }
        });
    }
}