package com.example.demo.service;

import com.example.demo.domain.LoginDTO;

/**
 * packageName: com.example.demo
 * fileName   : LoginService
 * author     : seoseongmin
 * date       : 2022-01-28
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-28     seoseongmin        최초 생성
 */
public class LoginService {
    public String execute(LoginDTO login){
        return String.format("%s 님 로그인 성공", login.getName());
    }
}
