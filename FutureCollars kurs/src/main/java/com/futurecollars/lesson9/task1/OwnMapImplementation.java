package com.futurecollars.lesson9.task1;

public class OwnMapImplementation implements OwnMap {
    private static final int DEFAULT_CAPACITY = 10;
    private Entry[] entries = new Entry[DEFAULT_CAPACITY];
    private int size = 0;

    private static class Entry {
        String key;
        String value;

        Entry(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    @Override
    public boolean put(String key, String value) {
        int index = findEntryIndex(key);

        if (index >= 0) {
            entries[index].value = value;
        } else {
            if (size >= entries.length) {
                increaseCapacity();
            }
            entries[size] = new Entry(key, value);
            size++;
        }

        return true;
    }

    @Override
    public boolean containsKey(String key) {
        return findEntryIndex(key) >= 0;
    }

    @Override
    public boolean containsValue(Object value) {
        for (int i = 0; i < size; i++) {
            if (value.equals(entries[i].value)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String remove(String key) {
        int index = findEntryIndex(key);
        if (index >= 0) {
            String removedValue = entries[index].value;
            for (int i = index; i < size - 1; i++) {
                entries[i] = entries[i + 1];
            }
            entries[size - 1] = null;
            size--;
            return removedValue;
        }
        return null;
    }

    @Override
    public String get(String key) {
        int index = findEntryIndex(key);
        if (index >= 0) {
            return entries[index].value;
        }
        return null;
    }

    private int findEntryIndex(String key) {
        for (int i = 0; i < size; i++) {
            if (entries[i] != null && key.equals(entries[i].key)) {
                return i;
            }
        }
        return -1;
    }

    private void increaseCapacity() {
        int newCapacity = entries.length * 2;
        Entry[] newEntries = new Entry[newCapacity];
        for (int i = 0; i < size; i++) {
            newEntries[i] = entries[i];
        }
        entries = newEntries;
    }
}
