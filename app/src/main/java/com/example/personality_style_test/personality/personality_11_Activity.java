package com.example.personality_style_test.personality;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;

public class personality_11_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personality11);

        Button personality_11_yes = (Button) findViewById(R.id.personality_11_yes);
        Button personality_11_no = (Button) findViewById(R.id.personality_11_no);

        personality_11_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent10 = getIntent();
                Bundle bundle = intent10.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int t = bundle.getInt("t");
                int f = bundle.getInt("f");
                int p = bundle.getInt("p");
                int j = bundle.getInt("j");
                int s = bundle.getInt("s");
                int n = bundle.getInt("n");

                p +=1;


                Intent intent11 = new Intent(getBaseContext(), personality_12_Activity.class);
                intent11.putExtra("e", e);
                intent11.putExtra("i", i);
                intent11.putExtra("f", f);
                intent11.putExtra("t", t);
                intent11.putExtra("p", p);
                intent11.putExtra("j", j);
                intent11.putExtra("s", s);
                intent11.putExtra("n", n);


                startActivity(intent11);
            }
        });

        personality_11_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent10 = getIntent();
                Bundle bundle = intent10.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int t = bundle.getInt("t");
                int f = bundle.getInt("f");
                int p = bundle.getInt("p");
                int j = bundle.getInt("j");
                int s = bundle.getInt("s");
                int n = bundle.getInt("n");

                j +=1;


                Intent intent11 = new Intent(getBaseContext(), personality_12_Activity.class);
                intent11.putExtra("e", e);
                intent11.putExtra("i", i);
                intent11.putExtra("f", f);
                intent11.putExtra("t", t);
                intent11.putExtra("p", p);
                intent11.putExtra("j", j);
                intent11.putExtra("s", s);
                intent11.putExtra("n", n);


                startActivity(intent11);
            }
        });
    }
}