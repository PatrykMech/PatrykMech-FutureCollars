package com.futurecollars.lesson3.task2;

public class Film {
    private final String title;
    private final String directorName;
    private final int length;
    private final int productionYear;

    public Film(String title, String directorName, int length, int productionYear) {
        this.title = title;
        this.directorName = directorName;
        this.length = length;
        this.productionYear = productionYear;
    }

    public String getTitle() {
        return title;
    }

    public String getDirectorName() {
        return directorName;
    }

    public int getLength() {
        return length;
    }

    public int getProductionYear() {
        return productionYear;
    }
}
