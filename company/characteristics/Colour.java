package com.company.characteristics;

public enum Colour {
    YELLOW("Желтый"),
    WHITE("Белый"),
    BLACK("Черный"),
    BLUE("Синий"),
    PINK("Розовый");

    private String velue;

    Colour(String velue){
        this.velue = velue;
    }

    public String getVelue(){
        return velue;

    }
}
