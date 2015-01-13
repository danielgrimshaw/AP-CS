public class CircularCone extends CircularShapeWithHeight {
   private double volume, sa;
   
   public CircularCone() {
      this(1.0);
   }
   
   public CircularCone(double baseRadius) {
      this(baseRadius, 1.0);
   }
   
   public CircularCone(double baseRadius, double height) {
      super(baseRadius, height);
      this.updateVolume();
      this.updateSurfaceArea();
   }
   
   private void updateVolume() {
      this.volume = this.getCrossSectionArea()*this.getHeight()/3;
   }
   
   private void updateSurfaceArea() {
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