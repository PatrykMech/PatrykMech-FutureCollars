package com.futurecollars.lesson8.task4;

import java.util.Calendar;
import java.util.Comparator;
import java.util.TreeSet;

public class Person implements Comparable<Person> {
    private final String firstName;
    private final String lastName;
    private final int birthYear;
    private final double height;
    private final double weight;

    public Person(String firstName, String lastName, int birthYear, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.height = height;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public int compareTo(Person otherPerson) {
        int thisAge = Calendar.getInstance().get(Calendar.YEAR) - this.birthYear;
        int otherAge = Calendar.getInstance().get(Calendar.YEAR) - otherPerson.birthYear;
        return Integer.compare(thisAge, otherAge);
    }

    public String toString() {
        return "Name and surname: " + firstName + " " + lastName + " || Birth year: " + birthYear + " || height: " + height + " || weight: " + weight;
    }

    public static void main(String[] args) {
        TreeSet<Person> people = new TreeSet<>();
        people.add(new Person("Phil", "Smith", 1990, 185.0, 95.0));
        people.add(new Person("Claudia", "Jones", 1960, 170.0, 65.0));
        people.add(new Person("David", "Williams", 1975, 200.0, 90.0));
        people.add(new Person("Emily", "Taylor", 2000, 160.0, 50.0));

        System.out.println("From the youngest to the oldest:");
        for (Person person : people) {
            System.out.println(person);
        }

        TreeSet<Person> byHeightSet = new TreeSet<>(Comparator.comparingDouble(person -> person.height));
        byHeightSet.addAll(people);

        System.out.println("\nFrom lowest to highest:");
        for (Person person : byHeightSet) {
            System.out.println(person);
        }

        TreeSet<Person> byWeightSet;
        Comparator<Person> weightComparator = Comparator.comparingDouble(Person::getWeight).reversed();
        byWeightSet = new TreeSet<>(weightComparator);
        byWeightSet.addAll(people);

        System.out.println("\nFrom heaviest to lightest:");
        for (Person person : byWeightSet) {
            System.out.println(person);
        }
    }
}