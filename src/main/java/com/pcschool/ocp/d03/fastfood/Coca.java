package com.pcschool.ocp.d03.fastfood;

public class Coca {
    private int price = 20;
    private static int amount = 100; // 共用類別變數

    public Coca() {
        amount--;
    }
    
    public int getPrice(){
        return price;
    }

    public static int getAmount() {
        return amount;
    }
    
}
