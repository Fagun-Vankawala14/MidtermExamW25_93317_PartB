package midtermexamw25_93317_partb;

import java.util.Scanner;
import java.util.*;

public class VendingMachineItem {
    public double price;
    
//    public static String[] candies = {"chocolate bar", "sour candy", "soft drink", "potato chips"};
//    public static double[] prices = {1.50, 1.20, 1.80, 2.00};
//    public static boolean[] itemAvailability = {true, true, true, true}; // Initially all items are available
    // Changed to make it Dynamic 
    
    public static List <String> candies = new ArrayList<>();
    public static List <Double> prices = new ArrayList<>();
    public static List <Boolean> itemAvailability = new ArrayList<>();
    public VendingMachineItem() {
  
            candies.add("chocolate bar");
            prices.add(1.50);
            itemAvailability.add(true);

            candies.add("sour candy");
            prices.add(1.20);
            itemAvailability.add(true);

            candies.add("soft drink");
            prices.add(1.80);
            itemAvailability.add(true);

            candies.add("potato chips");
            prices.add(2.00);
            itemAvailability.add(true);
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double givenPrice) {
        price = givenPrice;
    }
//     Made display dynmaic by changing loop from 4 to size of list.
    public static void displayMenu() {
        System.out.println("Welcome to the vending machine, here is a list of the possible candies:");
        for (int i = 0; i < candies.size(); i++) {
            System.out.println((i+1) + ". " + candies.get(i) + " - $" + prices.get(i));
        }
    }
    
       public static void addItem(String itemName, double itemPrice, boolean availability) {
        candies.add(itemName);
        prices.add(itemPrice);
        itemAvailability.add(availability);
    }
       
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VendingMachineItem vendingMachine = new VendingMachineItem();
        displayMenu();
        
//        Asking to add
        System.out.println("Admin: Would you like to add a new item to the inventory? (yes/no)");
        String adminChoice = sc.nextLine();
        
        if (adminChoice.equalsIgnoreCase("yes")) {
            System.out.println("Enter the name of the new item:");
            String newItem = sc.nextLine();
            
            System.out.println("Enter the price of the new item:");
            double newPrice = sc.nextDouble();
            if (newPrice < 0) {
                System.out.println("The price must be a positive value.");
                return;
            }
            boolean availability = true;
            
            addItem(newItem, newPrice, availability);
            System.out.println("New item added successfully!");
          
            displayMenu();
        } else {
            System.out.println("No new item added.");
        }
        
      }
}
