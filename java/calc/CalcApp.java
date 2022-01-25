package calc;


/**
 * packageName: calc
 * fileName   : CalcDemo.java
 * author     : seoseongmin
 * date       : 2022-01-25
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-25     seoseongmin        최초 생성
 */

public class CalcApp {
    public static String webSite = " Calc.com";
    private int num1;
    private int num2;
    private String opcode;

    public String calc(int num1Param, String opcodeParam, int num2Param){
        num1 = num1Param;
        opcode = opcodeParam;
        num2 = num2Param;
        int result = num1 + num2;
        return num1 + " " + opcode + " " + num2 + " = " + result;
    }
}

