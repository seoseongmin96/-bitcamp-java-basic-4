package com.example.demo;

import com.example.demo.member.controller.MemberController;
import com.example.demo.phone.controller.PhoneController;
import com.example.demo.quiz.controller.QuizController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Demo1Application {

    public static void main(String[] args) {

        SpringApplication.run(Demo1Application.class, args);
        Scanner scanner = new Scanner(System.in);
        MemberController memberController = new MemberController();
        PhoneController phoneController = new PhoneController();
        QuizController quizController = new QuizController();
        while (true) {
            System.out.println("메뉴선택 0.EXIT 1. Auth 2. OOP  3. Quiz 4.Algorithm");

            switch (scanner.next()) {
                case "0":
                    System.out.println("### Exit ###");
                    return;
                case "1":
                    System.out.println("### Auth ###");
                    memberController.execute(scanner);
                    break;

                case "2":
                    System.out.println("### OOP ###");
                    phoneController.execute(scanner);
                    break;
                case "3":
                    System.out.println("### Quiz ###");
                    quizController.execute(scanner);
                    break;
                case "4":
                    System.out.println("### Algorithm ###");
                    break;
                default:
                    System.out.println(" Wrong Number ");

            }
            phoneController.execute(scanner);
        }


    }
}