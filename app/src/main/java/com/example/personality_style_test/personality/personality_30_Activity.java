package com.example.personality_style_test.personality;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;

public class personality_30_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personality30);

        Button personality_30_yes = (Button) findViewById(R.id.personality_30_yes);
        Button personality_30_no = (Button) findViewById(R.id.personality_30_no);

        personality_30_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent29 = getIntent();
                Bundle bundle = intent29.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int n = bundle.getInt("n");
                int s = bundle.getInt("s");
                int f = bundle.getInt("f");
                int t = bundle.getInt("t");
                int p = bundle.getInt("p");
                int j = bundle.getInt("j");

                n+=1;

                Intent intent30 = new Intent(getBaseContext(), personality_31_Activity.class);
                intent30.putExtra("e", e);
                intent30.putExtra("i", i);
                intent30.putExtra("n", n);
                intent30.putExtra("s", s);
                intent30.putExtra("f", f);
                intent30.putExtra("t", t);
                intent30.putExtra("p", p);
                intent30.putExtra("j", j);

                startActivity(intent30);

            }
        });

        personality_30_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent29 = getIntent();
                Bundle bundle = intent29.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int n = bundle.getInt("n");
                int s = bundle.getInt("s");
                int f = bundle.getInt("f");
                int t = bundle.getInt("t");
                int p = bundle.getInt("p");
                int j = bundle.getInt("j");

                s+=1;

                Intent intent30 = new Intent(getBaseContext(), personality_31_Activity.class);
                intent30.putExtra("e", e);
                intent30.putExtra("i", i);
                intent30.putExtra("n", n);
                intent30.putExtra("s", s);
                intent30.putExtra("f", f);
                intent30.putExtra("t", t);
                intent30.putExtra("p", p);
                intent30.putExtra("j", j);

                startActivity(intent30);

            }
        });
    }
}