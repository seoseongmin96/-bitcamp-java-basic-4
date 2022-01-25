package com.example.demo;

/**
 * packageName: com.example.demo
 * fileName   : NaverApp
 * author     : seoseongmin
 * date       : 2022-01-25
 * desc       :
 * * 클래스변수  : NAVER_LOGO 네이버로고
 *  * 인스턴수변수 :
 *  * 파라미터,인스턴수변수 : ID 아이디, PW 비밀번호
 *  * 로컬변수 : res 아이디 %s 로그인 성공
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-25     seoseongmin        최초 생성
 */
public class NaverApp {
    public static String NAVER_APP = "NAVER";
    private String ID;
    private String PW;

    public String naver(String ID, String PW){
        this.ID =ID;
        this.PW =PW;
        String res = "아이디 %s 로그인 성공";
        return String.format(res,this.ID, this.PW);
    }

}
