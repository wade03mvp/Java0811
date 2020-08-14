package com.pcschool.ocp.d04;

public class CarStore {
    public static void main(String[] args) {
        Car.printCar2();
        Car car = new Car(); // 創立物件
        car.printCar();
        car.printCar3(); // 建構子內先創立物件
    } 
}
