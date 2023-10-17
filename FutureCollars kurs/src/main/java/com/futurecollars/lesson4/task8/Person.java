package com.futurecollars.lesson4.task8;

import java.util.Objects;

public class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        Person person = (Person) obj;
        return age == person.age && name == person.name;
    }

    public int hashCode() {
        return Objects.hash(name, age);
    }
}
