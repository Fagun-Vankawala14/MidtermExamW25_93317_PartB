package midtermexamw25_93317_partb;

import java.util.Scanner;

public class VendingMachineItem {
    public double price;
    public String candyName;
    public boolean availability;

    // Static arrays to hold the candy names, prices, and availability
    public static String[] candies = {"chocolate bar", "sour candy", "soft drink", "potato chips"};
    public static double[] prices = {1.50, 1.20, 1.80, 2.00};
    public static boolean[] itemAvailability = {true, true, true, true}; // Initially all items are available
    
    // Parameterized constructor
    public VendingMachineItem(String candyName, double price, boolean availability) {
        this.candyName = candyName;
        this.price = price;
        this.availability = availability;
    }

    // Getters and Setters for price
    public double getPrice() {
        return price;
    }

    public void setPrice(double givenPrice) {
        price = givenPrice;
    }

    // Method to display the current inventory of items
    public static void displayMenu() {
        System.out.println("Welcome to the vending machine, here is a list of the possible candies:");
        for (int i = 0; i < candies.length; i++) {
            System.out.println((i + 1) + ". " + candies[i] + " - $" + prices[i] + " (Available: " + itemAvailability[i] + ")");
        }
    }

    // Method for Admin to add a new item to the inventory
    public static void addNewItem(String candyName, double candyPrice, boolean availability) {
        // Expand the arrays to accommodate the new item
        int newSize = candies.length + 1;

        // Create new arrays with the expanded size
        String[] newCandies = new String[newSize];
        double[] newPrices = new double[newSize];
        boolean[] newAvailability = new boolean[newSize];

        // Copy the existing items into the new arrays
        System.arraycopy(candies, 0, newCandies, 0, candies.length);
        System.arraycopy(prices, 0, newPrices, 0, prices.length);
        System.arraycopy(itemAvailability, 0, newAvailability, 0, itemAvailability.length);

        // Add the new item to the arrays
        newCandies[newSize - 1] = candyName;
        newPrices[newSize - 1] = candyPrice;
        newAvailability[newSize - 1] = availability;

        // Assign the new arrays back to the original static arrays
        candies = newCandies;
        prices = newPrices;
        itemAvailability = newAvailability;

        System.out.println("New item added successfully: " + candyName + " - $" + candyPrice + " (Available: " + availability + ")");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Display the current inventory
        displayMenu();
        
        // Admin functionality to add a new item
        System.out.println("\nAdmin: Adding a new item to the inventory...");
        System.out.print("Enter the name of the new item: ");
        String newCandy = sc.nextLine();
        
        System.out.print("Enter the price of the new item: ");
        double newPrice = sc.nextDouble();
        
        System.out.print("Is the item available? (true/false): ");
        boolean availability = sc.nextBoolean();
        
        // Add the new item to the inventory
        addNewItem(newCandy, newPrice, availability);
        
        // Display the updated menu with the new item
        System.out.println("\nUpdated menu after adding new item:");
        displayMenu();
    }
}
