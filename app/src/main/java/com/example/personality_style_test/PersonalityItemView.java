package com.example.personality_style_test;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class PersonalityItemView extends LinearLayout {

    TextView title_resource, description_resource, time_resource;
    ImageView img_resource;

    public PersonalityItemView(Context context){
        super(context);
        init(context);
    }

    public PersonalityItemView(Context context, AttributeSet attrs){
        super(context, attrs);
        init(context);

    }
    private void init(Context context){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //객체화하기위해서 인플레이션 서비스를 활용함
        inflater.inflate(R.layout.personality_item,this,true);
        //이 소스가 Linear를 상속받았으므로 siger_item을 바로 this에 붙일 수 있음

        title_resource = findViewById(R.id.title_resource1);
        description_resource = findViewById(R.id.description_resource1);
        time_resource = findViewById(R.id.time_resource1);
        img_resource = findViewById(R.id.img_resource1);



    }





    public void setTitle_resource1(String title_resource1){
        title_resource.setText(title_resource1);
    }

    public void setDescription_resource1(String description_resource1){
        description_resource.setText(description_resource1);
    }

    public void setTime_resource1(String time_resource1){
        time_resource.setText(time_resource1);
    }

    public void setImg_resource1(int img_resource1) {
        img_resource.setImageResource(img_resource1);

    }


}
