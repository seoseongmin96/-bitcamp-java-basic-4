package com.example.demo.calc;

import java.util.Scanner;

/**
 * packageName: com.example.demo.calc
 * fileName   : CalcDemo
 * author     : seoseongmin
 * date       : 2022-01-27
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-27     seoseongmin        최초 생성
 */
public class CalcDemo {
    public String execute(int num1, String opcode, int num2){
        CalcApp calcApp = new CalcApp();
        return calcApp.calc(num1, opcode, num2);

    }
}

