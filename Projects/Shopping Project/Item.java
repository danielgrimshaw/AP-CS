public class Item {
   private String name;
   private double price;
   private double [] bulk;
   
   public Item(String name, double price) {
      this(name, price, 1, price);
   }
   
   public Item(String name, double price, int bulk_quantity, double bulk_price) {
      this.name = name;
      this.setPrice(price);
      this.setBulk(bulk_quantity, bulk_price);
   }
   
   private void setPrice(double price) {
      if (price >= 0) {
         this.price = price;
      else
         throw new IllegalArgumentException("Price is negative");
   }
   
   private void setBulk(int bulk_quantity, double bulk_price) {
   