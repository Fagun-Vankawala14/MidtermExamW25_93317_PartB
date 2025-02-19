package midtermexamw25_93317_partb;

import java.util.Scanner;

public class VendingMachineItem {
// Encapsulation , making price private
    private double price;
    
    // Encapsulation, making arrays private so not direct access from outside
    private static String[] candies = {"chocolate bar", "sour candy", "soft drink", "potato chips"};
    private static double[] prices = {1.50, 1.20, 1.80, 2.00};
    private static boolean[] itemAvailability = {true, true, true, true}; // Initially all items are available

    // Constructor with Encapsulation, initialize direct acces to other fdields
    public VendingMachineItem(double price) {
        this.price = price;
    }

// getter setters: encapsulation
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Abstraction
    public static void displayMenu() {
        System.out.println("Welcome to the vending machine, here is a list of the possible candies:");
        for (int i = 0; i < candies.length; i++) {
            System.out.println((i + 1) + ". " + candies[i] + " - $" + prices[i]);
        }
    }

    // Abstraction, method to add a new item that hides the complexity of resizing arrays
    public static void addItem(String itemName, double itemPrice, boolean isAvailable) {
        int newLength = candies.length + 1;
        String[] newCandies = new String[newLength];
        double[] newPrices = new double[newLength];
        boolean[] newAvailability = new boolean[newLength];

        for (int i = 0; i < candies.length; i++) {
            newCandies[i] = candies[i];
            newPrices[i] = prices[i];
            newAvailability[i] = itemAvailability[i];
        }

        newCandies[newLength - 1] = itemName;
        newPrices[newLength - 1] = itemPrice;
        newAvailability[newLength - 1] = isAvailable;

        candies = newCandies;
        prices = newPrices;
        itemAvailability = newAvailability;

        System.out.println("Item added successfully!");
    }

    // Abstraction, to check the availability of an item
    public static boolean checkItemAvailability(String itemName) {
        for (int i = 0; i < candies.length; i++) {
            if (candies[i].equalsIgnoreCase(itemName) && itemAvailability[i]) {
                return true;  // Item available
            }
        }
        return false;  // Item unavailable or not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        displayMenu();
        
        // Admin functionality - Encapsulation: Admin can add a new item without knowing about array resizing
        System.out.println("\nAs admin, would you like to add a new item? (yes/no)");
        String response = sc.nextLine();
        if (response.equalsIgnoreCase("yes")) {
            System.out.println("Enter item name:");
            String newItemName = sc.nextLine();
            System.out.println("Enter item price:");
            double newItemPrice = sc.nextDouble();
            System.out.println("Is the item available? (true/false):");
            boolean newItemAvailability = sc.nextBoolean();
            addItem(newItemName, newItemPrice, newItemAvailability);
        }

        // it will display the updated menu after any item additions
        displayMenu();

        // Customer functionality - Abstraction: Customer checks if an item is available
        System.out.println("\nCustomer, please enter the name of the item you'd like to check:");
        String customerItem = sc.nextLine(); 
        customerItem = sc.nextLine();

        if (checkItemAvailability(customerItem)) {
            System.out.println(customerItem + " is available.");
        } else {
            System.out.println(customerItem + " is not available.");
        }}}
