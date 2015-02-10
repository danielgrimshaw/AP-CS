/**
 * Catalog.java
 *
 * A really basic representation of a Catalog.
 * Essentially acts as an collection of items;
 *
 */

import java.util.*; // uses List and ArrayList

public class Catalog {
   private String name; // name of the catalog
   private List<Item> items; // the contents of the catalog
   
   public Catalog(String name) {
      this.name = name;
      this.items = new ArrayList<Item>();
   }
   
   public void add(Item item) {
      items.add(item); // relies on other classes to sort what should go where
                       // in future there should be an interface too the items ArrayList
                       // defined in this class
   }
   
   public int size() {
      return items.size();
   }
   
   public Item get(int index) {
      return items.get(index);
   }
   
   public String getName() {
      return this.name;
   }
   
   public String toString() {
      String ret = this.getName();
      for (Item item : items)
         ret += "\n"+item.toString();
      return ret;
   }
}