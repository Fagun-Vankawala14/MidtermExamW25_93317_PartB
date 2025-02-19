package midtermexamw25_93317_partb;

import java.util.Arrays;
import java.util.Scanner;

public class VendingMachineItem {
    // Encapsulation: Variables are marked private to protect direct modification
    private double price; 
    
    // Encapsulation: Static arrays store item details, keeping them within the class
    
    private static String[] candies = {"chocolate bar", "sour candy", "soft drink", "potato chips"};
    private static double[] prices = {1.50, 1.20, 1.80, 2.00};
    private static boolean[] itemAvailability = {true, true, true, true}; // Initially all items are available
    
    // Constructor Overloading - Polymorphism
    public VendingMachineItem() {
        // Default constructor
    }
    
    public VendingMachineItem(double price) {
        this.price = price;
    }
    
    // Encapsulation: Getter and Setter methods to access private variables
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double givenPrice) {
        this.price = givenPrice;
    }
    
    //This method only displays the menu, keeping responsibilities separate
    public static void displayMenu() {
        System.out.println("Welcome to the vending machine, here is a list of the possible candies:");
        for (int i = 0; i < candies.length; i++) {
            System.out.println((i+1) + ". " + candies[i] + " - $" + prices[i]);
        }
    }
       
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        displayMenu();
        
        VendingMachineItem vendingMachineItem = new VendingMachineItem();
        
        System.out.println("Are you an admin? (yes/no)");
        
        String isAdmin = sc.nextLine().toLowerCase();

        if (isAdmin.equals("yes")) {
            System.out.println("Enter the name of the new item:");
            String newItem = sc.nextLine();

            System.out.println("Enter the price of the new item:");
            
            // Input validation for price
            while (!sc.hasNextDouble()) {
                System.out.println("Invalid input! Please enter a valid price:");
                sc.next();
            }
            
            double newPrice = sc.nextDouble();
            sc.nextLine();

            vendingMachineItem.addItem(newItem, newPrice);
            
        } else {
            System.out.println("You do not have permission to add items.");
        }
        
        displayMenu();
        sc.close();
    }
    
    // The vending machine can now be extended by adding items without modifying existing code
    public void addItem(String candy, double price) {
        candies = Arrays.copyOf(candies, candies.length + 1);
        prices = Arrays.copyOf(prices, prices.length + 1);
        itemAvailability = Arrays.copyOf(itemAvailability, itemAvailability.length + 1);
        
        candies[candies.length - 1] = candy;
        prices[prices.length - 1] = price;
        itemAvailability[itemAvailability.length - 1] = true;
    }

    // This method is responsible only for displaying available items
    public void displayAvailableItems() {
        System.out.println("Available items in the vending machine:");
        
        boolean anyAvailable = false;

        for (int i = 0; i < candies.length; i++) {
            if (itemAvailability[i]) {
                System.out.println((i + 1) + ". " + candies[i] + " - $" + prices[i]);
                anyAvailable = true;
            }
        }

        if (!anyAvailable) {
            System.out.println("No items available.");
        }
    }
}
