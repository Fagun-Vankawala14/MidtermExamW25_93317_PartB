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
        Scanner scanner = new Scanner(System.in);

        // Simulating admin adding new items
        System.out.println("Admin: Add new inventory item");
        System.out.print("Enter item name: ");
        String name = scanner.nextLine();

        System.out.print("Enter item price: ");
        double price = scanner.nextDouble();

        System.out.print("Enter item quantity: ");
        int quantity = scanner.nextInt();

        // Create the new item and add to inventory
        Item newItem = new Item(name, price, quantity);
        inventory.addItem(newItem);

        // List the inventory
        inventory.listItems();
    }
}
