public class Cylinder {
   private Circle base;
   private double height;
   
   public Cylinder(double r, double h) {
      this.height = h;
      this.base = new Circle(r);
   }
   
   public double getVolume() {
      return this.base.getArea()*this.height;
   }
}