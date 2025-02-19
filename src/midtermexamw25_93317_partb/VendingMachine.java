/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexamw25_93317_partb;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author soky4
 * Vending Machine is now its own class, and the methods here are only related to
 * vending machine operations. 
 * Loose coupling is achieved by passing a created item into the addItem method,
 * so items are not created within the vending machine class but on their own.
 */
public class VendingMachine {
    
    public static ArrayList<String> candies = new ArrayList<>();

    public static ArrayList<Double> prices = new ArrayList<>();
    
    public static ArrayList<Boolean> availability = new ArrayList<>();
    
    public VendingMachine(ArrayList<String> candies, ArrayList<Double> prices, ArrayList<Boolean> availability) {
        this.candies = candies;
        this.prices = prices;
        this.availability = availability;
    }
    
    public void addItem(VendingMachineItem item) {
        this.candies.add(item.candy);
        this.prices.add(item.price);
        this.availability.add(true);
    }
    
    public void displayMenu() {
        System.out.println("Welcome to the vending machine, here is a list of the possible candies:");
        for (int i = 0; i < candies.size(); i++) {
            System.out.println((i+1) + ". " + candies.get(i) + " - $" + prices.get(i));
        }
    }
    
    public void selectItem(String item) {
        for (int i = 0; i < candies.size(); i++) {
            if (candies.get(i).equals(item)) {
                if (availability.get(i) == true) {
                System.out.println(item + " is available!");
            }
                else {
                    System.out.println(item + " is not available! Sorry.");
            }
        }
    }
}
}


