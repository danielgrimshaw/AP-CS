/**
 * CircularCone.java
 * A class for cones with circular bases.
 *
 */

public class CircularCone extends CircularShapeWithHeight {
   private double volume, sa; //Keeps track of the volume and surface area without always recalculating
   
   //Constructors
   public CircularCone() {
      this(1.0);
   }
   
   public CircularCone(double baseRadius) {
      this(baseRadius, 1.0);
   }
   
   public CircularCone(double baseRadius, double height) {
      super(baseRadius, height); //All of the actual size variables are stored in superclasses
                                 //Therefore I can only access them to change them through this constructor
      this.updateVolume();
      this.updateSurfaceArea();
   }
   
   private void updateVolume() { //Corrects to volume  variable to match current size
      this.volume = this.getCrossSectionArea()*this.getHeight()/3;
   }
   
   private void updateSurfaceArea() { //Corrects the sa variable to match current surface area
      this.sa = Math.PI*this.getRadius()*Math.sqrt(Math.pow(this.getRadius(), 2)+Math.pow(this.getHeight(), 2))+this.getCrossSectionArea();
   }
   
   public double getSurfaceArea() {
      return this.sa;
   }
   
   public double getVolume() {
      return this.volume;
   }
   
   public String toString() {
      return "Circular Cone with radius of "+this.getRadius()+" and height of "+this.getHeight();
   }
   
   public boolean equals(Object o) {
      if (o instanceof CircularCone)
         return this.getHeight() == ((CircularCone)o).getHeight() && this.getRadius() == ((CircularCone)o).getRadius();
      return false;
   }
} 
