package com.example.personality_style_test;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class HumorItemView extends LinearLayout {

    TextView humortitle_resource, humordescription_resource, humortime_resource;
    ImageView humorimg_resource;

    public HumorItemView(Context context){
        super(context);
        init(context);
    }

    public HumorItemView(Context context, AttributeSet attrs){
        super(context, attrs);
        init(context);

    }
    private void init(Context context){
        //만들어놓은 xml파일을 객체화해와서 붙이는 역할을 하면 되겠죠
        //서비스에서 제공하는 LAYOUT_INFLATER_SERVICE를 활용합니다.
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //객체화하기위해서 인플레이션 서비스를 활용함
        inflater.inflate(R.layout.humor_item,this,true);
        //이 소스가 Linear를 상속받았으므로 siger_item을 바로 this에 붙일 수 있음

        humortitle_resource = findViewById(R.id.humor_title_resource);
        humordescription_resource = findViewById(R.id.humor_description_resource);
        humortime_resource = findViewById(R.id.humor_time_resource);
        humorimg_resource = findViewById(R.id.humor_img_resource);
    }


    public void setHumor_title_resource(String humor_title_resource1){
        humortitle_resource.setText(humor_title_resource1);
    }

    public void setHumordescription_resource(String humor_description_resource1){
        humordescription_resource.setText(humor_description_resource1);
    }

    public void setHumortime_resource(String humor_time_resource1){
        humortime_resource.setText(humor_time_resource1);
    }

    public void setHumorimg_resource(int humor_img_resource1){
        humorimg_resource.setImageResource(humor_img_resource1);
    }
}
