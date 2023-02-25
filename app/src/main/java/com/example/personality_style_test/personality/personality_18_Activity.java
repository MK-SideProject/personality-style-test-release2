package com.example.personality_style_test.personality;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;

public class personality_18_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personality18);

        Button personality_18_yes = (Button) findViewById(R.id.personality_18_yes);
        Button personality_18_no = (Button) findViewById(R.id.personality_18_no);

        personality_18_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent17 = getIntent();
                Bundle bundle = intent17.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int t = bundle.getInt("t");
                int f = bundle.getInt("f");
                int p = bundle.getInt("p");
                int j = bundle.getInt("j");
                int s = bundle.getInt("s");
                int n = bundle.getInt("n");

                i +=1;


                Intent intent18 = new Intent(getBaseContext(), personality_19_Activity.class);
                intent18.putExtra("e", e);
                intent18.putExtra("i", i);
                intent18.putExtra("f", f);
                intent18.putExtra("t", t);
                intent18.putExtra("p", p);
                intent18.putExtra("j", j);
                intent18.putExtra("s", s);
                intent18.putExtra("n", n);


                startActivity(intent18);
            }
        });

        personality_18_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent17 = getIntent();
                Bundle bundle = intent17.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int t = bundle.getInt("t");
                int f = bundle.getInt("f");
                int p = bundle.getInt("p");
                int j = bundle.getInt("j");
                int s = bundle.getInt("s");
                int n = bundle.getInt("n");

                e +=1;


                Intent intent18 = new Intent(getBaseContext(), personality_19_Activity.class);
                intent18.putExtra("e", e);
                intent18.putExtra("i", i);
                intent18.putExtra("f", f);
                intent18.putExtra("t", t);
                intent18.putExtra("p", p);
                intent18.putExtra("j", j);
                intent18.putExtra("s", s);
                intent18.putExtra("n", n);


                startActivity(intent18);
            }
        });
    }
}