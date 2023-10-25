package com.futurecollars.lesson8.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class NamesList {
    public static void main(String[] args) {
        List<String> names = getStringList();
        List<String> uniqueNames = getUniqueNames(names);
        System.out.println("Lista bez duplikatów: " + String.join(", ", uniqueNames) + "\n");

        Collections.reverse(names);
        System.out.println("Elementy w odwrotnej kolejności: " + String.join(", ", names) + "\n");

        String oldName = "Anna";
        String newName = "Joanna";
        List<String> updatedNames = updateName(names, oldName, newName);
        System.out.println("Elementy po zmianie : " + oldName + " -> " + newName + ": \n" + String.join(", ", updatedNames));
    }

    private static List<String> getStringList() {
        List<String> names = new ArrayList<>();
        names.add("Anna");
        names.add("Katarzyna");
        names.add("Tymon");
        names.add("Tadeusz");
        names.add("Anna");
        names.add("Karolina");
        names.add("Dorota");
        names.add("Piotr");

        return names;
    }

    private static List<String> getUniqueNames(List<String> names) {
        Map<String, String> uniqueNamesMap = new LinkedHashMap<>();
        for (String name : names) {
            uniqueNamesMap.put(name, name);
        }
        return new ArrayList<>(uniqueNamesMap.values());
    }

    private static List<String> updateName(List<String> names, String oldName, String newName) {
        List<String> updatedNames = new ArrayList<>(names);
        for (int i = 0; i < updatedNames.size(); i++) {
            if (updatedNames.get(i).equals(oldName)) {
                updatedNames.set(i, newName);
            }
        }
        return updatedNames;
    }
}