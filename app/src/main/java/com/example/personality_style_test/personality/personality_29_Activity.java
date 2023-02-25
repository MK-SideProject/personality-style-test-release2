package com.example.personality_style_test.personality;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;

public class personality_29_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personality29);

        Button personality_29_yes = (Button) findViewById(R.id.personality_29_yes);
        Button personality_29_no = (Button) findViewById(R.id.personality_29_no);

        personality_29_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent28 = getIntent();
                Bundle bundle = intent28.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int n = bundle.getInt("n");
                int s = bundle.getInt("s");
                int f = bundle.getInt("f");
                int t = bundle.getInt("t");
                int p = bundle.getInt("p");
                int j = bundle.getInt("j");

                j+=1;

                Intent intent29 = new Intent(getBaseContext(), personality_30_Activity.class);
                intent29.putExtra("e", e);
                intent29.putExtra("i", i);
                intent29.putExtra("n", n);
                intent29.putExtra("s", s);
                intent29.putExtra("f", f);
                intent29.putExtra("t", t);
                intent29.putExtra("p", p);
                intent29.putExtra("j", j);

                startActivity(intent29);

            }
        });

        personality_29_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent28 = getIntent();
                Bundle bundle = intent28.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int n = bundle.getInt("n");
                int s = bundle.getInt("s");
                int f = bundle.getInt("f");
                int t = bundle.getInt("t");
                int p = bundle.getInt("p");
                int j = bundle.getInt("j");

                p+=1;

                Intent intent29 = new Intent(getBaseContext(), personality_30_Activity.class);
                intent29.putExtra("e", e);
                intent29.putExtra("i", i);
                intent29.putExtra("n", n);
                intent29.putExtra("s", s);
                intent29.putExtra("f", f);
                intent29.putExtra("t", t);
                intent29.putExtra("p", p);
                intent29.putExtra("j", j);

                startActivity(intent29);

            }
        });
    }
}