package com.pcschool.ocp.d07.case1.material;

public class Egg extends Material {

    public Egg() {
        this("蛋", 10); // 設定好,給 super
    }

    public Egg(String name, int price) {
        super(name, price);
    }
}
 
