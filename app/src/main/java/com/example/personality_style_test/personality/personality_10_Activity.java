package com.example.personality_style_test.personality;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;

public class personality_10_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personality10);

        Button personality_10_yes = (Button) findViewById(R.id.personality_10_yes);
        Button personality_10_no = (Button) findViewById(R.id.personality_10_no);

        personality_10_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent9 = getIntent();
                Bundle bundle = intent9.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int t = bundle.getInt("t");
                int f = bundle.getInt("f");
                int p = bundle.getInt("p");
                int j = bundle.getInt("j");
                int s = bundle.getInt("s");
                int n = bundle.getInt("n");

                n +=1;


                Intent intent10 = new Intent(getBaseContext(), personality_11_Activity.class);
                intent10.putExtra("e", e);
                intent10.putExtra("i", i);
                intent10.putExtra("f", f);
                intent10.putExtra("t", t);
                intent10.putExtra("p", p);
                intent10.putExtra("j", j);
                intent10.putExtra("s", s);
                intent10.putExtra("n", n);


                startActivity(intent10);
            }
        });

        personality_10_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent9 = getIntent();
                Bundle bundle = intent9.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int t = bundle.getInt("t");
                int f = bundle.getInt("f");
                int p = bundle.getInt("p");
                int j = bundle.getInt("j");
                int s = bundle.getInt("s");
                int n = bundle.getInt("n");

                s +=1;


                Intent intent10 = new Intent(getBaseContext(), personality_11_Activity.class);
                intent10.putExtra("e", e);
                intent10.putExtra("i", i);
                intent10.putExtra("f", f);
                intent10.putExtra("t", t);
                intent10.putExtra("p", p);
                intent10.putExtra("j", j);
                intent10.putExtra("s", s);
                intent10.putExtra("n", n);


                startActivity(intent10);
            }
        });
    }
}