package com.example.personality_style_test.personality;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;
import com.example.personality_style_test.foodtest.foodtest_2_Activity;

public class personality_1_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personality1);

        Button personality_1_yes = (Button) findViewById(R.id.personality_1_yes);
        Button personality_1_no = (Button) findViewById(R.id.personality_1_no);

        personality_1_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                int e = 0;
                e +=1;

                Intent intent = new Intent(getBaseContext(), personality_2_Activity.class);
                intent.putExtra("e", e);

                startActivity(intent);
            }
        });

        personality_1_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                int i = 0;
                i +=1;

                Intent intent = new Intent(getBaseContext(), personality_2_Activity.class);
                intent.putExtra("i", i);

                startActivity(intent);
            }
        });
    }
}