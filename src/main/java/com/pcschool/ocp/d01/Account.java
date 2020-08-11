package com.pcschool.ocp.d01;

public class Account {
    
    private int balance; // 私人帳號保護
    
    // 存款
    public void save(int money) {
        if(money > 0){
        balance += money; // balabce = balance + money
        }
    }
    // 提款
    public void withdraw(int money) {
        if (money > 0 && balance >= money) {
            balance -= money; // balabce = balance - money
        }
    }
    
    // 取得帳戶餘額
    public int getBalance() {
        return balance;
    }
    
}
