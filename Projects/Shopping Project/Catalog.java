import java.util.*;

public class Catalog {
   private String name;
   private List<Item> items;
   
   public Catalog(String name) {
      this.name = name;
      this.items = new ArrayList<Item>();
   }
   
   public void add(Item item) {
      items.add(item);
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