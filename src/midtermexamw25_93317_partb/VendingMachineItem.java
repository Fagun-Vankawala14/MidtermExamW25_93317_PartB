package midtermexamw25_93317_partb;

import java.util.Scanner;

public class VendingMachineItem {
    public double price;
    public String name;
    public boolean availability;
    
public VendingMachineItem(String name, double price) {
    this.name = name;
    this.price = price;
    this.availability = true; 

    }

    
    
    public static String[] candies = {"chocolate bar", "sour candy", "soft drink", "potato chips"};
    public static double[] prices = {1.50, 1.20, 1.80, 2.00};
    public static boolean[] itemAvailability = {true, true, true, true}; // Initially all items are available
    
   
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
    public static void selectItem(int itemIndex) {
    if (itemIndex < 0 || itemIndex >= candies.length) {
        System.out.println("Invalid selection.");
        return;
    }

    if (itemAvailability[itemIndex]) {
        System.out.println("You have selected: " + candies[itemIndex] + " for $" + prices[itemIndex]);
    } else {
        System.out.println(candies[itemIndex] + " is not available.");
    }
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
// Single Responsibility Principle: 
// The VendingMachineItem class is responsible for representing individual items, 
// including their properties (name, price, availability). 
// The VendingMachine class is responsible for managing the inventory of items, 
// including adding items, displaying the menu, and selecting items. 
// This separation of concerns makes the code easier to maintain and understand.

// Open/Closed Principle: 
// The VendingMachineItem class can be extended for new item types without modifying 
// the existing code. For example, if we want to create a special item with additional 
// features, we can create a subclass of VendingMachineItem without changing the 
// existing implementation. This allows the system to be extended with new functionality 
// while keeping the existing code intact.