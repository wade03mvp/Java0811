package com.pcschool.ocp.d01;

public class BMI {
    public String name;
    public double h;
    public double w;
    private double bmi; // 私有物件變數
    
    // 封裝技法
    public double getBMI() { // 取得 BMI
        return bmi;
    }
    
    // 設定計算 BMI 的方法
    public void setBMI() {
        bmi = w/Math.pow(h/100, 2);      
    } 
}
