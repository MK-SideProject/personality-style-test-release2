package com.example.personality_style_test;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class coupleActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_couple);


        Button couple_input_button = (Button) findViewById(R.id.couple_input_button);
        ImageView imageView_mbti_result = (ImageView) findViewById(R.id.imageView_mbti_result);
        TextView couple_mbti_result_text = (TextView) findViewById(R.id.couple_mbti_result_text);
        EditText couple_input_text = (EditText) findViewById(R.id.couple_input_text);

        //버튼을 누를때, 텍스트뷰 글씨 변경, 이미지뷰 결과화면 변경

        couple_input_text.setInputType ( InputType. TYPE_TEXT_FLAG_NO_SUGGESTIONS );

        couple_input_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mbti = couple_input_text.getText().toString();
                mbti  = mbti.toUpperCase();



              if (mbti.length() == 0 ) {
                        //공백일 때 처리할 내용
                   Toast.makeText(getApplicationContext(), "값을 입력해서 눌러주세요.",Toast.LENGTH_SHORT).show();

             }
             else{
                  if( mbti.equals("ENTJ") ) {
                      //텍스트 뷰 전환해주기
                      couple_mbti_result_text.setText("ENTJ와 어울리는 궁합은");
                      // 이미지 뷰 결과화면 변경
                      imageView_mbti_result.setImageResource(R.drawable.couple_entj);

                 }else if(mbti.equals("ENTP")){
                      //텍스트 뷰 전환해주기
                      couple_mbti_result_text.setText("ENTP와 어울리는 궁합은");
                      // 이미지 뷰 결과화면 변경
                      imageView_mbti_result.setImageResource(R.drawable.couple_entp);

                  }else if(mbti.equals("ENFJ")){
                      //텍스트 뷰 전환해주기
                      couple_mbti_result_text.setText("ENFJ와 어울리는 궁합은");
                      // 이미지 뷰 결과화면 변경
                      imageView_mbti_result.setImageResource(R.drawable.couple_enfj);
                  }else if(mbti.equals("ENFP")){

                      //텍스트 뷰 전환해주기
                      couple_mbti_result_text.setText("ENFP와 어울리는 궁합은");
                      // 이미지 뷰 결과화면 변경
                      imageView_mbti_result.setImageResource(R.drawable.couple_enfp);
                  }else if(mbti.equals("ESTP")){

                      //텍스트 뷰 전환해주기
                      couple_mbti_result_text.setText("ESTP와 어울리는 궁합은");
                      // 이미지 뷰 결과화면 변경
                      imageView_mbti_result.setImageResource(R.drawable.couple_estp);
                  }else if(mbti.equals("ESTJ")) {

                      //텍스트 뷰 전환해주기
                      couple_mbti_result_text.setText("ESTJ와 어울리는 궁합은");
                      // 이미지 뷰 결과화면 변경
                      imageView_mbti_result.setImageResource(R.drawable.couple_estj);
                  }else if(mbti.equals("ESFJ")){

                      //텍스트 뷰 전환해주기
                      couple_mbti_result_text.setText("ESFJ와 어울리는 궁합은");
                      // 이미지 뷰 결과화면 변경
                      imageView_mbti_result.setImageResource(R.drawable.couple_esfj);
                  }else if(mbti.equals("ESFP")){

                      //텍스트 뷰 전환해주기
                      couple_mbti_result_text.setText("ESFP와 어울리는 궁합은");
                      // 이미지 뷰 결과화면 변경
                      imageView_mbti_result.setImageResource(R.drawable.couple_esfp);
                  }else if(mbti.equals("INTJ")){
                      //텍스트 뷰 전환해주기
                      couple_mbti_result_text.setText("INTJ와 어울리는 궁합은");
                      // 이미지 뷰 결과화면 변경
                      imageView_mbti_result.setImageResource(R.drawable.couple_intj);

                  }else if(mbti.equals("INTP")){

                      //텍스트 뷰 전환해주기
                      couple_mbti_result_text.setText("INTP와 어울리는 궁합은");
                      // 이미지 뷰 결과화면 변경
                      imageView_mbti_result.setImageResource(R.drawable.couple_intp);
                  }else if(mbti.equals("INFJ")){

                      //텍스트 뷰 전환해주기
                      couple_mbti_result_text.setText("INFJ와 어울리는 궁합은");
                      // 이미지 뷰 결과화면 변경
                      imageView_mbti_result.setImageResource(R.drawable.couple_infj);
                  }else if(mbti.equals("INFP")){
                      //텍스트 뷰 전환해주기
                      couple_mbti_result_text.setText("INFP와 어울리는 궁합은");
                      // 이미지 뷰 결과화면 변경
                      imageView_mbti_result.setImageResource(R.drawable.couple_infp);

                  }else if(mbti.equals("ISTJ")){
                      //텍스트 뷰 전환해주기
                      couple_mbti_result_text.setText("ISTJ와 어울리는 궁합은");
                      // 이미지 뷰 결과화면 변경
                      imageView_mbti_result.setImageResource(R.drawable.couple_istj);

                  }else if(mbti.equals("ISTP")){
                      //텍스트 뷰 전환해주기
                      couple_mbti_result_text.setText("ISTP와 어울리는 궁합은");
                      // 이미지 뷰 결과화면 변경
                      imageView_mbti_result.setImageResource(R.drawable.couple_istp);

                  }else if(mbti.equals("ISFJ")){
                      //텍스트 뷰 전환해주기
                      couple_mbti_result_text.setText("ISFJ와 어울리는 궁합은");
                      // 이미지 뷰 결과화면 변경
                      imageView_mbti_result.setImageResource(R.drawable.couple_isfj);
                  }else if(mbti.equals("ISFP")){

                      //텍스트 뷰 전환해주기
                      couple_mbti_result_text.setText("ISFP와 어울리는 궁합은");
                      // 이미지 뷰 결과화면 변경
                      imageView_mbti_result.setImageResource(R.drawable.couple_isfp);
                  }else{
                      Toast.makeText(getApplicationContext(), "MBTI관련 단어만 입력해주세요.",Toast.LENGTH_SHORT).show();
                  }
            }


            }
        });
    }

}