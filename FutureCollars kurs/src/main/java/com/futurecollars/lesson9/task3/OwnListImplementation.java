package com.futurecollars.lesson9.task3;

public class OwnListImplementation<E> implements OwnList<E> {
    private Object[] elements;
    private int size;

    public OwnListImplementation() {
        this.elements = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    @Override
    public boolean add(E e) {
        if (size == elements.length) {
            int newCapacity = elements.length * 2;
            E[] newElements = (E[]) new Object[newCapacity];
            for (int i = 0; i < size; i++) {
                newElements[i] = (E) elements[i];
            }
            elements = newElements;
        }
        elements[size++] = e;
        return true;
    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return (E) elements[index];
    }

    @Override
    public boolean remove(E o) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(o)) {
                for (int j = i; j < size - 1; j++) {
                    elements[j] = elements[j + 1];
                }
                elements[--size] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }
}