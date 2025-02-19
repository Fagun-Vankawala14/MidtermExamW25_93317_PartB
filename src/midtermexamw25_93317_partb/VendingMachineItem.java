package midtermexamw25_93317_partb;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VendingMachineItem {
    public double price;
    
    public static List<String> candies = new ArrayList<>(Arrays.asList("chocolate bar", "sour candy", "soft drink", "potato chips"));
    public static List<Double> prices = new ArrayList<>(Arrays.asList(1.50, 1.20, 1.80, 2.00));
    public static List<Boolean> itemAvailability = new ArrayList<>(Arrays.asList(true, true, true, true));
    
    
    public VendingMachineItem(double price) {
        this.price = price;
    }
    
    public static void addItem(String candy, double price, boolean available) {
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
    
    public static void displayMenu() {
        System.out.println("Welcome to the vending machine, here is a list of the possible candies:");
        for (int i = 0; i < candies.size(); i++) {
            System.out.println((i+1) + ". " + candies.get(i) + " - $" + prices.get(i));
        }
    }
       
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        displayMenu();
    }
}