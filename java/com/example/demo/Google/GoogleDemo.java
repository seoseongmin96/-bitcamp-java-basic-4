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
    public String execute(String search){
        GoogleApp googleApp = new GoogleApp();
        return googleApp.google(search);
    }

}
