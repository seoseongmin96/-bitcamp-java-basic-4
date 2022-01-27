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
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalcApp calcApp = new CalcApp();
        System.out.println(CalcApp.CALC_APP);
        System.out.println("첫번째 숫자 : ");
        int num1 = scanner.nextInt();
        System.out.println("연산자 + - * / : ");
        String opcode = scanner.next();
        System.out.println("두번째 숫자 : ");
        int num2 = scanner.nextInt();
        System.out.println("연산결과 : ");
        String result = calcApp.calc(num1, opcode, num2);
        System.out.println("연산결과 : "+ result);
    }
}

