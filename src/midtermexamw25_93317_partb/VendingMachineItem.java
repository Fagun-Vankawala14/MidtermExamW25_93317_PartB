package midtermexamw25_93317_partb;

import java.util.Arrays;
import java.util.Scanner;

public class VendingMachineItem {
    public double price;
    
    public static String[] candies = {"chocolate bar", "sour candy", "soft drink", "potato chips"};
    public static double[] prices = {1.50, 1.20, 1.80, 2.00};
    public static boolean[] itemAvailability = {true, true, true, true}; // Initially all items are available
    
    public VendingMachineItem(String name, double price, boolean available) {
   this.price = price;
   this.name = name;
   this.available = available;    }
    
 public String name;   
public boolean available; 

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
       
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        displayMenu();
        System.out.print("Enter the item number to select: ");
        int itemNumber = sc.nextInt();
        selectItem(itemNumber);
      }
    
    public static void addItem(String itemName, double itemPrice, boolean availability) {

    candies = Arrays.copyOf(candies, candies.length + 1);
    
    prices = Arrays.copyOf(prices, prices.length + 1);
    
    itemAvailability = Arrays.copyOf(itemAvailability, itemAvailability.length + 1);

    candies[candies.length - 1] = itemName;
    
    prices[prices.length - 1] = itemPrice;
    
    itemAvailability[itemAvailability.length - 1] = availability;

    System.out.println(itemName + " is added to inventory");
}
 // Method  to select an item by checking its availability
    
    public static void selectItem(int itemNumber) {
        if (itemNumber < 1 || itemNumber > candies.length) {
            System.out.println("Invalid item number.");
            return;
        }
        int index = itemNumber - 1;
        if (itemAvailability[index]) {
            System.out.println("You selected: " + candies[index] + " for $" + prices[index]);
        } else {
            System.out.println(candies[index] + " is currently out of stock.");
        }
    }

 
}