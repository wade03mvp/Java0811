package com.pcschool.ocp.d04;

public class ConstructorDemo {
    public static void main(String[] args) {
        Employee emp = new Employee("vincent", 40000); // 下達參數
        System.out.println(emp);
        Employee emp2 = new Employee(); // 無參數
        System.out.println(emp2);
    }
}
