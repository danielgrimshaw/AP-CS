/**
 * ItemOrder.java
 *
 * Collections of Items that behave as a unit (an order)
 * Should implement order, but there are no other classes in this project
 * that behave in a similar way, therefore the order interface would be useless.
 *
 */

public class ItemOrder {
   private Item order; // the Item we are ordering
   private int qty; // how much
   
   public ItemOrder(Item order, int quantity) {
      this.order = order; // you can not change the item you ordered
                          // this would be useful if the main tracked your order history
                          // through shopping cart
                          // (it would be visible that you had something in your cart
                          // but don't have it any more)
      this.setQuantity(quantity); // quantity can change
   }
   
   public double getPrice() {
      return order.priceFor(qty);
   }
   
   public Item getItem() {
      return order; // little bit slow, but easier in this class
   }
   
   public int getQuantity() {
      return this.qty;
   }
   
   public void setQuantity(int quantity) {
      this.qty = quantity; // in some cases you want to reset the quantity
                           // (this case included)
   }
   
   
   public void addQuantity(int quantity) {
      this.qty += quantity; // in other cases you want to add to it
   }
   
   public String toString() {
      return order.toString() + " " + this.qty;
   }
}