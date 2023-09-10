package controller;

import java.util.ArrayList;

import model.Item;

public class ItemController {
    private ArrayList<Item> items;

    public ItemController() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public ArrayList<Item> searchByKeyword(String keyword) {
        ArrayList<Item> result = new ArrayList<>();
        for (Item item : items) {
            if (item.getName().contains(keyword)) {
                result.add(item);
            }
        }
        return result;
    }

    public ArrayList<Item> searchByString(String searchString) {
        ArrayList<Item> result = new ArrayList<>();
        for (Item item : items) {
            if (item.getName().equals(searchString)) {
                result.add(item);
            }
        }
        return result;
    }

    public Item searchById(int id) {
        for (Item item : items) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }
}


