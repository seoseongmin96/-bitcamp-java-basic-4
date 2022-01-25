package login;

import org.yaml.snakeyaml.events.Event;

/**
 * packageName: calc
 * fileName   : login1App.java
 * author     : seoseongmin
 * date       : 2022-01-25
 * DATE         AUTHOR        NOTE
 * desc       : 계산기 앱을 실행하는 데모
 * ================================
 * 2022-01-25     seoseongmin        최초 생성
 */

public class login1App {
    static String LOGIN_TITLE = "Kakao";
    private String id;
    private String pw;
    private String name;

    public String login(String id, String pw, String name){
        this.id= id;
        this.pw = pw;
        this.name = name;
        return String.format(" ID : %s, PW : %s, Name : %s ",
                this.id, this.pw, this.name);
    }
}
