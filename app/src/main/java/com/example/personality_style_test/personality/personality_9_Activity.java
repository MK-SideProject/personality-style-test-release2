package com.example.personality_style_test.personality;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;

public class personality_9_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personality9);

        Button personality_9_yes = (Button) findViewById(R.id.personality_9_yes);
        Button personality_9_no = (Button) findViewById(R.id.personality_9_no);

        personality_9_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent8 = getIntent();
                Bundle bundle = intent8.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int t = bundle.getInt("t");
                int f = bundle.getInt("f");
                int p = bundle.getInt("p");
                int j = bundle.getInt("j");
                int s = bundle.getInt("s");
                int n = bundle.getInt("n");

                t +=1;


                Intent intent9 = new Intent(getBaseContext(), personality_10_Activity.class);
                intent9.putExtra("e", e);
                intent9.putExtra("i", i);
                intent9.putExtra("f", f);
                intent9.putExtra("t", t);
                intent9.putExtra("p", p);
                intent9.putExtra("j", j);
                intent9.putExtra("s", s);
                intent9.putExtra("n", n);


                startActivity(intent9);
            }
        });

        personality_9_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent8 = getIntent();
                Bundle bundle = intent8.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int t = bundle.getInt("t");
                int f = bundle.getInt("f");
                int p = bundle.getInt("p");
                int j = bundle.getInt("j");
                int s = bundle.getInt("s");
                int n = bundle.getInt("n");

                f +=1;


                Intent intent9 = new Intent(getBaseContext(), personality_10_Activity.class);
                intent9.putExtra("e", e);
                intent9.putExtra("i", i);
                intent9.putExtra("f", f);
                intent9.putExtra("t", t);
                intent9.putExtra("p", p);
                intent9.putExtra("j", j);
                intent9.putExtra("s", s);
                intent9.putExtra("n", n);


                startActivity(intent9);
            }
        });
    }
}