package com.project.calculator;

import java.util.Scanner;

public class Calculator {
    Scanner sc = new Scanner(System.in);

    // 필드 선언부
    public int firstInputNum; // 첫번째 입력 정수
    public int lastInputNum; // 두번째 입력 정수
    public char oper;   // 연산 기호

    // 메서드 선언부
    // 더하기 메서드
    int add(int firstInputNum, int lastInputNum, char oper) {
        if (oper == '+') {
            return firstInputNum + lastInputNum;
        }
        return 0;
    }

    // 빼기 메서드
    int subtract(int firstInputNum, int lastInputNum, char oper) {
        if (oper == '-') {
            return firstInputNum - lastInputNum;
        }
        return 0;
    }

    // 곱하기 메서드
    int multiply(int firstInputNum, int lastInputNum, char oper) {
        if (oper == '*') {
            while (lastInputNum == 0) {
                System.out.println("0으로 곱할 수 없습니다. 다시 입력해주세요 : ");
                lastInputNum = sc.nextInt();
            }
            return firstInputNum * lastInputNum;
        }
        return 0;
    }

    // 나누기 메서드
    int divide(int firstInputNum, int lastInputNum, char oper) {
        if (oper == '/') {
            while (lastInputNum == 0) {
                System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요 : ");
                lastInputNum = sc.nextInt();
            }
            return firstInputNum / lastInputNum;
        }
        return 0;
    }



}
