package com.futurecollars.lesson10.task1;

class Person {
    private final String name;
    private final String phoneNumber;
    private final String address;

    public Person(String name, String phoneNumber, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Person [Name: " + name + ", Phone Number: " + phoneNumber + ", Address: " + address + "]";
    }
}
