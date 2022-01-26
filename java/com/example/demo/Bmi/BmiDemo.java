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
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BmiApp bmiApp = new BmiApp();
        System.out.println("name");
        System.out.println("height");
        System.out.println("weight");
        String name = scanner.next();
        String height = scanner.next();
        String weight = scanner.next();
        String res = bmiApp.bmi(name, height, weight);
        System.out.println(res);
    }
}