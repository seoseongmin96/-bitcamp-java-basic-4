package com.example.demo.quiz.controller;

import com.example.demo.quiz.service.QuizService;
import com.example.demo.quiz.service.QuizServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.example.demo.quiz.controller
 * fileName   : Feb06Controller
 * author     : seoseongmin
 * date       : 2022-02-08
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-08     seoseongmin        최초 생성
 */
public class Feb06Controller {
    public  void execute(Scanner scanner) {


        String[] arr = {"권혜민", "조현국", "김진영", "김한슬", "서성민",
                "정렬", "해시", "힙", "완전탐색", "DP",
                "스택", "깊이우선탐색", "그래프", "탐욕법", "이분탐색",
                "큐", "너비우선탐색"};



        QuizService service = new QuizServiceImpl();
        System.out.println("[MENU] 0.EXIT\n" + "1. 팀별 과제 출력 \n" + "2. 팀장이 맡은 과제만 출력 \n" +
                "3. 큐를 담당한 사람을 출력 \n" + "4. 팀원별 과제 수를 출력 \n");
        while (true){
            switch (scanner.next()){
                case "0" :
                    System.out.println("시스템종료"); return;
                case "1" :
                    service.quiz1(arr); break;
                case "2" :
                    service.quiz2(arr); break;
                case "3" :
                    service.quiz3(arr); break;
                case "4" :
                    service.quiz4(arr); break;
            }
        }
    }


}


