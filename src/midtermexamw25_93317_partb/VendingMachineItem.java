package midtermexamw25_93317_partb;

import java.util.Scanner;

public class VendingMachineItem {
    public double price;
    
    public static String[] candies = {"chocolate bar", "sour candy", "soft drink", "potato chips"};
    public static double[] prices = {1.50, 1.20, 1.80, 2.00};
    public static boolean[] itemAvailability = {true, true, true, true}; // Initially all items are available
    
   public VendingMachineItem(double price) {
        this.price = price;
    }
    
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double givenPrice) {
        price = givenPrice;
    }
    
    public static void displayMenu() {
        System.out.println("Welcome to the vending machine, here is a list of the possible candies:");
        for (int i = 0; i < candies.length; i++) {
            System.out.println((i+1) + ". " + candies[i] + " - $" + prices[i]);
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

       
        displayMenu();
    }
}
