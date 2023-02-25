package com.example.personality_style_test.personality;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;

public class personality_20_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personality20);

        Button personality_20_yes = (Button) findViewById(R.id.personality_20_yes);
        Button personality_20_no = (Button) findViewById(R.id.personality_20_no);

        personality_20_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent19 = getIntent();
                Bundle bundle = intent19.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int t = bundle.getInt("t");
                int f = bundle.getInt("f");
                int p = bundle.getInt("p");
                int j = bundle.getInt("j");
                int s = bundle.getInt("s");
                int n = bundle.getInt("n");

                i +=1;


                Intent intent20 = new Intent(getBaseContext(), personality_21_Activity.class);
                intent20.putExtra("e", e);
                intent20.putExtra("i", i);
                intent20.putExtra("f", f);
                intent20.putExtra("t", t);
                intent20.putExtra("p", p);
                intent20.putExtra("j", j);
                intent20.putExtra("s", s);
                intent20.putExtra("n", n);


                startActivity(intent20);
            }
        });

        personality_20_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent19 = getIntent();
                Bundle bundle = intent19.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int t = bundle.getInt("t");
                int f = bundle.getInt("f");
                int p = bundle.getInt("p");
                int j = bundle.getInt("j");
                int s = bundle.getInt("s");
                int n = bundle.getInt("n");

                e +=1;


                Intent intent20 = new Intent(getBaseContext(), personality_21_Activity.class);
                intent20.putExtra("e", e);
                intent20.putExtra("i", i);
                intent20.putExtra("f", f);
                intent20.putExtra("t", t);
                intent20.putExtra("p", p);
                intent20.putExtra("j", j);
                intent20.putExtra("s", s);
                intent20.putExtra("n", n);


                startActivity(intent20);
            }
        });
    }
}