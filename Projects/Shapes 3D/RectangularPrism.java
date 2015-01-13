/**
 * RectangularPrism.java
 * A class for representing Rectangular Prisms
 * Superclass of Cube
 */

public class RectangularPrism implements Shape3D {
   private double x, y, z; //Side lengths
   private double volume, sa; //sa is surface area
   
   public RectangularPrism() {
      this(1.0);
   }
      
   public RectangularPrism(double x) {
      this(x, 1.0);
   }
      
   public RectangularPrism(double x, double y) {
      this(x, y, 1.0);
   }
      
   public RectangularPrism(double x, double y, double z) {
      this.setSize(x, y, z);
   }
   
   public double getLenX() {
      return this.x; //length
   }
      
   public double getLenY() {
      return this.y; //width
   }
   
   public double getLenZ() {
      return this.z; //height
   }
   
   public void setSize(double x, double y, double z) {
      this.x = x;
      this.y = y;
      this.z = z;
      this.updateVolume();
      this.updateSurfaceArea();
   }
   
   private void updateVolume() {
      this.volume = this.x * this.y * this.z;
   }
   
   private void updateSurfaceArea() {
      double [] surfaces = new double [3]; //there are three distinct sizes of faces
      double surfaceArea = 0;
      
      surfaces[0] = this.x * this.y;
      surfaces[1] = this.x * this.z;
      surfaces[2] = this.y * this.z;
      
      for (double surface : surfaces)
         surfaceArea += surface;
         
      this.sa = 2*surfaceArea;
   }
   
   public double getVolume() {
      return this.volume;
   }
   
   public double getSurfaceArea() {
      return this.sa;
   }
   
   public String toString() {
      return "Rectangular Prism with a length of "+this.getLenX()+", width of "+this.getLenY()+", and height of "+this.getLenZ();
   }
   
   public boolean equals(Object o) { //Cubes count as instances of RectangularPrisms
      if (o instanceof RectangularPrism) {
         RectangularPrism p = (RectangularPrism)o;
         return p.getLenX() == this.getLenX() && p.getLenY() == this.getLenY() && p.getLenZ() == this.getLenZ();
      }
      return false;
   }
}
