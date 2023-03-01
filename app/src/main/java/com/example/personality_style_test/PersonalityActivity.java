package com.example.personality_style_test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;

import com.example.personality_style_test.bankingtest.BankingTestActivity;

import com.example.personality_style_test.colortest.colorTestActivity;
import com.example.personality_style_test.exercisetest.exercisetestActivity;

import com.example.personality_style_test.planttest.planttestActivity;

import com.example.personality_style_test.triptest.triptestActivity;


import java.util.ArrayList;

public class PersonalityActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personality);

        ListView listView = (ListView)findViewById(R.id.listView);
        PersonalityAdapter adapter = new PersonalityAdapter();

        adapter.addItem(new PersonalityItem("컬러 테스트", "축제 개최를 위해 마을에 들어선 당신, 무엇을 할까요? 당신의 성격을 다양한 컬러와 매치시켜 보세요!","소요시간 : 3분 내외", R.drawable.colortest));
        adapter.addItem(new PersonalityItem("여행 테스트", "여행을 갈 때 당신은 어떤타입?! 테스트를 통해서 당신의 성격과 알맞는 여행지와 여행법을 추천해드립니다!","소요시간 : 3분 내외", R.drawable.triptest));
        adapter.addItem(new PersonalityItem("금융 레벨 테스트", "나의 금전 유형은 어떨까? 현 금융상태를 파악해서 어떤 방식으로 발전해야할지 알려주는 테스트입니다! 테스트 결과는 참고용으로만 써주세요!","소요시간 : 3분 내외", R.drawable.bankingtest));
        adapter.addItem(new PersonalityItem("식물 추천 테스트", "취향에 맞춰 방에 대한 선택지를 골라보세요. 방의 분위기와 어울리는 식물을 추천해드리는 테스트입니다!","소요시간 : 3분 내외", R.drawable.planttest));
        adapter.addItem(new PersonalityItem("운동 추천 테스트", "운동을 하기로 마음먹으셨나요? 당신과 잘어울리는 운동유형을 추천해주는 테스트입니다!","소요시간 : 3분 내외", R.drawable.exercisetest));
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //final PersonalityItem item = (PersonalityItem) adapter.getItem(position);
                if(position==0){
                    Intent intent = new Intent(PersonalityActivity.this, colorTestActivity.class);
                    startActivity(intent);
                }
                if(position==1){
                    Intent intent = new Intent(PersonalityActivity.this, triptestActivity.class);
                    startActivity(intent);
                }
                if(position==2){
                    Intent intent = new Intent(PersonalityActivity.this, BankingTestActivity.class);
                    startActivity(intent);
                }
                if(position==3){
                    Intent intent = new Intent(PersonalityActivity.this, planttestActivity.class);
                    startActivity(intent);
                }
                if(position==4){
                    Intent intent = new Intent(PersonalityActivity.this, exercisetestActivity.class);
                    startActivity(intent);
                }

            }
        });


    }

    class PersonalityAdapter extends BaseAdapter {
        ArrayList<PersonalityItem> items = new ArrayList<PersonalityItem>();

        @Override
        public int getCount(){
            return items.size();
        }

        public void addItem(PersonalityItem item){
            items.add(item);
        }

        @Override
        public Object getItem(int poition){
            return  items.get(poition);
        }

        @Override
        public long getItemId(int position){
            return position;
        }


        @Override
        public View getView(int position, View convertView, ViewGroup parent){
            PersonalityItemView personalityItemView = null;
            if(convertView ==null){
                personalityItemView = new PersonalityItemView(getApplicationContext());

            }else{
                personalityItemView = (PersonalityItemView)convertView;
            }
            PersonalityItem item = items.get(position);
            personalityItemView.setTitle_resource1(item.getTitle_resource1());
            personalityItemView.setDescription_resource1(item.getDescription_resource1());
            personalityItemView.setTime_resource1(item.getTime_resource1());
            personalityItemView.setImg_resource1(item.getImg_resource1());
            return personalityItemView;
        }
    }
}