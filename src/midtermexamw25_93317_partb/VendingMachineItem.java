package midtermexamw25_93317_partb;
/*
    modified by Dylan Violo
    author fagun
*/
import java.util.Scanner;

public class VendingMachineItem { 
    
    public static void displayMenu() {
        System.out.println("Welcome to the vending machine, here is a list of the possible candies:");
        for (int i = 0; i < 4; i++) {
            System.out.println((i+1) + ". " + candies[i] + " - $" + prices[i]);
        }
    }
       
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        displayMenu();
      }
}
