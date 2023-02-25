package com.example.personality_style_test;

public class HumorItem {

    String humor_title_resource1;
    String humor_description_resource1;
    String humor_time_resource1;
    int humor_img_resource1;

    public HumorItem(String humor_title_resource1, String humor_description_resource1, String humor_time_resource1, int humor_img_resource1){
        this.humor_title_resource1 = humor_title_resource1;
        this.humor_description_resource1 = humor_description_resource1;
        this.humor_time_resource1 = humor_time_resource1;
        this.humor_img_resource1 = humor_img_resource1;
    }


    public String getHumor_title_resource1(){
        return humor_title_resource1;
    }

    public void setHumor_title_resource1(String humor_title_resource1){
        this.humor_title_resource1 = humor_title_resource1;
    }

    public String getHumor_description_resource1(){
        return humor_description_resource1;
    }

    public void setHumor_description_resource1(String humor_description_resource1){
        this.humor_description_resource1 = humor_description_resource1;
    }

    public String getHumor_time_resource1(){
        return humor_time_resource1;
    }

    public void setHumor_time_resource1(String humor_time_resource1){
        this.humor_time_resource1 = humor_time_resource1;
    }

    public int getHumor_img_resource1(){
        return humor_img_resource1;
    }

    public void setHumor_img_resource1(int humor_img_resource1){
        this.humor_img_resource1= humor_img_resource1;
    }

    @Override
    public String toString(){
        return "PersonalityItem{" +
                "name='"+ humor_time_resource1 + '\'' +
                ", explanation='"+ humor_description_resource1 + '\'' +
                ", time='"+ humor_time_resource1 + '\'' +
                '}';

    }
}
