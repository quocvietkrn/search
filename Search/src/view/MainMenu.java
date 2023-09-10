package view;

import java.util.ArrayList;
import java.util.Scanner;

import controller.ItemController;
import model.Item;

public class MainMenu extends Menu {
    private ItemController controller;
    private ItemView view;

    public MainMenu(ItemController controller, ItemView view) {
        this.controller = controller;
        this.view = view;
    }

    @Override
    public void display() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Search by keyword");
            System.out.println("2. Search by string");
            System.out.println("3. Search by ID");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter keyword: ");
                    String keyword = scanner.nextLine();
                    ArrayList<Item> keywordResults = controller.searchByKeyword(keyword);
                    view.printItems(keywordResults);
                    break;
                case 2:
                    System.out.print("Enter string: ");
                    String searchString = scanner.nextLine();
                    ArrayList<Item> stringResults = controller.searchByString(searchString);
                    view.printItems(stringResults);
                    break;
                case 3:
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    Item idResult = controller.searchById(id);
                    view.printItem(idResult);
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4);
    }
}
