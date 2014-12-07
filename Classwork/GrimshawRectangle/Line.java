public class Line {
   private Point start;
   private Point end;
   
   //constructors
   public Line(Line copy) {
      this.setPosition(copy.toArray());
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
   
   public Point intersect(Line other) {
      //designed to only work for rectangles and limited other cases.
      if (this.getX1() != this.getX2()) {
         int m = (int)this.getSlope();
         int b = this.getY1()-m*this.getX1();
         if (other.getX1() == other.getX2()) {
            if (other.getX1() < this.getX2() && other.getX1() > this.getX1())
               return new Point(other.getX1(), m*other.getX1() + b);
            else 
               throw new IllegalArgumentException("There is no intersection between the lines!");
         }
      } else {
         int m = (int)other.getSlope();
         int b = other.getY1()-m*other.getX1();
         if (this.getX1() < other.getX2() && this.getX1() > other.getX1())
            return new Point(this.getX1(), m*this.getX1() + b);
         else 
            throw new IllegalArgumentException("There is no intersection between the lines!");
      }
      
      throw new IllegalArgumentException("This function does not support two diagonal lines");
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
      ret[0] = this.start;
      ret[1] = this.end;
      return ret;
   }
   
   public String toString() {
      String ret = "[";
      ret += start.toString()+", ";
      ret += end.toString()+"]";
      return ret;
   }
}