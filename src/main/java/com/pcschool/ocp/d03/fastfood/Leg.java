package com.pcschool.ocp.d03.fastfood;

public class Leg {
    private static int amount = 100;
    private int price = 45;

    public Leg() {
        amount--;
    }
    
    public int getPrice(){
        return price;
    }   

    public static int getAmount() {
        return amount;
    }
    
}
