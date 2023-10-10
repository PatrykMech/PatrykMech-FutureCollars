package com.futurecollars.lesson3.task2;

public class Film {
    private final String title;
    private final String directorName;
    private final int lengthInMinutes;
    private final int productionYear;

    public Film(String title, String directorName, int lengthInMinutes, int productionYear) {
        this.title = title;
        this.directorName = directorName;
        this.lengthInMinutes = lengthInMinutes;
        this.productionYear = productionYear;
    }

    public String getTitle() {
        return title;
    }

    public String getDirectorName() {
        return directorName;
    }

    public int getLengthInMinutes() {
        return lengthInMinutes;
    }

    public int getProductionYear() {
        return productionYear;
    }
}
