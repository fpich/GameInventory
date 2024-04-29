package app;

import controller.InventoryController;
import model.Inventory;
import view.ConsoleView;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        ConsoleView view = new ConsoleView();
        InventoryController controller = new InventoryController(inventory, view);
        controller.run();
    }
}
