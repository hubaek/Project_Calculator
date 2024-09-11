package com.project.calculator.Level2;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    // 필드 선언부 -> 메서드에서 매개변수로 받기에 필요 없다?
//    public int firstInputNum; // 첫번째 입력 정수
//    public int lastInputNum; // 두번째 입력 정수
//    public char operator;   // 연산 기호

    // 연산 결과를 저장하는 컬렉션 타입 필드
    private List<Double> resultList = new ArrayList<>();



    // 메서드 선언부
    public double arithmeticOperation(int firstInputNum, int lastInputNum, char operator) {
        double result;

        switch (operator) {
            case '+' -> result = firstInputNum + lastInputNum;
            case '-' -> result = firstInputNum - lastInputNum;
            case '*' -> {
                if (lastInputNum == 0) {
                    throw new IllegalArgumentException("0으로 곱할 수 없습니다.");
                } else {
                    result = firstInputNum * lastInputNum;
                }
            }
            case '/' -> {
                if (lastInputNum == 0) {
                    throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
                } else {
                    result = (double) firstInputNum / lastInputNum;
                }
            }

            default -> throw new IllegalArgumentException("잘못된 연산자입니다.");
        }

        // 연산 결과를 컬렉션에 저장
        resultList.add(result);
        return result;

    }

    // 연산 결과를 반환하는 메서드
    public List<Double> getResultList(){
        if (resultList.isEmpty()) {
            throw new IndexOutOfBoundsException("저장된 연산 결과가 없습니다.");
        }
        return resultList;
    }

    public void setResultList() {
        this.resultList = resultList;
    }

    // 저장된 연산 결과 가장 먼저 저장된 데이터를 삭제하는 메서드
    public void removeResultList() {
        // 연산결과가 비어 있을 때 삭제하면 예외
        if (resultList.isEmpty()) {
            throw new IndexOutOfBoundsException("저장된 연산 결과가 없습니다.");
        }
        resultList.remove(0);
    }



}
