public class LineMain {
   public static void main(String[] args) {
      int x1 = 0, y1 = 0, x2 = 50, y2 = 50;
      Point begin = new Point(x1,y1), end = new Point(x2,y2);
      Line test1 = new Line(begin, end);
      Line test2 = new Line(x1,y1,x2,y2);
      
      System.out.println(test1.getP1().equals(test2.getP1()));
      System.out.println(test1.getP2().equals(test2.getP2()));
      
      System.out.println(test1);
      System.out.println(test2);
      
      System.out.println(test1.getSlope());
      System.out.println(test2.getSlope());
   }
}