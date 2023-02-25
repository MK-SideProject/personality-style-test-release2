package com.example.personality_style_test.personality;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;

public class personality_12_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personality12);

        Button personality_12_yes = (Button) findViewById(R.id.personality_12_yes);
        Button personality_12_no = (Button) findViewById(R.id.personality_12_no);

        personality_12_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent11 = getIntent();
                Bundle bundle = intent11.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int t = bundle.getInt("t");
                int f = bundle.getInt("f");
                int p = bundle.getInt("p");
                int j = bundle.getInt("j");
                int s = bundle.getInt("s");
                int n = bundle.getInt("n");

                f +=1;


                Intent intent12 = new Intent(getBaseContext(), personality_13_Activity.class);
                intent12.putExtra("e", e);
                intent12.putExtra("i", i);
                intent12.putExtra("f", f);
                intent12.putExtra("t", t);
                intent12.putExtra("p", p);
                intent12.putExtra("j", j);
                intent12.putExtra("s", s);
                intent12.putExtra("n", n);


                startActivity(intent12);
            }
        });

        personality_12_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent11 = getIntent();
                Bundle bundle = intent11.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int t = bundle.getInt("t");
                int f = bundle.getInt("f");
                int p = bundle.getInt("p");
                int j = bundle.getInt("j");
                int s = bundle.getInt("s");
                int n = bundle.getInt("n");

                t +=1;


                Intent intent12 = new Intent(getBaseContext(), personality_13_Activity.class);
                intent12.putExtra("e", e);
                intent12.putExtra("i", i);
                intent12.putExtra("f", f);
                intent12.putExtra("t", t);
                intent12.putExtra("p", p);
                intent12.putExtra("j", j);
                intent12.putExtra("s", s);
                intent12.putExtra("n", n);


                startActivity(intent12);
            }
        });
    }
}