package midtermexamw25_93317_partb;
class VendingMachineItem {
    private String name;
    private double price;
    private boolean available;

    public VendingMachineItem(String name, double price, boolean available) {
        this.name = name;
        this.price = price;
        this.available = available;
    }

    // Getters and Setters for the private attributes (Encapsulation)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailability(boolean available) {
        this.available = available;
    }

    // Display the item details
    public void displayItem(int itemNumber) {
        System.out.print(itemNumber + ". " + name + " - $" + price);
        if (available) {
            System.out.println(" (Available)");
        } else {
            System.out.println(" (Out of stock)");
        }
    }
}
