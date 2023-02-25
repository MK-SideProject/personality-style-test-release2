package com.example.personality_style_test.personality;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;

public class personality_39_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personality39);

        Button personality_39_yes = (Button) findViewById(R.id.personality_39_yes);
        Button personality_39_no = (Button) findViewById(R.id.personality_39_no);

        personality_39_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent38 = getIntent();
                Bundle bundle = intent38.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int n = bundle.getInt("n");
                int s = bundle.getInt("s");
                int f = bundle.getInt("f");
                int t = bundle.getInt("t");
                int p = bundle.getInt("p");
                int j = bundle.getInt("j");

                t+=1;

                Intent intent39 = new Intent(getBaseContext(), personality_40_Activity.class);
                intent39.putExtra("e", e);
                intent39.putExtra("i", i);
                intent39.putExtra("n", n);
                intent39.putExtra("s", s);
                intent39.putExtra("f", f);
                intent39.putExtra("t", t);
                intent39.putExtra("p", p);
                intent39.putExtra("j", j);

                startActivity(intent39);

            }
        });

        personality_39_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent38 = getIntent();
                Bundle bundle = intent38.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int n = bundle.getInt("n");
                int s = bundle.getInt("s");
                int f = bundle.getInt("f");
                int t = bundle.getInt("t");
                int p = bundle.getInt("p");
                int j = bundle.getInt("j");

                f+=1;

                Intent intent39 = new Intent(getBaseContext(), personality_40_Activity.class);
                intent39.putExtra("e", e);
                intent39.putExtra("i", i);
                intent39.putExtra("n", n);
                intent39.putExtra("s", s);
                intent39.putExtra("f", f);
                intent39.putExtra("t", t);
                intent39.putExtra("p", p);
                intent39.putExtra("j", j);

                startActivity(intent39);

            }
        });
    }
}