package midtermexamw25_93317_partb;

import java.util.Scanner;

public class VendingMachineItem {
    public double price;
    
    public static String[] candies = {"chocolate bar", "sour candy", "soft drink", "potato chips"};
    public static double[] prices = {1.50, 1.20, 1.80, 2.00};
    public static boolean[] itemAvailability = {true, true, true, true};
    
    public VendingMachineItem() {

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
            String availability = itemAvailability[i] ? "" : " (Sold Out)";
            System.out.println((i + 1) + ". " + candies[i] + " - $" + prices[i] + availability);
        }
    }
    
    public static void selectItem() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of the candy you want to purchase: ");
        int choice = sc.nextInt();
        // Check for a valid selection:
        if (choice >= 1 && choice <= candies.length) {
            if (itemAvailability[choice - 1]) {
                System.out.println("Dispensing " + candies[choice - 1] + " for $" + prices[choice - 1]);
                itemAvailability[choice - 1] = false;
            } else {
                System.out.println("Sorry, " + candies[choice - 1] + " is sold out.");
            }
        } else {
            System.out.println("Invalid selection.");
        }
    }
       
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        displayMenu();
        
        selectItem();
        
        System.out.println("\nUpdated Menu:");
        displayMenu();
    }
}
