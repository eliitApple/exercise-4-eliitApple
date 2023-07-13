package com.serenitydojo;

// abstract class can't be created by itself, you can't create a generic Pet

public abstract class Pet {
    private String name;

    public Pet(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public abstract String makeNoise();

    // abstract method is available for all child classes, but it's not defined for its parent Pet class

    public String goForWalks() { return "Walk walk walk"; }

}



