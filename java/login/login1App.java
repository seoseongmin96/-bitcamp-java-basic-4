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

    public static String LOGIN_TITLE = "로그인앱";
     String id;
     String pw;
     String name;
     static String PASSWORD = "abc";

    public String login(String id, String pw, String name) {
        this.id = id;
        this.pw = pw;
        this.name = name;
        String res = "";


        /*if (pw.equals("PASSWORD")) {

            res = String.format(" %s 님의 비번 %s 가 맞습니다. 로그인 성공 "
                    , this.name, this.pw);
        } else {
            res = String.format(" %s 님의 ID 는 맞고, 비번 %s 가 틀립니다. 로그인 실패"
                    , this.id, this.pw);
        }

        */

        switch (pw){
                case "abc": res = String.format(" %s 님의 비번 %s 가 맞습니다. 로그인 성공 "
                    , this.name, this.pw);break;

            default : res = String.format(" %s 님의 ID 는 맞고, 비번 %s 가 틀립니다. 로그인 실패"
                    , this.id, this.pw);

        }

        return res;

        }
    }
