// Demonstrates shape classes.
public class ShapesMain {
   public static void main(String[] args) {
      Shape[] shapes = new Shape[2];
      shapes[0] = new Circle(12);
      shapes[1] = new Rectangle(18, 18);
     
      for (int i = 0; i < shapes.length; i++) {
         System.out.println("area=" + shapes[i].getArea() +
               ", perimeter=" + shapes[i].getPerimeter());
      }
   }
}
