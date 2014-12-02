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
   
   public double distanceFrom(int otherX, int otherY) {
      return Math.sqrt((this.x - otherX)*(this.x - otherX) + (this.y - otherY)*(this.y - otherY));
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
      String ret = "(";
      ret += x+", ";
      ret += y+")";
      return ret;
   }
}