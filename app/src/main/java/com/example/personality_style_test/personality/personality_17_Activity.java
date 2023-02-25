package com.example.personality_style_test.personality;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;

public class personality_17_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personality17);

        Button personality_17_yes = (Button) findViewById(R.id.personality_17_yes);
        Button personality_17_no = (Button) findViewById(R.id.personality_17_no);

        personality_17_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent16 = getIntent();
                Bundle bundle = intent16.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int t = bundle.getInt("t");
                int f = bundle.getInt("f");
                int p = bundle.getInt("p");
                int j = bundle.getInt("j");
                int s = bundle.getInt("s");
                int n = bundle.getInt("n");

                p +=1;


                Intent intent17 = new Intent(getBaseContext(), personality_18_Activity.class);
                intent17.putExtra("e", e);
                intent17.putExtra("i", i);
                intent17.putExtra("f", f);
                intent17.putExtra("t", t);
                intent17.putExtra("p", p);
                intent17.putExtra("j", j);
                intent17.putExtra("s", s);
                intent17.putExtra("n", n);


                startActivity(intent17);
            }
        });

        personality_17_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent16 = getIntent();
                Bundle bundle = intent16.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int t = bundle.getInt("t");
                int f = bundle.getInt("f");
                int p = bundle.getInt("p");
                int j = bundle.getInt("j");
                int s = bundle.getInt("s");
                int n = bundle.getInt("n");

                j +=1;


                Intent intent17 = new Intent(getBaseContext(), personality_18_Activity.class);
                intent17.putExtra("e", e);
                intent17.putExtra("i", i);
                intent17.putExtra("f", f);
                intent17.putExtra("t", t);
                intent17.putExtra("p", p);
                intent17.putExtra("j", j);
                intent17.putExtra("s", s);
                intent17.putExtra("n", n);


                startActivity(intent17);
            }
        });
    }
}