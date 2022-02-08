package com.example.demo.quiz.service;

/**
 * packageName: com.example.demo.service
 * fileName   : QuizService
 * author     : seoseongmin
 * date       : 2022-02-07
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-07     seoseongmin        최초 생성
 */

public class Feb06ServiceImpl implements Feb06Service {
    @Override
    public void quiz1(String[] arr) {
        System.out.println(" Q1. 팀별 과제를 출력하세요");
        String s = "";
        for (int i = 0; i < arr.length; i++) {
            if (i % 5 == 0) {
                s += "\n";
            }
            s += i + ":" + arr[i] + "\t";

        }
        System.out.println(s);
    }

    @Override
    public void quiz2(String[] arr) {
        String s = "";
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
    }

    @Override
    public void quiz3(String[] arr) {
        String s;
        System.out.println("Q3. 큐를 담당한 사람을 출력하세요.");
        s = arr[15] + "를 담당한 사람: " + arr[0];

        for (int i = 0; i < arr.length; i++){
            if (arr[i].equals("힙")){
                System.out.println( arr[i]+ " 의 담당자는 " + arr[i%5]);
            }
        }
    }

    @Override
    public void quiz4(String[] arr) {
        String s = "";
        System.out.println("Q4. 팀원별 과제 수를 출력하세요 예) 권혜민(3개), 조현국(3개), 김진영(2개), 김한슬(2개), 서성민(2개)");
        int[] intArr = new int[5];
        int[] resArr = new int[5];


        for (int i = 0; i< arr.length; i++) {
            int a = i % 5;

          for(int j = 0; j< 5; j++){
              if (a==j) {
                  intArr[j]++;
              }
              resArr = intArr;

          }

            }
        for (int i = 0; i< 5; i++){
        System.out.println(arr[i] + "("+resArr[i]+"),");
    }
}
}
