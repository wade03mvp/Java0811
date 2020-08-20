package com.pcschool.ocp.d09.case3;

import java.util.Random;

public class LottoStore {
    public static void main(String[] args) {
        Lotto one = new Lotto() {  // 匿名內部類別(開始)
            @Override  // 重新定義介面的方法
            public void printNumber() {
                System.out.printf("%d\n", new Random().nextInt(10));
            }
        };  // 匿名內部類別(結束)
        one.printNumber();
        
        // Lambda 語法 (不用選實作方法)
        Lotto lotto = () -> System.out.printf("%d\n", new Random().nextInt(10));
        lotto.printNumber();
    }
}
