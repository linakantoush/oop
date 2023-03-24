import java.util.ArrayList;

public class GroceryList {
    public ArrayList<GroceryItemOrder> items;
    public int size;
    public GroceryList(){}
    public void add(GroceryItemOrder item){
        if(items.size() <=10) {
            items.add(item);
            size++;
        }
    }
    public double getTotalCost(){
        double cost = 0;
        for (int i = 0; i<items.size(); i++)
            cost += items.get(i).getCost();
        return cost;
    }
}
