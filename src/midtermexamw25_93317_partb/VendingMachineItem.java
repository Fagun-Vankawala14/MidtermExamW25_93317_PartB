package midtermexamw25_93317_partb;
/*
    modified by Dylan Violo
    author fagun
*/
import java.util.Scanner;

public class VendingMachineItem {
    public double price;
    
    public static String[] candies = {"chocolate bar", "sour candy", "soft drink", "potato chips"};
    public static double[] prices = {1.50, 1.20, 1.80, 2.00};
    public static boolean[] itemAvailability = {true, true, true, true}; // Initially all items are available
    
    public VendingMachineItem(double price) {
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
            System.out.println((i+1) + ". " + candies[i] + " - $" + prices[i]);
        }
    }
    
    public void addItem(String itemName, double itemPrice) {
        for (int i =0; i <= candies.length; i++) {
            if (candies[i] == null) {
                candies[i] = itemName;
        for (int j =0; j <= prices.length ; j++) {
            if (prices[j] == null) {
                prices[j] = itemPrice;
        }
    }
            }
        }
    }
       
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        displayMenu();
      }
}
