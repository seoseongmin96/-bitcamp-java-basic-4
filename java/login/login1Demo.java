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
    public String execute(String id, String pw, String name){
        login1App login1App = new login1App();
        return login1App.login(id, pw, name);

    }
}
