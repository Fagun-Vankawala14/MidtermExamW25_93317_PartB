package midtermexamw25_93317_partb;

import java.util.Scanner;


public class VendingMachineItem {
    public double price;
    
    public static String[] candies = {"chocolate bar", "sour candy", "soft drink", "potato chips"};
    public static double[] prices = {1.50, 1.20, 1.80, 2.00};
    public static boolean[] itemAvailability = {true, true, true, true}; // Initially all items are available
    
    public VendingMachineItem(double price) {
        this.price = price;// Constructor left blank intentionally
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
    
     public static void selectItem() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please select an item by entering its number:");

        int itemNumber = sc.nextInt();
        if (itemNumber > 0 && itemNumber <= candies.size()) {
            int index = itemNumber - 1;
            if (itemAvailability.get(index)) {
                System.out.println("You selected: " + candies.get(index) + " for $" + prices.get(index));
                System.out.println("Item is available, proceeding with purchase...");
                itemAvailability.set(index, false);
            } else {
                System.out.println("Sorry, this item is out of stock. Please choose another item.");
            }
        } else {
            System.out.println("Invalid selection");
        }
    }

}
