package com.pcschool.ocp.d08.case3;

import java.util.Arrays;

public class PetStore {
    public static void main(String[] args) {
        Pet[] pets = {new EDog(), new Yorkshire(), new Chihuahua(), new Persian()};
        
        // 狗都吃那些東西?
        Arrays.stream(pets)
                .filter(p -> p instanceof Dog)
                .forEach(p -> p.eat());
        System.out.println("-------------------");
        
        // 貓都吃那些東西?
        Arrays.stream(pets)
                .filter(p -> p instanceof Cat)
                .forEach(p -> p.eat());
        
        // 寵物的腿數共有幾隻?
        //int amount = pets.length;
        long amount = Arrays.stream(pets).count(); // count() => 計算陣列中有多少元素
        System.out.println(amount * Pet.legs);
    }
    
}
