/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexamw25_93317_partb;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.displayMenu();

        System.out.println("Do you want to add a new item? (yes/no)");
        String response = sc.nextLine();
        
        if (response.equalsIgnoreCase("yes")) {
            System.out.println("Enter item name:");
            String itemName = sc.nextLine();
            System.out.println("Enter item price:");
            double itemPrice = sc.nextDouble();
            vendingMachine.addNewItem(itemName, itemPrice);
            vendingMachine.displayMenu(); // Display updated menu
        }

        System.out.println("Do you want to select an item? (yes/no)");
        String selectResponse = sc.nextLine();
        
        if (selectResponse.equalsIgnoreCase("yes")) {
            System.out.println("Please select an item by entering the number:");
            int itemNumber = sc.nextInt();
            vendingMachine.selectItem(itemNumber); // Allow customer to select an item
        }

        sc.close();
    }
}
