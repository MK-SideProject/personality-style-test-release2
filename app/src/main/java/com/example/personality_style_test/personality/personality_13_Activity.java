package com.example.personality_style_test.personality;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;

public class personality_13_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personality13);

        Button personality_13_yes = (Button) findViewById(R.id.personality_13_yes);
        Button personality_13_no = (Button) findViewById(R.id.personality_13_no);


        personality_13_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent12 = getIntent();
                Bundle bundle = intent12.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int t = bundle.getInt("t");
                int f = bundle.getInt("f");
                int p = bundle.getInt("p");
                int j = bundle.getInt("j");
                int s = bundle.getInt("s");
                int n = bundle.getInt("n");

                f +=1;


                Intent intent13 = new Intent(getBaseContext(), personality_14_Activity.class);
                intent13.putExtra("e", e);
                intent13.putExtra("i", i);
                intent13.putExtra("f", f);
                intent13.putExtra("t", t);
                intent13.putExtra("p", p);
                intent13.putExtra("j", j);
                intent13.putExtra("s", s);
                intent13.putExtra("n", n);


                startActivity(intent13);
            }
        });

        personality_13_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent12 = getIntent();
                Bundle bundle = intent12.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int t = bundle.getInt("t");
                int f = bundle.getInt("f");
                int p = bundle.getInt("p");
                int j = bundle.getInt("j");
                int s = bundle.getInt("s");
                int n = bundle.getInt("n");

                t +=1;


                Intent intent13 = new Intent(getBaseContext(), personality_14_Activity.class);
                intent13.putExtra("e", e);
                intent13.putExtra("i", i);
                intent13.putExtra("f", f);
                intent13.putExtra("t", t);
                intent13.putExtra("p", p);
                intent13.putExtra("j", j);
                intent13.putExtra("s", s);
                intent13.putExtra("n", n);


                startActivity(intent13);
            }
        });

    }
}