package com.example.demo.service;

import com.example.demo.domain.CalcDTO;

/**
 * packageName: com.example.demo.calc
 * fileName   : CalcDemo
 * author     : seoseongmin
 * date       : 2022-01-27
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-27     seoseongmin        최초 생성
 */
public class CalcService {
    public String getCalc(CalcDTO calc){
        int result = 0;
        switch (calc.getOpcode()){
            case "+": result = calc.getNum1() + calc.getNum2(); break;
            case "-": result = calc.getNum1() - calc.getNum2(); break;
            case "*": result = calc.getNum1() * calc.getNum2(); break;
            case "/": result = calc.getNum1() / calc.getNum2(); break;
        }
        String res = String.format("%d %s %d = %d", calc.getNum1(), calc.getOpcode(), calc.getNum2());


        return res;
    }

}

