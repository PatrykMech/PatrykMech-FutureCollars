package com.futurecollars.lesson8.task2;

public class IntegerArray implements OwnList {

    private static final int DEFAULT_CAPACITY = 10;
    private int[] data;
    private int currentSize;

    public IntegerArray() {
        data = new int[DEFAULT_CAPACITY];
        currentSize = 0;
    }

    @Override
    public int size() {
        return currentSize;
    }

    @Override
    public boolean isEmpty() {
        return currentSize == 0;
    }

    @Override
    public void add(Integer element) {
        if (currentSize == data.length) {
            int minCapacity = currentSize + 1;
            int newCapacity = Math.max(data.length + DEFAULT_CAPACITY, minCapacity);
            int[] newData = new int[newCapacity];
            for (int i = 0; i < currentSize; i++) {
                newData[i] = data[i];
            }
            data = newData;
        }
        data[currentSize] = element;
        currentSize++;
    }

    @Override
    public Integer get(int index) {
        if (index < 0 || index >= currentSize) {
            throw new IndexOutOfBoundsException("Index " + index + " not found!");
        }
        return data[index];
    }

    @Override
    public void add(int index, Integer element) {
        if (index < 0 || index > currentSize) {
            throw new IndexOutOfBoundsException("Index " + index + " not found!");
        }

        if (currentSize == data.length) {
            int minCapacity = currentSize + 1;
            int newCapacity = Math.max(data.length + DEFAULT_CAPACITY, minCapacity);
            int[] newData = new int[newCapacity];
            for (int i = 0; i < index; i++) {
                newData[i] = data[i];
            }
            newData[index] = element;
            for (int i = index; i < currentSize; i++) {
                newData[i + 1] = data[i];
            }
            data = newData;
        } else {
            for (int i = currentSize; i > index; i--) {
                data[i] = data[i - 1];
            }
            data[index] = element;
        }
        currentSize++;
    }

    @Override
    public Integer remove(int index) {
        if (index < 0 || index >= currentSize) {
            throw new IndexOutOfBoundsException("Index " + index + " not found!");
        }
        int removedValue = data[index];
        for (int i = index; i < currentSize - 1; i++) {
            data[i] = data[i + 1];
        }
        currentSize--;
        return removedValue;
    }
}
