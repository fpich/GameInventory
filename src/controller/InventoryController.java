package controller;
import model.Inventory;
import model.Item;
import view.ConsoleView;

import java.util.Scanner;

public class InventoryController {
    private Inventory inventory;
    private ConsoleView view;
    private Scanner scanner;

    public InventoryController(Inventory inventory, ConsoleView view) {
        this.inventory = inventory;
        this.view = view;
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        boolean running = true;
        while (running) {
            view.printMenu();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Entrez le nom de l'objet:");
                    String name = scanner.next();
                    System.out.println("Entrez la quantité:");
                    int quantity = scanner.nextInt();
                    inventory.addItem(new Item(name, quantity));
                    break;
                case 2:
                    view.printInventory(inventory.getItems());
                    break;
                case 3:
                    running = false;
                    break;
                default:
                    System.out.println("Choix invalide");
            }
        }
    }
}
