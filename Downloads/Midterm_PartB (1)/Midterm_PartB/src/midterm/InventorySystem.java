package midterm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InventorySystem {

    private List<Item> inventoryList; // List to hold items in the inventory
    private int itemIdCounter; // Counter for item IDs

    public InventorySystem() {
        inventoryList = new ArrayList<>(); // Initialize the inventory list
        itemIdCounter = 0; // Initialize item ID counter
    }

    public static void main(String[] args) {
        InventorySystem inventorySystem = new InventorySystem(); // Create an instance of InventorySystem
        Scanner input = new Scanner(System.in);

        // Adding a new item through user input
        System.out.println("Enter description of the item to add:");
        String description = input.nextLine();

        System.out.println("Enter the price:");
        double price = input.nextDouble();

        // Create a new item and add it to the inventory
        Item item2 = new Item(++inventorySystem.itemIdCounter, description, price);
        inventorySystem.addItem(item2);

        // Adding sample items
        Item item3 = new Item(++inventorySystem.itemIdCounter, "Sony Headphones", 199.99);
        inventorySystem.addItem(item3);

        Item item4 = new Item(++inventorySystem.itemIdCounter, "JBL Speaker", 99.99);
        inventorySystem.addItem(item4);

        // Printing the list of items
        inventorySystem.printList();

        // Calculate and display the total inventory value
        double totalInventoryValue = inventorySystem.calculateTotalInventoryValue();
        System.out.println("Total Inventory Value: $" + totalInventoryValue);

        // Finding an item price by ID
        System.out.println("Enter ID of the item whose price you want to find:");
        int id = input.nextInt();
        System.out.println("Item's price is: $" + inventorySystem.getItemPrice(id));
        
        input.close(); // Close the scanner to prevent resource leaks
    }

    // Method to add an item to the inventory
    public void addItem(Item item) {
        inventoryList.add(item);
    }

    // Method to calculate the total inventory value
    public double calculateTotalInventoryValue() {
        double totalValue = 0.0;
        for (Item item : inventoryList) {
            totalValue += item.getPrice() * item.getQuantity(); // Assuming each item has a quantity
        }
        return totalValue;
    }

    // Method to print the list of items in the inventory
    public void printList() {
        for (Item item : inventoryList) {
            System.out.println(item);
        }
    }

    // Method to get an item's price by ID
    public double getItemPrice(int id) {
        for (Item item : inventoryList) {
            if (item.getId() == id) {
                return item.getPrice();
            }
        }
        return -1; // Return -1 if item not found
    }
}
