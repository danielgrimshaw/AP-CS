public class Item {
   private String name;
   private double price;
   private double [] bulk;
   
   public Item(String name, double price) {
      this(name, price, 1, price);
   }
   
   public Item(String name, double price, int bulk_quantity, double bulk_price) {
      this.name = name;
      this.bulk = new double [2];
      this.setPrice(price);
      this.setBulk(bulk_quantity, bulk_price);
   }
   
   private void setPrice(double price) {
      if (price >= 0)
         this.price = price;
      else
         throw new IllegalArgumentException("Price is negative");
   }
   
   private void setBulk(int bulk_quantity, double bulk_price) {
      if (bulk_quantity < 0 || bulk_price < 0)
         throw new IllegalArgumentException("Negative bulk quantity or price");
      else {
         this.bulk[0] = bulk_quantity;
         this.bulk[1] = bulk_price;
      }
   }
      
   public double priceFor(int quantity) {
      return (this.quantity/this.bulk[0] * this.bulk[1]) + (this.quantity%this.bulk[0] * this.price);
   }
         
   public String toString() {
      String ret = this.name+ ", " + this.price;
      if (this.bulk[0] != 1)
         ret += "("+this.bulk[0]+" for "+this.bulk[1]+")";
      return ret;
   }
}