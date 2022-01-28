package com.example.demo.domain;

/**
 * packageName: com.example.demo
 * fileName   : BmiApp
 * author     : seoseongmin
 * date       : 2022-01-25
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-25     seoseongmin        최초 생성
 */


public class BmiDTO {
    public static String BMI = "BMI";
    private String name;
    private String height;
    private String weight;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getHeight(){
        return height;
    }
    public void setHeight(String height){
        this.height = height;
    }

    public String getWeight(){
        return weight;
    }
    public void setWeight(String weight){
        this.weight = weight;
    }

}

