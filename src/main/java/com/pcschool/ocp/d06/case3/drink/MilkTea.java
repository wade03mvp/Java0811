package com.pcschool.ocp.d06.case3.drink;

import com.pcschool.ocp.d06.case3.material.Milk;


public class MilkTea extends RedTea { // 重構

    public MilkTea() {
        Milk milk = new Milk();
        addMaterial(milk);
    }

}
