package com.example.personality_style_test.personality;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;

public class personality_27_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personality27);

        Button personality_27_yes = (Button) findViewById(R.id.personality_27_yes);
        Button personality_27_no = (Button) findViewById(R.id.personality_27_no);

        personality_27_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent26 = getIntent();
                Bundle bundle = intent26.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int n = bundle.getInt("n");
                int s = bundle.getInt("s");
                int f = bundle.getInt("f");
                int t = bundle.getInt("t");
                int p = bundle.getInt("p");
                int j = bundle.getInt("j");

                t+=1;

                Intent intent27 = new Intent(getBaseContext(), personality_28_Activity.class);
                intent27.putExtra("e", e);
                intent27.putExtra("i", i);
                intent27.putExtra("n", n);
                intent27.putExtra("s", s);
                intent27.putExtra("f", f);
                intent27.putExtra("t", t);
                intent27.putExtra("p", p);
                intent27.putExtra("j", j);

                startActivity(intent27);

            }
        });

        personality_27_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent26 = getIntent();
                Bundle bundle = intent26.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int n = bundle.getInt("n");
                int s = bundle.getInt("s");
                int f = bundle.getInt("f");
                int t = bundle.getInt("t");
                int p = bundle.getInt("p");
                int j = bundle.getInt("j");

                f+=1;

                Intent intent27 = new Intent(getBaseContext(), personality_28_Activity.class);
                intent27.putExtra("e", e);
                intent27.putExtra("i", i);
                intent27.putExtra("n", n);
                intent27.putExtra("s", s);
                intent27.putExtra("f", f);
                intent27.putExtra("t", t);
                intent27.putExtra("p", p);
                intent27.putExtra("j", j);

                startActivity(intent27);

            }
        });
    }
}