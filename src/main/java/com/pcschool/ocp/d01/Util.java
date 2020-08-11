package com.pcschool.ocp.d01;

public class Util {
    public double [] values; // 新建一個空的陣列 
    public double getSum() { // 陣列總和的公式
        int sum = 0;
        for(int i=0;i<values.length;i++) {
            sum += values[i];
        }
        return sum; // sum => getSum()
    }
    public double getAvg() { // 陣列平均值的公式
        return getSum() / values.length; // 總和除以陣列長度
    }
    public double getSD() { // 陣列的標準差公式
        double avg = getAvg();
        double sum = 0;
        for(int i=0;i<values.length;i++) {
            sum += Math.pow(values[i] - avg, 2); // (xi - mu)^2 的總和
        }
        double sd = Math.sqrt((1.0/values.length)*sum); 
        return sd; // sd => getSD()
    }
    public double getCV() { 
        double cv = getSD() / getAvg(); // 陣列的變異係數公式
        return cv; // cv => getCV()
    }
}