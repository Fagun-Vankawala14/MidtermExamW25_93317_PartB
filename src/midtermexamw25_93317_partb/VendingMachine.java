/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexamw25_93317_partb;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author chris
 */
public class VendingMachine {
    
    // using arraylist to hold array and to allow admin to add items
    static ArrayList<String> candies = new ArrayList<>();
    static ArrayList<Double> prices = new ArrayList<>();
    static ArrayList<Boolean> itemAvailability = new ArrayList<>();
    
    
    public static void displayMenu() {
        System.out.println("Welcome to the vending machine, here is a list of the possible candies:");
        for (int i = 0; i < 4; i++) {
            System.out.println((i+1) + ". " + candies.get(i) + " - $" + prices.get(i));
        }
    }
    
    // function to select items based on availablity
    public static void selectItem() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Item number: ");
        int userSelect = sc.nextInt();
            if (itemAvailability.get(userSelect) == true) {
                System.out.println("Item is available");  
                System.out.println("Item selected: " + 
                        candies.get(userSelect - 1) + " - $" + prices.get(userSelect - 1));
            } 
            else {
                System.out.println("Item is not available");
            }
     
        
    }
    
    public static void addItems() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Candy Name: ");
        String candyName = sc.next();
        candies.add(candyName);
        System.out.println("Enter Price of" + candyName + ": ");
        double priceTag = sc.nextDouble();
        prices.add(priceTag);
        System.out.println("Enter Availabilty: ");
        boolean availability = sc.nextBoolean();
        itemAvailability.add(availability);
    }
    
    public static void addDefaultItems() {
        candies.add("chocolate bar");
        candies.add("sour candy");
        candies.add("chocolate bar");
        candies.add("sour candy");
        prices.add(1.50);
        prices.add(1.20);
        prices.add(1.80);
        prices.add(2.00);
        itemAvailability.add(true);
        itemAvailability.add(true);
        itemAvailability.add(true);
        itemAvailability.add(true);
    }
     public static void main(String[] args) {

        addDefaultItems();
        Scanner sc = new Scanner(System.in);
        displayMenu();
//        addItems(); for admin tests
        selectItem();
      }
}
