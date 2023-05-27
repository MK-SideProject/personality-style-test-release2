package com.example.personality_style_test.personality;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.R;
import com.example.personality_style_test.foodtest.foodtest_result1_Activity;
import com.example.personality_style_test.foodtest.foodtest_result2_Activity;
import com.example.personality_style_test.foodtest.foodtest_result3_Activity;

public class personality_40_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personality40);

        Button personality_40_yes = (Button) findViewById(R.id.personality_40_yes);
        Button personality_40_no = (Button) findViewById(R.id.personality_40_no);

        personality_40_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent39 = getIntent();
                Bundle bundle = intent39.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int n = bundle.getInt("n");
                int s = bundle.getInt("s");
                int f = bundle.getInt("f");
                int t = bundle.getInt("t");
                int p = bundle.getInt("p");
                int j = bundle.getInt("j");

                n+=1;

                //1
                if(e > i && n > s && f> t && p > j){
                    Intent intent40 = new Intent(getBaseContext(), personality_result_enfp.class);
                    startActivity(intent40);
                }
                //2
                else if(e > i && n > s && f > t && p < j){
                    Intent intent40 = new Intent(getBaseContext(), personality_result_enfj.class);
                    startActivity(intent40);
                }
                //3
                else if(e > i && n > s && f < t && p > j){
                    Intent intent40 = new Intent(getBaseContext(), personality_result_entp.class);
                    startActivity(intent40);
                }
                //4
                else if(e > i && n > s && f < t && p < j){
                    Intent intent40 = new Intent(getBaseContext(), personality_result_entj.class);
                    startActivity(intent40);
                }
                //5
                else if(e > i && n < s && f > t && p > j){
                    Intent intent40 = new Intent(getBaseContext(), personality_result_esfp.class);
                    startActivity(intent40);
                }
                //6
                else if(e > i && n < s && f > t && p < j){
                    Intent intent40 = new Intent(getBaseContext(), personality_result_esfj.class);
                    startActivity(intent40);
                }
                //7
                else if(e > i && n < s && f < t && p > j){
                    Intent intent40 = new Intent(getBaseContext(), personality_result_estp.class);
                    startActivity(intent40);
                }//8
                else if(e > i && n < s && f < t && p < j){
                    Intent intent40 = new Intent(getBaseContext(), personality_result_estj.class);
                    startActivity(intent40);
                }//9
                if(e < i && n > s && f> t && p > j){
                    Intent intent40 = new Intent(getBaseContext(), personality_result_infp.class);
                    startActivity(intent40);
                }
                else if(e < i && n > s && f > t && p < j){
                    Intent intent40 = new Intent(getBaseContext(), personality_result_infj.class);
                    startActivity(intent40);
                }
                else if(e < i && n > s && f < t && p > j){
                    Intent intent40 = new Intent(getBaseContext(), personality_result_intp.class);
                    startActivity(intent40);
                }
                else if(e < i && n > s && f < t && p < j){
                    Intent intent40 = new Intent(getBaseContext(), personality_result_intj.class);
                    startActivity(intent40);
                }
                else if(e < i && n < s && f > t && p > j){
                    Intent intent40 = new Intent(getBaseContext(), personality_result_isfp.class);
                    startActivity(intent40);
                }
                else if(e < i && n < s && f > t && p < j){
                    Intent intent40 = new Intent(getBaseContext(), personality_result_isfj.class);
                    startActivity(intent40);
                }
                else if(e < i && n < s && f < t && p > j){
                    Intent intent40 = new Intent(getBaseContext(), personality_result_istp.class);
                    startActivity(intent40);
                }
                else if(e < i && n < s && f < t && p < j){
                    Intent intent40 = new Intent(getBaseContext(), personality_result_istj.class);
                    startActivity(intent40);
                }
                else{
                    Intent intent40 = new Intent(getBaseContext(), personality_result_enfp.class);
                    startActivity(intent40);

                }


            }
        });

        personality_40_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent39 = getIntent();
                Bundle bundle = intent39.getExtras();

                int e = bundle.getInt("e");
                int i = bundle.getInt("i");
                int n = bundle.getInt("n");
                int s = bundle.getInt("s");
                int f = bundle.getInt("f");
                int t = bundle.getInt("t");
                int p = bundle.getInt("p");
                int j = bundle.getInt("j");

                s+=1;

                //1
                if(e > i && n > s && f> t && p > j){
                    Intent intent40 = new Intent(getBaseContext(), personality_result_enfp.class);
                    startActivity(intent40);
                }
                //2
                else if(e > i && n > s && f > t && p < j){
                    Intent intent40 = new Intent(getBaseContext(), personality_result_enfj.class);
                    startActivity(intent40);
                }
                //3
                else if(e > i && n > s && f < t && p > j){
                    Intent intent40 = new Intent(getBaseContext(), personality_result_entp.class);
                    startActivity(intent40);
                }
                //4
                else if(e > i && n > s && f < t && p < j){
                    Intent intent40 = new Intent(getBaseContext(), personality_result_entj.class);
                    startActivity(intent40);
                }
                //5
                else if(e > i && n < s && f > t && p > j){
                    Intent intent40 = new Intent(getBaseContext(), personality_result_esfp.class);
                    startActivity(intent40);
                }
                //6
                else if(e > i && n < s && f > t && p < j){
                    Intent intent40 = new Intent(getBaseContext(), personality_result_esfj.class);
                    startActivity(intent40);
                }
                //7
                else if(e > i && n < s && f < t && p > j){
                    Intent intent40 = new Intent(getBaseContext(), personality_result_estp.class);
                    startActivity(intent40);
                }//8
                else if(e > i && n < s && f < t && p < j){
                    Intent intent40 = new Intent(getBaseContext(), personality_result_estj.class);
                    startActivity(intent40);
                }//9
                if(e < i && n > s && f> t && p > j){
                    Intent intent40 = new Intent(getBaseContext(), personality_result_infp.class);
                    startActivity(intent40);
                }
                else if(e < i && n > s && f > t && p < j){
                    Intent intent40 = new Intent(getBaseContext(), personality_result_infj.class);
                    startActivity(intent40);
                }
                else if(e < i && n > s && f < t && p > j){
                    Intent intent40 = new Intent(getBaseContext(), personality_result_intp.class);
                    startActivity(intent40);
                }
                else if(e < i && n > s && f < t && p < j){
                    Intent intent40 = new Intent(getBaseContext(), personality_result_intj.class);
                    startActivity(intent40);
                }
                else if(e < i && n < s && f > t && p > j){
                    Intent intent40 = new Intent(getBaseContext(), personality_result_isfp.class);
                    startActivity(intent40);
                }
                else if(e < i && n < s && f > t && p < j){
                    Intent intent40 = new Intent(getBaseContext(), personality_result_isfj.class);
                    startActivity(intent40);
                }
                else if(e < i && n < s && f < t && p > j){
                    Intent intent40 = new Intent(getBaseContext(), personality_result_istp.class);
                    startActivity(intent40);
                }
                else if(e < i && n < s && f < t && p < j){
                    Intent intent40 = new Intent(getBaseContext(), personality_result_istj.class);
                    startActivity(intent40);
                }
                else{
                    Intent intent40 = new Intent(getBaseContext(), personality_result_enfp.class);
                    startActivity(intent40);

                }

            }
        });

    }
}