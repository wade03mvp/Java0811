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
        Material[] new_materials = new Material[materials.length + 1]; // 創立一個新陣列
        /*for(int i=0;i<new_materials.length-1;i++){   // 舊的陣列物件帶入
            new_materials[i] = materials[i];
        }*/
        // 來源陣列,來源陣列起始位置,目的陣列,目的陣列起始位置,資料長度
        System.arraycopy(materials, 0, new_materials, 0, materials.length); // 陣列複製
        new_materials[new_materials.length-1] = material; // 新陣列的最後一格,放入新素材
        setMaterials(new_materials); // 素材帶入
        return this;
    }

}
