// An abstract superclass for shapes with a circular cross-section
// that extends over some height

public abstract class CircularShapeWithHeight extends CircularShape {
   private double height;

   public CircularShapeWithHeight(double radius, double height) {
      super(radius);
      this.height = height;
   }

   public double getHeight() {
      return height;
   }
}
