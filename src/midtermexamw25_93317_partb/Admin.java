/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexamw25_93317_partb;

/**
 *
 * @author Tanvir Kaur
 */
import java.util.Scanner;
import java.util.*;
import static midtermexamw25_93317_partb.VendingMachineItem.addItem;
import static midtermexamw25_93317_partb.VendingMachineItem.displayMenu;
public class Admin {
      private VendingMachineItem vendingMachine;
       private Scanner sc;

    public Admin(VendingMachineItem vendingMachine) {
        this.vendingMachine = vendingMachine;
        this.sc = new Scanner(System.in);
        
    }
    public void addNewItem(){
        System.out.println("Admin: Would you like to add a new item to the inventory? (yes/no)");
        String adminChoice = sc.nextLine();
        
        if (adminChoice.equalsIgnoreCase("yes")) {
            System.out.println("Enter the name of the new item:");
            String newItem = sc.nextLine();
            
            System.out.println("Enter the price of the new item:");
            double newPrice = sc.nextDouble();
            if (newPrice < 0) {
                System.out.println("The price must be a positive value.");
                return;
            }
            boolean availability = true;
            
            addItem(newItem, newPrice, availability);
            System.out.println("New item added successfully!");
          
            displayMenu();
        } else {
            System.out.println("No new item added.");
        }
        
    }
    
}
