package com.example.demo;

import java.util.Scanner;

/**
 * packageName: com.example.demo
 * fileName   : AmazonDemo
 * author     : seoseongmin
 * date       : 2022-01-26
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-26     seoseongmin        최초 생성
 */
public class AmazonDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AmazonApp amazonApp= new AmazonApp();
        String res = amazonApp.getAmazon();
        System.out.println(res);
    }


}
