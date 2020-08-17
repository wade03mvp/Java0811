package com.pcschool.ocp.d06.case1;

public class Employee {
    private static final int BASE_SALARY = 2_3800; // 基本薪資(程式碼只有一個數字,方便調整)
                // final => 不可更改的參數
    private int salary;

    public Employee() {
        setSalary(BASE_SALARY); // 用呼叫的方法帶入 salary
    }
   
    public int getSalary() {
        return salary;
    }

    public void setSalary(int money) {
        if(money > BASE_SALARY){ // 方法寫在一個主程式內
            this.salary = money; 
        } else {
            this.salary = BASE_SALARY;
        }
        
        
    }
    
    
}
