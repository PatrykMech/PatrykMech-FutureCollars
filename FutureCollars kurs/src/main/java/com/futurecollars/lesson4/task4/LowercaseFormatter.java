package com.futurecollars.lesson4.task4;

public class LowercaseFormatter implements TextFormatter{
    @Override
    public String formatText(String text){
        return text.toLowerCase();
    }
}
