package com.futurecollars.lesson9.task5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BubbleSortTest {

    @Test
    public void shouldSortIntegerArray() {
        // given
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();
        Integer[] arr = {6, 1, 9, 2, 7, 4};
        Integer[] expected = {1, 2, 4, 6, 7, 9};

        // when
        bubbleSort.sort(arr);

        // then
        Assertions.assertArrayEquals(expected, arr);
    }

    @Test
    public void shouldSortStringArray() {
        // given
        BubbleSort<String> bubbleSort = new BubbleSort<>();
        String[] arr = {"Adam", "Bob", "Eve", "Charles", "David"};
        String[] expected = {"Adam", "Bob", "Charles", "David", "Eve"};

        // when
        bubbleSort.sort(arr);

        // then
        Assertions.assertArrayEquals(expected, arr);
    }

    @Test
    public void shouldSortEmptyArray() {
        // given
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();
        Integer[] arr = {};
        Integer[] expected = {};

        // when
        bubbleSort.sort(arr);

        // then
        Assertions.assertArrayEquals(expected, arr);
    }
}