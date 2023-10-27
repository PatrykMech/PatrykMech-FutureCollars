package com.futurecollars.lesson9.task2;

import java.util.NoSuchElementException;

public class OwnQueueImplementation implements OwnQueue {
    private Node front;
    private Node back;
    private int size;

    @Override
    public boolean add(Integer e) {
        if (e == null) {
            throw new NullPointerException("Element cannot be null");
        }

        Node node = new Node(e);

        if (size == 0) {
            front = node;
        } else {
            back.setNext(node);
        }

        back = node;
        size++;

        return true;
    }

    @Override
    public Integer remove() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }

        Integer value = front.getValue();
        front = front.getNext();
        size--;

        return value;
    }

    @Override
    public Integer element() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }

        return front.getValue();
    }

    private boolean isEmpty() {
        return size == 0;
    }

    private static class Node {
        private final Integer value;
        private Node next;

        public Node(Integer value) {
            this.value = value;
            this.next = null;
        }

        public Integer getValue() {
            return value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}