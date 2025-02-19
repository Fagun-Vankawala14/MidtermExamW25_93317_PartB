/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexamw25_93317_partb;

import static midtermexamw25_93317_partb.VendingMachineItem.candies;
import static midtermexamw25_93317_partb.VendingMachineItem.prices;

/**
 *
 * @author LucasP
 */
public class displayMenu {
    
    
    
    public static void display(){
     System.out.println("Welcome to the vending machine, here is a list of the possible candies:");
        for (int i = 0; i < 4; i++) {
            System.out.println((i+1) + ". " + candies[i] + " - $" + prices[i]);
        }
    }
   //In this Class, i've moved the display method to promote better coupling and cohesion.
}
