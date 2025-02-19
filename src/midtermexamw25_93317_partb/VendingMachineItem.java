package midtermexamw25_93317_partb;

// Single Responsibility Principle (SRP): Represents a vending machine item.
public class VendingMachineItem {
    private String name;
    private double price;
    private boolean available;

    public VendingMachineItem(String name, double price, boolean available) {
        this.name = name;
        this.price = price;
        this.available = available;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
