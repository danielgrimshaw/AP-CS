/**
 * Item.java
 *
 * A class representation of a purchaseable item.
 * Purchaseable should be an interface, but this
 * would be the only class that would implment it.
 *
 */

import java.text.NumberFormat;

public class Item {
   private final static NumberFormat nf = NumberFormat.getCurrencyInstance(); // Used for formatting the prices
   private String name; // Item name
   private double price; // Item singular price (mostly ignored)
   private double [] bulk; // double array for holding the bulk data
                           // [0] = bulk quantity
                           // [1] = bulk price
   
   public Item(String name, double price) {
      this(name, price, 1, price); // if there is no bulk, why not make it only bulk?
                                   // the bulk price is set to the normal price
                                   // and the bulk quantity is set to 1 to avoid errors
   }
   
   public Item(String name, double price, int bulk_quantity, double bulk_price) {
      this.name = name;
      this.bulk = new double [2]; // the bulk array must be defined before calling setBulk
      this.setPrice(price); // allows for easy error checking
      this.setBulk(bulk_quantity, bulk_price); // allows for easy error checking
   }
   
   private void setPrice(double price) {
      if (price >= 0) // is a valid price (Item's can be free)
         this.price = price;
      else // No store pays the customer to take their merchandise
         throw new IllegalArgumentException("Price is negative");
   }
   
   private void setBulk(int bulk_quantity, double bulk_price) {
      if (bulk_quantity < 0 || bulk_price < 0) // This prevents errors later
                                               // If you want to have no bulk data
                                               // please use the non-bulk constructor
         throw new IllegalArgumentException("Negative bulk quantity or price");
      else {
         this.bulk[0] = bulk_quantity; // [0] = quantity
         this.bulk[1] = bulk_price; // [1] = price
      }
   }
      
   public double priceFor(int quantity) { // calculate minimum possible price
                                          // bulk price for maximum bulk units
                                          // ^ (quantity / bulk_quantity) 
      return (quantity/(int)(this.bulk[0]) * (this.bulk[1]))/*bulk units*/ + (quantity%(int)(this.bulk[0]) * (this.price))/*remainder*/;
   }
   
   public String getName() {
      return this.name;
   }
        
   public String toString() {
      String ret = this.name+ ", " + nf.format(this.price); // everything has a price (formatted as such)
      if (this.bulk[0] != 1) // bulk quantity will never be <= 0
                             // a bulk quantity of 1 indicates no special bulk pricing
         ret += " ("+(int)this.bulk[0]+" for "+nf.format(this.bulk[1])+")"; // display special bulk pricing
      return ret;
   }
}