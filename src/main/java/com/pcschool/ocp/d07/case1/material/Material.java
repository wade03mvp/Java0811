package com.pcschool.ocp.d07.case1.material;

public class Material {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private String name;

    private int price;

    public Material() {
    }

    public Material(String name, int price) {
        setName(name);    // 封裝(參數帶入)
        setPrice(price);
    }

}
