package midterm;

public class Item {
    private int id;
    private String description;
    private double price;
    private int quantity; // Add quantity field

    public Item(int id, String description, double price) {
        this.id = id;
        this.description = description;
        this.price = price;
        this.quantity = 1; // Default quantity
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Item ID: " + id + ", Description: " + description + ", Price: $" + price + ", Quantity: " + quantity;
    }
}

