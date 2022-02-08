package com.example.demo.phone.service;

import com.example.demo.phone.service.PhoneService;

import java.util.Scanner;

/**
 * packageName: com.example.demo.service
 * fileName   : PhoneServiceImpl
 * author     : seoseongmin
 * date       : 2022-02-08
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-08     seoseongmin        최초 생성
 */
public class PhoneServiceImpl implements PhoneService {
    @Override
    public void usePhone(Scanner scanner) {
        while (true){
            System.out.println("0.EXIT 1.집전화 2.휴대폰 3.아이폰 4.갤럭시노트");
            int user = scanner.nextInt();
            String s = "";
            if(user==0){
                s = "종료합니다";
            }
            switch (user){
                case 1 :
                    s = "집전화";
                    break;
                case 2 :
                    s = "휴대폰";break;
                case 3 :
                    s = "아이폰";break;
                case 4 :
                    s = "갤럭시노트";break;
                default:
                    s = "다시 입력해 주세요";
                    break;
            }
            System.out.println(s);
        }

    }

    @Override
    public void useCelPhone(Scanner scanner) {

    }

    @Override
    public void useIPhone(Scanner scanner) {

    }

    @Override
    public void useGalPhone(Scanner scanner) {

    }
}
