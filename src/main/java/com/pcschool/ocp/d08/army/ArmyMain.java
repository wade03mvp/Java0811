package com.pcschool.ocp.d08.army;

import java.util.Arrays;

public class ArmyMain {
    
    public static void main(String[] args) {
        
        Airplane[] airplanes = {new Fighter(), new Fighter(), new Fighter()};
        Car[] cars = {new Tank(), new Tank(), new Truck(), new Truck()};
        Weapon[] weapons = {new Fighter(), new Tank()};
        System.out.println("------------");
        
        // cars 要統一發射武器
        for(Car car : cars) {
            if(car instanceof Tank) {
                ((Tank)car).shoot();
            }
        }
       
        // weapons 要統一發射武器
        for(Weapon w : weapons) {
            w.shoot();
        }
        System.out.println("------------");
        
        // Java8 : cars 要統一發射武器
        Arrays.stream(cars)
                .filter(c -> c instanceof Weapon) // 過濾出 cars 包含 Weapon 的元素 (還是 Car 型別)
                .map(c -> (Weapon)c)   // cars 轉型成 Weapon
                .forEach(c -> c.shoot());
        // Java8 : weapons 要統一發射武器
        Arrays.stream(weapons).forEach(w -> w.shoot());           
    }
}
