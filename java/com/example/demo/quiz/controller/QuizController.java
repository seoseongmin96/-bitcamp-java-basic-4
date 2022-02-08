package com.example.demo.quiz.controller;

import com.example.demo.quiz.service.QuizService;
import com.example.demo.quiz.service.QuizServiceImpl;

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
public class QuizController {
   public void execute(Scanner scanner) {
        Feb06Controller feb06Controller = new Feb06Controller();
        Feb07Controller feb07Controller = new Feb07Controller();
        Feb08Controller feb08Controller = new Feb08Controller();
        Feb09Controller feb09Controller = new Feb09Controller();

       while (true) {
           System.out.println("0)Exit 1)2월 6일 2)2월 7일 3)2월 8일 4)2월 9일");
           switch (scanner.next()) {
               case "0":
                   System.out.println("### Exit ###");
                   return;
               case "1":
                   System.out.println("2월 6일");
                   feb06Controller.execute(scanner);
                   break;
               case "2":
                   System.out.println("2월 7일");
                   feb07Controller.execute(scanner);
                   break;
               case  "3":
                   System.out.println("2월 8일");
                   feb08Controller.execute(scanner);
               case "4":
                   System.out.println("2월 9일");
                   feb09Controller.execute(scanner);


           }
       }
   }
}



















