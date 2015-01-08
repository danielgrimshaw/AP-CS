public class RectangularPrism implements Shape3D {
   private double x, y, z;
   private double volume, sa; //sa is surface area
   
   public RectangularPrism() {
      this(1.0);
   }
      
   public RectangularPrism(double x) {
      this(x, 1.0);
   }
      
   public RectangularPrism(double x, double y) {
      this(x, y, 1.0);
   }
      
   public RectangularPrism(double x, double y, double z) {
      this.setSize(x, y, z);
   }
   
   public double getLenX() {
      return this.x;
   }
      
   public double getLenY() {
      return this.y;
   }
   
   public double getLenZ() {
      return this.z;
   }
   
   public void setSize(double x, double y, double z) {
      this.x = x;
      this.y = y;
      this.z = z;
      this.updateVolume();
      this.updateSurfaceArea();
   }
   
   private void updateVolume() {
      this.volume = this.x * this.y * this.z;
   }
   
   private void updateSurfaceArea() {
      double [] surfaces = new double [3]; //there are three distinct sizes of faces
      int surfaceArea = 0;
      
      surfaces[0] = this.x * this.y;
      surfaces[1] = this.x * this.z;
      surfaces[2] = this.y * this.z;
      
      for (int surface : surfaces)
         surfaceArea += surface;
         
      this.sa = 2*surfaceArea;
   }
}