package com.example.personality_style_test.personality;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;

public class personality_22_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personality22);

        Button personality_22_yes = (Button) findViewById(R.id.personality_22_yes);
        Button personality_22_no = (Button) findViewById(R.id.personality_22_no);

        personality_22_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent21 = getIntent();
                Bundle bundle = intent21.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int n = bundle.getInt("n");
                int s = bundle.getInt("s");
                int f = bundle.getInt("f");
                int t = bundle.getInt("t");
                int p = bundle.getInt("p");
                int j = bundle.getInt("j");

                e+=1;

                Intent intent22 = new Intent(getBaseContext(), personality_23_Activity.class);
                intent22.putExtra("e", e);
                intent22.putExtra("i", i);
                intent22.putExtra("n", n);
                intent22.putExtra("s", s);
                intent22.putExtra("f", f);
                intent22.putExtra("t", t);
                intent22.putExtra("p", p);
                intent22.putExtra("j", j);

                startActivity(intent22);

            }
        });

        personality_22_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent21 = getIntent();
                Bundle bundle = intent21.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int n = bundle.getInt("n");
                int s = bundle.getInt("s");
                int f = bundle.getInt("f");
                int t = bundle.getInt("t");
                int p = bundle.getInt("p");
                int j = bundle.getInt("j");

                i+=1;

                Intent intent22 = new Intent(getBaseContext(), personality_23_Activity.class);
                intent22.putExtra("e", e);
                intent22.putExtra("i", i);
                intent22.putExtra("n", n);
                intent22.putExtra("s", s);
                intent22.putExtra("f", f);
                intent22.putExtra("t", t);
                intent22.putExtra("p", p);
                intent22.putExtra("j", j);

                startActivity(intent22);

            }
        });

    }
}