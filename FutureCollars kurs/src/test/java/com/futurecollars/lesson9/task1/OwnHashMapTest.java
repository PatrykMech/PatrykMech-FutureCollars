package com.futurecollars.lesson9.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OwnHashMapTest {

    private OwnMap ownMap;

    @BeforeEach
    public void setUp() {
        ownMap = new OwnHashMap();
    }

    @Test
    public void shouldPutAndGet() {
        // given
        ownMap.put("key1", "value1");

        // when
        String result = ownMap.get("key1");

        // then
        Assertions.assertEquals("value1", result);
    }

    @Test
    public void shouldPutTwiceAndGet() {
        // given
        ownMap.put("key1", "value1");
        ownMap.put("key2", "value2");

        // when
        String result1 = ownMap.get("key1");
        String result2 = ownMap.get("key2");

        // then
        Assertions.assertEquals("value1", result1);
        Assertions.assertEquals("value2", result2);
    }

    @Test
    public void shouldContainKey() {
        // given
        ownMap.put("key1", "value1");

        // when
        boolean result1 = ownMap.containsKey("key1");
        boolean result2 = ownMap.containsKey("key2");

        // then
        Assertions.assertTrue(result1);
        Assertions.assertFalse(result2);
    }

    @Test
    public void shouldContainValue() {
        // given
        ownMap.put("key1", "value1");

        // when
        boolean result1 = ownMap.containsValue("value1");
        boolean result2 = ownMap.containsValue("value2");

        // then
        Assertions.assertTrue(result1);
        Assertions.assertFalse(result2);
    }

    @Test
    public void shouldRemove() {
        // given
        ownMap.put("key1", "value1");

        // when
        String result1 = ownMap.remove("key1");
        String result2 = ownMap.remove("key2");

        // then
        Assertions.assertEquals("value1", result1);
        Assertions.assertNull(result2);
    }
}