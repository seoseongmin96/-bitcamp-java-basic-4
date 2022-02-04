package com.example.demo.controller;

import com.example.demo.domain.GradeDTO;
import com.example.demo.domain.SubjectDTO;

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
        System.out.println(" Q1. 팀별 과제를 출력하세요");
        String[] arr = {"권혜민", "조현국", "김진영", "김한슬", "서성민",
                "정렬", "해시", "힙", "완전탐색", "DP",
                "스택", "깊이우선탐색", "그래프", "탐욕법", "이분탐색",
                "큐", "너비우선탐색",};
        String s = "";
        for (int i = 0; i < arr.length; i++) {
            if (i % 5 == 0) {
                s += "\n";
            }
            s += i + ":" + arr[i] + "\t";

        }
        System.out.println(s);
        s = "";
        System.out.println(" Q2. 팀장이 맡은 과제만 출력하세요.");

        String l = "김진영";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("김진영")) {
                for (int j = 0; j < 3; j++) {
                    s += arr[i + j * 5] + ",";
                }
                if (i == 17) {
                    break;
                }


            }

        }

        System.out.println(s);
        s = "";
        System.out.println("Q3. 큐를 담당한 사람을 출력하세요.");
        s = arr[15] + "를 담당한 사람: " + arr[0];
        System.out.println(" 입력한 과목의 인덱스를 추출하세요");

        for (int i = 0; i < arr.length; i++){
            if (arr[i].equals("힙")){
                System.out.println(arr[i]+ "의 담당자는" + arr[i%5]);

            }
        }



        System.out.println("Q4. 팀원별 과제 수를 출력하세요.");
            int count = 0;
            String countManager = "";
            countManager += arr[0]+"(3개),";
            countManager += arr[1]+"(3개),";
            countManager += arr[2]+"(2개),";
            countManager += arr[3]+"(2개),";
            countManager += arr[4]+"(2개),";
            countManager = "";
            int count0 = 0;
            int count1 = 0;
            int count2 = 0;
            int count3 = 0;
            int count4 = 0;
            int[] intArr = new int[5];
            for (int i = 0; i< arr.length; i++) {
                if (arr[i].equals(arr[5])) {
                    count0++;
                }
                if (arr[i].equals(arr[6])) {
                    count1++;
                }
                if (arr[i].equals(arr[7])) {
                    count2++;
                }
                if (arr[i].equals(arr[8])) {
                    count3++;
                }
                if (arr[i].equals(arr[9])) {
                    count4++;
                }


            }
        System.out.println(arr[0]+"의 카운트는"+count0);
        System.out.println(arr[1]+"의 카운트는"+count1);
        System.out.println(arr[2]+"의 카운트는"+count2);
        System.out.println(arr[3]+"의 카운트는"+count3);
        System.out.println(arr[4]+"의 카운트는"+count4);



        System.out.println(countManager);
            for(int i=0; i<arr.length; i++){

            }


 }
}



















