package kakao;

import Hello.Hello1App;

import java.util.Scanner;

/**
 * packageName: calc
 * fileName   : KakaoDemo.java
 * author     : seoseongmin
 * date       : 2022-01-25
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-25     seoseongmin        최초 생성
 */

public class KakaoDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        KakaoApp kakaoApp = new KakaoApp();
        System.out.println();
        System.out.println("telno");
        System.out.println("message");
        String telno =scanner.next();
        String message = scanner.next();
        String result = kakaoApp.kakao(telno, message);
        System.out.println(result);
    }
}
