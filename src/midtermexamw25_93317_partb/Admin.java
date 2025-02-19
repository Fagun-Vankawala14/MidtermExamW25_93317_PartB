/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexamw25_93317_partb;

public class Admin {
    private Inventory inventory;

    public Admin(Inventory inventory) {
        this.inventory = inventory;
    }

    public void addNewItem(String name, int quantity, double price) {
        inventory.addItem(name, quantity, price);
        System.out.println("Admin added a new item: " + name);
    }
}
