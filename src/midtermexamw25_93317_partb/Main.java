/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexamw25_93317_partb;

/**
 *
 * @author ks055
 */


import java.util.Scanner;

// Single Responsibility Principle (SRP): Handles user interaction.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.displayMenu();

        System.out.print("\nAre you an Admin? (yes/no): ");
        String response = sc.next().toLowerCase();

        if (response.equals("yes") || response.equals("y")) {
            vendingMachine.addNewItem(sc);
            vendingMachine.displayMenu();
        } else {
            vendingMachine.selectItem(sc);
        }

        sc.close();
    }
}
