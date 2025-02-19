package midtermexamw25_93317_partb;

import java.util.Arrays;
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
            double newPrice = sc.nextDouble();
            sc.nextLine();

            vendingMachineItem.addItem(newItem, newPrice);
            
        } else {
            System.out.println("You do not have permission to add items.");
        }
        
        displayMenu();
        sc.close();
      }
    
    public void addItem(String candy, double price){
        
        candies = Arrays.copyOf(candies, candies.length + 1);
        prices = Arrays.copyOf(prices, prices.length + 1);
        itemAvailability = Arrays.copyOf(itemAvailability, itemAvailability.length + 1);
        
        candies[candies.length - 1] = candy;
        prices[prices.length - 1] = price;
        itemAvailability[itemAvailability.length - 1] = true;}
    
  
    }