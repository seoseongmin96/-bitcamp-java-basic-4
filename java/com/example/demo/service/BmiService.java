package com.example.demo.service;

import com.example.demo.domain.BmiDTO;

/**
 * packageName: com.example.demo
 * fileName   : BmiDemo
 * author     : seoseongmin
 * date       : 2022-01-25
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-25     seoseongmin        최초 생성
 */
public class BmiService {
    public String getBmi(BmiDTO bmi){
        //
        return String.format("%s정상", bmi.getName());
    }
}