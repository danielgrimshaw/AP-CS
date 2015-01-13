public class Sphere implements Shape3D {
   private double radius; //The only differenc between any to spheres is their radius
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
   
   private void updateVolume() {
      this.volume = 4.0*Math.PI*Math.pow(this.radius, 3)/3;
   }
   
   private void updateSurfaceArea() {
      this.sa = 4.0*Math.PI*Math.pow(this.radius, 2);
   }
   
   public double getRadius() {
      return this.radius;
   }
   
   public double getVolume() { //The advantage of using variables to hold values is really simple getters.
      return this.volume;
   }
   
   public double getSurfaceArea() {
      return this.sa;
   }
   
   public String toString() {
      return "Sphere with radius "+this.radius;
   }
   
   public boolean equals(Object o) { //Spheres can only be identical to spheres
      if (o instanceof Sphere)
         return this.getRadius() == ((Sphere)o).getRadius();
      return false;
   }
}
