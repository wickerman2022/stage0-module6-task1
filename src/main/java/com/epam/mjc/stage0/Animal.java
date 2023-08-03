package com.epam.mjc.stage0;

public class Animal {
    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }
    public String getDescription(){
            String furStatus = hasFur ? "a" : "no";
            String pawStr = (numberOfPaws == 1) ? "paw" : "paws";
            return "This animal is mostly " + color + ". It has " + numberOfPaws + " " + pawStr + " and "+ furStatus + " fur.";
        };
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

}
