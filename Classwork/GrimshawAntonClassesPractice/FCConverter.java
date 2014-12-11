public class FCConverter {
   private double degreesF, degreesC;
   
   public FCConverter() {
      this.setFahrenheit(0);
   }
   
   public double getFahrenheit() {
      return this.degreesF;
   }
   
   public double getCelsius() {
      return this.degreesC;
   }
   
   public void setFahrenheit(double deg) {
      this.degreesF = deg;
      this.degreesC = (5.0/9)*(deg-32);
   }
   
   public void setCelsius(double deg) {
      this.degreesC = deg;
      this.degreesF = (9.0/5)*deg+32;
   }
}
   
      