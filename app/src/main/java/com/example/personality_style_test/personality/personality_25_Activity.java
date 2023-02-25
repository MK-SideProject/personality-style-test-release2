package com.example.personality_style_test.personality;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;

public class personality_25_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personality25);

        Button personality_25_yes = (Button) findViewById(R.id.personality_25_yes);
        Button personality_25_no = (Button) findViewById(R.id.personality_25_no);

        personality_25_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent24 = getIntent();
                Bundle bundle = intent24.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int n = bundle.getInt("n");
                int s = bundle.getInt("s");
                int f = bundle.getInt("f");
                int t = bundle.getInt("t");
                int p = bundle.getInt("p");
                int j = bundle.getInt("j");

                j+=1;

                Intent intent25 = new Intent(getBaseContext(), personality_26_Activity.class);
                intent25.putExtra("e", e);
                intent25.putExtra("i", i);
                intent25.putExtra("n", n);
                intent25.putExtra("s", s);
                intent25.putExtra("f", f);
                intent25.putExtra("t", t);
                intent25.putExtra("p", p);
                intent25.putExtra("j", j);

                startActivity(intent25);

            }
        });

        personality_25_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent24 = getIntent();
                Bundle bundle = intent24.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int n = bundle.getInt("n");
                int s = bundle.getInt("s");
                int f = bundle.getInt("f");
                int t = bundle.getInt("t");
                int p = bundle.getInt("p");
                int j = bundle.getInt("j");

                p+=1;

                Intent intent25 = new Intent(getBaseContext(), personality_26_Activity.class);
                intent25.putExtra("e", e);
                intent25.putExtra("i", i);
                intent25.putExtra("n", n);
                intent25.putExtra("s", s);
                intent25.putExtra("f", f);
                intent25.putExtra("t", t);
                intent25.putExtra("p", p);
                intent25.putExtra("j", j);

                startActivity(intent25);

            }
        });
    }
}