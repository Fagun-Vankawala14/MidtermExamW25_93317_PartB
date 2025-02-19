/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexamw25_93317_partb;
import java.util.Scanner;
import java.util.*;
import static midtermexamw25_93317_partb.VendingMachineItem.candies;
import static midtermexamw25_93317_partb.VendingMachineItem.itemAvailability;
import static midtermexamw25_93317_partb.VendingMachineItem.prices;

/**
 *
 * @author Tanvir Kaur
 */
public class Customer {
     private VendingMachineItem vendingMachine;
    private Scanner sc;

    public Customer(VendingMachineItem vendingMachine) {
        this.vendingMachine = vendingMachine;
        this.sc = new Scanner(System.in);
    }

    // Method to interact with the customer - asking for selection and processing it
   public static void handleCustomerSelection(Scanner sc) {
        System.out.println("Customer, would you like to select an item? (yes/no)");
        String customerChoice = sc.nextLine();

        if (customerChoice.equalsIgnoreCase("yes")) {
            System.out.println("Enter the number of the item you want to purchase:");
            int selectedItem = sc.nextInt();
            sc.nextLine();  

            
            if (selectedItem < 1 || selectedItem > candies.size()) {
                System.out.println("Invalid selection.");
            } else { 
                int itemIndex = selectedItem - 1;
                if (itemAvailability.get(itemIndex)) {
                    System.out.println("You selected " + candies.get(itemIndex) + " for $" + prices.get(itemIndex));
                    System.out.println("Enjoy!");
                    // Set the item to unavailable after purchase
                    itemAvailability.set(itemIndex, false);
                } else {
                    System.out.println("Sorry,not available.");
                }
            }
        } else {
            System.out.println("Success");
        }
    }

    
    
}
