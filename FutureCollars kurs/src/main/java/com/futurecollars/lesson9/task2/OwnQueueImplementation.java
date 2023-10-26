package com.futurecollars.lesson9.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class OwnQueueImplementation implements OwnQueue {
    private final List<Integer> queue = new ArrayList<>();

    @Override
    public boolean add(Integer e) {
        if (e == null) {
            throw new NullPointerException("Element cannot be null");
        }
        queue.add(e);
        return true;
    }

    @Override
    public Integer remove() {
        if (queue.isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return queue.remove(0);
    }

    @Override
    public Integer element() {
        if (queue.isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return queue.get(0);
    }
}

