package com.example.personality_style_test.personality;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;

public class personality_19_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personality19);

        Button personality_19_yes = (Button) findViewById(R.id.personality_19_yes);
        Button personality_19_no = (Button) findViewById(R.id.personality_19_no);

        personality_19_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent18 = getIntent();
                Bundle bundle = intent18.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int t = bundle.getInt("t");
                int f = bundle.getInt("f");
                int p = bundle.getInt("p");
                int j = bundle.getInt("j");
                int s = bundle.getInt("s");
                int n = bundle.getInt("n");

                t +=1;


                Intent intent19 = new Intent(getBaseContext(), personality_20_Activity.class);
                intent19.putExtra("e", e);
                intent19.putExtra("i", i);
                intent19.putExtra("f", f);
                intent19.putExtra("t", t);
                intent19.putExtra("p", p);
                intent19.putExtra("j", j);
                intent19.putExtra("s", s);
                intent19.putExtra("n", n);


                startActivity(intent19);
            }
        });

        personality_19_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent18 = getIntent();
                Bundle bundle = intent18.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int t = bundle.getInt("t");
                int f = bundle.getInt("f");
                int p = bundle.getInt("p");
                int j = bundle.getInt("j");
                int s = bundle.getInt("s");
                int n = bundle.getInt("n");

                f +=1;


                Intent intent19 = new Intent(getBaseContext(), personality_20_Activity.class);
                intent19.putExtra("e", e);
                intent19.putExtra("i", i);
                intent19.putExtra("f", f);
                intent19.putExtra("t", t);
                intent19.putExtra("p", p);
                intent19.putExtra("j", j);
                intent19.putExtra("s", s);
                intent19.putExtra("n", n);


                startActivity(intent19);
            }
        });
    }
}