package login;

import org.yaml.snakeyaml.events.Event;

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
