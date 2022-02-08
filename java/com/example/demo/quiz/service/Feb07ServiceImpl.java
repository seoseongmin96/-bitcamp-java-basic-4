package com.example.demo.quiz.service;

import com.example.demo.quiz.service.Feb07Service;

import java.util.Random;
import java.util.Scanner;

/**
 * packageName: com.example.demo.service
 * fileName   : Feb07ServiceImpl
 * author     : seoseongmin
 * date       : 2022-02-07
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-07     seoseongmin        최초 생성
 */
public class Feb07ServiceImpl implements Feb07Service {

    @Override
    public void dice(Scanner scanner) {

    }

    @Override
    public void rps(Scanner scanner) { // 우선 if문을 사용할 수도 있었지만 경우의 수를 더 간결하게 코딩하기 위해서 switch문을 활용함.
        Random random = new Random(); // random 이라는 새로운 변수를 생성한다.
        int computer = random.nextInt(3); // computer라는 정수 타입의 변수를 random으로 할당한다. ( 이때 난수는 3)
        while (true){ // 반복문 while을 사용하여 가위,바위,보, 탈출이라는 메뉴를 출력한다.
            System.out.println("0.가위 1.바위 2.보 3.EXIT");
            int user = scanner.nextInt(); // 사용자라는 정수 타입의 변수를 scanner로 받는다.
            String s = ""; // s라는 변수를 초기화 한다.
            if(user==3){ // 조건문 if를 사용하여 사욪아가 3일 경우 s는 종료하는 것을 의미한다.
                s = "종료합니다";
                return; // 종료는 반복이 필요없기 때문에 return을 썼다.
            }
            //0~2까지 랜덤으로 번호가 입력된다.
            switch (computer - user){ // 조건문 switch를 활용해 컴퓨터 - 사용자 라는 입력변수를 가정한다.
                case 2 : // 컴퓨터에서 사용자를 뺀 값이 2일때
                    s = " 이겼다~"; // 결과
                    break;
                case -1 :
                    s = "이겼다~";
                    break;
                case 1 :
                    s = "졌다...";
                case -2 :
                    s = "졌다...";
                case 0 :
                    s = "비겼음!";
                    break;
                default:    // 잘못 입력했을 때를 나타내기 위해 씀
                    s = "다시 입력해 주세요"; // 다시 입력하라는 결과
                    break;

                    // 컴퓨터0(가위)/사용자1(바위)(win)=-1
                    // 컴퓨터1(바위)/사용자2(보)(win)=-1
                    // 컴퓨터2(보)/사용자0(가위)(win)=2

                    // 컴퓨터0(가위)/사용자2(보)(lose)=-2
                    // 컴퓨터1(바위)/사용자0(가위)(lose)=1
                    // 컴퓨터2(보)/사용자1(바위)=1
            }
            System.out.println(s); // 출력하기 위해 만듬
        }

    }

    @Override
    public void getPrime(Scanner scanner) {

    }

    @Override
    public void leapYear(Scanner scanner) {

    }

    @Override
    public void numberGolf(Scanner scanner) {

    }
}
