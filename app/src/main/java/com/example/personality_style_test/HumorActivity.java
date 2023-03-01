package com.example.personality_style_test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;


import com.example.personality_style_test.caketest.CakeTestActivity;

import com.example.personality_style_test.foodtest.foodtestActivity;

import com.example.personality_style_test.santatest.santatestActivity;


import java.util.ArrayList;

public class HumorActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_humor);

        ListView humor_list = (ListView)findViewById(R.id.humor_list);
        HumorAdapter adapter = new HumorAdapter();
        adapter.addItem(new HumorItem("음식 호불호테스트", "당신의 음식 호불호 취향을 알아보세요. 내가 어디까지 먹을 수 있을지 테스트 해보세요.","소요시간 : 2분 내외", R.drawable.foodtest));
        adapter.addItem(new HumorItem("내가 산타라면?", "크리스마스를 맞아 아이들에게 선물을 나눠주려고 합니다. 과연 나는 어떤 산타일까요?", "소요시간 : 3분 내외", R.drawable.santatest));
        adapter.addItem(new HumorItem("크리스마스 케이크 테스트", "이번 크리스마스에는 어떤 케이크가 나와 어울릴까? 케이크에 대해 고민을 하고 있는 당신을 위해 테스트를 통해 케이크를 골라드립니다.", "소요시간 : 3분 내외", R.drawable.caketest));
        humor_list.setAdapter(adapter);


        humor_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //final PersonalityItem item = (PersonalityItem) adapter.getItem(position);
                if(position==0){
                    Intent intent = new Intent(HumorActivity.this, foodtestActivity.class);
                    startActivity(intent);
                }
                if(position==1){
                    Intent intent = new Intent( HumorActivity.this, santatestActivity.class);
                    startActivity(intent);
                }
                if(position==2){
                    Intent intent = new Intent(HumorActivity.this, CakeTestActivity.class);
                    startActivity(intent);
                }


            }
        });


    }

    class HumorAdapter extends BaseAdapter {
        ArrayList<HumorItem> items = new ArrayList<HumorItem>();

        @Override
        public int getCount(){
            return items.size();
        }

        public void addItem(HumorItem item){
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
            HumorItemView humorItemView = null;
            if(convertView ==null){
                humorItemView = new HumorItemView(getApplicationContext());

            }else{
                humorItemView = (HumorItemView) convertView;
            }
            HumorItem item = items.get(position);
            humorItemView.setHumor_title_resource(item.getHumor_title_resource1());
            humorItemView.setHumordescription_resource(item.getHumor_description_resource1());
            humorItemView.setHumortime_resource(item.getHumor_time_resource1());
            humorItemView.setHumorimg_resource(item.getHumor_img_resource1());
            return humorItemView;
        }
    }

}