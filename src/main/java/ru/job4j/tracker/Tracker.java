package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {

    private final Item[] items = new Item[100];

    private int ids = 1;

    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public Item[] findByName(String key) {
        Item[] itemsWithKey = new Item[size];
        int temp = 0;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (key.equals(item.getName())) {
                itemsWithKey[temp] = item;
                temp++;
            }
        }
        return Arrays.copyOf(itemsWithKey, temp);
    }

    public Item[] findAll() {
        Item[] itemsWithoutNull = new Item[size];
        int temp = 0;
        for (Item item : items) {
            if (item != null) {
                itemsWithoutNull[temp] = item;
                temp++;
            }
        }
        return Arrays.copyOf(itemsWithoutNull, temp);
    }

    public boolean replace(int id, Item item) {
        boolean result = false;
        int index = indexOf(id);
        if (index != -1 && item != null) {
            Item replacedItem = items[index];
            replacedItem.setName(item.getName());
            result = true;
        }
        return result;
    }

    private int indexOf(int id) {
        int result = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                result = index;
                break;
            }
        }
        return result;
    }

}