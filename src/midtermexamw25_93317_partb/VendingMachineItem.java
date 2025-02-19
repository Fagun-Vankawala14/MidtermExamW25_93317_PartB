package midtermexamw25_93317_partb;

import java.util.Scanner;

public class VendingMachineItem {
    public double price;
    public String newItem;
    
    public static String[] candies = {"chocolate bar", "sour candy", "soft drink", "potato chips"};
    public static double[] prices = {1.50, 1.20, 1.80, 2.00};
    public static boolean[] itemAvailability = {true, true, true, true}; // Initially all items are available
    public static String[] newItems = {"Item One","Item Two"};

    public VendingMachineItem(double price , String newItem) {
        this.price = price;
        this.newItem = newItem;
    }
    
    public static String[] getCandies() {
        return candies;
    }

    public static void setCandies(String[] candies) {
        VendingMachineItem.candies = candies;
    }

    public static String[] getNewItems() {
        return newItems;
    }

    public static void setNewItems(String[] newItems) {
        VendingMachineItem.newItems = newItems;
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
    
    public static void addInventoryItem()
    {
       System.out.println("Please enter something new");
       Scanner newItem = new Scanner(System.in);
       System.out.println("The new Item availible is: " + newItem);
    
    }
    
    public static void checkAvailability()
    {
    System.out.println("The following items are availible: ");
    for (int i = 0; i < 4; i++) {
            System.out.println( "The candy: " + candies[i] + " Has the current availability status of:  " + itemAvailability[i]);
        } 
    };
       
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        displayMenu();
        checkAvailability();
        addInventoryItem();
      }
}
