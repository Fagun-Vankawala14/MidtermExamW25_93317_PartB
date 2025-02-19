package midtermexamw25_93317_partb;


//srp is used here as this handels the  vending machine operations here each method has seperate  Responsibilities
import java.util.Scanner;

public class VendingMachine {
    private VendingMachineItem[] items;

    // Constructor 
    public VendingMachine() {
        items = new VendingMachineItem[] {
            new VendingMachineItem("chocolate bar", 1.50, true),
            new VendingMachineItem("sour candy", 1.20, true),
            new VendingMachineItem("soft drink", 1.80, true),
            new VendingMachineItem("potato chips", 2.00, true)
        };
    }

    // this method display menu
    public void displayMenu() {
        System.out.println("Welcome to the vending machine, here is a list of the possible candies:");
        for (int i = 0; i < items.length; i++) {
            System.out.println((i + 1) + ". " + items[i].getName() + " - $" + items[i].getPrice());
        }
    }

    //This method ONLY handles selecting an item
    public void selectItem(int itemNumber) {
        if (itemNumber < 1 || itemNumber > items.length) {
            System.out.println("Invalid item number.");
            return;
        }
        VendingMachineItem item = items[itemNumber - 1];  
        if (item.isAvailable()) {
            System.out.println("You selected: " + item.getName() + " for $" + item.getPrice());
        } else {
            System.out.println(item.getName() + " is currently out of stock.");
        }
    }

    // Main method 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VendingMachine vendingMachine = new VendingMachine();  
        vendingMachine.displayMenu();
        System.out.print("Enter the item number to select: ");
        int itemNumber = sc.nextInt();
        vendingMachine.selectItem(itemNumber);
    }
}
