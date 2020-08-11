package com.pcschool.ocp.d01;

// 寫系統範例:
public class ArrayTest2 {
    public static void main(String[] args) {
        // 股票獲利陣列:
        double[] stocks = {7.6, 3.9, 15.6, 28.3, 1.2, 10.8, 35.3, 45.6, 10.2, 0.5};
        // 債券獲利陣列:
        double[] bounds = {6.8, 7.2, 6.8, 7.5, 6.9, 7.9, 7.9, 7.1, 7.2};
        
        Util stockUtil = new Util(); // 帶入新陣列
        stockUtil.values = stocks;
        System.out.printf("股票平均獲利: %.2f\n", stockUtil.getAvg()); // 呼叫求平均的公式
        System.out.printf("股票CV: %.2f\n", stockUtil.getCV()); // 呼叫求變異係數的公式
        
        Util boundsUtil = new Util();
        boundsUtil.values = bounds;
        System.out.printf("債券平均獲利: %.2f\n", boundsUtil.getAvg());
        System.out.printf("債券CV: %.2f\n", boundsUtil.getCV());
        
        // 三元運算子: 股票變異係數 有沒有小於 債券變異係數 ?有 "股票" :沒有 "債券"
        System.out.printf("CV值小的是: %s\n", stockUtil.getCV() < boundsUtil.getCV() ? "股票" : "債券");
        
    }
}
