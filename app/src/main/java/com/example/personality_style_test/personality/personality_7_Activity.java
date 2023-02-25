package com.example.personality_style_test.personality;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;

public class personality_7_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personality7);

        Button personality_7_yes = (Button) findViewById(R.id.personality_7_yes);
        Button personality_7_no = (Button) findViewById(R.id.personality_7_no);

        personality_7_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent6 = getIntent();
                Bundle bundle = intent6.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int t = bundle.getInt("t");
                int f = bundle.getInt("f");
                int p = bundle.getInt("p");
                int j = bundle.getInt("j");
                int s = 0;
                s +=1;

                Intent intent7 = new Intent(getBaseContext(), personality_8_Activity.class);
                intent7.putExtra("e", e);
                intent7.putExtra("i", i);
                intent7.putExtra("f", f);
                intent7.putExtra("t", t);
                intent7.putExtra("p", p);
                intent7.putExtra("j", j);
                intent7.putExtra("s", s);


                startActivity(intent7);
            }
        });

        personality_7_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent6 = getIntent();
                Bundle bundle = intent6.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int t = bundle.getInt("t");
                int f = bundle.getInt("f");
                int p = bundle.getInt("p");
                int j = bundle.getInt("j");
                int n = 0;
                n +=1;

                Intent intent7 = new Intent(getBaseContext(), personality_8_Activity.class);
                intent7.putExtra("e", e);
                intent7.putExtra("i", i);
                intent7.putExtra("f", f);
                intent7.putExtra("t", t);
                intent7.putExtra("p", p);
                intent7.putExtra("j", j);
                intent7.putExtra("n", n);


                startActivity(intent7);
            }
        });
    }
}