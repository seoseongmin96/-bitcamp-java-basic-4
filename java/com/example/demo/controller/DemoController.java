package com.example.demo.controller;

import com.example.demo.domain.LoginDTO;
import com.example.demo.service.LoginService;
import com.example.demo.domain.BmiDTO;
import com.example.demo.service.BmiService;
import com.example.demo.domain.GoogleDTO;
import com.example.demo.service.GoogleService;
import com.example.demo.domain.CalcDTO;
import com.example.demo.service.CalcService;
import com.example.demo.domain.GradeDTO;
import com.example.demo.service.GradeService;

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
        CalcDTO calc = new CalcDTO();
        CalcService calcService =new CalcService();
        BmiDTO bmi = new BmiDTO();
        BmiService bmiService = new BmiService();
        GoogleDTO google = new GoogleDTO();
        GoogleService googleService = new GoogleService();
        GradeDTO grade = new GradeDTO();
        GradeService gradeService = new GradeService();
        LoginDTO login = new LoginDTO();
        LoginService loginService = new LoginService();


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
               System.out.println(BmiDTO.BMI+"\n 이름, 키, 몸무게 입력");
               bmi.setName(scanner.next());
               bmi.setHeight(scanner.next());
               bmi.setWeight(scanner.next());
               res = bmiService.getBmi(bmi); break;
               case "2" :
               System.out.println(CalcDTO.CALC_APP+"\n숫자1, 연산자, 숫자2 입력");
               calc.setNum1(scanner.nextInt());
               calc.setOpcode(scanner.next());
               calc.setNum2(scanner.nextInt());
               res = calcService.getCalc(calc);break;
               case "3" :
               System.out.println(GoogleDTO.GOOGLE_APP +"\n 검색어 입력");
               google.setSearch(scanner.next());
               res = googleService.getGoogle(google);break;
               case "4" :
               System.out.println(GradeDTO.GRADE_TITLE+"\n 이름, 국어 ,영어, 수학");
               grade.setName(scanner.next());
               grade.setKor(scanner.nextInt());
               grade.setEng(scanner.nextInt());
               grade.setMath(scanner.nextInt());
               res = gradeService.getGrade(grade);break;
               case "5" :
               System.out.println(LoginDTO.LOGIN_TITLE+"\n ID , PW, Name 입력");
               login.setId(scanner.next());
               login.setPw(scanner.next());
               login.setName(scanner.next());
               res = loginService.execute(login);break;
               default: res = "WRONG"; break;
           }
            System.out.println(res);
        }
    }
}
