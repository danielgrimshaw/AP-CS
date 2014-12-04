/**
 * A Point object
 * Class for pairs of (x, y) coordinates
 * ONLY DOES 2D POINTS!!
 * @author "Daniel Grimshaw"
 * @version "0.0.1"
 */
public class Point {
   //instance vars, fields
   private int x, y;
   
   //Constructors
   public Point() {
      this(0, 0);
   }
   
   public Point(int x) {
      this.setX(x);
      this.setY(0);
   }
   
   public Point(int x, int y) {
      this.setPoint(x, y);
   }
   
   public Point(Point toCopy) {
      this.setPoint(toCopy.toArray());
   }
   //instance methods
   public int getX() {
      return this.x;
   }
   
   public int getY() {
      return this.y;
   }
   
   public int [] getPoint() {
      int [] ret = {this.x, this.y};
      return ret;
   }
   
   public String getPointStr() {
      return this.toString();
   }
   
   public double distanceFromOrigin() {
      return Math.sqrt(this.x*this.x + this.y*this.y);
   }
   
   public double distance(int otherX, int otherY) {
      return Math.sqrt((otherX - this.x)*(otherX - this.x) + (otherY - this.y)*(otherY - this.y));
   }
   
   public double distance(int [] other) {
      if (other.length != 2)
         throw new IllegalArgumentException("Invallid Array Length");
      return this.distance(other[0], other[1]);
   }
   
   public double distance(Point other) {
      return this.distance(other.toArray());
   }
   
   public int manhattanDistance(int otherX, int otherY) {
      return (otherX - this.x) + (otherY - this.y);
   }
   
   public int manhattanDistance(int [] other) {
      if (other.length != 2)
         throw new IllegalArgumentException("Invallid Array Length");
      return this.manhattanDistance(other[0], other[1]);
   }
   
   public int manhattanDistance(Point other) {
      return this.manhattanDistance(other.toArray());
   }
   
   public boolean isVertical(int otherX) {
      return this.getX() == otherX;
   }
   
   public boolean isVertical(int [] other) {
      if (other.length != 2)
         throw new IllegalArgumentException("Invallid Array Length");
      return this.isVertical(other[0]);
   }
   
   public boolean isVertical(Point other) {
      return this.isVertical(other.toArray());
   }
   
   public double slope(int otherX, int otherY) {
      return (double)(otherY - this.y)/(otherX - this.x);
   }
   
   public double slope(int [] other) {
      if (other.length != 2)
         throw new IllegalArgumentException("Invallid Array Length");
      return slope(other[0], other[1]);
   }
   
   public double slope(Point other) {
      return this.slope(other.toArray());
   }
   
   public void setX(int newX) {
      this.x = newX;
   }
   
   public void setY(int newY) {
      this.y = newY;
   }
   
   public void setPoint() {
      this.setPoint(0);
   }
   
   public void setPoint(int x) {
      this.setPoint(x, this.getY());
   }
   
   public void setPoint(int x, int y) {
      this.x = x;
      this.y = y;
   }
   
   public void setPoint(int [] vals) {
      if (vals.length != 2)
         throw new IllegalArgumentException("Invallid Array Length");
      this.setPoint(vals[0], vals[1]);
   }
   
   public void shiftPoint(int x, int y) {
      this.setPoint(this.getX()+x, this.getY()+y);
   }
   
   public void shiftRight(int distance) {
      this.setX(this.getX()+distance);
   }
   
   public void shiftLeft(int distance) {
      this.shiftRight(-distance);
   }
   
   public void shiftUp(int distance) {
      this.setY(this.getY()+distance);
   }
   
   public void shiftDown(int distance) {
      this.shiftUp(-distance);
   }
   
   public void translate(int xDistance, int yDistance) {
      this.shiftPoint(xDistance, yDistance);
   }
   
   public boolean equals(Point p) {
      return (this.x == p.getX() && this.y == p.getY());
   }
   
   public int [] toArray() {
      int [] ret = {x, y};
      return ret;
   }
   
   public String toString() {
      String ret = "	Point[x=";
      ret += x+", y=";
      ret += y+")";
      return ret;
   }
}