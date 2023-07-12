package com.serenitydojo;

public class Cat extends Pet {
    private String favouriteFood;
    private int age;

    public static final String CAT_NOISE = "Meow";

    public static String usualFood() {
        return "Tuna";
    }

    public Cat(String name, String favouriteFood, int age) {
        super(name);
        this.favouriteFood = favouriteFood;
        this.age = age;
    }

    public Cat(String name, int age) {
        super(name);
        this.age = age;
        this.favouriteFood = usualFood();
    }

    public int getAge() {
        return age;
    }

    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public void makeNoise() {
        System.out.println(CAT_NOISE);
    }

    public void feed(String food) {
        System.out.println(getName() + " eats some " + food);
    }

    public void groom() {
        lickPaws();
        cleanFur();
    }

    private void cleanFur() {
        System.out.println(getName() + " clean his fur");
    }

    private void lickPaws() {
        System.out.println(getName() + " licks his paws");
    }
}
