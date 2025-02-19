/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexamw25_93317_partb;

/**
 *
 * @author ks055
 */


import java.util.ArrayList;
import java.util.Scanner;

// Single Responsibility Principle (SRP): Manages vending machine inventory and operations.
public class VendingMachine {
    private ArrayList<VendingMachineItem> inventory;

    public VendingMachine() {
        inventory = new ArrayList<>();
        addItem("Chocolate Bar", 1.50, true);
        addItem("Sour Candy", 1.20, true);
        addItem("Soft Drink", 1.80, true);
        addItem("Potato Chips", 2.00, true);
    }

    public void addItem(String name, double price, boolean isAvailable) {
        inventory.add(new VendingMachineItem(name, price, isAvailable));
    }

    public void displayMenu() {
        System.out.println("\nVending Machine Inventory:");
        for (int i = 0; i < inventory.size(); i++) {
            VendingMachineItem item = inventory.get(i);
            System.out.println((i + 1) + ". " + item.getName() + " - $" + item.getPrice() +
                    (item.isAvailable() ? " (Available)" : " (Out of Stock)"));
        }
    }

    public void addNewItem(Scanner sc) {
        sc.nextLine();  
        System.out.print("\nEnter item name: ");
        String newItem = sc.nextLine();

        System.out.print("Enter price: $");
        double newPrice = sc.nextDouble();

        addItem(newItem, newPrice, true);
        System.out.println(newItem + " added successfully!");
    }

    public void selectItem(Scanner sc) {
        System.out.print("\nEnter the item number to purchase: ");
        int choice = sc.nextInt();

        if (choice < 1 || choice > inventory.size()) {
            System.out.println("Invalid selection.");
            return;
        }

        VendingMachineItem selectedItem = inventory.get(choice - 1);
        if (selectedItem.isAvailable()) {
            System.out.println("You have purchased: " + selectedItem.getName() + " for $" + selectedItem.getPrice());
            selectedItem.setAvailable(false); 
        } else {
            System.out.println("Sorry, " + selectedItem.getName() + " is out of stock.");
        }
    }
}

