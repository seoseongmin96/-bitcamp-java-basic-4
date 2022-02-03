package com.example.demo.controller;

import com.example.demo.domain.GradeDTO;

import java.util.Scanner;

/**
 * packageName: com.example.demo
 * fileName   : TempController
 * author     : seoseongmin
 * date       : 2022-02-03
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-03     seoseongmin        최초 생성
 */
public class TempController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("학생수는 몇명 ?");
        int count = scanner.nextInt();

        GradeDTO[] grades = new GradeDTO[count];
        for(int i =0; i<grades.length; i++){
            System.out.println("이름,국어,영어,수학점수 ");
            grades[i] = new GradeDTO();
            grades[i].setName(scanner.next());
            grades[i].setKor(scanner.nextInt());
            grades[i].setEng(scanner.nextInt());
            grades[i].setMath(scanner.nextInt());

        }
        for(int i = 0; i < grades.length; i++){
            System.out.println(" 이름  : "+grades[i].getName());
            System.out.println(" 국어점수 : "+grades[i].getKor());
            System.out.println(" 국어점수 : "+grades[i].getEng());
            System.out.println(" 수학점수 : "+grades[i].getMath());



        }
    }
}