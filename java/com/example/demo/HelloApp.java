package com.example.demo;

public class HelloApp {
    String id = "";
    String pw = "";
    String name = "";

    public String hello(String paramId, String paramPw, String paramName){

        id = paramId;
        pw = paramPw;
        name = paramName;

        return "ID "+id+" PW "+pw+" Name "+name;
    }
}
