package com.pcschool.ocp.d07.case1.Food;

import com.pcschool.ocp.d07.case1.material.Egg;
import com.pcschool.ocp.d07.case1.material.Ham;
import com.pcschool.ocp.d07.case1.material.Material;

public class Sandwich extends Food {

    public Sandwich(String name) {  // 建立一個帶 name 參數的建構子 
        super(name); // 食材名稱給食物
        // 定義食材
        Material[] materials = new Material[2]; // 靜態陣列
        materials[0] = new Ham();
        materials[1] = new Egg();
        setMaterials(materials); // 將食材陣列透過 setMaterials 設定到 Food 的 materials 物件變數中
    }
}
 
