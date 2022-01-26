package login;

import java.util.Scanner;

/**
 * packageName: calc
 * fileName   : login1Demo.java
 * author     : seoseongmin
 * date       : 2022-01-25
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-25     seoseongmin        최초 생성
 */

public class login1Demo {
    public static void main(String[] args) {
       Scanner scanner =new Scanner(System.in);
       login1App login1App = new login1App();
        System.out.println("LOGIN_TITLE");
        System.out.println("id");
        String id = scanner.next();
        System.out.println("pw");
        String pw = scanner.next();
        System.out.println("name");
        String name = scanner.next();
        String res = login1App.login(id, pw, name);
        System.out.println(res);

    }
}
