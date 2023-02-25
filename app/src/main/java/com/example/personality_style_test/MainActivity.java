package com.example.personality_style_test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.personality_style_test.personality.personalitytest_Activity;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class MainActivity extends AppCompatActivity {



    private AdView mAdView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {

            @Override

            public void onInitializationComplete(InitializationStatus initializationStatus) {

            }

        });

        mAdView2 = findViewById(R.id.adView2);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView2.loadAd(adRequest);

        Button personality = (Button)findViewById(R.id.personality);
        Button humor = (Button)findViewById(R.id.humor);
        Button mbtiTest = (Button)findViewById(R.id.mbtiTest);
        Button couple = (Button)findViewById(R.id.couple);

        personality.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), PersonalityActivity.class);
                startActivity(intent);
            }
        });


        humor.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), HumorActivity.class);
                startActivity(intent);
            }
        });

        mbtiTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), personalitytest_Activity.class);
                startActivity(intent);
            }
        });

        couple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), coupleActivity.class);
                startActivity(intent);
            }
        });
    }




}