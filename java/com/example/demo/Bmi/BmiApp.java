package com.example.demo.Bmi;

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


public class BmiApp {
    public static String BMI = "BMI";
    private String name;
    private String height;
    private String weight;
    public String bmi(String name, String height, String weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
        String res = String.format("res, this.name, this.height, this.weight");
        return res;
    }
}