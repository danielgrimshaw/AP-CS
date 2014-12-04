public class Line {
   private Point start;
   private Point end;
   
   //constructors
   public Line(Line copy) {
      this.setPosition(copy.toArray);
   }
      
   public Line(Point p1, Point p2) {
      this.setPosition(p1, p2);
   }
   
   public Line(int x1, int y1, int x2, int y2) {
      this(new Point(x1,y1), new Point(x2,y2));
   }
   
   //getters
   public Point getP1() {
      return this.start;
   }
   
   public Point getP2() {
      return this.end;
   }
   
   public int getX1() {
      return this.start.getX();
   }
   
   public int getY1() {
      return this.start.getY();
   }
   
   public int getX2() {
      return this.end.getX();
   }
   
   public int getY2() {
      return this.end.getY();
   }
   
   public double getSlope() {
      return this.start.slope(this.end);
   }
   
   //setters
   public void setPosition(Point [] vals) {
      if (vals.length != 2)
         throw new IllegalArgumentException("Invallid Array Length");
      this.setPosition(vals[0], vals[1]);
   }
   
   public void setPosition(Point p1, Point p2) {
      this.start = p1;
      this.end = p2;
   }
   
   public Point [] toArray() {
      Point [] ret = new Point [2];
      ret[0] = this.p1;
      ret[1] = this.p2;
      return ret;
   }
   
   public String toString() {
      String ret = "[";
      ret += start.toString()+", ";
      ret += end.toString()+"]";
      return ret;
   }
}