package midtermexamw25_93317_partb;

public class VendingMachineItem {
    private String name;
    private double price;
    private boolean availability;
    
    
    
    public VendingMachineItem(String name, double price, boolean availability) {
        // Constructor left blank intentionally
        this.name = name;
        this.price = price;
        this.availability = availability;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double givenPrice) {
        price = givenPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
    
    
   
}
