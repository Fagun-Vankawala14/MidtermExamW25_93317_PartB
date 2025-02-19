package midtermexamw25_93317_partb;

import java.util.Scanner;
import java.util.ArrayList;


public class VendingMachineItem {
    public double price;
    
    public static String[] candies = {"chocolate bar", "sour candy", "soft drink", "potato chips"};
    public static ArrayList<String> moreCandies = new ArrayList<>();
    
    public static double[] prices = {1.50, 1.20, 1.80, 2.00};
    public static ArrayList<Double> morePrices = new ArrayList<>();
    
    public static boolean[] itemAvailability = {true, true, true, true}; // Initially all items are available
    public static ArrayList<Boolean> moreAvailability = new ArrayList<>();
    
    public VendingMachineItem() {
        // Constructor left blank intentionally
    }
    
    public static void addItem(String candy, double price) {
        moreCandies.add(candy);
        morePrices.add(price);
        moreAvailability.add(true);
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
        for (int i = 0; i < moreCandies.size(); i++) {
            System.out.println((i+5) + ". " + moreCandies.get(i) + " - $" + morePrices.get(i));
        }
    }
       
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        addItem("Nerdz", 1.00);
        addItem("Jujubes", 3.00);
        displayMenu();
      }
}
