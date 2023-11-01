package com.futurecollars.lesson10.task1;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PhoneBook {
    private final Map<String, Person> peopleMap = new HashMap<>();
    private static final String PHONE_BOOK_FILE = "C:\\Users\\m3sio\\PatrykMech-FutureCollars\\FutureCollars kurs\\phonebook.txt";

    public PhoneBook() {
        checkAndCreatePhoneBookFile();
        loadPhoneBookData();
    }

    private void checkAndCreatePhoneBookFile() {
        File file = new File(PHONE_BOOK_FILE);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void loadPhoneBookData() {
        try (BufferedReader br = new BufferedReader(new FileReader(PHONE_BOOK_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\t");
                if (parts.length == 3) {
                    addPerson(parts[0], parts[1], parts[2]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void savePhoneBookData() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(PHONE_BOOK_FILE))) {
            for (Person person : peopleMap.values()) {
                writer.println(person.getName() + "\t" + person.getPhoneNumber() + "\t" + person.getAddress());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addPerson(String name, String phoneNumber, String address) {
        if (isValidName(name)) {
            Person person = new Person(name, phoneNumber, address);
            peopleMap.put(name, person);
            savePhoneBookData();
        }
    }

    private static boolean isValidName(String name) {
        String namePattern = "^[A-Z][a-zA-Z]*\\s[A-Z][a-zA-Z]*$";
        Pattern pattern = Pattern.compile(namePattern);
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }

    private static boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("\\d{9}");
    }

    public Person findPerson(String name) throws Exception {
        if (peopleMap.containsKey(name)) {
            return peopleMap.get(name);
        } else {
            throw new Exception("Person with name " + name + " not found.");
        }
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Scanner scanner = new Scanner(System.in);

        System.out.println("PHONE BOOK");
        System.out.println("Commands: add, search, exit");

        while (true) {
            System.out.print("Enter a command: ");
            String command = scanner.nextLine();

            if (command.equalsIgnoreCase("add")) {
                String name;
                while (true) {
                    System.out.print("Enter name and surname: ");
                    name = scanner.nextLine();
                    if (isValidName(name)) {
                        break;
                    } else {
                        System.out.println("Invalid name format. Name should start with a capital letter and contain only letters");
                    }
                }
                String phoneNumber;
                while (true) {
                    System.out.print("Enter phone number (9 digits): ");
                    phoneNumber = scanner.nextLine();
                    if (isValidPhoneNumber(phoneNumber)) {
                        break;
                    } else {
                        System.out.println("Invalid phone number format. Phone number should contain 9 digits.");
                    }
                }
                System.out.print("Enter address: ");
                String address = scanner.nextLine();
                System.out.println("Contact added.");

                phoneBook.addPerson(name, phoneNumber, address);
            } else if (command.equalsIgnoreCase("search")) {
                System.out.print("Enter name to search: ");
                String nameToSearch = scanner.nextLine();

                try {
                    Person foundPerson = phoneBook.findPerson(nameToSearch);
                    System.out.println(foundPerson);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            } else if (command.equalsIgnoreCase("exit")) {
                System.out.println("Phone book closed");
                break;
            }
        }

        scanner.close();
    }
}