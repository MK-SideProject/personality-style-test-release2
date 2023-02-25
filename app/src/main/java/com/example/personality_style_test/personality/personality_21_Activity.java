package com.example.personality_style_test.personality;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;

public class personality_21_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personality21);

        Button personality_21_yes = (Button) findViewById(R.id.personality_21_yes);
        Button personality_21_no = (Button) findViewById(R.id.personality_21_no);

        personality_21_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent20 = getIntent();
                Bundle bundle = intent20.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int t = bundle.getInt("t");
                int f = bundle.getInt("f");
                int p = bundle.getInt("p");
                int j = bundle.getInt("j");
                int s = bundle.getInt("s");
                int n = bundle.getInt("n");

                p +=1;


                Intent intent21 = new Intent(getBaseContext(), personality_22_Activity.class);
                intent21.putExtra("e", e);
                intent21.putExtra("i", i);
                intent21.putExtra("f", f);
                intent21.putExtra("t", t);
                intent21.putExtra("p", p);
                intent21.putExtra("j", j);
                intent21.putExtra("s", s);
                intent21.putExtra("n", n);


                startActivity(intent21);
            }
        });

        personality_21_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent20 = getIntent();
                Bundle bundle = intent20.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int t = bundle.getInt("t");
                int f = bundle.getInt("f");
                int p = bundle.getInt("p");
                int j = bundle.getInt("j");
                int s = bundle.getInt("s");
                int n = bundle.getInt("n");

                j +=1;


                Intent intent21 = new Intent(getBaseContext(), personality_22_Activity.class);
                intent21.putExtra("e", e);
                intent21.putExtra("i", i);
                intent21.putExtra("f", f);
                intent21.putExtra("t", t);
                intent21.putExtra("p", p);
                intent21.putExtra("j", j);
                intent21.putExtra("s", s);
                intent21.putExtra("n", n);


                startActivity(intent21);
            }
        });

    }
}