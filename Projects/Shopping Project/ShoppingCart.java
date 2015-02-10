/**
 * ShoppingCart.java
 *
 * A class for representing an ordering catalog.
 * In future there will be a graphical interface.
 *
 */

import java.util.*;

public class ShoppingCart {
   private List<ItemOrder> orders;
   private boolean dscnt;
   
   public ShoppingCart() {
      this.orders = new ArrayList<ItemOrder>();
      this.dscnt = false;
   }
   
   public void add(ItemOrder order) { // checks if the Item already has been ordered
                                      // to avoid memory and price leaks
      for (int i = 0; i < orders.size(); i++) {
         Item item = orders.get(i).getItem();
         if (item.getName().equals(order.getItem().getName())) {
            orders.get(i).setQuantity(order.getQuantity());
            return;
         }
      }
      orders.add(order);
   }
   
   public void setDiscount(boolean value) {
      this.dscnt = value;
   }
   
   public double getTotal() {
      double sum = 0;
      for (ItemOrder order : orders)
         sum += order.getPrice();
      return dscnt ? 0.9*sum : sum;
   }
   
   public String toString() {
      String ret = new String();
      for (ItemOrder order : orders)
         ret += order.toString()+ "\n";
      ret += dscnt ? "Qualify for discount" : "Does not qualify for discount";
      return ret;
   }
}