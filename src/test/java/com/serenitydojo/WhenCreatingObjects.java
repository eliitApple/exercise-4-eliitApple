package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;

import static com.serenitydojo.Cat.usualFood;

public class WhenCreatingObjects {

    @Test
    public void creating_a_cat() {
        String name = "Felix";
        String favouriteFood = "Tuna";
        int age = 4;

        Cat felix = new Cat("Felix", "Tuna", 4);
        felix.setFavouriteFood("Tuna");

        Cat spot = new Cat("Spot", "Tuna", 3);
        System.out.println("Spot age is: " + spot.getAge());

    }

    @Test
    public void cat_makes_noise() {
        Cat felix = new Cat("Felix", 4);
        Cat spot = new Cat("Spot", "Salmon", 3);
        felix.makeNoise();
        felix.feed("Tuna");
        felix.groom();
        spot.makeNoise();
        spot.feed("Salmon");
        System.out.println(Cat.usualFood());
        System.out.println("Felix goes " + felix.makeNoise());
    }

    @Test
    public void creating_a_dog() {
        Dog fido = new Dog("Fido","Bone", 5);
        Assert.assertEquals(fido.getName(), "Fido");
        Assert.assertEquals(fido.getFavoriteToy(), "Bone");
        Assert.assertEquals(fido.getAge(), 5);
    }

    @Test
    public void dog_makes_noise() {
        Dog fido = new Dog("Fido", "Bone", 5);

        System.out.println("Fido goes " + fido.makeNoise());

    }

    @Test
    public void whenADogBarks() {
        Dog fido = new Dog("Fido","Bone", 5);
        String dogSound = fido.makeNoise();

        Assert.assertEquals(dogSound, "Woof");
    }

    @Test
    public void whenADogGetsFed() {
        Dog fido = new Dog("Fido","Bone", 5);

        fido.feed();

        Assert.assertTrue(fido.isFed());

    }

    @Test
    public void creating_a_hamster() {
        Hamster rusty = new Hamster("Rusty", "Wheel", 1);

        Assert.assertEquals(rusty.getName(), "Rusty");
        Assert.assertEquals(rusty.getFavoriteGame(), "Wheel");
        Assert.assertEquals(rusty.getAge(), 1);

    }

    @Test
    public void pets_make_noise() {
        Pet felix = new Cat("Felix", 4);
        Pet fido = new Dog("Fido", "Bone", 5);
        Pet rusty = new Hamster("Rusty", "Wheel", 1);

        System.out.println("Felix goes " + felix.makeNoise());
        System.out.println("Fido goes " + fido.makeNoise());
        System.out.println("Rusty goes " + rusty.makeNoise());
    }


}
