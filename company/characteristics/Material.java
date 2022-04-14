package com.company.characteristics;

public enum Material {
    WOOD("Дерево"),
    IRON("Железо"),
    PLASTIC("Пластик"),
    GLASS("Стекло"),
    DOUGH("Тесто");

    private String velue;

    Material(String velue){
        this.velue = velue;
    }

    public String getVelue(){
        return velue;

    }
}
