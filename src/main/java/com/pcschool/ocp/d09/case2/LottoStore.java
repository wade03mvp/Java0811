package com.pcschool.ocp.d09.case2;

import java.util.Random;

public class LottoStore {
    public static void main(String[] args) {
        
        // 實作 lotto 介面以開出 0~9 一個數字
        Lotto one = new LottoOne();
        one.printNumber();
        // 實作 lotto 介面以開出 0~9 一個數字
        Lotto four = new LottoFour();
        four.printNumber();
        
    }
}
