package com.example.personality_style_test.triptest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;
import com.example.personality_style_test.colortest.colortest_result1_Activity;
import com.example.personality_style_test.colortest.colortest_result2_Activity;
import com.example.personality_style_test.colortest.colortest_result3_Activity;
import com.example.personality_style_test.colortest.colortest_result4_Activity;
import com.example.personality_style_test.colortest.colortest_result5_Activity;

public class triptest_7_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triptest7);

        Button triptest_7_an1 = (Button) findViewById(R.id.triptest_7_an1);
        Button triptest_7_an2 = (Button) findViewById(R.id.triptest_7_an2);

        triptest_7_an1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {


                Intent intent6 = getIntent();
                Bundle bundle = intent6.getExtras();

                String alone_x = bundle.getString("alone_x");
                String alone_o = bundle.getString("alone_o");
                String plan_o = bundle.getString("plan_o");
                String plan_x = bundle.getString("plan_x");
                String active_o = bundle.getString("active_o");
                String active_x = bundle.getString("active_x");


                if((alone_o != null && alone_o.equals("alone_o") ) && (plan_o!= null && plan_o.equals("plan_o") ) && (active_x!= null && active_x.equals("active_x") )  ){
                    Intent intent7 = new Intent(getBaseContext(), triptest_result1_Activity.class);
                    startActivity(intent7);
                }
                else if((alone_o != null && alone_o.equals("alone_o") ) && (plan_o!= null && plan_o.equals("plan_o") ) && (active_o!= null && active_o.equals("active_o") ) ){
                    Intent intent7 = new Intent(getBaseContext(), triptest_result2_Activity.class);
                    startActivity(intent7);
                }
                else if((alone_o != null && alone_o.equals("alone_o") ) && (plan_x!= null && plan_x.equals("plan_x") ) && (active_o!= null && active_o.equals("active_o") )){
                    Intent intent7 = new Intent(getBaseContext(), triptest_result3_Activity.class);
                    startActivity(intent7);

                }
                else if((alone_o != null && alone_o.equals("alone_o") ) && (plan_x!= null && plan_x.equals("plan_x") ) && (active_x!= null && active_x.equals("active_x") )){
                    Intent intent7 = new Intent(getBaseContext(), triptest_result4_Activity.class);
                    startActivity(intent7);
                }
                else if((alone_x != null && alone_x.equals("alone_x") ) && (plan_o!= null && plan_o.equals("plan_o") ) && (active_o!= null && active_o.equals("active_o") )){
                    Intent intent7 = new Intent(getBaseContext(), triptest_result5_Activity.class);
                    startActivity(intent7);
                }
                else if((alone_x != null && alone_x.equals("alone_x") ) && (plan_x!= null && plan_x.equals("plan_x") ) && (active_o!= null && active_o.equals("active_o") )){
                    Intent intent7 = new Intent(getBaseContext(), triptest_result6_Activity.class);
                    startActivity(intent7);
                }
                else if((alone_x != null && alone_x.equals("alone_x") ) && (plan_o!= null && plan_o.equals("plan_o") ) && (active_x!= null && active_x.equals("active_x") )){
                    Intent intent7 = new Intent(getBaseContext(), triptest_result7_Activity.class);
                    startActivity(intent7);
                }
                else{
                    Intent intent7 = new Intent(getBaseContext(), triptest_result8_Activity.class);
                    startActivity(intent7);
                }


            }
        });

        triptest_7_an2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {


                Intent intent6 = getIntent();
                Bundle bundle = intent6.getExtras();

                String alone_x = bundle.getString("alone_x");
                String alone_o = bundle.getString("alone_o");
                String plan_o = bundle.getString("plan_o");
                String plan_x = bundle.getString("plan_x");
                String active_o = bundle.getString("active_o");
                String active_x = bundle.getString("active_x");


                if((alone_o != null && alone_o.equals("alone_o") ) && (plan_o!= null && plan_o.equals("plan_o") ) && (active_x!= null && active_x.equals("active_x") )  ){
                    Intent intent7 = new Intent(getBaseContext(), triptest_result1_Activity.class);
                    startActivity(intent7);
                }
                else if((alone_o != null && alone_o.equals("alone_o") ) && (plan_o!= null && plan_o.equals("plan_o") ) && (active_o!= null && active_o.equals("active_o") ) ){
                    Intent intent7 = new Intent(getBaseContext(), triptest_result2_Activity.class);
                    startActivity(intent7);
                }
                else if((alone_o != null && alone_o.equals("alone_o") ) && (plan_x!= null && plan_x.equals("plan_x") ) && (active_o!= null && active_o.equals("active_o") )){
                    Intent intent7 = new Intent(getBaseContext(), triptest_result3_Activity.class);
                    startActivity(intent7);

                }
                else if((alone_o != null && alone_o.equals("alone_o") ) && (plan_x!= null && plan_x.equals("plan_x") ) && (active_x!= null && active_x.equals("active_x") )){
                    Intent intent7 = new Intent(getBaseContext(), triptest_result4_Activity.class);
                    startActivity(intent7);
                }
                else if((alone_x != null && alone_x.equals("alone_x") ) && (plan_o!= null && plan_o.equals("plan_o") ) && (active_o!= null && active_o.equals("active_o") )){
                    Intent intent7 = new Intent(getBaseContext(), triptest_result5_Activity.class);
                    startActivity(intent7);
                }
                else if((alone_x != null && alone_x.equals("alone_x") ) && (plan_x!= null && plan_x.equals("plan_x") ) && (active_o!= null && active_o.equals("active_o") )){
                    Intent intent7 = new Intent(getBaseContext(), triptest_result6_Activity.class);
                    startActivity(intent7);
                }
                else if((alone_x != null && alone_x.equals("alone_x") ) && (plan_o!= null && plan_o.equals("plan_o") ) && (active_x!= null && active_x.equals("active_x") )){
                    Intent intent7 = new Intent(getBaseContext(), triptest_result7_Activity.class);
                    startActivity(intent7);
                }
                else{
                    Intent intent7 = new Intent(getBaseContext(), triptest_result8_Activity.class);
                    startActivity(intent7);
                }


            }
        });

    }
}