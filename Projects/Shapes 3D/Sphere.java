public class Sphere implements Shape3D {
   private double radius;
   private double volume, sa;
   
   public Sphere() {
      this(1.0);
   }
   
   public Sphere(double radius) {
      this.setSize(radius);
   }
   
   public void setSize(double radius) {
      this.radius = radius;
      
      updateVolume();
      updateSurfaceArea();
   }
   
   private void updateVolume();
   public double getVolume() {
      return this.volume;
   }
   
   public double getSurfaceArea() {
      return this.sa;
   }
}