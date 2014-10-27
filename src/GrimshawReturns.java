public class GrimshawReturns {
   public static void main(String[] args) {
      System.out.println(largerAbsVal(11,2));
      System.out.println(largerAbsVal(4,-5));
      System.out.println(distance(1,0,4,4));
   }
   
   public static double distance(int x1, int y1, int x2, int y2) {
      return Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1,2));
   }
   
   public static int largerAbsVal(int a, int b) {
      return (Math.max(Math.abs(a), Math.abs(b)));
   }
   public static double largerAbsVal(double a, double b) {
      return (((a<0)?-a:a)>=((b<0)?-b:b))?a:b;
   }
}