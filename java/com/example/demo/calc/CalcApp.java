package com.example.demo.calc;

/**
 * packageName: com.example.demo.calc
 * fileName   : CalcApp
 * author     : seoseongmin
 * date       : 2022-01-27
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-27     seoseongmin        최초 생성
 */
public class CalcApp {
    public static String CALC_APP = "계산기";
    private int num1;
    private String opcode;
    private int num2;

    public String calc(int num1, String opcode, int num2){
        this.num1 = num1;
        this.num2 = num2;
        this.opcode = opcode;
        int res = 0;
        System.out.println(">>>>>>> "+opcode);

        /* if(opcode.equals("+")) {
            res = num1 + num2;
        }else if(opcode.equals("-")){
            res = num1 - num2;
        }else if(opcode.equals("*")){
            res = num1 * num2;
        }else if(opcode.equals("/")){
            res = num1 / num2;
        }

*/
        switch (opcode) {
            case "+": res = num1 + num2; break;
            case "-": res = num1 - num2; break;
            case "*": res = num1 * num2; break;
            case "/": res = num1 / num2; break;
        }


        String result = String.format("%d %s %d = %d ",
                this.num1, this.opcode, this.num2, res);
        return result;
    }

}
