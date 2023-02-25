package com.example.personality_style_test.personality;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;

public class personality_6_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personality6);

        Button personality_6_yes = (Button) findViewById(R.id.personality_6_yes);
        Button personality_6_no = (Button) findViewById(R.id.personality_6_no);

        personality_6_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent5 = getIntent();
                Bundle bundle = intent5.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int t = bundle.getInt("t");
                int f = bundle.getInt("f");
                int p = bundle.getInt("p");
                int j = bundle.getInt("j");

                e +=1;

                Intent intent6 = new Intent(getBaseContext(), personality_7_Activity.class);
                intent6.putExtra("e", e);
                intent6.putExtra("i", i);
                intent6.putExtra("f", f);
                intent6.putExtra("t", t);
                intent6.putExtra("p", p);
                intent6.putExtra("j", j);


                startActivity(intent6);
            }
        });

        personality_6_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent5 = getIntent();
                Bundle bundle = intent5.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int t = bundle.getInt("t");
                int f = bundle.getInt("f");
                int p = bundle.getInt("p");
                int j = bundle.getInt("j");

                i +=1;

                Intent intent6 = new Intent(getBaseContext(), personality_7_Activity.class);
                intent6.putExtra("e", e);
                intent6.putExtra("i", i);
                intent6.putExtra("f", f);
                intent6.putExtra("t", t);
                intent6.putExtra("p", p);
                intent6.putExtra("j", j);


                startActivity(intent6);
            }
        });
    }
}