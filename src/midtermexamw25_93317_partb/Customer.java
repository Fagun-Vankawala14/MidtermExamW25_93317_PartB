/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexamw25_93317_partb;

public class Customer {
    private Inventory inventory;

    public Customer(Inventory inventory) {
        this.inventory = inventory;
    }

    public void selectItem(String itemName, int quantityRequested) {
        if (inventory.isItemAvailable(itemName, quantityRequested)) {
            for (VendingMachineItem item : inventory.getItems()) {
                if (item.getName().equalsIgnoreCase(itemName)) {
                    item.setQuantity(item.getQuantity() - quantityRequested);
                    System.out.println("Customer selected: " + itemName + " (Quantity: " + quantityRequested + ")");
                    return;
                }
            }
        } else {
            System.out.println("Item not available or insufficient stock.");
        }
    }
}
