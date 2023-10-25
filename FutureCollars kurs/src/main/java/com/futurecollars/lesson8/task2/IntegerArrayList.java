package com.futurecollars.lesson8.task2;

import java.util.ArrayList;

public class IntegerArrayList implements OwnList {

    private final ArrayList<Integer> arrayList;

    public IntegerArrayList() {
        arrayList = new ArrayList<>();
    }

    @Override
    public int size() {
        return arrayList.size();
    }

    @Override
    public boolean isEmpty() {
        return arrayList.isEmpty();
    }

    @Override
    public void add(Integer element) {
        arrayList.add(element);
    }

    @Override
    public Integer get(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Index " + index + " not found!");
        }
        return arrayList.get(index);
    }

    @Override
    public void add(int index, Integer element) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException("Index " + index + " not found!");
        }
        arrayList.add(index, element);
    }

    @Override
    public Integer remove(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Index " + index + " not found!");
        }
        return arrayList.remove(index);
    }
}
