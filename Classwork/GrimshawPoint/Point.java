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
      setX(x);
      setY(0);
   }
   
   public Point(int x, int y) {
      setPoint(x, y);
   }
   
   //instance methods
   public int getX() {
      return x;
   }
   
   public int getY() {
      return y;
   }
   
   public int [] getPoint() {
      int [] ret = {x, y};
      return ret;
   }
   
   public void setX(int newX) {
      this.x = newX;
   }
   
   public void setY(int newY) {
      this.y = newY;
   }
   
   public void setPoint() {
      setPoint(0);
   }
   
   public void setPoint(int x) {
      setPoint(x, getY());
   }
   
   public void setPoint(int x, int y) {
      this.x = x;
      this.y = y;
   }
   
   public void shiftPoint(int x, int y) {
      setPoint(getX()+x, getY()+y);
   }
   
   public void shiftRight(int distance) {
      setX(getX()+distance);
   }
   
   public void shiftLeft(int distance) {
      shiftRight(-distance);
   }
   
   public void shiftUp(int distance) {
      setY(getY()+distance);
   }
   
   public void shiftDown(int distance) {
      shiftUp(-distance);
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