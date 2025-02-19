/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexamw25_93317_partb;

/**
 *
 * @author khali_jwhe8us
 */
public class VendingMachine {
    private static Scanner sc = new Scanner(System.in);

    public static void displayMenu() {
        System.out.println("Welcome to the vending machine, here are the available candies:");
        for (int i = 0; i < VendingMachineItem.candies.length; i++) {
            System.out.println((i+1) + ". " + VendingMachineItem.candies[i] + " - $" + VendingMachineItem.prices[i] +
                               " (Available: " + VendingMachineItem.itemAvailability[i] + ")");
        }
    }

    public static void addItem(String candy, double price, boolean availability) {
        int n = VendingMachineItem.candies.length;
        if (n < 100) { // Open for extension, Closed for modification (OCP)
            String[] newCandies = new String[n + 1];
            double[] newPrices = new double[n + 1];
            boolean[] newAvailability = new boolean[n + 1];

            System.arraycopy(VendingMachineItem.candies, 0, newCandies, 0, n);
            System.arraycopy(VendingMachineItem.prices, 0, newPrices, 0, n);
            System.arraycopy(VendingMachineItem.itemAvailability, 0, newAvailability, 0, n);

            newCandies[n] = candy;
            newPrices[n] = price;
            newAvailability[n] = availability;

            VendingMachineItem.candies = newCandies;
            VendingMachineItem.prices = newPrices;
            VendingMachineItem.itemAvailability = newAvailability;

            System.out.println("New item added successfully!");
        } else {
            System.out.println("No more space to add new items.");
        }
    }

    public static void selectItem(int itemIndex) {
        if (itemIndex >= 0 && itemIndex < VendingMachineItem.candies.length) {
            if (VendingMachineItem.itemAvailability[itemIndex]) {
                System.out.println("You have selected: " + VendingMachineItem.candies[itemIndex] + ". Please proceed to payment.");
            } else {
                System.out.println("Sorry, " + VendingMachineItem.candies[itemIndex] + " is currently unavailable. Please select another item.");
            }
        } else {
            System.out.println("Invalid item selection. Please try again.");
        }
    }

    public static void main(String[] args) {
        displayMenu();
        System.out.println("Enter 'add' to add a new item or 'select' to choose an item:");
        String command = sc.nextLine();
        if ("add".equalsIgnoreCase(command)) {
            System.out.println("Enter candy name:");
            String candy = sc.nextLine();
            System.out.println("Enter price:");
            double price = sc.nextDouble();
            System.out.println("Enter availability (Yes/No):");
            boolean availability = sc.nextBoolean();
            addItem(candy, price, availability);
            displayMenu();
        } else if ("select".equalsIgnoreCase(command)) {
            System.out.println("Please enter the number of the item you wish to select:");
            int itemSelection = sc.nextInt() - 1;  // Adjust for 0-based index
            selectItem(itemSelection);
        }
        sc.close();
    }
}