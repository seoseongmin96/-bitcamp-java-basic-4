package com.example.demo.quiz.controller;

import com.example.demo.quiz.service.Feb07Service;
import com.example.demo.quiz.service.Feb07ServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.example.demo.controller
 * fileName   : Feb07Controller
 * author     : seoseongmin
 * date       : 2022-02-07
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-07     seoseongmin        최초 생성
 */
public class Feb07Controller {
/**(int) (Math.random() * 6) +1;
 * 1. 주사위 dice
 * 2. 가위바위보 Rps
 * 3. 입력받은 두 수 사이의 있는 소수 구하기 getPrime
 * 4. 자바로 입력받은 연도가 윤년인지 평년인지 판단하기 leapYear
 * 5. 임의로 입력받은 숫자 맞추기 numberGolf
 * */
public  void execute(Scanner scanner) { // 메소드 선언 , 시스템이 입력 받을 수 있는 Scanner라는 객체 scanner를 생성한다.


    Feb07Service service = new Feb07ServiceImpl(); // Feb07Service라는 객체  service를 생성한다.

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
                service.rps(scanner); // 서비스의 가위바위보를 스캐너로 받기 위해
                break;
            case  "3" :
                System.out.println("3.입력받은 두 수 사이의 있는 소수 구하기"); break;
            case  "4" :
                System.out.println("4.자바로 입력받은 연도가 윤년인지 평년인지 판단하기"); break;
            case  "5" :
                System.out.println("5. 임의로 입력받은 숫자 맞추기"); break;
        }
    }

}

}
