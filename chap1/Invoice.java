import java.util.ArrayList;

public class Invoice {
  //static inner class
  ArrayList<Item> items = new ArrayList<>();

  public static class Item{
    private String description;
    private int quantity;
    private double price;

    public Item(String description, int quantity, double price){
      this.description = description;
      this.quantity = quantity;
      this.price = price;
    }
    public double price(){
      return quantity * price;
    }
  }

  public void addItem(Item item){
       items.add(item);
  }

 
  public static void main(String[] args){
    Invoice myInvoice = new Invoice();
    var thisItem = new Invoice.Item("Dumb stuff bough", 10, 200.50);
    myInvoice.addItem(thisItem);
  }
  
}
