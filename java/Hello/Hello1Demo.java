package Hello;

import java.util.Scanner;

/**
 * packageName: calc
 * fileName   : Hello1Demo.java
 * author     : seoseongmin
 * date       : 2022-01-25
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-25     seoseongmin        최초 생성
 */

public class Hello1Demo {
    public static void main(String[] args) {
        Hello1App hello1App = new Hello1App();
        Scanner scanner = new Scanner(System.in);
        System.out.println(Hello1App.HELLO_TITLE);
        System.out.println("이름");
        String name = scanner.next();
        System.out.println("나이");
        int age = scanner.nextInt();
        String result = hello1App.hello(name, age);
        System.out.println(result);
    }
}


