package com.serenitydojo;

public class Dog extends Pet {

    public String favoriteToy;
    public int age;

    public boolean isFed;

    public static final String DOG_NOISE = "Woof";

    public String makeNoise() {
        return DOG_NOISE;
    }

    public Dog(String name, String favoriteToy, int age) {
        super(name);
        this.favoriteToy = favoriteToy;
        this.age = age;
    }


    public String getFavoriteToy() {
        return favoriteToy;
    }

    public int getAge() {
        return age;
    }

    public void feed() {
        this.isFed = true;
    }

    public boolean isFed() {
        return isFed;
    }

}
