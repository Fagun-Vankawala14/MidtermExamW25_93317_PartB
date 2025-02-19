package midtermexamw25_93317_partb;

import java.util.Scanner;
import java.util.ArrayList;


public class VendingMachineItem {
    public double price;
    
    
    public static ArrayList<String> candies = new ArrayList<>();

    public static ArrayList<Double> prices = new ArrayList<>();
    
    public static ArrayList<Boolean> availability = new ArrayList<>();
    
    public VendingMachineItem(ArrayList<String> candies, ArrayList<Double> prices, ArrayList<Boolean> availability) {
        this.candies = candies;
        this.prices = prices;
        this.availability = availability;
    }
    
    public void addItem(String candy, double price) {
        candies.add(candy);
        prices.add(price);
        availability.add(true);
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double givenPrice) {
        price = givenPrice;
    }
    
    public void displayMenu() {
        System.out.println("Welcome to the vending machine, here is a list of the possible candies:");
        for (int i = 0; i < 4; i++) {
            System.out.println((i+1) + ". " + candies.get(i) + " - $" + prices.get(i));
        }
    }
       
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<String> candyList = new ArrayList<>();

        ArrayList<Double> priceList = new ArrayList<>();
    
        ArrayList<Boolean> availabilityList = new ArrayList<>();
                
        candyList.add("chocolate bar");
        priceList.add(1.50);
        availabilityList.add(true);
        candyList.add("gummies");
        priceList.add(2.00);
        availabilityList.add(true);
        candyList.add("mints");
        priceList.add(1.00);
        availabilityList.add(true);
        candyList.add("bag of chips");
        priceList.add(2.50);
        availabilityList.add(true);        
                
        VendingMachineItem vmi = new VendingMachineItem(candyList, priceList, availabilityList);
        
        vmi.addItem("Nerdz", 1.00);
        vmi.addItem("Jujubes", 3.00);
        vmi.displayMenu();
      }
}
