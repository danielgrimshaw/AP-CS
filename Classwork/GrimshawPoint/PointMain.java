public class PointMain {
   public static void main(String[] args) {
      //create 4 points
      Point p1 = new Point(7,2);
      Point p2 = new Point(4,3);
      Point p3 = new Point();
      Point p4 = new Point(50);
      
      p1.shiftDown(5);
      p4.shiftPoint(-25,-25);
      System.out.println("p1 = "+p1);
      System.out.println("p2 = "+p2);
      System.out.println("p3 = "+p3);
      System.out.println("p4 = "+p4);
   }
}