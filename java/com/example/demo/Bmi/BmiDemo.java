package com.example.demo.Bmi;

import com.example.demo.Bmi.BmiApp;

import java.util.Scanner;

/**
 * packageName: com.example.demo
 * fileName   : BmiDemo
 * author     : seoseongmin
 * date       : 2022-01-25
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-25     seoseongmin        최초 생성
 */
public class BmiDemo {
    public String execute(String name, String height, String weight){
        System.out.println();
        BmiApp bmiApp = new BmiApp();

        return bmiApp.getBmi(name, height, weight);

    }



}