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
    
    
    //added by khaled
    // parameterrize constructor
    public VendingMachineItem(double price) {
    this.price = price; // Set the price of the item
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
    
    //added by khaled Hreseh
    
    public static void addItem(String candy, double price, boolean availability) {
    int n = candies.length;
    // Check for capacity in arrays
    if (n < 100) { // Assuming max 100 items for simplicity
        // Extend arrays by 1
        String[] newCandies = new String[n + 1];
        double[] newPrices = new double[n + 1];
        boolean[] newAvailability = new boolean[n + 1];
        
        System.arraycopy(candies, 0, newCandies, 0, n);
        System.arraycopy(prices, 0, newPrices, 0, n);
        System.arraycopy(itemAvailability, 0, newAvailability, 0, n);
        
        newCandies[n] = candy;
        newPrices[n] = price;
        newAvailability[n] = availability;
        
        candies = newCandies;
        prices = newPrices;
        itemAvailability = newAvailability;
        
        System.out.println("New item added successfully!");
    } else {
        System.out.println("No more space to add new items.");
    }
    //end
    
    
    public static void selectItem(int itemIndex) {
        if (itemIndex >= 0 && itemIndex < candies.length) {
            if (itemAvailability[itemIndex]) {
                System.out.println("You have selected: " + candies[itemIndex] + ". Please proceed to payment.");
            } else {
                System.out.println("Sorry, " + candies[itemIndex] + " is currently unavailable. Please select another item.");
            }
        } else {
            System.out.println("Invalid item selection. Please try again.");
        }
    }
       
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        displayMenu();
        System.out.println("Enter 'add' to add a new item.");
        String command = sc.nextLine();
        if ("add".equalsIgnoreCase(command)) {
            System.out.println("Enter candy name:");
            String candy = sc.nextLine();
            System.out.println("Enter price:");
            double price = sc.nextDouble();
            System.out.println("Enter availability (Yes/No):");
            boolean availability = sc.nextBoolean();
            addItem(candy, price, availability);
      }
    }
}
