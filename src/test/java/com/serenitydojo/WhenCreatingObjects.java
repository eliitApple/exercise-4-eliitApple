package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;

import static com.serenitydojo.Cat.usualFood;
import static com.serenitydojo.Dog.makeNoise;

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
        System.out.println(usualFood());
    }

    @Test
    public void creating_a_dog() {
        Pet hamster = new Pet("Rusty");
        Dog fido = new Dog("Fido","Bone", 5);
        Assert.assertEquals(fido.getName(), "Fido");
        Assert.assertEquals(fido.getFavoriteToy(), "Bone");
        Assert.assertEquals(fido.getAge(), 5);
    }

    @Test
    public void whenADogBarks() {
        Dog fido = new Dog("Fido","Bone", 5);
        String dogSound = makeNoise();

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
}
