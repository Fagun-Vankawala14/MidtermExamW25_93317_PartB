package midtermexamw25_93317_partb;

import java.util.Scanner;

public class VendingMachineItem {
    public double price;
    
    public static String[] candies = {"chocolate bar", "sour candy", "soft drink", "potato chips"};
    public static double[] prices = {1.50, 1.20, 1.80, 2.00};
    public static boolean[] itemAvailability = {true, true, true, true}; // Initially all items are available
    
    public VendingMachineItem() {
        // Constructor left blank intentionally
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double givenPrice) {
        price = givenPrice;
    }
    
    public static void displayMenu() {
        System.out.println("Welcome to the vending machine, here is a list of the possible candies:");
        for (int i = 0; i < 4; i++) {
            System.out.println((i+1) + ". " + candies[i] + " - $" + prices[i]);
        }
    }
    
    // method to allow admin to add new items
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
       
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        displayMenu();
        
    // admin can add new data
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

        // this will display updated menu
        displayMenu();

    }
      
}
