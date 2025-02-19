package midtermexamw25_93317_partb;

import java.util.ArrayList;
import java.util.Scanner;

public class VendingMachineItem {
    private double price;
    
    // Using ArrayLists instead of fixed arrays
    public static ArrayList<String> candies = new ArrayList<>();
    public static ArrayList<Double> prices = new ArrayList<>();
    public static ArrayList<Boolean> itemAvailability = new ArrayList<>();

    public VendingMachineItem(String name, double givenPrice, boolean available) {
    this.price = givenPrice;
    candies.add(name);
    prices.add(givenPrice);
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

    // Admin functionality to add a new item to the inventory
    public static void addItem() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter item name: ");
        String itemName = sc.nextLine();
        System.out.print("Enter item price: ");
        double itemPrice = sc.nextDouble();
        sc.nextLine(); // Consume newline
        
        candies.add(itemName);
        prices.add(itemPrice);
        itemAvailability.add(true); // Newly added items are available by default

        System.out.println("Item added successfully!");
    }

    // Hardcoded initial inventory values
    static {
        candies.add("chocolate bar");
        prices.add(1.50);
        itemAvailability.add(true);

        candies.add("sour candy");
        prices.add(1.20);
        itemAvailability.add(true);

        candies.add("soft drink");
        prices.add(1.80);
        itemAvailability.add(true);

        candies.add("potato chips");
        prices.add(2.00);
        itemAvailability.add(true);
    }
}
