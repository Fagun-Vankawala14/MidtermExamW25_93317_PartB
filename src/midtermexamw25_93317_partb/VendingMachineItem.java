package midtermexamw25_93317_partb;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class VendingMachineItem {
    private double price;
    
    private static List<String> candies = new ArrayList<>(Arrays.asList("chocolate bar", "sour candy", "soft drink", "potato chips"));
    private static List<Double> prices = new ArrayList<>(Arrays.asList(1.50, 1.20, 1.80, 2.00));
    private static List<Boolean> itemAvailability = new ArrayList<>(Arrays.asList(true, true, true, true));
    
    public VendingMachineItem(double price) {
        this.price = price;
    }
    
    static void addNewItem(String candy, double price, boolean available) {
        candies.add(candy);
        prices.add(price);
        itemAvailability.add(available);
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double givenPrice) {
        price = givenPrice;
    }
    
    public static List<String> getCandies() {
        return Collections.unmodifiableList(candies);
    }
    
    public static List<Double> getPrices() {
        return Collections.unmodifiableList(prices);
    }
    
    public static List<Boolean> getAvailability() {
        return Collections.unmodifiableList(itemAvailability);
    }
    
    public static void displayMenu() {
        System.out.println("Welcome to the vending machine, here is a list of the possible candies:");
        for (int i = 0; i < candies.size(); i++) {
            System.out.println((i+1) + ". " + candies.get(i) + " - $" + prices.get(i));
        }
    }
    
    public static void selectItem(Scanner sc) {
        System.out.println("Enter the item number to select:");
        int choice = sc.nextInt();
        if (choice < 1 || choice > candies.size()) {
            System.out.println("Invalid selection!");
        } else if (itemAvailability.get(choice - 1)) {
            System.out.println("Item dispensed: " + candies.get(choice - 1));
            itemAvailability.set(choice - 1, false);
        } else {
            System.out.println("Item out of stock!");
        }
    }
       
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        displayMenu();
        selectItem(sc);
    }
}