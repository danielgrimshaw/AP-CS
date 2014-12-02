import java.util.Arrays;

public class PointMain {
   public static void main(String[] args) {
      //create 4 points
      Point p1 = new Point(7,2);
      Point p2 = new Point(4,3);
      Point p3 = new Point();
      Point p4 = new Point(50);
      System.out.println("p1 = "+p1);
      System.out.println("p2 = "+p2);
      System.out.println("p3 = "+p3);
      System.out.println("p4 = "+p4+"\n");
      
      p1.shiftDown(5);
      p2.translate(50,-50);
      p3.setPoint(500,30);
      p4.shiftPoint(-25,-25);
      
      System.out.println("p1 = "+p1);
      System.out.println("p2 = "+p2);
      System.out.println("p3 = "+p3);
      System.out.println("p4 = "+p4+"\n");
      
      int [] point1 = p1.toArray();
      System.out.println(Arrays.toString(point1)+"\n");
      
      int [][] points = new int [4][2];
      points[0] = p1.toArray();
      points[1] = p2.toArray();
      points[2] = p3.toArray();
      points[3] = p4.toArray();
      
      for (int [] i : points) 
         System.out.println(Arrays.toString(i));
      
      System.out.println("\n"+p1.distanceFromOrigin());
      System.out.println(p2.distanceFromOrigin());
      System.out.println(p3.distanceFromOrigin());
      System.out.println(p4.distanceFromOrigin());
   }
}