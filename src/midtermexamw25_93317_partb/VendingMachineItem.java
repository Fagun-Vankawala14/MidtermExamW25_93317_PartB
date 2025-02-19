package midtermexamw25_93317_partb;

public class VendingMachineItem {
    private double price;
    
    private static String[] candies = {"chocolate bar", "sour candy", "soft drink", "potato chips"};
    private static double[] prices = {1.50, 1.20, 1.80, 2.00};
    private static boolean[] itemAvailability = {true, true, true, true};

    public VendingMachineItem() {}

    public VendingMachineItem(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double givenPrice) {
        price = givenPrice;
    }

    public static String[] getCandies() {
        return candies;
    }

    public static double[] getPrices() {
        return prices;
    }

    public static boolean[] getItemAvailability() {
        return itemAvailability;
    }

    public static void setCandies(String[] newCandies) {
        candies = newCandies;
    }

    public static void setPrices(double[] newPrices) {
        prices = newPrices;
    }

    public static void setItemAvailability(boolean[] newAvailability) {
        itemAvailability = newAvailability;
    }

    public static void updateAvailability(int index, boolean available) {
        itemAvailability[index] = available;
    }

    public static void displayMenu() {
        System.out.println("Welcome to the vending machine, here is a list of the available candies:");
        for (int i = 0; i < candies.length; i++) {  
            System.out.println((i + 1) + ". " + candies[i] + " - $" + prices[i] + 
                (itemAvailability[i] ? " (Available)" : " (Out of Stock)"));
        }
    }
}
