package com.example.personality_style_test.personality;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;

public class personality_38_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personality38);

        Button personality_38_yes = (Button) findViewById(R.id.personality_38_yes);
        Button personality_38_no = (Button) findViewById(R.id.personality_38_no);

        personality_38_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent37 = getIntent();
                Bundle bundle = intent37.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int n = bundle.getInt("n");
                int s = bundle.getInt("s");
                int f = bundle.getInt("f");
                int t = bundle.getInt("t");
                int p = bundle.getInt("p");
                int j = bundle.getInt("j");

                s+=1;

                Intent intent38 = new Intent(getBaseContext(), personality_39_Activity.class);
                intent38.putExtra("e", e);
                intent38.putExtra("i", i);
                intent38.putExtra("n", n);
                intent38.putExtra("s", s);
                intent38.putExtra("f", f);
                intent38.putExtra("t", t);
                intent38.putExtra("p", p);
                intent38.putExtra("j", j);

                startActivity(intent38);

            }
        });

        personality_38_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent37 = getIntent();
                Bundle bundle = intent37.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int n = bundle.getInt("n");
                int s = bundle.getInt("s");
                int f = bundle.getInt("f");
                int t = bundle.getInt("t");
                int p = bundle.getInt("p");
                int j = bundle.getInt("j");

                n+=1;

                Intent intent38 = new Intent(getBaseContext(), personality_39_Activity.class);
                intent38.putExtra("e", e);
                intent38.putExtra("i", i);
                intent38.putExtra("n", n);
                intent38.putExtra("s", s);
                intent38.putExtra("f", f);
                intent38.putExtra("t", t);
                intent38.putExtra("p", p);
                intent38.putExtra("j", j);

                startActivity(intent38);

            }
        });
    }
}