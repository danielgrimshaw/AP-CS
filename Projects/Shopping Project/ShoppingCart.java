import java.util.*;

public class ShoppingCart {
   private List<ItemOrder> orders;
   private boolean dscnt;
   
   public ShoppingCart() {
      this.orders = new ArrayList<ItemOrder>();
      this.dscnt = false;
   }
   
   public void add(ItemOrder order) {
      orders.add(order);
   }
   
   public void setDiscount(boolean value) {
      this.dscnt = value;
   }
   
   public double getTotal() {
      double sum = 0;
      for (ItemOrder order : orders)
         sum += order.getPrice();
      return sum;
   }
   
   public String toString() {
      String ret = new String();
      for (ItemOrder order : orders)
         ret += order.toString()+ "\n";
      ret += dscnt ? "Qualify for discount" : "Does not qualify for discount";
      return ret;
   }
}