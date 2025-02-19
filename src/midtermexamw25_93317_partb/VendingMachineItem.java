package midtermexamw25_93317_partb;

import java.util.Scanner;

public class VendingMachineItem {
    private double price;
    
 private static String[] candies = {"chocolate bar", "sour candy", "soft drink", "potato chips"};
private static double[] prices = {1.50, 1.20, 1.80, 2.00};
private static boolean[] itemAvailability = {true, true, true, true};

    public VendingMachineItem(double price) {
    this.price = price;
}

    
    // ✅ Getter & Setter for encapsulation
    public double getPrice() {
        return price;
    }

    public void setPrice(double givenPrice) {
        price = givenPrice;
    }
    // ✅ Getter methods for encapsulated arrays
    public static String[] getCandies() {
        return candies;
    }

    public static double[] getPrices() {
        return prices;
    }

    public static boolean[] getItemAvailability() {
        return itemAvailability;
    }
    public static void displayMenu() {
        System.out.println("Welcome to the vending machine, here is a list of the possible candies:");
        for (int i = 0; i < candies.length; i++) {
            System.out.println((i+1) + ". " + candies[i] + " - $" + prices[i]);
        }
    }
    
    public static void showMenu() {
        System.out.println("===== Vending Machine Menu =====");
        displayMenu();
    }
      public static void addItem(String newItem, double newPrice) {
    int newSize = candies.length + 1;

    // Expand arrays
    String[] newCandies = new String[newSize];
    double[] newPrices = new double[newSize];
    boolean[] newAvailability = new boolean[newSize];

    for (int i = 0; i < candies.length; i++) {
        newCandies[i] = candies[i];
        newPrices[i] = prices[i];
        newAvailability[i] = itemAvailability[i];
    }

    newCandies[newSize - 1] = newItem;
    newPrices[newSize - 1] = newPrice;
    newAvailability[newSize - 1] = true; 

    // Assign back to static variables
    candies = newCandies;
    prices = newPrices;
    itemAvailability = newAvailability;

    System.out.println("Item added successfully!");
} 
      public static boolean selectItem(int itemNumber) {
        if (itemNumber > 0 && itemNumber <= candies.length) {
            if (itemAvailability[itemNumber - 1]) {
                System.out.println("You selected: " + candies[itemNumber - 1]);
                return true;
            } else {
                System.out.println("Sorry, this item is out of stock.");
                return false;
            }
        } else {
            System.out.println("Invalid selection.");
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        
        while (running) {
            showMenu();  // ✅ Using showMenu() instead of displayMenu()

            System.out.println("\nOptions:");
            System.out.println("1. Select an item");
            System.out.println("2. Add a new item");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Select an item number: ");
                    int selection = sc.nextInt();
                    selectItem(selection);
                    break;

                case 2:
                    sc.nextLine(); // ✅ Clear scanner buffer
                    System.out.print("Enter new item name: ");
                    String newItem = sc.nextLine();
                    System.out.print("Enter new item price: ");
                    double newPrice = sc.nextDouble();
                    addItem(newItem, newPrice);
                    break;

                case 3:
                    System.out.println("Thank you for using the vending machine. Goodbye!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println(); // ✅ For better spacing in the UI
        }

        sc.close(); // ✅ Close Scanner resource
    }
}

