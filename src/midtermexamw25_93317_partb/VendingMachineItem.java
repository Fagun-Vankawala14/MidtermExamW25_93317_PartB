package midtermexamw25_93317_partb;

import java.util.ArrayList;
import java.util.Scanner;

public class VendingMachineItem {
    // Encapsulation is used as i made the fields private to restrict direct access
    private String name;
    private double price;
    private boolean available;
    
    // Encapsulation is used to keep inventory as a private static list to manage items properly
    private static ArrayList<VendingMachineItem> inventory = new ArrayList<>();

    // Constructor with parameters is also an example of encapsulation
    public VendingMachineItem(String name, double price, boolean available) {
        this.name = name;
        this.price = price;
        this.available = available;
        inventory.add(this); //ading to inventory upon creation
    }

    // getter methods are used to access private fields example of encapsulation
    public double getPrice() { return price; }
    public String getName() { return name; }
    public boolean isAvailable() { return available; }

    // seter method are use to update availability example of encapsulation
    public void setAvailable(boolean available) { this.available = available;}

    //  this method only displays the menu example of srp
    public static void displayMenu() {
        System.out.println("Welcome to the vending machine. Here are the available items:");
        for (int i = 0; i < inventory.size(); i++) {
            System.out.println((i + 1) + ". " + inventory.get(i).getName() + " - $" + inventory.get(i).getPrice() + 
                               (inventory.get(i).isAvailable() ? " [Available]" : " [Out of Stock]"));
        }
    }

    //this method is only responsible for adding items example of srp
    public static void addItem() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter item name: ");
        String itemName = sc.nextLine();
        System.out.print("Enter item price: ");
        double itemPrice = sc.nextDouble();
        new VendingMachineItem(itemName, itemPrice, true);
        System.out.println("Item added successfully!");
    }
    
    // method is only responsible for item selection example of srp
    public static void selectItem() {
        Scanner sc = new Scanner(System.in);
        displayMenu();
        System.out.print("Select an item by number: ");
        int choice = sc.nextInt();
        
        if (choice > 0 && choice <= inventory.size()) {
            VendingMachineItem selectedItem = inventory.get(choice - 1);
            if (selectedItem.isAvailable()) {
                System.out.println("You selected: " + selectedItem.getName());
                System.out.println("Price: $" + selectedItem.getPrice());
            } else {
                System.out.println("Sorry, this item is out of stock.");
            }
        } else {
            System.out.println("Invalid choice!");
        }
    }

    // inventory is initialized in a static block, separate from other logic example of both encapsulatiom and srp
    static {
        new VendingMachineItem("Chocolate Bar", 1.50, true);
        new VendingMachineItem("Sour Candy", 1.20, true);
        new VendingMachineItem("Soft Drink", 1.80, true);
        new VendingMachineItem("Potato Chips", 2.00, true);
    }
}
