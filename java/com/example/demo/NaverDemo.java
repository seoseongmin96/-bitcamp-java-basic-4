package com.example.demo;

import java.util.Scanner;

/**
 * packageName: com.example.demo
 * fileName   : NaverDemo
 * author     : seoseongmin
 * date       : 2022-01-25
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-25     seoseongmin        최초 생성
 */

public class NaverDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NaverApp naverApp = new NaverApp();
        System.out.println("ID");
        String ID = scanner.next();
        System.out.println("PW");
        String PW = scanner.next();
        String res = naverApp.naver(ID, PW);
        System.out.println(res);
    }
}
