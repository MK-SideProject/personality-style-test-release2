package com.example.personality_style_test.personality;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;

public class personality_26_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personality26);

        Button personality_26_yes = (Button) findViewById(R.id.personality_26_yes);
        Button personality_26_no = (Button) findViewById(R.id.personality_26_no);

        personality_26_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent25 = getIntent();
                Bundle bundle = intent25.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int n = bundle.getInt("n");
                int s = bundle.getInt("s");
                int f = bundle.getInt("f");
                int t = bundle.getInt("t");
                int p = bundle.getInt("p");
                int j = bundle.getInt("j");

                s+=1;

                Intent intent26 = new Intent(getBaseContext(), personality_27_Activity.class);
                intent26.putExtra("e", e);
                intent26.putExtra("i", i);
                intent26.putExtra("n", n);
                intent26.putExtra("s", s);
                intent26.putExtra("f", f);
                intent26.putExtra("t", t);
                intent26.putExtra("p", p);
                intent26.putExtra("j", j);

                startActivity(intent26);

            }
        });

        personality_26_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent25 = getIntent();
                Bundle bundle = intent25.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int n = bundle.getInt("n");
                int s = bundle.getInt("s");
                int f = bundle.getInt("f");
                int t = bundle.getInt("t");
                int p = bundle.getInt("p");
                int j = bundle.getInt("j");

                n+=1;

                Intent intent26 = new Intent(getBaseContext(), personality_27_Activity.class);
                intent26.putExtra("e", e);
                intent26.putExtra("i", i);
                intent26.putExtra("n", n);
                intent26.putExtra("s", s);
                intent26.putExtra("f", f);
                intent26.putExtra("t", t);
                intent26.putExtra("p", p);
                intent26.putExtra("j", j);

                startActivity(intent26);

            }
        });
    }
}