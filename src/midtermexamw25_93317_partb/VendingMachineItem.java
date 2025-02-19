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
       
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        displayMenu();
      }
    
       
    public static void addNewItem() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the name of the new item:");
    String newItem = sc.nextLine();
    
    System.out.println("Enter the price of the new item:");
    double newPrice = sc.nextDouble();
    sc.nextLine(); // Consume the leftover newline
    
    candies.add(newItem);
    prices.add(newPrice);
    itemAvailability.add(true);
    
    System.out.println("New item added successfully!");
}

}
