/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexamw25_93317_partb;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<VendingMachineItem> itemList;

    public Inventory() {
        this.itemList = new ArrayList<>();
    }

    // Method to add an item to inventory
   public void addItem(String name, int quantity, double price) {
    VendingMachineItem newItem = new VendingMachineItem(name, quantity, price);
    itemList.add(newItem);
    System.out.println("Item added successfully: " + name);
}

    // Method to check if an item is available
 public boolean isItemAvailable(String name, int requestedQuantity) {
    for (VendingMachineItem item : itemList) {
        if (item.getName().equalsIgnoreCase(name) && item.getQuantity() >= requestedQuantity) {
            return true;
        }
    }
    return false;
}


    // Get all items in the inventory
    public List<VendingMachineItem> getItems() {
        return itemList;
    }
}
