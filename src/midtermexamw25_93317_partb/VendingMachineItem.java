package midtermexamw25_93317_partb;

import java.util.Scanner;
import java.util.ArrayList;
public class VendingMachineItem {
    public double price;
    
//    public static String[] candies = {"chocolate bar", "sour candy", "soft drink", "potato chips"};
//    public static double[] prices = {1.50, 1.20, 1.80, 2.00};
//    public static boolean[] itemAvailability = {true, true, true, true}; // Initially all items are available
    
    // using arraylist to hold array and to allow admin to add items
    static ArrayList<String> candies = new ArrayList<>();
    static ArrayList<Double> prices = new ArrayList<>();
    static ArrayList<Boolean> itemAvailability = new ArrayList<>();
    
    public VendingMachineItem(double price) {
        // Constructor left blank intentionally
        this.price = price;
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
            System.out.println((i+1) + ". " + candies.get(i) + " - $" + prices.get(i));
        }
    }
    
    // function to select items based on availablity
    public static void selectItem() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Item number: ");
        int userSelect = sc.nextInt();
            if (itemAvailability.get(userSelect) == true) {
                System.out.println("Item is available");  
                System.out.println("Item selected: " + candies.get(userSelect - 1) + " - $" + prices.get(userSelect - 1));
            } 
            else {
                System.out.println("Item is not available");
            }
     
        
    }
    
    public static void addItems() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Candy Name: ");
        String candyName = sc.next();
        VendingMachineItem.candies.add(candyName);
        System.out.println("Enter Price of" + candyName + ": ");
        double priceTag = sc.nextDouble();
        VendingMachineItem.prices.add(priceTag);
        System.out.println("Enter Availabilty: ");
        boolean availability = sc.nextBoolean();
        VendingMachineItem.itemAvailability.add(availability);
    }
       
    public static void main(String[] args) {
        VendingMachineItem.candies.add("chocolate bar");
        VendingMachineItem.candies.add("sour candy");
        VendingMachineItem.candies.add("chocolate bar");
        VendingMachineItem.candies.add("sour candy");
        VendingMachineItem.prices.add(1.50);
        VendingMachineItem.prices.add(1.20);
        VendingMachineItem.prices.add(1.80);
        VendingMachineItem.prices.add(2.00);
        VendingMachineItem.itemAvailability.add(true);
        VendingMachineItem.itemAvailability.add(true);
        VendingMachineItem.itemAvailability.add(true);
        VendingMachineItem.itemAvailability.add(true);
        
        Scanner sc = new Scanner(System.in);
        displayMenu();
//        addItems(); for admin tests
        selectItem();
      }
}
