public class SquarePyramid implements Shape3D {
   private double baseSide, height;
   private double volume, sa;
   
   public SquarePyramid() {
      this(1.0);
   }
   
   public SquarePyramaid(double baseSide) {
      this(baseSide, 1.0);
   }
   
   public SquarePyramaid(double baseSide, double height) {
      this.setSize(baseSide, height);
   }
   
   public void setSize() {
      this.setSize(1.0);
   }
      
   public void setSize(double baseSide) {
      this.setSize(baseSide, 1.0);
   }
         
   public void setSize(double baseSide, double height) {
         
   }
   
   public double getVolume() {
      return this.volume;
   }
   
   public double getSurfaceArea() {
      return this.sa;
   }
}