package com.pcschool.ocp.d06.case3.material;

public class Pearl extends Material {

    private String size;

    public Pearl() {
        this("L"); // 預設參數 "L" (建構子調用)
    }

    public Pearl(String size) {
        setName("珍珠");
        setSize(size);
        setPrice(); // 記得設定價格
    }
    
    
    // 超載方法 Overloading
    public void setPrice(){
        if(size.equalsIgnoreCase("L")){ // 呼叫 Material 的 setPrice
            setPrice(40);
        } else {
            setPrice(20);
        }
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

}
