public class Line {
   private Point start;
   private Point end;
   
   //constructors
   public Line(Point p1, Point p2) {
      this.start = p1;
      this.end = p2;
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
   
   public double getSlope() {
      return this.start.slope(this.end);
   }
   
   public String toString() {
      String ret = "[";
      ret += start.toString()+", ";
      ret += end.toString()+"]";
      return ret;
   }
}