package com.futurecollars.lesson3.task2;

public class Task2Main {
        public static void main(String[] args) {
            Film film = new Film("Titanic", "James Cameron", 195, 1997);
            System.out.println("Title: " + film.getTitle());
            System.out.println("Director's name: " + film.getDirectorName());
            System.out.println("Length(in minutes): " + film.getLength());
            System.out.println("Year of production: " + film.getProductionYear());
        }
}
