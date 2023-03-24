public class GroceryItemOrder {
    public String item;
    public int quantity;
    public double price;
    public GroceryItemOrder(String name, double pricePerUnit){
        item = name;
        price = pricePerUnit;
        quantity++;
    }
    public double getCost(){
        return price*quantity;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
}
