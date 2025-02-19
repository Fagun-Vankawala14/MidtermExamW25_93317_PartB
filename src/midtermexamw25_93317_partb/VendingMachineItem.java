package midtermexamw25_93317_partb;


//Seperated Vending Machine Item into it's own class, with a getter/setter for admin to
//change price. Item are now seperate from the vending machine itself, allowing
//for high cohesion; VendingMachineItem does not do all the jobs of the VendingMachine.

public class VendingMachineItem {
    
    public String candy;
    public double price;
    
    public VendingMachineItem(String candy, double price) {
        this.candy = candy;
        this.price = price;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double givenPrice) {
        price = givenPrice;
    }
}
