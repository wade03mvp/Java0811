package com.pcschool.ocp.d05;

class Animal {
    public Animal(int legs) {
        System.out.println("執行 Animal 建構子");
        System.out.printf("有 %d 隻腳\n", legs);
    }
}

class Dog extends Animal {
    public Dog(int legs) {
        super(legs); // 給參數帶入 Animal
        System.out.println("執行 Dog 建構子"); 
    }
    public Dog() {
        super(4); // this(4); => 先跳到 Animal()
        System.out.println("執行 Dog 建構子");
    }
}

public class Zoo {
    public static void main(String[] args) {
        Dog d = new Dog(4); // 建構子有參數
        Dog d2 = new Dog();
    }
}
