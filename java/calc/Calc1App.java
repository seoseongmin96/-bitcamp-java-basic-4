package calc;

/**
 * packageName: calc
 * fileName   : calcApp.java
 * author     : seoseongmin
 * date       : 2022-01-25
 * DATE         AUTHOR        NOTE
 * desc       : 계산기 앱을 실행하는 데모
 * ================================
 * 2022-01-25     seoseongmin        최초 생성
 */

/***
* 숫자 2개와 연산자 1개를 받아서 계산하는 계산기를 코딩하시오
 * int, String
* */
public class Calc1App {
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
