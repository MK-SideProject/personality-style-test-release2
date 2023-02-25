package com.example.personality_style_test.personality;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;

public class personality_14_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personality14);

        Button personality_14_yes = (Button) findViewById(R.id.personality_14_yes);
        Button personality_14_no = (Button) findViewById(R.id.personality_14_no);

        personality_14_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent13 = getIntent();
                Bundle bundle = intent13.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int t = bundle.getInt("t");
                int f = bundle.getInt("f");
                int p = bundle.getInt("p");
                int j = bundle.getInt("j");
                int s = bundle.getInt("s");
                int n = bundle.getInt("n");

                e +=1;


                Intent intent14 = new Intent(getBaseContext(), personality_15_Activity.class);
                intent14.putExtra("e", e);
                intent14.putExtra("i", i);
                intent14.putExtra("f", f);
                intent14.putExtra("t", t);
                intent14.putExtra("p", p);
                intent14.putExtra("j", j);
                intent14.putExtra("s", s);
                intent14.putExtra("n", n);


                startActivity(intent14);
            }
        });

        personality_14_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent13 = getIntent();
                Bundle bundle = intent13.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int t = bundle.getInt("t");
                int f = bundle.getInt("f");
                int p = bundle.getInt("p");
                int j = bundle.getInt("j");
                int s = bundle.getInt("s");
                int n = bundle.getInt("n");

                i +=1;


                Intent intent14 = new Intent(getBaseContext(), personality_15_Activity.class);
                intent14.putExtra("e", e);
                intent14.putExtra("i", i);
                intent14.putExtra("f", f);
                intent14.putExtra("t", t);
                intent14.putExtra("p", p);
                intent14.putExtra("j", j);
                intent14.putExtra("s", s);
                intent14.putExtra("n", n);


                startActivity(intent14);
            }
        });
    }
}