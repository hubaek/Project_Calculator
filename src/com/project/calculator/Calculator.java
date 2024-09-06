package com.project.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        /*
        * if문
        if (oper == '+') {
            System.out.println(firstInputNum + " + " + lastInputNum + " = " + (firstInputNum + lastInputNum));
        } else if (oper == '-') {
            System.out.println(firstInputNum + " - " + lastInputNum + " = " + (firstInputNum - lastInputNum));
        } else if (oper == '*') {
            // 두번째 숫자가 0 일때, 다시 입력 받기
            while (lastInputNum == 0) {
                System.out.println("0으로 곱할 수 없습니다. 다시 입력해주세요 : ");
                lastInputNum = sc.nextInt();
            }
            System.out.println(firstInputNum + " * " + lastInputNum + " = " + (firstInputNum * lastInputNum));
        } else if (oper == '/') {
            while (lastInputNum == 0) {
                System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요 : ");
                lastInputNum = sc.nextInt();
            }
            System.out.println(firstInputNum + " / " + lastInputNum + " = " + (firstInputNum / lastInputNum));
        }
         */

        // exit 입력시까지 계산기 프로그램 반복
        while (true) { // 끝나는 명령어 전까지 계속 돌아야함

            // Scanner활용 - 양의 정수(0포함) 입력받기
            Scanner sc = new Scanner(System.in);
            System.out.println("첫번째 숫자를 입력해주세요 : ");
            int firstInputNum = sc.nextInt();

            sc.nextLine(); // nextInt에서 입력받은 줄바꿈을 제거, 버퍼 비우기

            // 사칙연산 기호( + , - , * , / ) 입력받기
            System.out.println("계산할 기호를 입력해주세요(+,-,*,/) : ");
            char oper;
            while (true) {
                oper = sc.nextLine().charAt(0);
                // 4가지 기호 외에 들어오면 정확한 기호를 입력해 주세요 경고하고, 다시 입력 필요 (x)
                if (oper == '+' || oper == '-' || oper == '*' || oper == '/') {
                    break;
                } else {
                    System.out.println("계산 기호를 다시 입력해주세요(+,-,*,/)");
                }
            }

            // 두번째 정수 입력받기
            System.out.println("두번째 숫자를 입력해주세요 : ");
            int lastInputNum = sc.nextInt();


            // 사칙연산 해당 기호마다 계산식
            switch (oper) {
                case '+' -> System.out.println("결과 :" + firstInputNum + " + " + lastInputNum + " = " + (firstInputNum + lastInputNum));
                case '-' -> System.out.println("결과 :" + firstInputNum + " - " + lastInputNum + " = " + (firstInputNum - lastInputNum));
                case '*' -> {
                    // 두번째 숫자가 0 일때, 다시 입력 받기
                    while (lastInputNum == 0) {
                        System.out.println("0으로 곱할 수 없습니다. 다시 입력해주세요 : ");
                        lastInputNum = sc.nextInt();
                    }
                    System.out.println("결과 :" + firstInputNum + " * " + lastInputNum + " = " + (firstInputNum * lastInputNum));
                }
                case '/' -> {
                    // 두번째 숫자가 0 일때, 다시 입력 받기
                    while (lastInputNum == 0) {
                        System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요 : ");
                        lastInputNum = sc.nextInt();
                    }
                    System.out.println("결과 :" + firstInputNum + " / " + lastInputNum + " = " + (firstInputNum / lastInputNum));
                }
            }

            System.out.println("더 계산하시겠습니까? (yes/no)" );
            String end = sc.next();

            // 계산기 종료 로직
            if (end.equals("no")) {
                System.out.println("계산기를 종료합니다.");
                break;
            } else if (end.equals("yes")){
                continue;
            }
        }
        


    }
}
