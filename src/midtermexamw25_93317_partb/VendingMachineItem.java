package midtermexamw25_93317_partb;

import java.util.Scanner;

public class VendingMachineItem {
    public double price;
    private String name;
    private boolean availability;
    public static String[] candies = {"chocolate bar", "sour candy", "soft drink", "potato chips"};
    public static double[] prices = {1.50, 1.20, 1.80, 2.00};
    public static boolean[] itemAvailability = {true, true, true, true}; // Initially all items are available
    
    public VendingMachineItem(String name,double price  ) {
        this.name= name;
        this.price= price;
        this.availability=availability;
        
                
    }
    
    public double get_Price() {
        return price;
    }
    
    public void set_Price(double givenPrice) {
        price = givenPrice;
    }
    
    public static void displayMenu() {
        System.out.println("Welcome to the vending machine, here is a list of the possible candies:");
        for (int i = 0; i < 4; i++) {
            System.out.println((i+1) + ". " + candies[i] + " - $" + prices[i]);
        }
    }
    
    public static void addItem(String name, double price, boolean availability) {
        int index = finding_Empty_Space();
        if (index != -1) {
            candies[index] = name;
            prices[index] = price;
            itemAvailability[index] = availability;
            System.out.println("Item added with name:" + name + " with price: $" + price);
        } else {
            System.out.println("Cannot add more items. Inv is full");
        }
    }
    
    public static void select_item( int itemIndex){
        
        if (itemIndex >= 0 && itemIndex < candies.length) {
            if (itemAvailability[itemIndex]) {
                System.out.println("You selected: " + candies[itemIndex] + " and the Price: $" + prices[itemIndex]);
                System.out.println("Thanks you. Enjoy your " + candies[itemIndex] + ".");
                itemAvailability[itemIndex] = false; // Mark the item as no longer available
            } else {
                System.out.println("Sorry, we don't have " + candies[itemIndex] );
            }
        } else {
            System.out.println("Please choose a valid number.");
        }
        
    }
    
    
    private static int finding_Empty_Space() {
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] == null) { 
                return i;
            }
        }
        return -1; 
    }
       
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        displayMenu();
      }
}
