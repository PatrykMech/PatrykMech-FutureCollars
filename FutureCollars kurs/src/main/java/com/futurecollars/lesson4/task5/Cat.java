package com.futurecollars.lesson4.task5;

public class Cat extends Animal {
    private final String breed;

    public Cat(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
}

