// Encapsulation: Private fields with getters/setters
// SRP: Inventory handles items, Customer only selects items
package midtermexamw25_93317_partb;

public class VendingMachineItem {
    private String name;
    private int quantity;
    private double price;

    // Parameterized Constructor
    public VendingMachineItem(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    // Getters and Setters (Encapsulation)
    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }
}
