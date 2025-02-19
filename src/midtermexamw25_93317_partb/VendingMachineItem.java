package midtermexamw25_93317_partb;

import java.util.ArrayList;
import java.util.Scanner;

public class VendingMachineItem {
    private double price;

    
    private static ArrayList<String> items = new ArrayList<>();
    private static ArrayList<Double> prices = new ArrayList<>();
    private static ArrayList<Boolean> availability = new ArrayList<>();

    
    static {
        addItem("Chocolate Bar", 1.50, true);
        addItem("Sour Candy", 1.20, true);
        addItem("Soft Drink", 1.80, true);
        addItem("Potato Chips", 2.00, true);
    }

    public VendingMachineItem() {}
    
     public VendingMachineItem(String itemName, double price, boolean isAvailable) {
        addItem(itemName, price, isAvailable);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    
      public static void addItem(String name, double price, boolean isAvailable) {
        items.add(name);
        prices.add(price);
        availability.add(isAvailable);
    }

    
    public static void addNewItem(Scanner sc) {
        sc.nextLine(); 
        System.out.print("\nEnter item name: ");
        String newItem = sc.nextLine();

        System.out.print("Enter price: $");
        double newPrice = sc.nextDouble();

        addItem(newItem, newPrice, true);
        System.out.println(newItem + " added successfully!");
    }

    
    public static void displayMenu() {
        System.out.println("\nVending Machine Inventory:");
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + ". " + items.get(i) + " - $" + prices.get(i) +
                    (availability.get(i) ? " (Available)" : " (Out of Stock)"));
        }
    }

     public static void selectItem(Scanner sc) {
        System.out.print("\nEnter the item number to purchase: ");
        int choice = sc.nextInt();

        if (choice < 1 || choice > items.size()) {
            System.out.println("Invalid selection.");
            return;
        }

        int index = choice - 1;
        if (availability.get(index)) {
            System.out.println("You have purchased: " + items.get(index) + " for $" + prices.get(index));
            availability.set(index, false); 
        } else {
            System.out.println("Sorry, " + items.get(index) + " is out of stock.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        displayMenu();

        System.out.print("\nAre you an Admin? (yes/no): ");
        String response = sc.next().toLowerCase();

        if (response.equals("yes") || response.equals("y")) {
            addNewItem(sc);
            displayMenu();
        } else {
            selectItem(sc);
        }

        sc.close();
    }
}
