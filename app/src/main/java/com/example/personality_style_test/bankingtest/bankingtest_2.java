package com.example.personality_style_test.bankingtest;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.personality_style_test.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link bankingtest_2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class bankingtest_2 extends Fragment {


    public bankingtest_2() {
        // Required empty public constructor
    }


    public static bankingtest_2 newInstance(String param1, String param2) {
        bankingtest_2 fragment = new bankingtest_2();
        Bundle args = new Bundle();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View BankingTest2 = inflater.inflate(R.layout.fragment_bankingtest_2, container, false);

        Button bankingtest_2_an1 = (Button) BankingTest2.findViewById(R.id.bankingtest_2_an1);
        Button bankingtest_2_an2 = (Button) BankingTest2.findViewById(R.id.bankingtest_2_an2);
        Button bankingtest_2_an3 = (Button) BankingTest2.findViewById(R.id.bankingtest_2_an3);

        bankingtest_2_an1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //번들 메소드 받기
                Bundle bundle = getArguments();

                if(bundle != null) {

                    String bankingtest_result1 = bundle.getString("bankingtest_result1");
                    String bankingtest_result2 = bundle.getString("bankingtest_result2");
                    String bankingtest_result3 = bundle.getString("bankingtest_result3");

                    Log.d("check", bankingtest_result1);
                }

//                Intent intent2 = new Intent(getBaseContext(), bankingtest_3_Activity.class);
//                intent2.putExtra("bankingtest_result1", bankingtest_result1);
//                intent2.putExtra("bankingtest_result2", bankingtest_result2);
//                intent2.putExtra("bankingtest_result3", bankingtest_result3);
//                //Toast.makeText(getApplicationContext(), bankingtest_result1,Toast.LENGTH_SHORT).show();
//                startActivity(intent2);
            }
        });

        bankingtest_2_an2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                Intent intent = getIntent();
//                Bundle bundle = intent.getExtras();
//
//                String bankingtest_result1 = bundle.getString("bankingtest_result1");
//                String bankingtest_result2 = bundle.getString("bankingtest_result2");
//                String bankingtest_result3 = bundle.getString("bankingtest_result3");
//
//                Intent intent2 = new Intent(getBaseContext(), bankingtest_3_Activity.class);
//                intent2.putExtra("bankingtest_result1", bankingtest_result1);
//                intent2.putExtra("bankingtest_result2", bankingtest_result2);
//                intent2.putExtra("bankingtest_result3", bankingtest_result3);
//                //Toast.makeText(getApplicationContext(), bankingtest_result3,Toast.LENGTH_SHORT).show();
//                startActivity(intent2);
            }
        });

        bankingtest_2_an3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                Intent intent = getIntent();
//                Bundle bundle = intent.getExtras();
//
//                String bankingtest_result1 = bundle.getString("bankingtest_result1");
//                String bankingtest_result2 = bundle.getString("bankingtest_result2");
//                String bankingtest_result3 = bundle.getString("bankingtest_result3");
//
//                Intent intent2 = new Intent(getBaseContext(), bankingtest_3_Activity.class);
//                intent2.putExtra("bankingtest_result1", bankingtest_result1);
//                intent2.putExtra("bankingtest_result2", bankingtest_result2);
//                intent2.putExtra("bankingtest_result3", bankingtest_result3);
//                //Toast.makeText(getApplicationContext(), bankingtest_result2,Toast.LENGTH_SHORT).show();
//                startActivity(intent2);
            }
        });

        return BankingTest2;
    }

}