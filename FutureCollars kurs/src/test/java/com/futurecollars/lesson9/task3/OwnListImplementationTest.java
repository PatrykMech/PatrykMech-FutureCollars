package com.futurecollars.lesson9.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OwnListImplementationTest {

    @Test
    public void shouldAddElementToList() {
        OwnList<String> list = new OwnListImplementation<>();
        Assertions.assertTrue(list.add("Element"));
        Assertions.assertEquals("Element", list.get(0));
    }

    @Test
    public void shouldGetElementByIndex() {
        OwnList<Integer> list = new OwnListImplementation<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Assertions.assertEquals(2, list.get(1));
    }

    @Test
    public void shouldRemoveElementFromList() {
        OwnList<Integer> list = new OwnListImplementation<>();
        list.add(1);
        list.add(2);
        Assertions.assertTrue(list.remove(1));
        Assertions.assertEquals(2, list.get(0));
        Assertions.assertEquals(1, list.size());
    }

    @Test
    public void shouldReturnSizeOfList() {
        OwnList<String> list = new OwnListImplementation<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        Assertions.assertEquals(3, list.size());
    }

    @Test
    public void shouldNotRemoveElementWhenItDoesNotExist() {
        OwnList<Integer> list = new OwnListImplementation<>();
        list.add(1);
        list.add(2);
        Assertions.assertFalse(list.remove(3));
        Assertions.assertEquals(2, list.size());
    }
}
