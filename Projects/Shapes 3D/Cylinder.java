/**
 * Cylinder.java
 * A class for representing 3D cylinders.
 */

public class Cylinder extends CircularShapeWithHeight {
   //This class is identical to CircularCone except that CircularCone has been replaced with Cylinder
   //And the volume and surface area math is different
   private double volume, sa;
   
   public Cylinder() {
      this(1.0);
   }
   
   public Cylinder(double baseRadius) {
      this(baseRadius, 1.0);
   }
   
   public Cylinder(double baseRadius, double height) {
      super(baseRadius, height);
      this.updateVolume();
      this.updateSurfaceArea();
   }
   
   private void updateVolume() { //updates the volume variable
      this.volume = this.getCrossSectionArea()*this.getHeight();
   }
   
   private void updateSurfaceArea() { //updates the sa variable
      this.sa = this.getCrossSectionPerimeter()*this.getHeight()+2*this.getCrossSectionArea();
   }
   
   public double getSurfaceArea() {
      return this.sa;
   }
   
   public double getVolume() {
      return this.volume;
   }
   
   public String toString() {
      return "Cylinder with radius of "+this.getRadius()+" and height of "+this.getHeight();
   }
   
   public boolean equals(Object o) {
      if (o instanceof Cylinder)
         return this.getHeight() == ((Cylinder)o).getHeight() && this.getRadius() == ((Cylinder)o).getRadius();
      return false;
   }
} 
