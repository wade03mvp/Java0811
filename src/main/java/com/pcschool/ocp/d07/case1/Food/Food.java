package com.pcschool.ocp.d07.case1.Food;

import com.pcschool.ocp.d07.case1.material.Material;
import java.util.Arrays;

public class Food {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Material[] getMaterials() {
        return materials;
    }

    public void setMaterials(Material[] materials) {
        this.materials = materials;
    }

    private String name;

    private Material[] materials;

    public Food() {
    }

    public Food(String name) {
        setName(name); // 呼叫 setName
    }

    public int getPrice() {
        return Arrays.stream(materials).mapToInt(m -> m.getPrice()).sum();
        // 找出 materials 陣列中 getPrice() 的總和 sum()
    }

    public Food addMaterial(Material material) {
        return null;
    }

}
