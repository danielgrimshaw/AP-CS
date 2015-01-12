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
      this.baseSide = baseSide;
      this.height = height;
      
      updateVolume();
      updateSurfaceArea();
   }
   
   private void updateVolume() {
      this.volume = (Math.pow(this.baseSide, 2)*height)/3;
   }
   
   private void updateSurfaceArea() {
      this.sa = this.baseSide*(this.baseSide+Math.sqrt(Math.pow(this.baseSide, 2)+4*Math.pow(this.height, 2));
   }
   
   public double getBaseSide() {
      return this.baseSide;
   }
   
   public double getHeight() {
      return this.height;
   }
   
   public double getVolume() {
      return this.volume;
   }
   
   public double getSurfaceArea() {
      return this.sa;
   }
}