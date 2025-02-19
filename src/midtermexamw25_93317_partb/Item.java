/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexamw25_93317_partb;

/**
 * 
 * @author dylan
 */
public class Item {
   //Moved almost all functions out of main because of the low cohesion and high coupling of the original
   //into its own class.
    public double price;
    
    public static String[] candies = {"chocolate bar", "sour candy", "soft drink", "potato chips"};
    public static double[] prices = {1.50, 1.20, 1.80, 2.00};
    public static boolean[] itemAvailability = {true, true, true, true}; // Initially all items are available
    
    
    
    public double getPrice() {
      return price;
    }
    
    public void setPrice(double givenPrice) {
        price = givenPrice;
    }
}

public void addItem(String itemName, double itemPrice) {
        for (int i =0; i <= candies.length; i++) {
            if (candies[i] == null) {
                candies[i] = itemName;
                prices[i] = itemPrice;
            }
        }
    }
   
 
    
    public void selectItem(String itemName) {
        for(int i =0; i < candies.length; i++) {
            if (candies[i].equals(itemName) && itemAvailability[i] == true) {
                System.out.println("You get your item");
            }
            else {
                System.out.println("Sorry! That item is not available.");
            }
        }
    }


    public void addItem(String itemName, double itemPrice) {
        for (int i =0; i <= candies.length; i++) {
            if (candies[i] == null) {
                candies[i] = itemName;
                prices[i] = itemPrice;
            }
        }
    }
   
 
    
    public void selectItem(String itemName) {
        for(int i =0; i < candies.length; i++) {
            if (candies[i].equals(itemName) && itemAvailability[i] == true) {
                System.out.println("You get your item");
            }
            else {
                System.out.println("Sorry! That item is not available.");
            }
        }
    }
