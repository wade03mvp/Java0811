package com.pcschool.ocp.d04;

public class BMI {
    private double h =170; // 100 ~ 250 cm (預設 = 170.0)
    private double w = 60; // 30 ~ 150 kg (預設 = 60.0)

    public BMI() { // 預設建構子
        
    }

    public BMI(double h, double w) {
        this(h); // this() 一定要在程式的第一行, () 內只能放區域變數
        if(w >= 30 && w <= 150) {
           this.w = w;
        }
    }
    
    public BMI(double h){
        if(h >= 100 && h <= 250){
           this.h = h; 
        }
    }

    @Override
    public String toString() {
        return "BMI{" + "h=" + h + ", w=" + w + '}';
    }
    
}
