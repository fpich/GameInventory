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
            scanner.nextLine();  // Consommer la nouvelle ligne restante après le nombre
            switch (choice) {
                case 1:
                    addItem();
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
        scanner.close();
    }

    private void addItem() {
        System.out.println("Entrez le nom de l'objet:");
        String name = scanner.nextLine();
        System.out.println("Entrez le type de l'objet (ex. épée, potion):");
        String type = scanner.nextLine();
        System.out.println("Entrez la rareté de l'objet (commun, rare, épique):");
        String rarity = scanner.nextLine();
        System.out.println("Entrez l'effet de puissance de l'objet:");
        int powerEffect = scanner.nextInt();
        System.out.println("Entrez le prix de l'objet:");
        int price = scanner.nextInt();
        System.out.println("Entrez le poids de l'objet:");
        double weight = scanner.nextDouble();
        System.out.println("Entrez le niveau requis pour utiliser l'objet:");
        int levelRequired = scanner.nextInt();
        System.out.println("Entrez la durabilité de l'objet:");
        int durability = scanner.nextInt();
        scanner.nextLine(); // Consommer la nouvelle ligne restante
        System.out.println("Entrez une description pour l'objet:");
        String description = scanner.nextLine();
        System.out.println("L'objet est-il utilisable ? (true/false):");
        boolean isUsable = scanner.nextBoolean();
        
        Item newItem = new Item(name, type, rarity, powerEffect, price, weight, levelRequired, durability, description, isUsable);
        inventory.addItem(newItem);
        System.out.println("Objet ajouté avec succès!");
    }
}
