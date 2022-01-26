package com.example.demo.Google;

import java.util.Scanner;

/**
 * packageName: com.example.demo
 * fileName   : GoogleDemo.java
 * author     : seoseongmin
 * date       : 2022-01-25
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-25     seoseongmin        최초 생성
 */
public class GoogleDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GoogleApp googleApp = new GoogleApp();
        System.out.println("search");
        String search = scanner.next();
        String res = googleApp.google(search);
        System.out.println(res);
    }
}
