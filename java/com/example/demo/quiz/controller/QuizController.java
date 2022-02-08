package com.example.demo.quiz.controller;

import com.example.demo.quiz.service.Feb06Service;
import com.example.demo.quiz.service.Feb06ServiceImpl;
import com.example.demo.quiz.service.Feb07Service;
import com.example.demo.quiz.service.Feb07ServiceImpl;

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
        Feb06Service feb06Service = new Feb06ServiceImpl();
        Feb07Service feb07Service = new Feb07ServiceImpl();


       while (true) {
           System.out.println("[서브메뉴]\n 0)Exit 1)2월 6일 2)2월 7일 3)2월 8일 4)2월 9일");
           switch (scanner.next()) {
               case "0":
                   System.out.println("### Exit ###");
                   return;
               case "1":
                   System.out.println("2월 6일");
                   String[] arr = {"권혜민", "조현국", "김진영", "김한슬", "서성민",
                           "정렬", "해시", "힙", "완전탐색", "DP",
                           "스택", "깊이우선탐색", "그래프", "탐욕법", "이분탐색",
                           "큐", "너비우선탐색"};




                   System.out.println("[소메뉴] 0.EXIT\n" + "1. 팀별 과제 출력 \n" + "2. 팀장이 맡은 과제만 출력 \n" +
                           "3. 큐를 담당한 사람을 출력 \n" + "4. 팀원별 과제 수를 출력 \n");
                   while (true){
                       switch (scanner.next()){
                           case "0" :
                               System.out.println("시스템종료"); return;
                           case "1" :
                               feb06Service.quiz1(arr); break;
                           case "2" :
                               feb06Service.quiz2(arr); break;
                           case "3" :
                               feb06Service.quiz3(arr); break;
                           case "4" :
                               feb06Service.quiz4(arr); break;
                           default:
                               System.out.println("번호 제대로 입력하기"); break;
                       }
                   }

                   case "2":
                   System.out.println("2월 7일");


                       while (true){
                           System.out.println("메뉴 선택"); //메뉴출력
                           String menu = "\"메뉴 0.EXIT 1.주사위 dice 2.가위바위보 Rps 3.입력받은 두 수 사이의 있는 소수 구하기 getPrime \" +\n" +
                                   "  \"4.자바로 입력받은 연도가 윤년인지 평년인지 판단하기 leapYear 5. 임의로 입력받은 숫자 맞추기 numberGolf\"";
                           System.out.println(menu); // 메뉴를 보여준다
                           String select = scanner.next(); //메뉴를 선택할 수 있는 select라는 변수를 쓰기 위해
                           String res = "";
                           switch (select){ // 조건문 switch  사용 select라는 입력변수
                               case  "0" : // 0인경우
                                   System.out.println("Exit"); return;
                               case  "1" :
                                   System.out.println("1.주사위"); break;
                               case  "2" :
                                   System.out.println("2.가위바위보");
                                   feb07Service.rps(scanner); // 서비스의 가위바위보를 스캐너로 받기 위해
                                   break;
                               case  "3" :
                                   System.out.println("3.입력받은 두 수 사이의 있는 소수 구하기"); break;
                               case  "4" :
                                   System.out.println("4.자바로 입력받은 연도가 윤년인지 평년인지 판단하기"); break;
                               case  "5" :
                                   System.out.println("5. 임의로 입력받은 숫자 맞추기"); break;
                               default :
                                   System.out.println("잘못된 정보");break;
                           }
                       }




               case  "3":
                   System.out.println("2월 8일");

               case "4":
                   System.out.println("2월 9일");



           }
       }
   }
}



















