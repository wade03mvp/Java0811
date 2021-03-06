package com.pcschool.ocp.d01;
// 寵物店
public class PetStore {
    // 主程式
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Dog();
        Dog d3 = new Dog();
        // d1 d2 d3 資料設定
        Dog.type = "柴犬"; // 呼叫共用的"類別"變數
        d1.age = 5;d1.price = 5000;d1.amount = 30; // "物件"變數
        d2.age = 2;d2.price = 3000;d2.amount = 20;
        d3.age = 4;d3.price = 8000;d3.amount = 10;
        // d1 d2 d3 資料印出; %,d 千分位逗點(常數變數); %s(字元變數)
        System.out.printf("品種: %s 年齡: %d 價格: %,d 數量: %d 小計: %,d\n", 
                Dog.type, d1.age, d1.price, d1.amount, (d1.price*d1.amount));
        System.out.printf("品種: %s 年齡: %d 價格: %,d 數量: %d 小計: %,d\n", 
                Dog.type, d2.age, d2.price, d2.amount, (d2.price*d2.amount));
        System.out.printf("品種: %s 年齡: %d 價格: %,d 數量: %d 小計: %,d\n", 
                Dog.type, d3.age, d3.price, d3.amount, (d3.price*d3.amount));
        // d1 d2 d3 的小計總和
        int sum = (d1.price*d1.amount)+(d2.price*d2.amount)+(d3.price*d3.amount);
        System.out.printf("Dog 總資產: %,d\n", sum);
    }   
}
