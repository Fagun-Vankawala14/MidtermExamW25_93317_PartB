package midtermexamw25_93317_partb;

import java.util.Scanner;

public class VendingMachineItem {
    

    private String name;
    private double price;
    private boolean availability;

    
    public static String[] candies = {"chocolate bar", "sour candy", "soft drink", "potato chips"};
    public static double[] prices = {1.50, 1.20, 1.80, 2.00};
    public static boolean[] itemAvailability = {true, true, true, true}; // Initially all items are available
    
    public VendingMachineItem(String name, double price, boolean availability) {
        this.name = name;
        this.price = price;
        this.availability = availability;
    }
    
    // Encapsulation: Use getter methods to access private variables
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
    
    public boolean isAvailable() {
        return availability;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public static void displayMenu() {
        System.out.println("Welcome to the vending machine, here is a list of the possible candies:");
        for (int i = 0; i < candies.length; i++) {
            System.out.println((i + 1) + ". " + candies[i] + " - $" + prices[i]);
        }
    }

    // Add a new item to the inventory
    public static void addNewItem(String itemName, double itemPrice, boolean availability) {
        // Create new arrays with extra space for the new item
        String[] newCandies = new String[candies.length + 1];
        double[] newPrices = new double[prices.length + 1];
        boolean[] newItemAvailability = new boolean[itemAvailability.length + 1];

        // Copy existing items to new arrays
        System.arraycopy(candies, 0, newCandies, 0, candies.length);
        System.arraycopy(prices, 0, newPrices, 0, prices.length);
        System.arraycopy(itemAvailability, 0, newItemAvailability, 0, itemAvailability.length);

        // Add the new item to the arrays
        newCandies[candies.length] = itemName;
        newPrices[prices.length] = itemPrice;
        newItemAvailability[itemAvailability.length] = availability;

        candies = newCandies;
        prices = newPrices;
        itemAvailability = newItemAvailability;

        System.out.println("New item added: " + itemName);
    }

    // Customer selects an item and checks availability
    public static void selectItem(String itemName) {
        boolean itemFound = false;

        for (int i = 0; i < candies.length; i++) {
            if (candies[i].equalsIgnoreCase(itemName)) {
                itemFound = true;
                if (itemAvailability[i]) {
                    System.out.println(itemName + " is available for $" + prices[i]);
                } else {
                    System.out.println(itemName + " is currently unavailable.");
                }
                break;
            }
        }

        if (!itemFound) {
            System.out.println("Item not found. Please select a valid item.");
        }
    }

    // Refactored main method using objects to apply polymorphism and encapsulation.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        displayMenu();

        // Admin adds a new item
        System.out.println("\nAdmin: Would you like to add a new item? (yes/no)");
        String adminResponse = sc.nextLine();
        if (adminResponse.equalsIgnoreCase("yes")) {
            System.out.println("Enter item name:");
            String itemName = sc.nextLine();
            System.out.println("Enter item price:");
            double itemPrice = sc.nextDouble();
            System.out.println("Is the item available? (true/false)");
            boolean itemAvailable = sc.nextBoolean();
            addNewItem(itemName, itemPrice, itemAvailable);
        }

        // Customer selects an item and checks availability
        displayMenu();
        System.out.println("\nCustomer: Please select an item by name to check its availability:");
        sc.nextLine(); // consume leftover newline
        String customerItem = sc.nextLine();
        selectItem(customerItem); // Check if the item is available

        sc.close(); // Close the scanner to avoid resource leaks
    }
}
