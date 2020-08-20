package com.pcschool.ocp.d09.case3;

import java.util.Random;

public class LottoStore {
    public static void main(String[] args) {
        Lotto one = new Lotto() {          // 匿名內部類別
            @Override
            public void printNumber() {
                System.out.printf("%d\n", new Random().nextInt(10));
            }
        };
        one.printNumber();
        
        // Lambda 語法 (不用選實作方法)
        Lotto lotto = () -> System.out.printf("%d\n", new Random().nextInt(10));
        lotto.printNumber();
    }
}
