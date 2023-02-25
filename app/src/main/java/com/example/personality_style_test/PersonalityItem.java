package com.example.personality_style_test;

public class PersonalityItem {
    String title_resource1;
    String description_resource1;
    String time_resource1;
    int img_resource1;

    public PersonalityItem(String title_resource1, String description_resource1, String time_resource1, int img_resource1){
       this.title_resource1 = title_resource1;
       this.description_resource1 = description_resource1;
       this.time_resource1 = time_resource1;
       this.img_resource1 = img_resource1;
    }


    public String getTitle_resource1(){
        return title_resource1;
    }

    public void setTitle_resource1(String title_resource1){
        this.title_resource1 = title_resource1;
    }

    public String getDescription_resource1(){
        return description_resource1;
    }

    public void setDescription_resource1(String description_resource1){
        this.description_resource1 = description_resource1;
    }

    public String getTime_resource1(){
        return time_resource1;
    }

    public void setTime_resource1(String time_resource1){
        this.time_resource1 = time_resource1;
    }

    public int getImg_resource1(){
        return img_resource1;
    }

    public void setImg_resource1(int img_resource1){
        this.img_resource1= img_resource1;
    }

    @Override
    public String toString(){
        return "PersonalityItem{" +
                "name='"+ time_resource1 + '\'' +
                ", explanation='"+ description_resource1 + '\'' +
                ", time='"+ time_resource1 + '\'' +
                '}';

    }
}
