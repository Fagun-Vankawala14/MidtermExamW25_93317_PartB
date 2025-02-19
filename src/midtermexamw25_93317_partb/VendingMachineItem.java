package midtermexamw25_93317_partb;

import java.util.Scanner;

public class VendingMachineItem {
    public double price;
    
    public static String[] candies = {"chocolate bar", "sour candy", "soft drink", "potato chips"};
    public static double[] prices = {1.50, 1.20, 1.80, 2.00};
    public static boolean[] itemAvailability = {true, true, true, true}; // Initially all items are available

    public VendingMachineItem() {
    }

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
        System.out.println("Welcome to the vending machine, here is a list of the available candies:");
        for (int i = 0; i < candies.length; i++) {  
            System.out.println((i + 1) + ". " + candies[i] + " - $" + prices[i] + 
                (itemAvailability[i] ? " (Available)" : " (Out of Stock)"));
        }
    }

    public static void addItem(String name, double price) {
        int newSize = candies.length + 1;
        String[] newCandies = new String[newSize];
        double[] newPrices = new double[newSize];
        boolean[] newAvailability = new boolean[newSize];

        System.arraycopy(candies, 0, newCandies, 0, candies.length);
        System.arraycopy(prices, 0, newPrices, 0, prices.length);
        System.arraycopy(itemAvailability, 0, newAvailability, 0, itemAvailability.length);

        newCandies[newSize - 1] = name;
        newPrices[newSize - 1] = price;
        newAvailability[newSize - 1] = true;

        candies = newCandies;
        prices = newPrices;
        itemAvailability = newAvailability;

        System.out.println("Item added successfully: " + name + " - $" + price);
    }

    public static void selectItem(int itemNumber) {
        if (itemNumber >= 1 && itemNumber <= candies.length) {
            if (itemAvailability[itemNumber - 1]) {
                System.out.println("You selected: " + candies[itemNumber - 1]);
                itemAvailability[itemNumber - 1] = false; 
            } else {
                System.out.println("Sorry, this item is out of stock.");
            }
        } else {
            System.out.println("Invalid selection.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        displayMenu();

        System.out.println("Do you want to add a new item? (yes/no)");
        String response = sc.next();
        if (response.equalsIgnoreCase("yes")) {
            System.out.print("Enter item name: ");
            sc.nextLine(); 
            String itemName = sc.nextLine();
            System.out.print("Enter item price: ");
            double itemPrice = sc.nextDouble();
            addItem(itemName, itemPrice);
        }

        displayMenu(); 

        System.out.println("Enter the number of the item you want to buy: ");
        int selectedItem = sc.nextInt();
        selectItem(selectedItem);
        
        displayMenu();
    }
}
