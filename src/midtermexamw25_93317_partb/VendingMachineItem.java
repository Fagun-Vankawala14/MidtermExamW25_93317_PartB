package midtermexamw25_93317_partb;

// Cohesion: This class represents a single logical entity (Vending Machine Item)
// It encapsulates all properties and behaviors related to an individual item.
public class VendingMachineItem {
    private double price;
    private String candyName;
    private boolean availability;

    // Constructor to initialize the vending machine item
    public VendingMachineItem(String candyName, double price, boolean availability) {
        this.candyName = candyName;
        this.price = price;
        this.availability = availability;
    }

    // Getters and Setters for price, candy name, and availability
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCandyName() {
        return candyName;
    }

    public void setCandyName(String candyName) {
        this.candyName = candyName;
    }

    public boolean isAvailable() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}
