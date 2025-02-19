/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexamw25_93317_partb;

/**
 *
 * @author Admin
 */

import java.util.Scanner;



public class AdminPanel {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        // Add items to inventory (admin logic)
        inventory.addItem(new Item("Laptop", 1200.99, 10));
        inventory.addItem(new Item("Phone", 700.50, 0));

        // Display available items to the customer
        displayInventory(inventory);

        // Customer selects an item
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the item name you want to select: ");
        String selectedItemName = scanner.nextLine();

        // Check if the item is available and process selection
        Item selectedItem = inventory.getItemByName(selectedItemName);
        if (selectedItem != null) {
            if (selectedItem.isAvailable()) {
                System.out.println("You have successfully selected the item: " + selectedItem);
            } else {
                System.out.println("Sorry, the item is out of stock.");
            }
        } else {
            System.out.println("Item not found.");
        }
    }

    // Method to display inventory
    public static void displayInventory(Inventory inventory) {
        System.out.println("Items available in the inventory:");
        for (Item item : inventory.getItems()) {
            System.out.println(item);
        }
    }
}
