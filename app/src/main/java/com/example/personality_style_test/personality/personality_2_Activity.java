package com.example.personality_style_test.personality;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;

public class personality_2_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personality2);

        Button personality_2_yes = (Button) findViewById(R.id.personality_2_yes);
        Button personality_2_no = (Button) findViewById(R.id.personality_2_no);

        personality_2_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = getIntent();
                Bundle bundle = intent.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int f = 0;
                f +=1;

                Intent intent2 = new Intent(getBaseContext(), personality_3_Activity.class);
                intent2.putExtra("e", e);
                intent2.putExtra("i", i);
                intent2.putExtra("f", f);

                startActivity(intent2);
            }
        });

        personality_2_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = getIntent();
                Bundle bundle = intent.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int t = 0;
                t +=1;

                Intent intent2 = new Intent(getBaseContext(), personality_3_Activity.class);
                intent2.putExtra("e", e);
                intent2.putExtra("i", i);
                intent2.putExtra("t", t);

                startActivity(intent2);
            }
        });
    }
}