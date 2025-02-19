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
      public static void addItem(String newItem, double newPrice) {
    int newSize = candies.length + 1;

    // Expand arrays
    String[] newCandies = new String[newSize];
    double[] newPrices = new double[newSize];
    boolean[] newAvailability = new boolean[newSize];

    for (int i = 0; i < candies.length; i++) {
        newCandies[i] = candies[i];
        newPrices[i] = prices[i];
        newAvailability[i] = itemAvailability[i];
    }

    newCandies[newSize - 1] = newItem;
    newPrices[newSize - 1] = newPrice;
    newAvailability[newSize - 1] = true; 

    // Assign back to static variables
    candies = newCandies;
    prices = newPrices;
    itemAvailability = newAvailability;

    System.out.println("Item added successfully!");
} 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        displayMenu();
      }
}
