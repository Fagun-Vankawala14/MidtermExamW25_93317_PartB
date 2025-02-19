package midtermexamw25_93317_partb;

import java.util.Scanner;

public class VendingMachineItem {
    public double price;
    public String name;
    public static String[] candies = {"chocolate bar", "sour candy", "soft drink", "potato chips"};
    public static double[] prices = {1.50, 1.20, 1.80, 2.00};
    public static boolean[] itemAvailability = {true, true, true, true}; // Initially all items are available
    
    public VendingMachineItem(String name,double price  ) {
        this.name= name;
        this.price= price;
        
                
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
    
    public static void addItem(String name, double price, boolean availability) {
        int index = finding_Empty_Space();
        if (index != -1) {
            candies[index] = name;
            prices[index] = price;
            itemAvailability[index] = availability;
            System.out.println("Item added with name:" + name + " with price: $" + price);
        } else {
            System.out.println("Cannot add more items. Inv is full");
        }
    }
    
    
    private static int finding_Empty_Space() {
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] == null) { 
                return i;
            }
        }
        return -1; 
    }
       
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        displayMenu();
      }
}
