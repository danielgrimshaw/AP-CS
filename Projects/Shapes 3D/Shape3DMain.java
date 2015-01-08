public class Shape3DMain
{
   public static void main(String[] args)
   {
   	// Create two arrays of 3D shapes
      Shape3D[] shapes3D = { new Cube(7), new RectangularPrism(2, 3, 4), 
            new SquarePyramid(4, 5), new Sphere(3), new CircularCone(4, 7), 
            new Cylinder(3, 5) };
      Shape3D[] shapes3D2 = { new Cube(5), new RectangularPrism(2, 3, 4), 
            new SquarePyramid(5, 5), new Sphere(3), new CircularCone(4, 8), 
            new Cylinder(3, 5) };
   	// Print the 3D shapes in the first array, the shapes volume and 
   	// surface area and determine whether element i in each array is equal.
      for (int i = 0; i < shapes3D.length; i++)
      {
         System.out.println("Shape " + i + ":");
         System.out.println("\tArray 1 shape is a " + shapes3D[i]);
         System.out.println("\tVolume is: " + shapes3D[i].getVolume());
         System.out.println("\tSurface Area is: " + shapes3D[i].getSurfaceArea());
         System.out.println("\tArray 2 shape is a " + shapes3D2[i]);
         System.out.println("\tDoes this shape = the shape in the second array? " 
            + shapes3D[i].equals(shapes3D2[i]));
      }
   	// Test whether different shapes in the arrays are equal. 
      // Should be false for first two and true for last one.
      System.out.println("\nDoes a sphere = a cube? " + 
         shapes3D[0].equals(shapes3D[1]));
      System.out.println("\nDoes a circular cone = a cylinder? " + 
         shapes3D[4].equals(shapes3D[5]));
      System.out.println("\nDoes a cube = a rectangular prism? " +
         shapes3D[0].equals(new RectangularPrism(7,7,7)));
      RectangularPrism r = new RectangularPrism(7,7,7);
      System.out.println("\nDoes a rectangular prism = a cube? " +
         r.equals(shapes3D[0]));
   }

}