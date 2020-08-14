package com.pcschool.ocp.d04;

public class Employee {
    private String name; // 物件變數
    private int salary;

    public Employee(String name, int salary) { // 有區域參數呼叫建構
        this.name = name;
        this.salary = salary;
    }

    public Employee() { // 自訂參數呼叫建構
        name = "Unknown";
        salary = 100;
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", salary=" + salary + '}';
    }
    
}
