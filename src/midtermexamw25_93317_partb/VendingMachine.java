/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexamw25_93317_partb;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class VendingMachine {
    private ArrayList<VendingMachineItem> items;

    public VendingMachine() {
        this.items = new ArrayList<>();
        // Adding initial items to the vending machine
        items.add(new VendingMachineItem("COCA COLA", 5.50, true));
        items.add(new VendingMachineItem("CHIPS", 1.20, true));
        items.add(new VendingMachineItem("CHOCOLATE", 3.50, true));
        items.add(new VendingMachineItem("GUM", 2.00, true));
    }

    // Display the vending machine menu
    public void displayMenu() {
        System.out.println("Welcome to the vending machine, here is a list of the possible candies:");
        for (int i = 0; i < items.size(); i++) {
            items.get(i).displayItem(i + 1);
        }
    }

    // Add new item functionality for the admin
    public void addNewItem(String name, double price) {
        items.add(new VendingMachineItem(name, price, true));
        System.out.println("New item added successfully!");
    }

    // Handle item selection with availability check
    public void selectItem(int itemNumber) {
        if (itemNumber > 0 && itemNumber <= items.size()) {
            VendingMachineItem selectedItem = items.get(itemNumber - 1);
            if (selectedItem.isAvailable()) {
                System.out.println("You selected: " + selectedItem.getName() + " for $" + selectedItem.getPrice());
                selectedItem.setAvailability(false); 
                System.out.println("Item has been successfully dispensed.");
            } else {
                System.out.println("choose another item.");
            }
        } else {
            System.out.println("Invalid selection");
        }
    }
}