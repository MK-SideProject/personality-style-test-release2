package com.example.personality_style_test.personality;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;

public class personality_32_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personality32);

        Button personality_32_yes = (Button) findViewById(R.id.personality_32_yes);
        Button personality_32_no = (Button) findViewById(R.id.personality_32_no);

        personality_32_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent31 = getIntent();
                Bundle bundle = intent31.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int n = bundle.getInt("n");
                int s = bundle.getInt("s");
                int f = bundle.getInt("f");
                int t = bundle.getInt("t");
                int p = bundle.getInt("p");
                int j = bundle.getInt("j");

                f+=1;

                Intent intent32 = new Intent(getBaseContext(), personality_33_Activity.class);
                intent32.putExtra("e", e);
                intent32.putExtra("i", i);
                intent32.putExtra("n", n);
                intent32.putExtra("s", s);
                intent32.putExtra("f", f);
                intent32.putExtra("t", t);
                intent32.putExtra("p", p);
                intent32.putExtra("j", j);

                startActivity(intent32);

            }
        });

        personality_32_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent31 = getIntent();
                Bundle bundle = intent31.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int n = bundle.getInt("n");
                int s = bundle.getInt("s");
                int f = bundle.getInt("f");
                int t = bundle.getInt("t");
                int p = bundle.getInt("p");
                int j = bundle.getInt("j");

                t+=1;

                Intent intent32 = new Intent(getBaseContext(), personality_33_Activity.class);
                intent32.putExtra("e", e);
                intent32.putExtra("i", i);
                intent32.putExtra("n", n);
                intent32.putExtra("s", s);
                intent32.putExtra("f", f);
                intent32.putExtra("t", t);
                intent32.putExtra("p", p);
                intent32.putExtra("j", j);

                startActivity(intent32);

            }
        });
    }
}