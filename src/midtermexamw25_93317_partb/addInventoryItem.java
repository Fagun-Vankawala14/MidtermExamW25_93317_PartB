/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexamw25_93317_partb;

import java.util.Scanner;

/**
 *
 * @author LucasP
 */
public class addInventoryItem {
    public static void addInventoryItem()
    {
       System.out.println("Please enter something new");
       Scanner newItem = new Scanner(System.in);
       System.out.println("The new Item availible is: " + newItem);
    
    }
    //Just as the other two methods, addInventoryItem has been seperated out to better incentivise looser coupling and higher cohesion.
}
