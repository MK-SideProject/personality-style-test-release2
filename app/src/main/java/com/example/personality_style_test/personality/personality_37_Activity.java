package com.example.personality_style_test.personality;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;

public class personality_37_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personality37);

        Button personality_37_yes = (Button) findViewById(R.id.personality_37_yes);
        Button personality_37_no = (Button) findViewById(R.id.personality_37_no);

        personality_37_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent36 = getIntent();
                Bundle bundle = intent36.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int n = bundle.getInt("n");
                int s = bundle.getInt("s");
                int f = bundle.getInt("f");
                int t = bundle.getInt("t");
                int p = bundle.getInt("p");
                int j = bundle.getInt("j");

                i+=1;

                Intent intent37 = new Intent(getBaseContext(), personality_38_Activity.class);
                intent37.putExtra("e", e);
                intent37.putExtra("i", i);
                intent37.putExtra("n", n);
                intent37.putExtra("s", s);
                intent37.putExtra("f", f);
                intent37.putExtra("t", t);
                intent37.putExtra("p", p);
                intent37.putExtra("j", j);

                startActivity(intent37);

            }
        });

        personality_37_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent36 = getIntent();
                Bundle bundle = intent36.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int n = bundle.getInt("n");
                int s = bundle.getInt("s");
                int f = bundle.getInt("f");
                int t = bundle.getInt("t");
                int p = bundle.getInt("p");
                int j = bundle.getInt("j");

                e+=1;

                Intent intent37 = new Intent(getBaseContext(), personality_38_Activity.class);
                intent37.putExtra("e", e);
                intent37.putExtra("i", i);
                intent37.putExtra("n", n);
                intent37.putExtra("s", s);
                intent37.putExtra("f", f);
                intent37.putExtra("t", t);
                intent37.putExtra("p", p);
                intent37.putExtra("j", j);

                startActivity(intent37);

            }
        });
    }
}