public class ItemOrder {
   private Item order;
   private int qty;
   
   public ItemOrder(Item order, int quantity) {
      this.order = order;
      this.qty = quantity;
   }
   
   public double getPrice() {
      return order.priceFor(qty);
   }
   
   public Item getItem() {
      return order;
   }
   
   public String toString() {
      return order.toString() + " " + this.qty;
   }
}