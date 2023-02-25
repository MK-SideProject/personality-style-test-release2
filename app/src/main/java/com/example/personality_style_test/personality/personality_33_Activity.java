package com.example.personality_style_test.personality;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;

public class personality_33_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personality33);

        Button personality_33_yes = (Button) findViewById(R.id.personality_33_yes);
        Button personality_33_no = (Button) findViewById(R.id.personality_33_no);

        personality_33_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent32 = getIntent();
                Bundle bundle = intent32.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int n = bundle.getInt("n");
                int s = bundle.getInt("s");
                int f = bundle.getInt("f");
                int t = bundle.getInt("t");
                int p = bundle.getInt("p");
                int j = bundle.getInt("j");

                i+=1;

                Intent intent33 = new Intent(getBaseContext(), personality_34_Activity.class);
                intent33.putExtra("e", e);
                intent33.putExtra("i", i);
                intent33.putExtra("n", n);
                intent33.putExtra("s", s);
                intent33.putExtra("f", f);
                intent33.putExtra("t", t);
                intent33.putExtra("p", p);
                intent33.putExtra("j", j);

                startActivity(intent33);

            }
        });

        personality_33_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent32 = getIntent();
                Bundle bundle = intent32.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int n = bundle.getInt("n");
                int s = bundle.getInt("s");
                int f = bundle.getInt("f");
                int t = bundle.getInt("t");
                int p = bundle.getInt("p");
                int j = bundle.getInt("j");

                e+=1;

                Intent intent33 = new Intent(getBaseContext(), personality_34_Activity.class);
                intent33.putExtra("e", e);
                intent33.putExtra("i", i);
                intent33.putExtra("n", n);
                intent33.putExtra("s", s);
                intent33.putExtra("f", f);
                intent33.putExtra("t", t);
                intent33.putExtra("p", p);
                intent33.putExtra("j", j);

                startActivity(intent33);

            }
        });
    }
}