package com.example.personality_style_test.personality;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;

public class personality_5_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personality5);

        Button personality_5_yes = (Button) findViewById(R.id.personality_5_yes);
        Button personality_5_no = (Button) findViewById(R.id.personality_5_no);

        personality_5_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent4 = getIntent();
                Bundle bundle = intent4.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int t = bundle.getInt("t");
                int f = bundle.getInt("f");
                int p = bundle.getInt("p");
                int j = bundle.getInt("j");

                f +=1;

                Intent intent5 = new Intent(getBaseContext(), personality_6_Activity.class);
                intent5.putExtra("e", e);
                intent5.putExtra("i", i);
                intent5.putExtra("f", f);
                intent5.putExtra("t", t);
                intent5.putExtra("p", p);
                intent5.putExtra("j", j);


                startActivity(intent5);
            }
        });

        personality_5_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent4 = getIntent();
                Bundle bundle = intent4.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int t = bundle.getInt("t");
                int f = bundle.getInt("f");
                int p = bundle.getInt("p");
                int j = bundle.getInt("j");

                t +=1;

                Intent intent5 = new Intent(getBaseContext(), personality_6_Activity.class);
                intent5.putExtra("e", e);
                intent5.putExtra("i", i);
                intent5.putExtra("f", f);
                intent5.putExtra("t", t);
                intent5.putExtra("p", p);
                intent5.putExtra("j", j);


                startActivity(intent5);
            }
        });
    }
}