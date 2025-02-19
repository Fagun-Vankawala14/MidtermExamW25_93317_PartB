package midtermexamw25_93317_partb;

import java.util.Scanner;

public class VendingMachineItem {
    public double price;
    
    public static String[] candies = {"chocolate bar", "sour candy", "soft drink", "potato chips"};
    public static double[] prices = {1.50, 1.20, 1.80, 2.00};
    public static boolean[] itemAvailability = {true, true, true, true}; // Initially all items are available
    
    public VendingMachineItem(String name, double price) {
    this.name = name;
    this.price = price;
    this.availability = true; 

    }
    public static void addItem(String itemName, double itemPrice) {
   
    String[] newCandies = new String[candies.length + 1];
    double[] newPrices = new double[prices.length + 1];
    boolean[] newAvailability = new boolean[itemAvailability.length + 1];

    
    for (int i = 0; i < candies.length; i++) {
        newCandies[i] = candies[i];
        newPrices[i] = prices[i];
        newAvailability[i] = itemAvailability[i];
    }

   
    newCandies[newCandies.length - 1] = itemName;
    newPrices[newPrices.length - 1] = itemPrice;
    newAvailability[newAvailability.length - 1] = true; // New item is available

    
    candies = newCandies;
    prices = newPrices;
    itemAvailability = newAvailability;

    System.out.println("Item " + itemName + " added to the vending machine.");
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
       
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        displayMenu();
      }
}
