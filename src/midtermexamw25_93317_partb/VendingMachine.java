package midtermexamw25_93317_partb;

import java.util.Scanner;

// The VendingMachine class is the entry point to simulate the entire vending machine system
// It interacts with the VendingMachineInventory to display items, add items, and allow customers to select items.
public class VendingMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VendingMachineInventory inventory = new VendingMachineInventory();
        
        // Display the current inventory
        inventory.displayMenu();
        
        // Admin functionality to add a new item
        System.out.println("\nAdmin: Adding a new item to the inventory...");
        System.out.print("Enter the name of the new item: ");
        String newCandy = sc.nextLine();
        
        System.out.print("Enter the price of the new item: ");
        double newPrice = sc.nextDouble();
        
        System.out.print("Is the item available? (true/false): ");
        boolean availability = sc.nextBoolean();
        
        // Add the new item to the inventory
        inventory.addNewItem(newCandy, newPrice, availability);
        
        // Display the updated menu with the new item
        System.out.println("\nUpdated menu after adding new item:");
        inventory.displayMenu();
        
        // Customer functionality to select an item
        sc.nextLine(); // Consume newline left by nextDouble and nextBoolean
        System.out.println("\nCustomer: Please select an item by entering its number:");
        int selection = sc.nextInt();
        inventory.selectItem(selection);
        
        // Display updated menu after selection
        System.out.println("\nUpdated menu after item selection:");
        inventory.displayMenu();
    }
}
