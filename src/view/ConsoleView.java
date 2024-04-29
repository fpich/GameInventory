package view;
import model.Item;

import java.util.List;

public class ConsoleView {
    public void printMenu() {
        System.out.println("1. Ajouter un objet");
        System.out.println("2. Afficher l'inventaire");
        System.out.println("3. Quitter");
    }

    public void printInventory(List<Item> items) {
        for (Item item : items) {
            System.out.println(item);
        }
    }
}
