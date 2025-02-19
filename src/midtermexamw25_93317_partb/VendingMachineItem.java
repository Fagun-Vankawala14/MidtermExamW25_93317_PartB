package midtermexamw25_93317_partb;

import java.util.ArrayList;
import java.util.Scanner;

public class VendingMachineItem {
    private double price;

    // Dynamic inventory lists
    private static final ArrayList<String> items = new ArrayList<>();
    private static final ArrayList<Double> prices = new ArrayList<>();
    private static final ArrayList<Boolean> availability = new ArrayList<>();

    // Initialize inventory
    static {
        addItem("Chocolate Bar", 1.50);
        addItem("Sour Candy", 1.20);
        addItem("Soft Drink", 1.80);
        addItem("Potato Chips", 2.00);
    }

    public VendingMachineItem() {}

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Method to add an item
    public static void addItem(String name, double price) {
        items.add(name);
        prices.add(price);
        availability.add(true);
    }

    // Admin feature: Add new item to inventory
    public static void addNewItem(Scanner sc) {
        sc.nextLine(); // Consume newline
        System.out.print("\nEnter item name: ");
        String newItem = sc.nextLine();

        System.out.print("Enter price: $");
        double newPrice = sc.nextDouble();

        addItem(newItem, newPrice);
        System.out.println(newItem + " added successfully!");
    }

    // Display menu
    public static void displayMenu() {
        System.out.println("\nVending Machine Inventory:");
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + ". " + items.get(i) + " - $" + prices.get(i) +
                    (availability.get(i) ? " (Available)" : " (Out of Stock)"));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        displayMenu();

        System.out.print("\nAre you an Admin? (yes/no): ");
        if (sc.next().equalsIgnoreCase("yes")) {
            addNewItem(sc);
            displayMenu();
        } else {
            System.out.println("Access Denied.");
        }
        sc.close();
    }
}
