package view;

import java.util.ArrayList;

import model.Item;

public class ItemView {
    public void printItems(ArrayList<Item> items) {
        for (Item item : items) {
            System.out.println("ID: " + item.getId() + ", Name: " + item.getName());
        }
    }

    public void printItem(Item item) {
        if (item != null) {
            System.out.println("ID: " + item.getId() + ", Name: " + item.getName());
        } else {
            System.out.println("Item not found.");
        }
    }
}
