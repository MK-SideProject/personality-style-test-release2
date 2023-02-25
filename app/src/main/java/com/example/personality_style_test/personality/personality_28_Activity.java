package com.example.personality_style_test.personality;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;

public class personality_28_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personality28);

        Button personality_28_yes = (Button) findViewById(R.id.personality_28_yes);
        Button personality_28_no = (Button) findViewById(R.id.personality_28_no);

        personality_28_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent27 = getIntent();
                Bundle bundle = intent27.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int n = bundle.getInt("n");
                int s = bundle.getInt("s");
                int f = bundle.getInt("f");
                int t = bundle.getInt("t");
                int p = bundle.getInt("p");
                int j = bundle.getInt("j");

                j+=1;

                Intent intent28 = new Intent(getBaseContext(), personality_29_Activity.class);
                intent28.putExtra("e", e);
                intent28.putExtra("i", i);
                intent28.putExtra("n", n);
                intent28.putExtra("s", s);
                intent28.putExtra("f", f);
                intent28.putExtra("t", t);
                intent28.putExtra("p", p);
                intent28.putExtra("j", j);

                startActivity(intent28);

            }
        });

        personality_28_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent27 = getIntent();
                Bundle bundle = intent27.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int n = bundle.getInt("n");
                int s = bundle.getInt("s");
                int f = bundle.getInt("f");
                int t = bundle.getInt("t");
                int p = bundle.getInt("p");
                int j = bundle.getInt("j");

                p+=1;

                Intent intent28 = new Intent(getBaseContext(), personality_29_Activity.class);
                intent28.putExtra("e", e);
                intent28.putExtra("i", i);
                intent28.putExtra("n", n);
                intent28.putExtra("s", s);
                intent28.putExtra("f", f);
                intent28.putExtra("t", t);
                intent28.putExtra("p", p);
                intent28.putExtra("j", j);

                startActivity(intent28);

            }
        });
    }
}