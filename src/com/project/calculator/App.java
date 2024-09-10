package com.project.calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        /*
        * if문
        if (operator == '+') {
            System.out.println(firstInputNum + " + " + lastInputNum + " = " + (firstInputNum + lastInputNum));
        } else if (operator == '-') {
            System.out.println(firstInputNum + " - " + lastInputNum + " = " + (firstInputNum - lastInputNum));
        } else if (operator == '*') {
            // 두번째 숫자가 0 일때, 다시 입력 받기
            while (lastInputNum == 0) {
                System.out.println("0으로 곱할 수 없습니다. 다시 입력해주세요 : ");
                lastInputNum = sc.nextInt();
            }
            System.out.println(firstInputNum + " * " + lastInputNum + " = " + (firstInputNum * lastInputNum));
        } else if (operator == '/') {
            while (lastInputNum == 0) {
                System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요 : ");
                lastInputNum = sc.nextInt();
            }
            System.out.println(firstInputNum + " / " + lastInputNum + " = " + (firstInputNum / lastInputNum));
        }
         */

        Calculator calculator = new Calculator();

        // 종료 입력시까지 계산기 프로그램 반복
        while (true) {

            // Scanner활용 - 양의 정수(0포함) 입력받기
            Scanner sc = new Scanner(System.in);
            System.out.println("첫번째 숫자를 입력해주세요 : ");
            int firstInputNum = sc.nextInt();

            sc.nextLine(); // nextInt에서 입력받은 줄바꿈을 제거, 버퍼 비우기

            // 사칙연산 기호( + , - , * , / ) 입력받기
            System.out.println("계산할 기호를 입력해주세요(+,-,*,/) : ");
            char operator;
            operator = sc.nextLine().charAt(0);


            /*
            // 4가지 기호 외에 들어오면 정확한 기호를 입력해 주세요 경고하고, 다시 입력 필요 (x)
            * Calculator 클래스에 IllegalArgumentException 예외처리
            while (true) {
                operator = sc.nextLine().charAt(0);
                if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
                    break;
                } else {
                    System.out.println("계산 기호를 다시 입력해주세요(+,-,*,/)");
                }
            }

             */

            // 두번째 정수 입력받기
            System.out.println("두번째 숫자를 입력해주세요 : ");
            int lastInputNum = sc.nextInt();


            // 입력한 정수 2개와 연산기호를 calculator 클래스의 메서드 호출로 사칙연산 계산
            try {
                double result = calculator.arithmeticOperation(firstInputNum, lastInputNum, operator);
                System.out.println("결과 : " + result);
            }catch (IllegalArgumentException e) {
                // arithmeticOperation에서 예외 발생시, 오류메시지 print
                System.out.println("오류 : " + e.getMessage());
            }


            System.out.println("더 계산하시겠습니까? (yes/no)" );
            String endApp = sc.next();

            // 계산기 종료 로직
            if (endApp.equals("no")) {
                System.out.println("계산기를 종료합니다.");
                break;
            }
        }

        System.out.println(calculator.getResultList().toString());
        // 컬렉션 첫번째 값 제거하기
        calculator.removeResultList();
        System.out.println(calculator.getResultList().toString());

    }

}
