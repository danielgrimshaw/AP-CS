import java.util.Scanner;
public class CylinderTest {
   public static void main(String[] args) {
      Scanner kb = new Scanner(System.in);
      System.out.print("Enter the radius: ");
      double r = kb.nextDouble();
      System.out.print("Enter the height: ");
      double h = kb.nextDouble();
      Cylinder c = new Cylinder(r,h);
      System.out.println("radius = " + r + "\nheight = " + h + "\nvolume = " + c.getVolume());
   }
}