package com.example.demo.controller;

import com.example.demo.Bmi.BmiApp;
import com.example.demo.Bmi.BmiDemo;
import com.example.demo.Google.GoogleApp;
import com.example.demo.Google.GoogleDemo;
import com.example.demo.calc.CalcApp;
import com.example.demo.calc.CalcDemo;
import com.example.demo.grade.GradeApp;
import com.example.demo.grade.GradeDemo;
import login.login1App;
import login.login1Demo;

import java.util.Scanner;

/**
 * packageName: com.example.demo.controller
 * fileName   : DemoController
 * author     : seoseongmin
 * date       : 2022-01-27
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-27     seoseongmin        최초 생성
 */
public class DemoController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalcDemo calcDemo =new CalcDemo();
        BmiDemo bmiDemo = new BmiDemo();
        GoogleDemo googleDemo = new GoogleDemo();
        GradeDemo gradeDemo = new GradeDemo();
        login1Demo login1Demo = new login1Demo();
        while(true){
            System.out.println("메뉴 선택");
            String menu = "0.Exit 1.BMI 2.CALC 3.SEARCH 4.GRADE 5.LOGIN";
            System.out.println(menu);
            String select = scanner.next();
            String res = "";
           switch (select){
               case "0" :
                   System.out.println("Exit"); return;
               case "1" :
               System.out.println(BmiApp.BMI+"\n 이름, 키, 몸무게 입력");
               res = bmiDemo.execute(scanner.next(), scanner.next(), scanner.next());break;
               case "2" :
               System.out.println(CalcApp.CALC_APP+"\n숫자1, 연산자, 숫자2 입력");
               res = calcDemo.execute(scanner.nextInt(), scanner.next(), scanner.nextInt());break;
               case "3" :
               System.out.println(GoogleApp.GOOGLE_APP +"\n 검색어 입력");
               res = googleDemo.execute(scanner.next());break;
               case "4" :
               System.out.println(GradeApp.GRADE_TITLE+"\n 이름, 국어 ,영어, 수학");
               res = gradeDemo.execute(scanner.next(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());break;
               case "5" :
               System.out.println(login1App.LOGIN_TITLE+"\n ID , PW, Name 입력");
               res = login1Demo.execute(scanner.next(), scanner.next(), scanner.next());break;
               default: res = "WRONG"; break;
           }
            System.out.println(res);
        }
    }
}
