/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexamw25_93317_partb;

import static midtermexamw25_93317_partb.VendingMachineItem.candies;
import static midtermexamw25_93317_partb.VendingMachineItem.itemAvailability;

/**
 *
 * @author LucasP
 */
public class checkAvailability {
    
    public static void checkAvailability()
    {
    System.out.println("The following items are availible: ");
    for (int i = 0; i < 4; i++) {
            System.out.println( "The candy: " + candies[i] + " Has the current availability status of:  " + itemAvailability[i]);
        } 
    };
    //Likewise, the checkAvailability method has ben given its own seperate class to better enhance the coupling and cohesion.
}
