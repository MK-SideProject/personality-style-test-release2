package com.example.personality_style_test.personality;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;

public class personality_4_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personality4);

        Button personality_4_yes = (Button) findViewById(R.id.personality_4_yes);
        Button personality_4_no = (Button) findViewById(R.id.personality_4_no);

        personality_4_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent3 = getIntent();
                Bundle bundle = intent3.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int t = bundle.getInt("t");
                int f = bundle.getInt("f");
                int p = bundle.getInt("p");
                int j = bundle.getInt("j");

                i +=1;

                Intent intent4 = new Intent(getBaseContext(), personality_5_Activity.class);
                intent4.putExtra("e", e);
                intent4.putExtra("i", i);
                intent4.putExtra("f", f);
                intent4.putExtra("t", t);
                intent4.putExtra("p", p);
                intent4.putExtra("j", j);


                startActivity(intent4);
            }
        });

        personality_4_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent3 = getIntent();
                Bundle bundle = intent3.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int t = bundle.getInt("t");
                int f = bundle.getInt("f");
                int p = bundle.getInt("p");
                int j = bundle.getInt("j");

                e +=1;

                Intent intent4 = new Intent(getBaseContext(), personality_5_Activity.class);
                intent4.putExtra("e", e);
                intent4.putExtra("i", i);
                intent4.putExtra("f", f);
                intent4.putExtra("t", t);
                intent4.putExtra("p", p);
                intent4.putExtra("j", j);


                startActivity(intent4);
            }
        });
    }
}