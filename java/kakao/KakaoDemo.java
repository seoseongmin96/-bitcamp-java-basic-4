package kakao;

import Hello.Hello1App;

import java.util.Scanner;

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
