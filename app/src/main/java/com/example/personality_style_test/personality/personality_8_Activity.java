package com.example.personality_style_test.personality;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;

public class personality_8_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personality8);

        Button personality_8_yes = (Button) findViewById(R.id.personality_8_yes);
        Button personality_8_no = (Button) findViewById(R.id.personality_8_no);

        personality_8_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent7 = getIntent();
                Bundle bundle = intent7.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int t = bundle.getInt("t");
                int f = bundle.getInt("f");
                int p = bundle.getInt("p");
                int j = bundle.getInt("j");
                int s = bundle.getInt("s");
                int n = bundle.getInt("n");

                t +=1;


                Intent intent8 = new Intent(getBaseContext(), personality_9_Activity.class);
                intent8.putExtra("e", e);
                intent8.putExtra("i", i);
                intent8.putExtra("f", f);
                intent8.putExtra("t", t);
                intent8.putExtra("p", p);
                intent8.putExtra("j", j);
                intent8.putExtra("s", s);
                intent8.putExtra("n", n);


                startActivity(intent8);
            }
        });

        personality_8_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent7 = getIntent();
                Bundle bundle = intent7.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int t = bundle.getInt("t");
                int f = bundle.getInt("f");
                int p = bundle.getInt("p");
                int j = bundle.getInt("j");
                int s = bundle.getInt("s");
                int n = bundle.getInt("n");

                f +=1;


                Intent intent8 = new Intent(getBaseContext(), personality_9_Activity.class);
                intent8.putExtra("e", e);
                intent8.putExtra("i", i);
                intent8.putExtra("f", f);
                intent8.putExtra("t", t);
                intent8.putExtra("p", p);
                intent8.putExtra("j", j);
                intent8.putExtra("s", s);
                intent8.putExtra("n", n);


                startActivity(intent8);
            }
        });
    }
}