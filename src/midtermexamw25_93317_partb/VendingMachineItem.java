package midtermexamw25_93317_partb;

import java.util.Scanner;

public class VendingMachineItem {
    // Encapsulation: Keeping attributes private
    private double price;

    private static String[] candies = {"chocolate bar", "sour candy", "soft drink", "potato chips"};
    private static double[] prices = {1.50, 1.20, 1.80, 2.00};
    private static boolean[] itemAvailability = {true, true, true, true};

    public VendingMachineItem() {
        // Constructor left blank intentionally
    }

    // Encapsulation: Providing getter and setter methods for private attributes
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Single Responsibility Principle (SRP): Displaying the menu is a separate responsibility
    public static void displayMenu() {
        System.out.println("Welcome to the vending machine, here is a list of the possible candies:");
        for (int i = 0; i < candies.length; i++) {
            System.out.println((i + 1) + ". " + candies[i] + " - $" + prices[i]);
        }
    }

    // Single Responsibility Principle (SRP): Adding a new item is a separate responsibility
    public void addNewItem(String name, double price) {
        String[] newCandies = new String[candies.length + 1];
        double[] newPrices = new double[prices.length + 1];
        boolean[] newAvailability = new boolean[itemAvailability.length + 1];

        System.arraycopy(candies, 0, newCandies, 0, candies.length);
        System.arraycopy(prices, 0, newPrices, 0, prices.length);
        System.arraycopy(itemAvailability, 0, newAvailability, 0, itemAvailability.length);

        newCandies[candies.length] = name;
        newPrices[prices.length] = price;
        newAvailability[itemAvailability.length] = true;

        candies = newCandies;
        prices = newPrices;
        itemAvailability = newAvailability;
    }

    // Single Responsibility Principle (SRP): Checking item availability is a separate responsibility
    public static boolean isItemAvailable(int index) {
        if (index < 0 || index >= itemAvailability.length) return false;
        return itemAvailability[index];
    }

    // Single Responsibility Principle (SRP): Selecting an item is a separate responsibility
    public static String selectItem(int index) {
        if (isItemAvailable(index)) {
            return candies[index];
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        displayMenu();
    }
}
