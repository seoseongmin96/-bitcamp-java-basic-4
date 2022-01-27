package com.example.demo.Abc;

import java.util.Scanner;

/**
 * packageName: com.example.demo
 * fileName   : AbcDemo
 * author     : seoseongmin
 * date       : 2022-01-26
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-26     seoseongmin        최초 생성
 */
public class AbcDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AbcApp abcApp = new AbcApp();
        String res = abcApp.getAbc();
        System.out.println(res);
    }

}
