// An abstract superclass for shapes with a circular cross-section

public abstract class CircularShape implements Shape3D {
   private double radius;
   
   public CircularShape(double radius) {
      this.radius = radius;
   }
   
   public double getDiameter() {
      return 2 * radius;
   }

   public double getRadius() {
      return radius;
   }
   
   public double getCrossSectionArea() {
      return Math.PI * radius * radius;
   }
   
   public double getCrossSectionPerimeter() {
      return Math.PI * getDiameter();
   }
}
