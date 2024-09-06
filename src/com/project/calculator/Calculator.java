package com.project.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        // Scanner활용 - 양의 정수(0포함) 입력받기
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 숫자를 입력해주세요 : ");
        int firstInputNum = sc.nextInt();

        sc.nextLine(); // nextInt에서 입력받은 줄바꿈을 제거, 버퍼 비우기

        // 사칙연산 기호( + , - , * , / ) 입력받기
        // 4가지 기호 외에 들어오면 정확한 기호를 입력해 주세요 경고하고, 다시 입력 필요
        System.out.println("계산할 기호를 입력해주세요(+,-,*,/) : ");
        char oper = sc.nextLine().charAt(0);

        System.out.println("두번째 숫자를 입력해주세요 : ");
        int lastInputNum = sc.nextInt();

//        System.out.println(firstInputNum + " + " + lastInputNum + " = " + (firstInputNum + lastInputNum));

        if (oper == '+') {
            System.out.println(firstInputNum + " + " + lastInputNum + " = " + (firstInputNum + lastInputNum));
        } else if (oper == '-') {
            System.out.println(firstInputNum + " - " + lastInputNum + " = " + (firstInputNum - lastInputNum));
        } else if (oper == '*') {
            System.out.println(firstInputNum + " * " + lastInputNum + " = " + (firstInputNum * lastInputNum));
        } else if (oper == '/') {
            System.out.println(firstInputNum + " / " + lastInputNum + " = " + (firstInputNum / lastInputNum));
        }


    }
}
