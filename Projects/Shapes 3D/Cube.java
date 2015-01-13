/**
 * Cube.java
 * A class for representing cubes.
 */

public class Cube extends RectangularPrism {
   public Cube() {
      this(1);
   }
   
   public Cube(int size) {
      super(size, size, size);
   }
   
   public void setSize(int size) {
      super.setSize(size, size, size);
   }
   
   //override the RectangularPrism setSize so that a cube must be cubic
   public void setSize(int x, int y, int z) {
      if (x == y && x == z)
         setSize(x);
   }
   
   public String toString() {
      return "Cube with a side length of "+this.getLenX();
   }
   
   //Cubes can be rectangular prisms
   public boolean equals(Object o) {
      if (o instanceof Cube)
         return super.equals((RectangularPrism)o);
      else if (o instanceof RectangularPrism)
         return ((RectangularPrism)o).equals((RectangularPrism)this);
      return false;
   }
}
