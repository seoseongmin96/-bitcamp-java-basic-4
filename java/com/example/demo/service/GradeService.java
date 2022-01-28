package com.example.demo.service;

import com.example.demo.domain.GradeDTO;

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
public class GradeService {
    public String getGrade(GradeDTO grade){
       int total = grade.getKor() + grade.getEng() + grade.getMath();
       int avg = total /3;
       String pass = (avg >=60) ? "합격" : "불합격";

        return String.format("* ########## %s ########\n" +
                " * 이름: %s\n" +
                " * > 국어: %d\n" +
                " * > 영어: %d\n" +
                " * > 수학: %d\n" +
                " * 총점: %d\n" +
                " * 평균(정수): %d\n" +
                " * 합격여부: %s\n" +
                " * #######################",
                GradeDTO.GRADE_TITLE,
                grade.getName(),
                grade.getKor(),
                grade.getEng(),
                grade.getMath(),
                total,
                avg,
                pass);


    }
}










