package kakao;

/**
 * packageName: calc
 * fileName   : KakaoApp.java
 * author     : seoseongmin
 * date       : 2022-01-25
 * DATE         AUTHOR        NOTE
 * desc       : 계산기 앱을 실행하는 데모
 * ================================
 * 2022-01-25     seoseongmin        최초 생성
 */

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
