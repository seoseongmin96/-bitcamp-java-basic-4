package com.example.demo.grade;

import org.springframework.boot.rsocket.context.RSocketPortInfoApplicationContextInitializer;

import java.util.Scanner;

/**
 * packageName: com.example.demo.grade
 * fileName   : GradeDemo
 * author     : seoseongmin
 * date       : 2022-01-26
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-26     seoseongmin        최초 생성
 */
public class GradeDemo {
    public String execute(String name, int kor, int eng, int math){
        GradeApp gradeApp = new GradeApp();
        return gradeApp.getGrade(name, kor, eng, math);


    }
}










