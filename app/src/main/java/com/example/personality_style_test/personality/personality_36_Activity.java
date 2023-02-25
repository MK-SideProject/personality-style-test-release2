package com.example.personality_style_test.personality;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;

public class personality_36_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personality36);

        Button personality_36_yes = (Button) findViewById(R.id.personality_36_yes);
        Button personality_36_no = (Button) findViewById(R.id.personality_36_no);

        personality_36_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent35 = getIntent();
                Bundle bundle = intent35.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int n = bundle.getInt("n");
                int s = bundle.getInt("s");
                int f = bundle.getInt("f");
                int t = bundle.getInt("t");
                int p = bundle.getInt("p");
                int j = bundle.getInt("j");

                n+=1;

                Intent intent36 = new Intent(getBaseContext(), personality_37_Activity.class);
                intent36.putExtra("e", e);
                intent36.putExtra("i", i);
                intent36.putExtra("n", n);
                intent36.putExtra("s", s);
                intent36.putExtra("f", f);
                intent36.putExtra("t", t);
                intent36.putExtra("p", p);
                intent36.putExtra("j", j);

                startActivity(intent36);

            }
        });

        personality_36_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent35 = getIntent();
                Bundle bundle = intent35.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int n = bundle.getInt("n");
                int s = bundle.getInt("s");
                int f = bundle.getInt("f");
                int t = bundle.getInt("t");
                int p = bundle.getInt("p");
                int j = bundle.getInt("j");

                s+=1;

                Intent intent36 = new Intent(getBaseContext(), personality_37_Activity.class);
                intent36.putExtra("e", e);
                intent36.putExtra("i", i);
                intent36.putExtra("n", n);
                intent36.putExtra("s", s);
                intent36.putExtra("f", f);
                intent36.putExtra("t", t);
                intent36.putExtra("p", p);
                intent36.putExtra("j", j);

                startActivity(intent36);

            }
        });
    }
}