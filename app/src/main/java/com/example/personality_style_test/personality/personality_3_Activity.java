package com.example.personality_style_test.personality;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;

public class personality_3_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personality3);

        Button personality_3_yes = (Button) findViewById(R.id.personality_3_yes);
        Button personality_3_no = (Button) findViewById(R.id.personality_3_no);

        personality_3_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent2 = getIntent();
                Bundle bundle = intent2.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int t = bundle.getInt("t");
                int f = bundle.getInt("f");
                int p = 0;
                p += 1;


                Intent intent3 = new Intent(getBaseContext(), personality_4_Activity.class);
                intent3.putExtra("e", e);
                intent3.putExtra("i", i);
                intent3.putExtra("f", f);
                intent3.putExtra("t", t);
                intent3.putExtra("p", p);


                startActivity(intent3);
            }
        });

        personality_3_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent2 = getIntent();
                Bundle bundle = intent2.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int t = bundle.getInt("t");
                int f = bundle.getInt("f");
                int j = 0;
                j += 1;


                Intent intent3 = new Intent(getBaseContext(), personality_4_Activity.class);
                intent3.putExtra("e", e);
                intent3.putExtra("i", i);
                intent3.putExtra("f", f);
                intent3.putExtra("t", t);
                intent3.putExtra("j", j);


                startActivity(intent3);
            }
        });
    }
}