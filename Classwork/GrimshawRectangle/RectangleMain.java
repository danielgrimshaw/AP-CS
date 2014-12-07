public class RectangleMain {
   public static void main(String[] args) {  
      int x = 0;
      int y = 0;
      int width = 50;
      int height = 50;
      
      Point bottomLeft = new Point(x, y);
      Point topRight = new Point(width, height);
      
      Line posSlopeDiagonal = new Line(bottomLeft, topRight);
      //Line negSlopeDiagonal = new Line(0,50,50,0);
      
      Rectangle test1 = new Rectangle(x, y, width, height);
      Rectangle test2 = new Rectangle(bottomLeft, topRight);
      Rectangle test3 = new Rectangle(posSlopeDiagonal);
      //Rectangle testShouldFail = new Rectangle(negSlopeDiagonal);
      
      System.out.println(test2);
      System.out.println(test3);
      
      test2.setX(25);
      test2.setY(25);
      test2.setWidth(100);
      test2.setHeight(100);
      
      test3.setPos(25, 25, 100, 100);
      
      System.out.println(test2);
      System.out.println(test3);
      
      test3.setPos(new Point(25,25), new Point(125, 125));
      
      System.out.println(test3);
      
      System.out.println(test1.contains(25,25));
      System.out.println(test1.contains(new Point(25,25)));
      
      System.out.println(test1.intersection(test2));
   }
}