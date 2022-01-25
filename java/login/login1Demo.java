package login;

import java.util.Scanner;

public class login1Demo {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       LoginApp loginApp = new LoginApp();
        System.out.println(LoginApp.Website);
        System.out.println("ID :");
        System.out.println("PW :");
        System.out.println("Name :");
        String id = scanner.next();
        String pw = scanner.next();
        String name = scanner.next();
        String result = loginApp.login(id, pw, name);
        System.out.println(result);

    }
}
