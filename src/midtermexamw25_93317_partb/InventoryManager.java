/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexamw25_93317_partb;

/**
 *
 * @author tutejad
 */
public class InventoryManager {
    public static void addItem(String candy, double price, boolean available) {
        VendingMachineItem.addNewItem(candy, price, available); 
    }
}
