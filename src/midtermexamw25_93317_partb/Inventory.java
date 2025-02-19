/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexamw25_93317_partb;

/**
 *
 * @author Admin
 */
import java.util.ArrayList;

public class Inventory {
    private ArrayList<Item> items;

    // Constructor
    public Inventory() {
        items = new ArrayList<>();
    }

    // Add a new item to the inventory
    public void addItem(Item newItem) {
        items.add(newItem);
    }

    // List all items in the inventory
    public void listItems() {
        System.out.println("Inventory List:");
        for (Item item : items) {
            System.out.println(item);
        }
    }

    // Method to get an item by name
    public Item getItemByName(String name) {
        for (Item item : items) {
            if (item.getName().equalsIgnoreCase(name)) {
                return item;
            }
        }
        return null;  // Return null if the item is not found
    }
}
