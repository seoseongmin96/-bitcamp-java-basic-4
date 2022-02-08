package com.example.demo.oop.controller;

import com.example.demo.oop.service.OopService;
import com.example.demo.oop.service.OopServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.example.demo.controller
 * fileName   : PhoneController
 * author     : seoseongmin
 * date       : 2022-02-08
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-08     seoseongmin        최초 생성
 */
public class OopController {
    public static void execute(Scanner scanner) {

        OopService service = new OopServiceImpl();
        while (true) {
            System.out.println("메뉴선택\n [집전화\n 휴대폰\n 아이폰\n 갤럭시노트]");
            String menu = "메뉴 0.EXIT 1.집전화 2.휴대폰 3.아이폰 4.갤럭시노트";
            System.out.println(menu);

            switch (scanner.next()){
                case "0" :
                    System.out.println("Exit"); return;
                case "1" :
                    System.out.println("집전화");
                    service.usePhone(scanner);break;
                case "2" :
                    System.out.println("휴대폰");
                    service.useCelPhone(scanner);break;
                case "3" :
                    System.out.println("아이폰");
                    service.useIPhone(scanner);break;

                case "4" :
                    System.out.println("갤럭시노트");
                    service.useGalPhone(scanner);break;
                default :
                    System.out.println("잘못된 정보입니다"); break;
            }

        }
    }
}