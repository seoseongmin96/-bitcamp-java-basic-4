package com.example.demo.member.doamin;

/**
 * packageName: com.example.demo
 * fileName   : LoginDTO
 * author     : seoseongmin
 * date       : 2022-01-28
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-28     seoseongmin        최초 생성
 */
public class LoginDTO {

        public static String LOGIN_TITLE = "안녕하십니까";
        private String id;
        private String pw;
        private String name;
        public static String PASSWORD = "abc";

        public String getId() {
            return id;
        }
        public void  setId(String id) {
            this.id = id;
        }
        public String getPw() {
            return pw;
        }
        public void setPw(String pw) {
            this.pw = pw;
        }
        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name = name;
        }

}

