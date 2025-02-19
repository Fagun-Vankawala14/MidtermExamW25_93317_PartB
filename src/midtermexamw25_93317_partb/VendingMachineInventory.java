package midtermexamw25_93317_partb;

import java.util.ArrayList;
import java.util.List;

// Cohesion: This class is responsible for managing the inventory of vending machine items
// It does not mix the concerns of individual items but instead handles the collection of items.
public class VendingMachineInventory {
    private List<VendingMachineItem> inventory;

    public VendingMachineInventory() {
        this.inventory = new ArrayList<>();
        // Initial items in the inventory
        inventory.add(new VendingMachineItem("chocolate bar", 1.50, true));
        inventory.add(new VendingMachineItem("sour candy", 1.20, true));
        inventory.add(new VendingMachineItem("soft drink", 1.80, true));
        inventory.add(new VendingMachineItem("potato chips", 2.00, true));
    }

    // Display current inventory (menu)
    public void displayMenu() {
        System.out.println("Welcome to the vending machine, here is a list of the possible candies:");
        for (int i = 0; i < inventory.size(); i++) {
            VendingMachineItem item = inventory.get(i);
            System.out.println((i + 1) + ". " + item.getCandyName() + " - $" + item.getPrice() + " (Available: " + item.isAvailable() + ")");
        }
    }

    // Loose Coupling: The inventory is responsible for adding new items, but it interacts with VendingMachineItem
    // through its public interface. No need to know internal details of VendingMachineItem.
    public void addNewItem(String candyName, double candyPrice, boolean availability) {
        inventory.add(new VendingMachineItem(candyName, candyPrice, availability));
        System.out.println("New item added successfully: " + candyName + " - $" + candyPrice + " (Available: " + availability + ")");
    }

    // Loose Coupling: The customer can select an item, and this functionality depends on the VendingMachineItem's 
    // public interface (such as availability check and price retrieval).
    public boolean selectItem(int selection) {
        if (selection < 1 || selection > inventory.size()) {
            System.out.println("Invalid selection. Please choose a valid item.");
            return false;
        }

        VendingMachineItem selectedItem = inventory.get(selection - 1);
        if (selectedItem.isAvailable()) {
            System.out.println("You selected: " + selectedItem.getCandyName() + " - $" + selectedItem.getPrice());
            selectedItem.setAvailability(false); // Mark item as unavailable after selection
            System.out.println("Thank you for your purchase! The item is now marked as unavailable.");
            return true;
        } else {
            System.out.println("Sorry, the item '" + selectedItem.getCandyName() + "' is currently unavailable.");
            return false;
        }
    }
}
