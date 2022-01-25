package kakao;

/**
 * 전화번호와 메시지를 받아서 전송하는 어플을 만드시오
 * String telno, String message
 * */
public class KakaoApp {
    public static String webSite = "Kakao.com";
     String telno ;
     String message ;

    public String kakao(String telno, String message){
        this.telno=telno;
        this.message=message;
        return String.format(" telno : %s, message : %s ", this.telno, this.message);
    }

}
