package midtermexamw25_93317_partb;



//(Encapsulation) is used here because this are private variable with are encapsulated by getter and setter 
public class VendingMachineItem {
    private String name;
    private double price;
    private boolean available;
    public VendingMachineItem(String name, double price, boolean available) {
        this.name = name;
           this.price = price;
       this.available = available;
    }

// Getters and setters to Encapsulate 
    public String getName() {
        return name;
    }
public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public boolean isAvailable() {
        return available;
    }    public void setAvailable(boolean available) {
        this.available = available;
    }
}
